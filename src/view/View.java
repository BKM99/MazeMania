package view;

import controller.Message;
import controller.MoveMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.BlockingQueue;

public class View {
    public GameView gameFrame;
    public MenuView menu;
    private BlockingQueue<Message> queue;

    public static View init(BlockingQueue<Message> queue) {
        // Create object of type view
        return new View(queue);
    }

    private View(BlockingQueue<Message> queue) {
        this.queue = queue;
        // TODO:
        // you should initalize JFrame and show it,
        // JFrame should be able to add Messages to queue
        // JFrame can be in a separate class or created JFrame with all the elements in this class
        // or you can make View a subclass of JFrame by extending it

        menu = new MenuView();
        gameFrame = new GameView();
        while(menu.getClicked() == 0) {
            System.out.println("in main menu");
        }
        loadGame();
        System.out.println("game loaded");
    }

    public void loadGame() {
        JButton newGame = new JButton("New Game");
        JButton pauseButton = new JButton("Pause");
        JButton moveComponent = new JButton("Play");
        View.KeyboardListener listener = new View.KeyboardListener();
        moveComponent.addKeyListener(listener);

        // add everything and set layout and other standard JFrame settings
        gameFrame.add(newGame);
        gameFrame.add(moveComponent);
        gameFrame.add(pauseButton);
        gameFrame.changeMaze("Maze1.jpg");
        gameFrame.setSize(800, 800);
        gameFrame.setLayout(new FlowLayout());
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
    }
    public void change() {
        // TODO: do all the updates and repaint
        //gameFrame.repaint();
    }

    public void dispose() {
        // TODO: clear all the resources
        // for example, gameFrame.dispose();
    }

    public class KeyboardListener implements KeyListener {

        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {
            try {
                queue.put(new MoveMessage(e.getKeyCode())); // Adds move message to the queue
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        public void keyReleased(KeyEvent e) {

        }
    }
}
