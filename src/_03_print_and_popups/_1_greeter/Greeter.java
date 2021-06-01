package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.print("Hello\n");
		System.out.println("World!!");
		
		String input = JOptionPane.showInputDialog("What is Your Name?");
		JOptionPane.showMessageDialog(null, "Hello, " + input);
	}
	
}
