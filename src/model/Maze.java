package model;

/**
 * Models a 8x8 Maze
 */
public class Maze {

    int[][] maze;
    int start = 1;
    int end = 2;
    int resetTrap = 3;
    int timerTrap = 4;
    int wall = -1;
    int openSpace = 0; //openSpace is also the path the player takes since everything else is walls

    private static final int SIZE = 8;

    /**
     * Constructs a 8 x 8 Maze with a start at [7][7] and end at [0][0]
     */
    public Maze() {
        maze = new int[SIZE][SIZE];
        maze[SIZE - 1][SIZE - 1] = start;
        maze[0][0] = end;
    }

    /**
     * Adds a wall in the desired space
     *
     * @param row the row
     * @param col the column
     */
    public void addWall(int row, int col) {
        maze[row][col] = wall;
    }

    /**
     * Checks if the desired space is a wall
     *
     * @param row the row
     * @param col the column
     * @return true if wall, false if not
     */
    public boolean isWall(int row, int col) {
        return maze[row][col] == wall;
    }

    /**
     * Checks if the desired space is a path
     *
     * @param row the row
     * @param col the column
     * @return true if it is an open space, false if not
     */
    public boolean isPath(int row, int col) {
        return maze[row][col] == openSpace;
    }

    /**
     * Adds a reset trap to the desired space
     *
     * @param row the row
     * @param col the column
     */
    public void addResetTrap(int row, int col) {
        maze[row][col] = resetTrap;
    }

    /**
     * Adds a timer trap to the desired space
     *
     * @param row the row
     * @param col the col
     */
    public void addTimerTrap(int row, int col) {
        maze[row][col] = timerTrap;
    }

    /**
     * Checks for reset trap on the desired space
     *
     * @param row the row
     * @param col the column
     * @return true if it is a reset trap, false if not
     */
    public boolean isResetTrap(int row, int col) {
        return maze[row][col] == resetTrap;
    }

    /**
     * Checks for timer trap on the desired space
     *
     * @param row the row
     * @param col the col
     * @return true if it is a timer trap, false if not
     */
    public boolean isTimerTrap(int row, int col) {
        return maze[row][col] == timerTrap;

    }

}
