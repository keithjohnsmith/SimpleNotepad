package com.keith.notepad;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
	
	//init the JFrame as window
	JFrame window;
	
	//init the text area
	JTextArea textArea;
	
	//scroll bar
	JScrollPane scrollPane;

	public static void main(String[] args) {
		new GUI();

	}
	
	//constructor for the GUI
	public GUI() {
		createWindow();
		createTextArea();
		
		
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

}
