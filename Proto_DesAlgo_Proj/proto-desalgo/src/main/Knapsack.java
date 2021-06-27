package main;

/**
 * MEMBERS:
 * * ARAMBULO, HANS
 * * BANDOL, JESSIE
 * * DELOS SANTOS, RONS
 * * OLAGUER, MATTHEW
 * * PABALAN, KURT
 * BSCS 2-1N
 * FINAL REQUIREMENT:
 * PROGRAMMING PROBLEM #1
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//JFrame, JPanel, JCheckBox, GridLayout

public class Knapsack implements ActionListener, ItemListener {
    
    //For alignments
    JFrame frame;
    Container cont;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;

    //Text Fields
    JTextField txtBudget;
    JTextField txtPrice;
    JTextField txtWeight;
    
    //Labels
    JLabel lblTitle;
    JLabel lblBudget;
    JLabel lblSelection;
    JLabel lblPrice;
    JLabel lblWeight;

    //Buttons
    JButton btnBudget;

    //Combobox
    JComboBox<String> cmbSelection;

    //Font Styles
    Font fBold;

    public Knapsack() {
        //Frame setup
        final int vGap = 4;
        final int hGap = 4;
        frame = new JFrame("Sulit Ulam Solver");
		frame.setDefaultCloseOperation(0x03);
		cont = frame.getContentPane();
		cont.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		panel1 = new JPanel();
        panel3 = new JPanel(new GridLayout(0, 2, hGap, vGap));
        panel2 = new JPanel(new GridLayout(0, 2, hGap, vGap));
        panel4 = new JPanel(new GridLayout(0, 4, hGap, vGap));
        panel2.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        panel3.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        panel4.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        //Panel1
        lblTitle = new JLabel("Knapsack Sulit Ulam Solver");
        panel1.add(lblTitle);

        //Panel2
        lblBudget = new JLabel("Enter budget:");
        txtBudget = new JTextField("", 10);
        panel2.add(lblBudget);
        panel2.add(txtBudget);

        //Panel3
        lblSelection = new JLabel("Selections:");
        cmbSelection = new JComboBox<String>(new String[] {});
        panel3.add(lblSelection);
        panel3.add(cmbSelection);
        cmbSelection.setEditable(false);

        //Panel4
        lblPrice = new JLabel("Price:");
        lblWeight = new JLabel("Weight:");
        txtPrice = new JTextField("", 5);
        txtWeight = new JTextField("", 5);
        panel4.add(lblPrice);
        panel4.add(txtPrice);
        panel4.add(lblWeight);
        panel4.add(txtWeight);
        txtPrice.setEditable(false);
        txtWeight.setEditable(false);
        
        frame.pack();
		frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Knapsack();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
