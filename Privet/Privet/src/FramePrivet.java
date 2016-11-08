import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FramePrivet extends JFrame {

	private JLabel label;
	private JTextField textField;
	private JTextField textField1;
	private JLabel label1;



	private JFrame frame;

	private JButton button;
	private JButton saveButton;

	private JPanel panel;




	/**
	 * Constructor
	 */
	public FramePrivet() {
		initGUI();
		initListeners();
	}

	/**
	 * GUI initialization
	 */
	private void initGUI() {

		textField = new JTextField(15);
		label = new JLabel("1");
		frame = new JFrame("Anastasia");
		button = new JButton("Restore");
		saveButton = new JButton("Save");
		textField1 = new JTextField(15);
		label1 = new JLabel("2");


		panel = new JPanel();




		//JTextField her = new JTextField(15);
		//panel.add(her);

		//JTextField her2 = new JTextField(15);
		//button.add(her2);
		//panel.add(her2);


		panel.add(saveButton);
		panel.add(button);
		panel.add(textField);
		panel.add(label);
		panel.add(textField1);
		panel.add(label1);




		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);


	}

	private void initListeners() {


		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String stroka = JOptionPane.showInputDialog(null);
				System.out.println("PRIMER: " + stroka);

			}
		});

		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				File file = new File("C:/Users/h129355/Desktop/String/data.dat");
				String text = textField.getText();
				try {
		            try (FileWriter writer = new FileWriter(file)) {

		                writer.write(text+"\n");

		            }
		    } catch (IOException ex ) {
		        JOptionPane.showMessageDialog(null, ex);
		        ex.printStackTrace();
		    } finally {

		    }




			}
		});

	}


	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FramePrivet();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}
}
