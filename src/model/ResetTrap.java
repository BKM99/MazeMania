package model;

public class ResetTrap extends Player implements Obstacle{
	
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
