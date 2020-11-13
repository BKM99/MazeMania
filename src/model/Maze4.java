package model;

public class Maze4 extends Maze {
    /**
     * Constructs the fourth maze
     */
    public Maze4() {
        super();
        //ROW 0
        addWall(0, 5);

        //ROW 1
        addWall(1, 1);
        addWall(1, 5);

        //ROW 2
        addWall(2, 1);
        addWall(2, 2);
        addWall(2, 3);
        addWall(2, 5);

        //ROW 3
        addWall(3, 1);

        //ROW 4
        addWall(4, 1);
        addWall(4, 3);
        addWall(4, 5);
        addWall(4, 6);

        //ROW 5
        addWall(5, 3);

        //ROW 6
        addWall(6, 1);
        addWall(6, 5);
        addWall(6, 6);

        //ROW 7
        addWall(7, 1);
        addWall(7, 3);
    }
}
