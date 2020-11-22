package model;

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
     * Constructs a 8 x 8 Maze
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
     * Adds obstacles onto the desired space
     *
     * @param row the row
     * @param col the column
     */
//    public void addResetTrap(int row, int col, ResetTrap reset) { //adds a reset trap to the maze
//    	maze[row][col] = resetTrap;
//
//    }
//    
//    public void addTimerTrap(int row, int col, TimerTrap timer) { //adds a timer trap to the maze
//    	maze[row][col] = timerTrap;
//
//    }

    /**
     * Checks for obstacles on the desired space
     *
     * @param row the row
     * @param col the column
     * @return true if it is a obstacle, false if not
     */
    public boolean isResetTrap(int row, int col) { //test for reset trap
        return maze[row][col] == resetTrap;
    }
 
    public boolean isTimerTrap(int row, int col) { //test for timer trap
    	return maze[row][col] == timerTrap;

    }

}
