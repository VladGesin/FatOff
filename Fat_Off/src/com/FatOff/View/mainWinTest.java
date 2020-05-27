package com.FatOff.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class mainWinTest {

	public mainWinTest() {
		// TODO Auto-generated constructor stub
		JFrame newFrame = new JFrame("Fat Off");
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		
		JPanel logoPanel = new JPanel();
		logoPanel.setBorder(null);
		FlowLayout fl_logoPanel = (FlowLayout) logoPanel.getLayout();
		fl_logoPanel.setVgap(2);
		fl_logoPanel.setHgap(2);
		
		JPanel sessionDataPanel = new JPanel();
		sessionDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Session Data", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(64, 64, 64)));
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sessionDataPanel, GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
					.addGap(7))
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sessionDataPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(443, Short.MAX_VALUE))
		);
		
		JLabel diaticianNameLbl = new JLabel("Dietician Name:");
		
		JLabel customerNameLbl = new JLabel("Customer name:");
		
		JTextPane dieticianNameTxtPane = new JTextPane();
		dieticianNameTxtPane.setEditable(false);
		
		JTextPane customerNameTxtPane = new JTextPane();
		customerNameTxtPane.setEditable(false);
		
		JLabel dateLbl = new JLabel("Date:");
		
		JLabel sessionNumLbl = new JLabel("Session:");
		
		JTextPane dateTxtPane = new JTextPane();
		dateTxtPane.setEditable(false);
		
		JTextPane sessionNumTxtPane = new JTextPane();
		sessionNumTxtPane.setEditable(false);
		
		JLabel bmiLbl = new JLabel("BMI :");
		
		JLabel eerLbl = new JLabel("EER :");
		
		JTextPane bmiTxtPane = new JTextPane();
		bmiTxtPane.setEditable(false);
		
		JTextPane eerTxtPane = new JTextPane();
		eerTxtPane.setEditable(false);
		GroupLayout gl_sessionDataPanel = new GroupLayout(sessionDataPanel);
		gl_sessionDataPanel.setHorizontalGroup(
			gl_sessionDataPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sessionDataPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(diaticianNameLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerNameLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(customerNameTxtPane, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
						.addComponent(dieticianNameTxtPane, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(dateLbl, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(sessionNumLbl, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(sessionNumTxtPane)
						.addComponent(dateTxtPane, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_sessionDataPanel.createSequentialGroup()
							.addComponent(bmiLbl, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bmiTxtPane, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
						.addGroup(gl_sessionDataPanel.createSequentialGroup()
							.addComponent(eerLbl, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(eerTxtPane, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
					.addGap(133))
		);
		gl_sessionDataPanel.setVerticalGroup(
			gl_sessionDataPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_sessionDataPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(bmiTxtPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(bmiLbl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(dieticianNameTxtPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(diaticianNameLbl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(dateLbl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateTxtPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_sessionDataPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(sessionNumLbl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerNameLbl)
						.addComponent(eerLbl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(eerTxtPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerNameTxtPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sessionNumTxtPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7))
		);
		sessionDataPanel.setLayout(gl_sessionDataPanel);
		gl_mainPanel.setHonorsVisibility(false);
		
		JLabel logoLbl = new JLabel("");
		logoLbl.setIcon(new ImageIcon(mainWinTest.class.getResource("/com/FatOff/View/imgonline-com-ua-resize-5aRADIEx30404X17.png")));
		logoPanel.add(logoLbl);
		mainPanel.setLayout(gl_mainPanel);
		GroupLayout groupLayout = new GroupLayout(newFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		newFrame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		newFrame.setJMenuBar(menuBar);
		
		JMenu menuMenuItem = new JMenu("Menu");
		menuBar.add(menuMenuItem);
		
		JMenuItem createCustomerMenuItem = new JMenuItem("Create customer");
		menuMenuItem.add(createCustomerMenuItem);
		
		JMenuItem openCustomerMenuItem = new JMenuItem("Open customer");
		menuMenuItem.add(openCustomerMenuItem);
		
		JMenu customerMenu = new JMenu("Customer");
		menuBar.add(customerMenu);
		
		JMenuItem openIntroMeeting = new JMenuItem("Open intoductory summary");
		customerMenu.add(openIntroMeeting);
		
		JMenuItem prevSumMenuItem = new JMenuItem("Open summary of previous meeting");
		customerMenu.add(prevSumMenuItem);
		
		JMenu menuAdminItem = new JMenu("Admin");
		menuBar.add(menuAdminItem);
		
		JMenuItem addDieticion = new JMenuItem("Add Dieticion");
		menuAdminItem.add(addDieticion);
		
		JMenuItem removeDieticion = new JMenuItem("Remov Dieticion");
		menuAdminItem.add(removeDieticion);
		
		JMenuItem helpMenuItem = new JMenuItem("Help");
		helpMenuItem.setHorizontalAlignment(SwingConstants.TRAILING);
		helpMenuItem.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		helpMenuItem.setPreferredSize(new Dimension(10, 0));
		menuBar.add(helpMenuItem);
		
		newFrame.getContentPane().add(mainPanel);
		newFrame.setVisible(true);
	}
}
