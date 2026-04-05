package CriticalThinking;

//import features I need for GUI

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class menuGUI implements ActionListener{
	
	//declare variables
	private JFrame frame;
	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JTextArea area;
	
	
	
	public static void main(String[] args) {
		//this starts the GUI application
		new menuGUI();
	}
		//Constructor
		public menuGUI() {
	
		//Construct JFrame object, set size, and set to close
		frame = new JFrame("Menu Application");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Construct menu & menu bar objects, and add menu to menu bar
		menu = new JMenu("Main Menu");
		menuBar = new JMenuBar();
		menuBar.add(menu);
		
		//Construct menu items & title according to action that will be performed
		menuItem1 = new JMenuItem("Date/Time");
		menuItem2 = new JMenuItem("Save to Log");
		menuItem3 = new JMenuItem("Change Color");
		menuItem4 = new JMenuItem("Exit");
		
		//add menu items to menu and add action listener to each
		menu.add(menuItem1);
		menuItem1.addActionListener(this);
		menu.add(menuItem2);
		menuItem2.addActionListener(this);
		menu.add(menuItem3);
		menuItem3.addActionListener(this);
		menu.add(menuItem4);
		menuItem4.addActionListener(this);
		
		//add menu bar to the frame
		frame.setJMenuBar(menuBar);
		
		//Construct text area and add to frame
		area = new JTextArea();
		frame.add(area);
		
		//Make the frame visible to the user
		frame.setVisible(true);	
	}
		
		//Make each menu item perform desired action
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Object source = e.getSource(); //shows what menu item the user selects
			
			//Date/Time selected
			if (source == menuItem1) {
				area.setText("Date and Time: " + LocalDateTime.now());
			}
			//Save to log
			else if (source == menuItem2) {
				String logText = area.getText(); // retrieves the text
				try {
					FileWriter writer  = new FileWriter("log.txt");
					writer.write(logText);
					System.out.print("Successfully saved to log.");
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			//Change color - make sure random generator is imported as well
			else if (source == menuItem3) {
				Random random = new Random();
				int r = random.nextInt(100);
				int g = random.nextInt(156) + 100;
				int b = random.nextInt(100);
				Color color = new Color(r, g, b);
				area.setBackground(color);
				}
			//exit the program
			else if (source == menuItem4) {
				System.exit(0);
			}
		}
}
