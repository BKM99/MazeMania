package model;

public class ResetTrap extends Player implements Obstacle {
    void handicap(Player p) {
        if (maze.isResetTrap(p.getRowPosition(), p.getColPosition())) {
            p.setRowPosition(7);
            p.setColPositon(7);
        }
    }


}
