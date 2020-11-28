package model;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test class for class Player
 */
public class PlayerTest {

    @Test
    public void testSetRowPosition() {
        Player testPlayer = new Player();
        testPlayer.setRowPosition(3);
        assertTrue("Row position not set correctly", testPlayer.getRowPosition() == 3);
    }

    @Test
    public void testSetColPosition() {
        Player testPlayer = new Player();
        testPlayer.setColPosition(3);
        assertTrue("Col position not set correctly", testPlayer.getColPosition() == 3);
    }

    @Test
    public void testMoveUp() {
        Player testPlayer = new Player();
        testPlayer.moveUp();
        assertTrue("Row position needs to decrease by 1", testPlayer.getRowPosition() == 6);

    }

    @Test
    public void testMoveDown() {
        Player testPlayer = new Player();
        testPlayer.setRowPosition(6);
        testPlayer.moveDown();
        assertTrue("Row position needs to increase by 1", testPlayer.getRowPosition() == 7);
    }

    @Test
    public void testMoveRight() {
        Player testPlayer = new Player();
        testPlayer.setColPosition(6);
        testPlayer.moveRight();
        assertTrue("Row position needs to increase by 1", testPlayer.getColPosition() == 7);
    }

    @Test
    public void testMoveLeft() {
        Player testPlayer = new Player();
        testPlayer.moveLeft();
        assertTrue("Col position needs to decrease by 1", testPlayer.getColPosition() == 6);
    }


}
