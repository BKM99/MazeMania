package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VictoryMessageView extends JFrame {
    JLabel message = new JLabel("Congratulations, you beat Maze Mania!");
    JPanel panel = new JPanel();

    public VictoryMessageView() throws Exception {
        setSize(300,100);
        message.setFont(new Font("Courier", Font.BOLD,20));
        panel.add(message);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        //message disposes after 5 secs
        Timer timer = new Timer(5000 ,taskPerformer);
        timer.start();
    }
}
