package model;

public class Player {
    /**
     * @param maze the desired maze level
     */
    Maze maze;
    int rowPosition;
    int colPosition;

    /**
     * Creates a Player starting at (7, 7), the most bottom right point on the Maze
     */
    public Player(Maze maze) {
        this.maze = maze;
        rowPosition = 7;
        colPosition = 7;
    }

    /**
     * Gets the current row position of the player
     *
     * @return the row position
     */
    public int getRowPosition() {
        return rowPosition;
    }

    /**
     * Gets the current column position of the player
     *
     * @return the column position
     */
    public int getColPosition() {
        return colPosition;
    }

    /**
     * Sets a new row position
     *
     * @param row the new row position
     */
    public void setRowPosition(int row) {
        rowPosition = row;
    }

    /**
     * Sets a new column position
     *
     * @param col the column position
     */
    public void setColPositon(int col) {
        colPosition = col;
    }

    /**
     * Moves the player up by 1 if there is no wall
     */
    public void moveUp() {
        //Checks to maze sure player is not at the very top and that there is not a wall above
        if (rowPosition > 0 && !maze.isWall(rowPosition - 1, colPosition)) {
            rowPosition--;
        }
    }

    /**
     * Moves the player down by 1 if there is no wall
     */
    public void moveDown() {
        //Checks to maze sure player is not at the very bottom and that there is not a wall below
        if (rowPosition < 7 && !maze.isWall(rowPosition + 1, colPosition)) {
            rowPosition++;
        }
    }

    /**
     * Moves the player right by 1 if there is no wall
     */
    public void moveRight() {
        //Checks to maze sure player is not at the very right and that there is not a wall to the right
        if (colPosition < 7 && !maze.isWall(rowPosition, colPosition + 1)) {
            colPosition++;
        }
    }

    /**
     * Moves the player left by 1 if there is no wall
     */
    public void moveLeft() {
        //Checks to maze sure player is not at the very left and that there is not a wall to the left
        if (colPosition > 0 && !maze.isWall(rowPosition, colPosition - 1)) {
            colPosition--;
        }
    }
}