package model;
/**
 * Constructs the third maze
 */
public class Maze3 extends Maze {

	
//	//This maze has 2 traps.
//	ResetTrap r;
//	TimerTrap t;
	
    public Maze3() {
        super();
        //ROW 0
        addWall(0,2);
        addWall(0,3);
        addWall(0,4);
        addWall(0,5);
        addWall(0,6);
        addWall(0,7);

        //ROW 1
        addWall(1,0);
//        addResetTrap(1, 2, r);
        addWall(1,7);

        //ROW 2
        addWall(2,0);
        addWall(2,2);
        addWall(2,3);
        addWall(2,5);
        addWall(2,6);
        addWall(2,7);

        //ROW 3
        addWall(3,0);
        addWall(3,3);

        //ROW 4
        addWall(4,0);
        addWall(4,3);

        //ROW 5
        addWall(5,0);
        addWall(5,2);
        addWall(5,3);
        addWall(5,4);
        addWall(5,5);
        addWall(5,7);

        //ROW 6
//        addTimerTrap(6, 2, t);
        addWall(6,6);
        addWall(6,7);

        //ROW 7
        addWall(7,2);
        addWall(7,4);

    }
}
