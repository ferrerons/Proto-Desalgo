package vars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import methods.*;

public class Variables {

    
    //For alignments
    public static JFrame frame;
    public static Container cont;
    public static JPanel panel1;
    public static JPanel panel2;
    public static JPanel panel3;
    public static JPanel panel4;
    public static JPanel panel5;

    //Text Fields
    public static JTextField txtBudget;
    public static JTextField txtPrice;
    public static JTextField txtWeight;
    
    //Labels
    public static JLabel lblTitle;
    public static JLabel lblBudget;
    public static JLabel lblSelection;
    public static JLabel lblPrice;
    public static JLabel lblWeight;

    //Buttons
    public static JButton btnBudget;
    public static JButton btnHistory;

    //Combobox
    public static JComboBox<String> cmbSelection;

    //Font Styles
    Font fBold;

    public Variables() {
        //Frame setup
        final int vGap = 4;
        final int hGap = 4;
        frame = new JFrame("Sulit Ulam Solver");
		frame.setDefaultCloseOperation(0x03);
		cont = frame.getContentPane();
		cont.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(0, 3, hGap, vGap));
        panel3 = new JPanel(new GridLayout(0, 2, hGap, vGap));
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        panel3.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

        //Panel1
        lblTitle = new JLabel("Knapsack Sulit Ulam Solver");
        panel1.add(lblTitle);

        //Panel2
        lblBudget = new JLabel("Enter budget:");
        txtBudget = new JTextField("", 10);
        btnBudget = new JButton("Enter");
        panel2.add(lblBudget);
        panel2.add(txtBudget);
        panel2.add(btnBudget);
        btnBudget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });

        //Panel3
        lblSelection = new JLabel("Selections:");
        cmbSelection = new JComboBox<String>(new String[] {});
        panel3.add(lblSelection);
        panel3.add(cmbSelection);
        cmbSelection.setEnabled(false);

        //Panel4
        btnHistory = new JButton("History");
        panel4.add(btnHistory);
        btnHistory.setEnabled(false);
        
        frame.pack();
		frame.setVisible(true);
        frame.setResizable(false);
    }

    
}
