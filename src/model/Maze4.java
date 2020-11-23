package model;

public class Maze4 extends Maze {
    /**
     * Constructs the fourth maze
     */
<<<<<<< HEAD

    //This maze has 3 traps.
    //ResetTrap r1;
    //TimerTrap t1;
    //TimerTrap t2;
    public Maze4() {
        super();
        //ROW 0
        //addResetTrap(0, 4, r1);
        addWall(0, 5);
        //addTimerTrap(0, 6, t1);
=======
    public Maze4() {
        super();
        //ROW 0
        addResetTrap(0, 4);
        addWall(0, 5);
        addTimerTrap(0, 6);
>>>>>>> d99d3341b49e1d2f509ea7afd185cb0120b83ae5

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
<<<<<<< HEAD
        //addTimerTrap(5, 4, t2);
=======
        addTimerTrap(5, 4);
>>>>>>> d99d3341b49e1d2f509ea7afd185cb0120b83ae5

        //ROW 6
        addWall(6, 1);
        addWall(6, 5);
        addWall(6, 6);

        //ROW 7
        addWall(7, 1);
        addWall(7, 3);
    }
}
