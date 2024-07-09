package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name);
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 600, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rules.setText(
       "<html>"+ 
                "1.Participants must select one answer choice from the provided options for each multiple-choice question." + "<br><br>" +
                "2.Only one answer choice is allowed per question. Selecting multiple answers may result in the answer being marked as incorrect." + "<br><br>" +
                "3.Participants should ensure they have selected their final answer before moving to the next question. Once an answer is submitted, it cannot be changed." + "<br><br>" +
                "4. Participants should read each question and all answer choices carefully before making their selection."+ "<br><br>" +
                "5.  Answers must be submitted within the specified time limit for each question. Late submissions may not be accepted." + "<br><br>" +
                "6. Points will be awarded only for correctly chosen answers. Incorrect or unanswered questions may not earn any points.\n" +"" + "<br><br>" +

                "7.In case of technical glitches or errors affecting the ability to select an answer, participants should notify the quiz organizers immediately for resolution." + "<br><br>" +
            
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
