package model;

public class ResetTrap extends Player implements Obstacle{
	void handicap(Player p) {
		if (maze.isObstacle(p.getRowPosition(), p.getColPosition())) {
			p.setRowPosition(7);
			p.setColPositon(7);
		}
	}

}
