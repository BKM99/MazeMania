package controller;

import model.*;
import view.TimerTrapView;
import view.VictoryMessageView;
import view.View;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Class which updates the view and model
 */
public class Controller {
    private BlockingQueue<Message> queue;
    private View view; // Direct reference to view

    private List<Valve> valves = new LinkedList<Valve>();

    private Player player;
    private Maze1 maze1;
    private Maze2 maze2;
    private Maze3 maze3;
    private Maze4 maze4;
    private Maze5 maze5;

    private MazeState state; // Direct reference to the state of the Mazes

    /**
     * Creates a controller
     *
     * @param view  the view
     * @param queue blocking queue
     */
    public Controller(View view, BlockingQueue<Message> queue) {
        this.view = view;
        this.queue = queue;

        valves.add(new NewMoveValve());

        player = new Player();
        maze1 = new Maze1();
        player.attachMaze(maze1);
        maze2 = new Maze2();
        maze3 = new Maze3();
        maze4 = new Maze4();
        maze5 = new Maze5();

        state = MazeState.MAZE1_STARTED;
    }

    public void mainLoop() throws Exception {
        ValveResponse response = ValveResponse.EXECUTED;
        Message message = null;
        while (response != ValveResponse.FINISH) {
            try {
                message = queue.take(); // <--- take next message from the queue
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Look for a Valve that can process a message
            for (Valve valve : valves) {
                response = valve.execute(message);
                // if successfully processed or game over, leave the loop
                if (response != ValveResponse.MISS) {
                    break;
                }
            }
            //displays the victory message
            displayMessage();
        }
    }

    private interface Valve {
        /**
         * Performs certain action in response to message
         */
        public ValveResponse execute(Message message);
    }

    /**
     * Creates a new move valve
     */
    private class NewMoveValve implements Valve {
        /**
         * Moves the player and executes actions based on where they moved
         *
         * @param message the message
         * @return MISS if message is not a move message, EXECUTED with correct valve response if is a move message
         */
        public ValveResponse execute(Message message) {
            if (message.getClass() != MoveMessage.class) {
                return ValveResponse.MISS;
            }

            /**
             * Remove print statements before submission -- exist for testing purposes
             */

            //If moved left
            if (((MoveMessage) message).keyCode == KeyEvent.VK_A || ((MoveMessage) message).keyCode == KeyEvent.VK_LEFT) {
                if (player.canMoveLeft()) {
                    player.moveLeft();
                    view.gameFrame.updateDog(view.gameFrame.getX() - 75, view.gameFrame.getY());
                }

            }

            //If moved right
            if (((MoveMessage) message).keyCode == KeyEvent.VK_D || ((MoveMessage) message).keyCode == KeyEvent.VK_RIGHT) {
                if (player.canMoveRight()) {
                    player.moveRight();
                    view.gameFrame.updateDog(view.gameFrame.getX() + 75, view.gameFrame.getY());
                }

            }

            //If moved up
            if (((MoveMessage) message).keyCode == KeyEvent.VK_W || ((MoveMessage) message).keyCode == KeyEvent.VK_UP) {
                if (player.canMoveUp()) {
                    player.moveUp();
                    view.gameFrame.updateDog(view.gameFrame.getX(), view.gameFrame.getY() - 75);
                }
            }

            //If moved down
            if (((MoveMessage) message).keyCode == KeyEvent.VK_S || ((MoveMessage) message).keyCode == KeyEvent.VK_DOWN) {
                if (player.canMoveDown()) {
                    player.moveDown();
                    view.gameFrame.updateDog(view.gameFrame.getX(), view.gameFrame.getY() + 75);
                }

            }

            //If player is at the end of the maze
            if (player.getRowPosition() == 0 && player.getColPosition() == 0) {
                System.out.println("FINISHED!");
                if (state == MazeState.MAZE1_STARTED) {
                    view.gameFrame.changeMaze("Maze2.jpg");
                    player.attachMaze(maze2);
                    state = MazeState.MAZE2_STARTED;
                } else if (state == MazeState.MAZE2_STARTED) {
                    view.gameFrame.changeMaze("Maze3.jpg");
                    player.attachMaze(maze3);
                    state = MazeState.MAZE3_STARTED;
                } else if (state == MazeState.MAZE3_STARTED) {
                    view.gameFrame.changeMaze("Maze4.jpg");
                    player.attachMaze(maze4);
                    state = MazeState.MAZE4_STARTED;
                } else if (state == MazeState.MAZE4_STARTED) {
                    view.gameFrame.changeMaze("Maze5.jpg");
                    player.attachMaze(maze5);
                    state = MazeState.MAZE5_STARTED;
                }

            }

            //If player reaches the coordinates of a reset trap, reset the player position to the beginning of the maze.

            Maze currentMaze = player.getMaze();
            if (currentMaze.isResetTrap(player.getRowPosition(), player.getColPosition())) {
                view.gameFrame.resetDog();
                player.setRowPosition(7);
                player.setColPosition(7);
            }


            return ValveResponse.EXECUTED;
        }
    }
    
    //Displays 2 types of messages depending on events in the game: a timer trap, and a victory message when finishing game
    public void displayMessage() throws Exception {
        Maze currentMaze = player.getMaze();
        //Timer trap shows message blocking player movement and visibility for 5 seconds when player hits a trap location.
        if (currentMaze.isTimerTrap(player.getRowPosition(), player.getColPosition())) {
            new TimerTrapView();
        }

        //Prints a victory message after 5th maze is complete
        if (state == MazeState.MAZE5_STARTED && player.getColPosition() == 0 && player.getRowPosition() == 0) {
            new VictoryMessageView();
        }
    }
}

