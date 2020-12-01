package model;

/**
 * Models the second maze
 */
public class Maze2 extends Maze {
    /**
     * Constructs the second maze
     */
    public Maze2() {
        super();
        //ROW 0
        addWall(0, 1);
        addWall(0, 2);
        addWall(0, 3);
        addWall(0, 4);
        addWall(0, 5);
        addWall(0, 6);
        addWall(0, 7);

        //ROW 1
        addWall(1, 7);

        //ROW 2
        addWall(2, 0);
        addWall(2, 3);
        addWall(2, 4);
        addWall(2, 6);
        addWall(2, 7);

        //ROW 3
        addWall(3, 0);
        addWall(3, 3);
        addWall(3, 7);

        //ROW 4
        addWall(4, 0);
        addWall(4, 1);
        addWall(4, 3);
        addWall(4, 4);
        addWall(4, 5);
        addWall(4, 6);
        addWall(4, 7);

        //ROW 5
        addWall(5, 0);
        addWall(5, 7);

        //ROW 6
        addWall(6, 0);
        addWall(6, 2);
        addWall(6, 4);
        addWall(6, 6);
        addWall(6, 7);

        //ROW 7
        addWall(7, 0);
        addWall(7, 2);
        addWall(7, 4);
    }
}
