package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameView extends JFrame {
    BufferedImage mazeImage;
    JLabel background;
    boolean mazeChanged;

    BufferedImage dogImage;
    int x;
    int y;

    /**
     * Constructs a new game view
     */
    public GameView() {
        this.x = 600;
        this.y = 600;

        try {
            dogImage = ImageIO.read(new File("doge.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Updates the dog's position on the maze
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void updateDog(int x, int y) {
        this.x = x;
        this.y = y;
        repaint(); //Repaints the dog when the (x, y) coordinates are changed
    }

    /**
     * Sets the dog player icon back to the starting coordinates
     */
    public void resetDog() {
        x = 600;
        y = 600;
    }

    /**
     * Changes the maze the player is on
     *
     * @param mazeFile the file of the desired maze
     */
    public void changeMaze(String mazeFile) {
        if (mazeChanged) {
            remove(background);
            mazeChanged = false;
        }
        try {
            mazeImage = ImageIO.read(new File(mazeFile));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        background = new JLabel(new ImageIcon(mazeImage));
        mazeChanged = true;
        add(background);
        revalidate();
        resetDog();
        repaint();
    }

    /**
     * Gets the x coordinate of the dog image
     *
     * @return x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y coordinate of the dog image
     *
     * @return y coordinate
     */
    public int getY() {
        return y;
    }


    /**
     * Paints the dog image in a new location
     *
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(dogImage, x, y, this);

    }
}
