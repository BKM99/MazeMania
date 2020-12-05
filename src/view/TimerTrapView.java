package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TimerTrapView extends JFrame {
	/**
     * Constructs a Timer Trap message window. Is displayed when player reaches coordinates of timer trap.
     * @throws Exception
     */
	JLabel message = new JLabel("Oops, you stepped on a trap! Please wait 5 seconds before continuing");
	JPanel panel = new JPanel();
	
	public TimerTrapView() throws Exception {
		setSize(800, 800);
		message.setFont(new Font("Courier", Font.BOLD, 20));
		panel.add(message);
		this.getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        //Close the trap after 5 seconds.
        ActionListener timerListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        Timer timer = new Timer(5000, timerListener);
        timer.start();
	}

}
