package com.itgnius;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Insets;

public class HelloGUI {

	private JFrame frmTestProgram;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloGUI window = new HelloGUI();
					window.frmTestProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestProgram = new JFrame();
		frmTestProgram.setTitle("Test Program");
		frmTestProgram.setBounds(100, 100, 450, 354);
		frmTestProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestProgram.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(69, 55, 77, 16);
		frmTestProgram.getContentPane().add(lblNewLabel);

		username = new JTextField();
		username.setMargin(new Insets(8, 8, 8, 8));
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBounds(69, 84, 288, 40);
		frmTestProgram.getContentPane().add(username);
		username.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(69, 137, 77, 16);
		frmTestProgram.getContentPane().add(lblPassword);

		password = new JTextField();
		password.setMargin(new Insets(8, 8, 8, 8));
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setColumns(10);
		password.setBounds(69, 166, 288, 40);
		frmTestProgram.getContentPane().add(password);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String getuser = username.getText();
					String getpass = password.getText();
					
					// System.out.println(getuser);
					if(getuser.equals("admin") && getpass.equals("1234")){
						JOptionPane.showMessageDialog(null, "Login Success");
					}else {
						JOptionPane.showMessageDialog(null, "Login Fail!!!");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				// JOptionPane.showMessageDialog(null, "Hello");
			}
		});
		btnNewButton.setBounds(69, 225, 288, 47);
		frmTestProgram.getContentPane().add(btnNewButton);
	}
}
