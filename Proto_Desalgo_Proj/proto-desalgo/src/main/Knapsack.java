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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;
//JFrame, JPanel, JCheckBox, GridLayout

import com.mysql.cj.xdevapi.Table;

public class Knapsack implements ActionListener, ItemListener {
    
    //For alignments
    JFrame frame;
    Container cont;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;

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
    JButton btnHistory;

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
    
    public static Connection getConnection() throws Exception {
        
        try {
            String driver = "com.sql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "Albedo";
            String password = "SolarIsotoma";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success!");

            return conn;
        } catch(Exception e) {
            e.getStackTrace();
        }
        
        return null;
    }

    public static void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXIST ulam(id int NOT NULL AUTO_INCREMENT, name VARCHAR(25), PRIMARY KEY (id))");
            create.executeUpdate();

            System.out.println("Table Creation Success!");
        } catch(Exception e){
            e.getStackTrace();
        }
    }

    public static Table getTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("SELECT id FROM database");
            create.executeQuery();

        } catch(Exception e) {
            
        }
        
        return null;
    }


    public static void main(String[] args) throws Exception {
        createTable();

        new Knapsack();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
