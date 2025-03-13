package com.keith.notepad;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
	
	//init the JFrame as window
	JFrame window;
	
	//init the text area
	JTextArea textArea;
	
	//scroll bar
	JScrollPane scrollPane;
	
	//menubar class
	JMenuBar menuBar;
	
	//menu specific classes
	JMenu menuFile, menuEdit, menuFormat, menuColor;
	
	//individual menu items
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
	
	

	public static void main(String[] args) {
		new GUI();

	}
	
	//constructor for the GUI
	public GUI() {
		createWindow();
		createTextArea();
		createMenuBar();
		createFileMenu();
		
		window.setVisible(true);
	}
	
	public void createWindow() {
		//setting the name, size and exit
		window = new JFrame("Notepad");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Method to init the text area
	public void createTextArea() {
		
		
		textArea = new JTextArea();
		
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		window.add(scrollPane);
		//window.add(textArea);
	}
	
	public void createMenuBar() {
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		menuColor = new JMenu("Color");
		menuBar.add(menuColor);
	}
	
	public void createFileMenu() {
		iNew = new JMenuItem("New");
		menuFile.add(iNew);
		
		iOpen = new JMenuItem("Open");
		menuFile.add(iOpen);
		
		iSave = new JMenuItem("Save");
		menuFile.add(iSave);
		
		iSaveAs = new JMenuItem("Save As");
		menuFile.add(iSaveAs);
		
		iExit = new JMenuItem("Exit");
		menuFile.add(iExit);
	}

}
