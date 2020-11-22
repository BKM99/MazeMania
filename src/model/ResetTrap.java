package model;

<<<<<<< HEAD

=======
>>>>>>> 96e39b9c33758e956d213ee20b686b67d6120e25
public class ResetTrap extends Player implements Obstacle {
    void handicap(Player p) {
        if (maze.isResetTrap(p.getRowPosition(), p.getColPosition())) {
            p.setRowPosition(7);
            p.setColPositon(7);
        }
    }


<<<<<<< HEAD
    public class ResetTrap extends Player implements Obstacle {

        //ResetTrap resets the player's position to the starting position
        void handicap(Player p) {
            //call isResetTrap to test if coordinates match the reset trap
            if (maze.isResetTrap(p.getRowPosition(), p.getColPosition())) {
                //return player to given x, y position coordinates
                p.setRowPosition(7);
                p.setColPositon(7);
            }
        }
    }
=======
}
>>>>>>> 96e39b9c33758e956d213ee20b686b67d6120e25
