import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {

	private static final int HEIGHT = 650;
	private static final int WIDTH = 850;

	public static void main(String[] args) {
		
		JFrame hi = new JFrame("Darkness then redness then whiteness...");
		hi.setSize(HEIGHT, WIDTH);
		hi.setLocationRelativeTo(null);
		hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout excuses = new FlowLayout();
		hi.setLayout(excuses);
		
		JButton initialButt = new JButton("Niki is cute");
		JButton secondButt = new JButton("Spongeboy me bob");
		JButton bensButt = new JButton("Push the BUTTon");
		
		initialButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Why are you pushing this?");
			}
			
		});

		hi.add(initialButt);
		hi.add(secondButt);
		hi.add(bensButt);
		
		hi.pack();
		hi.setVisible(true);
	}

}
