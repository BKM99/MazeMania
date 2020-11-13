package model;

public class Maze1 extends Maze {
    /**
     * Constructs the first maze
     */
    public Maze1() {
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
        addWall(1, 1);
        addWall(1, 2);
        addWall(1, 3);
        addWall(1, 4);
        addWall(1, 5);
        addWall(1, 6);
        addWall(1, 7);

        //ROW 2
        addWall(2, 1);
        addWall(2, 2);
        addWall(2, 3);
        addWall(2, 4);
        addWall(2, 5);
        addWall(2, 6);
        addWall(2, 7);

        //ROW 3
        addWall(3, 1);
        addWall(3, 2);
        addWall(3, 3);
        addWall(3, 4);
        addWall(3, 5);
        addWall(3, 6);
        addWall(3, 7);

        //ROW 4: ALL OPEN

        //ROW 5
        addWall(5, 0);
        addWall(5, 1);
        addWall(5, 2);
        addWall(5, 3);
        addWall(5, 4);
        addWall(5, 5);
        addWall(5, 6);

        //ROW 6
        addWall(6, 0);
        addWall(6, 1);
        addWall(6, 2);
        addWall(6, 3);
        addWall(6, 4);
        addWall(6, 5);
        addWall(6, 6);

        //ROW 7
        addWall(7, 0);
        addWall(7, 1);
        addWall(7, 2);
        addWall(7, 3);
        addWall(7, 4);
        addWall(7, 5);
        addWall(7, 6);
    }
}
