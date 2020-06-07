
package com.FatOff.View;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.FatOff.Model.Customer;
public class MainWinTest {
	 
	private JTextField txtEnterWeight;
	private JTextField txtHeight;
	private JTextField txtEnterAge;
	private JTextField txtEnterWrist;
	private JTextField txtEnterWaist;
	private JTextField txtEnterThigh;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnClear;
	private JButton btnCalculate;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel lblCustomersName;
	private JTextField txtCustomerNameSholud;
	private JLabel lblBmi;
	private JLabel lblUpdatedEer;
	private JTextField txtNewValue;
	private JTextField txtNewValue_1;
	private JSeparator separator_1;
	private JTextField txtEnter;
	private JLabel lblBreakfast;
	private JLabel lblLunch;
	private JLabel lblDinner;
	private JLabel lblBreakfastSnack;
	private JLabel lblSnack;
	private JLabel lblSnack_2;
	private JButton btnClear_1;
	private JButton btnSave;
	private JTextField txtEnterbreakfast;
	private JTextField txtEnterLunch;
	private JTextField txtEnterDinner;
	private JTextField txtEnterSnack1;
	private JTextField txtEnterSnack2;
	private JTextField txtEnterSnack3;
	
	public MainWinTest(Object cus, Customer selected) {
		JFrame customerframe = new JFrame("custmer");
		/////////////////////
		///MenuBar + need to add  link to intrudactory meeting + help
		JMenuBar menuBar = new JMenuBar();
		customerframe.setJMenuBar(menuBar);
		
		mntmNewMenuItem = new JMenuItem("Open Intrudactory Meeting");
		mntmNewMenuItem.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Help");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.TRAILING);
		mntmNewMenuItem_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1345, 732);
		customerframe.getContentPane().add(panel);
		
		JButton btnGraph = new JButton("Graph");
		btnGraph.setForeground(Color.WHITE);
		btnGraph.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnGraph.setBorder(null);
		btnGraph.setBackground(new Color(97, 212, 195));
		
		txtEnterSnack3 = new JTextField();
		txtEnterSnack3.setText("Enter relevant snack");
		txtEnterSnack3.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterSnack3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtEnterSnack3.setColumns(10);
		
		txtEnterDinner = new JTextField();
		txtEnterDinner.setText("Enter relevant meal");
		txtEnterDinner.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterDinner.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtEnterDinner.setColumns(10);
		
		txtEnterSnack2 = new JTextField();
		txtEnterSnack2.setText("Enter relevant snack");
		txtEnterSnack2.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterSnack2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtEnterSnack2.setColumns(10);
		
		txtEnterLunch = new JTextField();
		txtEnterLunch.setText("Enter relevant meal");
		txtEnterLunch.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterLunch.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtEnterLunch.setColumns(10);
		
		txtEnterSnack1 = new JTextField();
		txtEnterSnack1.setText("Enter relevant snack");
		txtEnterSnack1.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterSnack1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtEnterSnack1.setColumns(10);
		
		txtEnterbreakfast = new JTextField();
		txtEnterbreakfast.setText("Enter relevant meal");
		txtEnterbreakfast.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterbreakfast.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtEnterbreakfast.setColumns(10);
		
		/// general conclusion of the meeting
		txtEnter = new JTextField();
		txtEnter.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnter.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtEnter.setText("Enter general summary of the meeting");
		txtEnter.setColumns(10);
		
		txtCustomerNameSholud = new JTextField();
		txtCustomerNameSholud.setEditable(false);
		txtCustomerNameSholud.setHorizontalAlignment(SwingConstants.CENTER);
		txtCustomerNameSholud.setForeground(new Color(255, 255, 255));
		txtCustomerNameSholud.setText("Customer name sholud appear");
		txtCustomerNameSholud.setBackground(null);
		txtCustomerNameSholud.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtCustomerNameSholud.setColumns(10);
		
		///Parameters about the customer
			///Name of Customer
		lblCustomersName = new JLabel("Name of customer :");
		lblCustomersName.setForeground(Color.WHITE);
		lblCustomersName.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		txtNewValue = new JTextField();
		txtNewValue.setText("New Value");
		txtNewValue.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewValue.setForeground(Color.WHITE);
		txtNewValue.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtNewValue.setEditable(false);
		txtNewValue.setColumns(10);
		txtNewValue.setBackground((Color) null);
		
		txtNewValue_1 = new JTextField();
		txtNewValue_1.setText("New Value");
		txtNewValue_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewValue_1.setForeground(Color.WHITE);
		txtNewValue_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtNewValue_1.setEditable(false);
		txtNewValue_1.setColumns(10);
		txtNewValue_1.setBackground((Color) null);
		
