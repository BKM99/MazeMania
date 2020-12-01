package model;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test class for class Player
 */
public class PlayerTest {

    /**
     * Tests whether setRowPosition() successfully changes the row position
     */
    @Test
    public void testSetRowPosition() {
        Player testPlayer = new Player();
        testPlayer.setRowPosition(3);
        assertTrue("Row position not set correctly", testPlayer.getRowPosition() == 3);
    }

    /**
     * Tests whether setColPosition() successfully changes the col position
     */
    @Test
    public void testSetColPosition() {
        Player testPlayer = new Player();
        testPlayer.setColPosition(3);
        assertTrue("Col position not set correctly", testPlayer.getColPosition() == 3);
    }

    /**
     * Tests whether moveUp() successfully moves the player up
     */
    @Test
    public void testMoveUp() {
        Player testPlayer = new Player();
        testPlayer.moveUp();
        assertTrue("Row position needs to decrease by 1", testPlayer.getRowPosition() == 6);

    }

    /**
     * Tests whether moveDown() successfully moves the player down
     */
    @Test
    public void testMoveDown() {
        Player testPlayer = new Player();
        testPlayer.setRowPosition(6);
        testPlayer.moveDown();
        assertTrue("Row position needs to increase by 1", testPlayer.getRowPosition() == 7);
    }

    /**
     * Tests whether moveRight() successfully moves the player right
     */
    @Test
    public void testMoveRight() {
        Player testPlayer = new Player();
        testPlayer.setColPosition(6);
        testPlayer.moveRight();
        assertTrue("Row position needs to increase by 1", testPlayer.getColPosition() == 7);
    }

    /**
     * Tests whether moveLeft() successfully moves the player left
     */
    @Test
    public void testMoveLeft() {
        Player testPlayer = new Player();
        testPlayer.moveLeft();
        assertTrue("Col position needs to decrease by 1", testPlayer.getColPosition() == 6);
    }


}
