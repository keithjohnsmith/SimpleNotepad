package com.keith.notepad;

import java.awt.Color;

public class Function_Color {
	
	GUI gui;
	
	public Function_Color(GUI gui) {
		this.gui = gui;
	}
	
	public void changeColor(String color) {
		
		switch(color) {
		case "White":
			gui.window.getContentPane().setBackground(Color.white);
			gui.textArea.setBackground(Color.white);
			gui.textArea.setForeground(Color.black);
			break;
		case "Black":
			gui.window.getContentPane().setBackground(Color.black);
			gui.textArea.setBackground(Color.black);
			gui.textArea.setForeground(Color.white);
			break;
		case "Blue":
			gui.window.getContentPane().setBackground(Color.blue);
			gui.textArea.setBackground(Color.blue);
			gui.textArea.setForeground(Color.white);
			break;
		}
		
	}

}
