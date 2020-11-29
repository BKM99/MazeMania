package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesView extends JFrame {
    JLabel welcome;
    JLabel rule1;
    JLabel rule2;
    JLabel subRule1;
    JLabel subRule2;
    JLabel subRule3;
    JLabel subRule4;
    JLabel rule3;

    JButton back = new JButton("back");
    JPanel panel = new JPanel();


    public RulesView() {
        setSize(640,640);
        setTitle("Rules");
        setLocationRelativeTo(null);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //creating the rules
        welcome = new JLabel("How To Play...");
        welcome.setFont(new Font("Courier", Font.BOLD,25));

        rule1 = new JLabel("1. Click play to start, click pause to pause the game");
        rule1.setFont(new Font("Courier", Font.BOLD,16));

        rule2 = new JLabel("2. Move player with WASD keys");
        rule2.setFont(new Font("Courier", Font.BOLD,16));

        subRule1 = new JLabel("     - W is to move forward");
        subRule1.setFont(new Font("Courier", Font.BOLD,16));
        subRule2 = new JLabel("     - A is to move left");
        subRule2.setFont(new Font("Courier", Font.BOLD,16));
        subRule3 = new JLabel("     - S is to move down");
        subRule3.setFont(new Font("Courier", Font.BOLD,16));
        subRule4 = new JLabel("     - D is to move right");
        subRule4.setFont(new Font("Courier", Font.BOLD,16));

        rule3 = new JLabel("3. The goal is to move to the upper left corner of the maze");
        rule3.setFont(new Font("Courier", Font.BOLD,16));

        //adding everything to the panel
        panel.add(welcome);
        panel.add(rule1);
        panel.add(rule2);
        panel.add(subRule1);
        panel.add(subRule2);
        panel.add(subRule3);
        panel.add(subRule4);
        panel.add(rule3);

        //making the back button work
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuView();
            }
        });

        panel.add(back);
        this.getContentPane().add(panel);
        setVisible(true);
        pack();
    }
}
