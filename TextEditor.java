import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TextEditor extends JFrame {
	
	//Sets up editor GUI with scrollable pane
	public TextEditor(){
		JPanel textContainer = new JPanel();
		textContainer.setLayout(new BoxLayout(textContainer, BoxLayout.Y_AXIS));
		JPanel savePanel = new JPanel();
		savePanel.setLayout(new FlowLayout());
		JTextArea editor = new JTextArea(40,140);
		JScrollPane textArea = new JScrollPane(editor);
		setTitle("Text Editor");
		JButton saveButton = new JButton("save");
		saveButton.setSize(60,60);
		textContainer.add(textArea);
		savePanel.add(saveButton);
		textContainer.add(savePanel);
		setSize(200,200);
		getContentPane().add(BorderLayout.CENTER,textContainer);
		setLocationByPlatform(true);
		pack();
		setVisible(true);
	}
	
	
	
	public static void main(String[] args){
		TextEditor editor = new TextEditor();
	}
}
