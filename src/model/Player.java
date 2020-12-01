package model;

/**
 * Models a player on a maze
 */
public class Player {

    Maze maze;
    int rowPosition;
    int colPosition;

    /**
     * Creates a Player starting at (7, 7), the most bottom right point on the Maze
     */
    public Player() {
        rowPosition = 7;
        colPosition = 7;
    }

    /**
     * Attaches a maze to the player and sets the player position back to the start (7,7)
     *
     * @param newMaze the maze that the player is on
     */
    public void attachMaze(Maze newMaze) {
        this.maze = newMaze;
        setRowPosition(7);
        setColPosition(7);
    }

    /**
     * Returns attached maze
     *
     * @return the attached maze
     */
    public Maze getMaze() {
        return maze;
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
    public void setColPosition(int col) {
        colPosition = col;
    }

    /**
     * Moves the player up by 1
     */
    public void moveUp() {
        rowPosition--;
    }

    /**
     * Checks if there is not a wall above the player and that player is not at the very top
     *
     * @return false if player cannot move, true if player can move
     */
    public boolean canMoveUp() {
        if (rowPosition > 0 && !maze.isWall(rowPosition - 1, colPosition)) {
            return true;
        }
        return false;
    }

    /**
     * Moves the player down by 1
     */
    public void moveDown() {
        rowPosition++;
    }

    /**
     * Checks if there is not a wall below the player and that player is not at the very bottom
     *
     * @return false if player cannot move, true if player can move
     */
    public boolean canMoveDown() {
        //Checks to maze sure player is not at the very bottom and that there is not a wall below
        if (rowPosition < 7 && !maze.isWall(rowPosition + 1, colPosition)) {
            return true;
        }
        return false;
    }

    /**
     * Moves the player right by 1
     */
    public void moveRight() {

        colPosition++;
    }

    /**
     * Checks if there is no wall to the right of the player and that player is not on the very right
     *
     * @return false if player cannot move, true if player can move
     */
    public boolean canMoveRight() {
        if (colPosition < 7 && !maze.isWall(rowPosition, colPosition + 1)) {
            return true;
        }
        return false;
    }


    /**
     * Moves the player left by 1 if there is no wall
     */
    public void moveLeft() {

        colPosition--;
    }

    /**
     * Checks if there is no wall to the left of the player and that player is not on the very left
     *
     * @return false if player cannot move, true if player can move
     */
    public boolean canMoveLeft() {
        //Checks to maze sure player is not at the very left and that there is not a wall to the left
        if (colPosition > 0 && !maze.isWall(rowPosition, colPosition - 1)) {
            return true;
        }
        return false;
    }

}