			///Updated EER
		lblUpdatedEer = new JLabel("Updated EER :");
		lblUpdatedEer.setForeground(Color.WHITE);
		lblUpdatedEer.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
			///Updated BMI
		lblBmi = new JLabel("Updated BMI :");
		lblBmi.setForeground(Color.WHITE);
		lblBmi.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		//save button, need to save as PDF and as a new session
		btnSave = new JButton("Save");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(97,212,195));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///finish meeting buttons
			///clear
		btnClear_1 = new JButton("Clear");
		btnClear_1.setForeground(new Color(255, 255, 255));
		btnClear_1.setBorder(null);
		btnClear_1.setBackground(new Color(97,212,195));
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		/// adding buttom CLEAR to MEASURES
		btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBorder(null);
		btnClear.setBackground(new Color(97,212,195));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of THIGH
		lblNewLabel_6 = new JLabel("Thigh:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of WAIST
		lblNewLabel_5 = new JLabel("Waist :");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of WRIST
		lblNewLabel_4 = new JLabel("Wrist :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of AGE
		lblNewLabel_3 = new JLabel("Age :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of HEIGHT
		lblNewLabel_2 = new JLabel("Height :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		
		///adding lable of WEIGHT
		lblNewLabel_1 = new JLabel("Weight :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		///adding lable of MEASURES
		JLabel lblNewLabel = new JLabel("Measures :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		/// adding LOGO to window
		JLabel Logolbl = new JLabel("");
		Logolbl.setIcon(new ImageIcon(MainWin.class.getResource("/com/FatOff/View/fat_off_white.png")));
		Logolbl.setForeground(Color.WHITE);
		Logolbl.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		/// enter WEIGHT text 
			///need to connect to the new session
		txtEnterWeight = new JTextField();
		txtEnterWeight.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterWeight.setText("Enter Weight");
		txtEnterWeight.setColumns(10);
		
		///enter HEIGHT text
			/// need to be constant
		txtHeight = new JTextField();
		txtHeight.setForeground(new Color(0, 0, 0));
		txtHeight.setEditable(false);
		txtHeight.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtHeight.setText("Enter Height");
		txtHeight.setColumns(10);
		
		///enter AGE text
			/// need to be constant
		txtEnterAge = new JTextField();
		txtEnterAge.setEditable(false);
		txtEnterAge.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterAge.setText("Enter Age");
		txtEnterAge.setColumns(10);
		/// enter WRIST text 
			///need to connect to the new session
		txtEnterWrist = new JTextField();
		txtEnterWrist.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterWrist.setText("Enter Wrist");
		txtEnterWrist.setColumns(10);
		
		/// enter WAIST text 
			///need to connect to the new session
		txtEnterWaist = new JTextField();
		txtEnterWaist.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterWaist.setText("Enter Waist");
		txtEnterWaist.setColumns(10);
		
		/// enter THIGH text 
			///need to connect to the new session
		txtEnterThigh = new JTextField();
		txtEnterThigh.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterThigh.setText("Enter Thigh");
		txtEnterThigh.setColumns(10);
		
		///adding buttom CALCULATE to MEASURES
		btnCalculate = new JButton("Calculate");
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBorder(null);
		btnCalculate.setBackground(new Color(97,212,195));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		lblSnack_2 = new JLabel("Snack 3 :");
		lblSnack_2.setForeground(Color.WHITE);
		lblSnack_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		lblDinner = new JLabel("Dinner :");
		lblDinner.setForeground(Color.WHITE);
		lblDinner.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		lblSnack = new JLabel("Snack 2 :");
		lblSnack.setForeground(Color.WHITE);
		lblSnack.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		lblLunch = new JLabel("Lunch :");
		lblLunch.setForeground(Color.WHITE);
		lblLunch.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		lblBreakfastSnack = new JLabel("Snack 1 :");
		lblBreakfastSnack.setForeground(Color.WHITE);
		lblBreakfastSnack.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		/// meals during the day 
		lblBreakfast = new JLabel("Breakfast :");
		lblBreakfast.setForeground(Color.WHITE);
		lblBreakfast.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		separator_1 = new JSeparator();
		
		///separator above measures
		separator = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUpdatedEer, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblBmi, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(29)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(44)
														.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(53)
														.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(10)
														.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_panel.createSequentialGroup()
																.addGap(10)
																.addComponent(Logolbl, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED))
															.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
																.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(separator, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)))
														.addGap(102)))
												.addGap(313))
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(40)
												.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(40)
											.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(41)
										.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(40)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(167)
									.addComponent(lblBreakfast, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtEnterWeight, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(83)
									.addComponent(lblBreakfastSnack, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtEnterAge, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(71)
									.addComponent(lblLunch, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtEnterWrist, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtEnterWaist, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(83)
									.addComponent(lblSnack, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtEnterThigh, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(71)
									.addComponent(lblDinner, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(25)
									.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(179)
									.addComponent(lblSnack_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(txtNewValue_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnClear_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addComponent(btnGraph, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGap(475))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(txtEnterDinner, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnterSnack3, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnterSnack2, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnterLunch, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnterSnack1, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnterbreakfast, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEnter, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 864, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtNewValue, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
								.addGap(335)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(167)
							.addComponent(lblCustomersName, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(txtCustomerNameSholud, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Logolbl, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblBreakfast, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(txtEnterWeight, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(3)
											.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblBreakfastSnack, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addGap(7)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(3)
											.addComponent(txtEnterAge, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblLunch, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addGap(10)
									.addComponent(txtEnterWrist, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtEnterWaist, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(2)
											.addComponent(lblSnack, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addGap(8)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtEnterThigh, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(5)
											.addComponent(lblDinner, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addGap(10)
									.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(lblSnack_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCustomersName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCustomerNameSholud, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtEnter, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(txtEnterbreakfast, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(txtEnterSnack1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtEnterLunch, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(29)
									.addComponent(txtEnterSnack2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(txtEnterDinner, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(txtEnterSnack3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBmi, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNewValue, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNewValue_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUpdatedEer, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGraph, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClear_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(8)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)))
					.addGap(90))
		);
		panel.setLayout(gl_panel);
		panel.setBackground(new Color(36, 47, 65));
		customerframe.setVisible(true);
		

		

		
	}
}

