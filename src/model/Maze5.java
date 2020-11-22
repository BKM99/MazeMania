package model;

public class Maze5 extends Maze {
    /**
     * Constructs the fifth maze
     */
	
    public Maze5() {
        super();
        //ROW 0
        addWall(0, 1);
        addTimerTrap(0, 5);

        //ROW 1
        addWall(1, 1);
        addWall(1, 2);
        addWall(1, 4);
        addWall(1, 6);

        //ROW 2
        addWall(2, 6);

        //ROW 3
        addWall(3, 2);
        addWall(3, 6);

        //ROW 4
        addWall(4, 1);
        addWall(4, 3);
        addWall(4, 4);
        addWall(4, 6);

        //ROW 5
        addWall(5, 1);
        addTimerTrap(5, 2);
        addWall(5, 6);

        //ROW 6
        addWall(6, 1);
        addWall(6, 3);
        addResetTrap(6, 4);

        //ROW 7
        addResetTrap(7, 0);
        addWall(7, 3);
        addWall(7, 6);
    }
}
