package model;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test class for class Maze
 */
public class MazeTest {

    /**
     * Tests whether addWall() method successfully creates a wall
     */
    @Test
    public void testAddWall() {
        Maze testMaze = new Maze();
        testMaze.addWall(2, 2);
        assertTrue(testMaze.maze[2][2] == -1);
    }

    /**
     * Tests whether addResetTrap() method successfully creates a reset trap
     */
    @Test
    public void testAddResetTrap() {
        Maze testMaze = new Maze();
        testMaze.addResetTrap(2, 2);
        assertTrue(testMaze.maze[2][2] == 3);
    }

    /**
     * Tests whether addTimerTrap() method successfully creates a timer trap
     */
    @Test
    public void testAddTimerTrap() {
        Maze testMaze = new Maze();
        testMaze.addTimerTrap(2, 2);
        assertTrue(testMaze.maze[2][2] == 4);
    }

}
