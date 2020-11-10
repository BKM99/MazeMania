package model;

/**
 * created a maze represented as 2d array
 * player starts at 1 and ends at 2
 * in the maze -1's are walls and 0's are open spaces for the player to move
 * example:
 * maze = {1,0,0,0,0,0,0,0},
 * {0,0,0,0,0,0,0,0},		//this is what the maze looks like by default
 * {0,0,0,0,0,0,0,0},		//player moves from 1 (start) to 2 (end)
 * {0,0,0,0,0,0,0,0},		//we can change the 0's (openSpaces) to -1's (walls) to make the maze more complicated
 * {0,0,0,0,0,0,0,0},		//we can add traps to the openSpaces
 * {0,0,0,0,0,0,0,0},
 * {0,0,0,0,0,0,0,0},
 * {0,0,0,0,0,0,0,2},
 */
public class Maze {
    int[][] maze;
    int start = 1;
    int end = 2;
    int trap = 3;
    int wall = -1;
    int openSpace = 0; //openSpace is also the path the player takes since everything else is walls

    private static final int SIZE = 8;

    /**
     * Constructs a 8 x 8 Maze
     */
    public Maze() {
        maze = new int[SIZE][SIZE];
        maze[0][0] = start;
        maze[SIZE - 1][SIZE - 1] = end;
    }

    /**
     * Checks if the desired space is a wall
     *
     * @param row
     * @param col
     * @return true if wall, false if not
     */
    public boolean isWall(int row, int col) {
        return maze[row][col] == wall;
    }

    /**
     * Creates a new open path space
     *
     * @param row
     * @param col
     */
    public void createPath(int row, int col) {
        maze[row][col] = openSpace;
    }

    /**
     * Checks if the desired space is a path
     *
     * @param row
     * @param col
     * @return
     */
    public boolean isPath(int row, int col) {
        return maze[row][col] == openSpace;
    }

    /**
     * Adds obstacle onto the desired space
     *
     * @param row
     * @param col
     */
    public void addObstacle(int row, int col, Obstacle obstacle) {
        maze[row][col] = trap;

        //Not sure about this implementation yet
    }

    /**
     * Checks for obstacles on the desired space
     *
     * @param row
     * @param col
     * @return
     */
    public boolean isObstacle(int row, int col) {
        return maze[row][col] == trap;
    }

}
