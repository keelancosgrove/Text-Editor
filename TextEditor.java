import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TextEditor extends JFrame {
	
	//Sets up editor GUI with scrollable pane
	public TextEditor(){
		//Instantiates menu items
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;
		
		menuBar = new JMenuBar();
		menu = new JMenu("A menu");
		menuItem = new JMenuItem("Here!!");
		menu.add(menuItem);
		menuBar.add(menu);
		
		//Creates panel container for text area and save panel
		JPanel textContainer = new JPanel();
		textContainer.setLayout(new BoxLayout(textContainer, BoxLayout.Y_AXIS));
		JPanel savePanel = new JPanel();
		savePanel.setLayout(new FlowLayout());
		JTextArea editor = new JTextArea(40,140);
		JScrollPane textArea = new JScrollPane(editor);
		setTitle("Text Editor");
		
		//Save Panel only contains button for now
		JButton saveButton = new JButton("save");
		saveButton.setSize(60,60);
		
		//Sets container hierarchy and places elements in JFrame
		textContainer.add(textArea);
		savePanel.add(saveButton);
		textContainer.add(savePanel);
		add(textContainer);
		
		//Sets JFrame properties and makes text editor visible
		setJMenuBar(menuBar);
		setSize(200,200);
		getContentPane().add(BorderLayout.CENTER,textContainer);
		setLocationByPlatform(true);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args){
		//Instantiates new text editor object, with components created from constructor
		TextEditor editor = new TextEditor();
	}
}
