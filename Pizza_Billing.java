import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;

public class Pizza_Billing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza_Billing window = new Pizza_Billing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pizza_Billing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pizza billing  calculator");
		lblNewLabel.setBounds(247, 43, 147, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order no");
		lblNewLabel_1.setBounds(39, 112, 80, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setBounds(39, 151, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(101, 115, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 148, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setBounds(28, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 191, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("rate");
		lblNewLabel_4.setBounds(309, 118, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Amount");
		lblNewLabel_5.setBounds(309, 151, 49, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("topping");
		lblNewLabel_6.setBounds(309, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(368, 115, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(368, 148, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(368, 191, 96, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 273, 208, 89);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("pan pizza");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("oil pizza");
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("regular pizza");
		panel.add(rdbtnNewRadioButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(353, 273, 223, 89);
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("onion");
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("cheese");
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tomato");
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("chilli");
		panel_1.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel_7 = new JLabel("pizza type");
		lblNewLabel_7.setBounds(28, 248, 80, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("topping type");
		lblNewLabel_8.setBounds(359, 248, 90, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("calculate");
		// button group
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		            int order_no= Integer.parseInt(textField.getText());
		    String custname= textField_1.getText();
		    int qty =Integer.parseInt(textField_2.getText());
		    double rate= 0;
		    // pizza type condition
		    if(rdbtnNewRadioButton.isSelected()){
		        rate= 200;
		    }
		    else if (rdbtnNewRadioButton_1.isSelected()){
		        rate=300;
		    }
		    else if(rdbtnNewRadioButton_3.isSelected()){
		        rate=150;
		    }
		    // display rate
		    textField_3.setText(""+ rate);
		    
		    double topamt=0;

		    // topping condition
		    if(chckbxNewCheckBox.isSelected()){
		        topamt=60;
		    }
		     if(chckbxNewCheckBox_1.isSelected()){
		        topamt=topamt+30;
		    }
		     if(chckbxNewCheckBox_2.isSelected()){
		        topamt=topamt+40; 
		    }
		     if(chckbxNewCheckBox_3.isSelected()){
		        topamt=topamt+50;
		    }
		    // display amount
		    textField_5.setText(""+ topamt);

		    // total amount
		    double totalpayable =(rate * qty) + topamt;
		     
		    textField_4.setText("" + totalpayable);

		    // display
		    
		    textField_6.setText(
		        "Hello, your Order Id is: " + order_no + "\nName: " + custname + "\nAMOUNT PAYABLE IS: " + totalpayable);
			}
		});
		btnNewButton.setBounds(61, 407, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				textField_6.setText("");
			}
		});
		btnNewButton_1.setBounds(398, 407, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(39, 441, 537, 100);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
	}
	
	
}
