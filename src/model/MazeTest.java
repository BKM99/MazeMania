package model;

import org.junit.*;

import static org.junit.Assert.*;

public class MazeTest {

    @Test
    public void testAddWall() {
        Maze testMaze = new Maze();
        testMaze.addWall(2, 2);
        assertTrue(testMaze.maze[2][2] == -1);
    }

    @Test
    public void testAddResetTrap() {
        Maze testMaze = new Maze();
        testMaze.addResetTrap(2, 2);
        assertTrue(testMaze.maze[2][2] == 3);
    }

    @Test
    public void testAddTimerTrap() {
        Maze testMaze = new Maze();
        testMaze.addTimerTrap(2, 2);
        assertTrue(testMaze.maze[2][2] == 4);
    }

}
