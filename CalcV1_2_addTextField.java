import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalcV1 implements ActionListener{
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons= new JButton[10];
	JButton[] functionButtons= new JButton[10];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton; 
	JPanel panel;
	
	Font myFont = new Font("TimesRoman",Font.BOLD,30);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	
	
	
	
	
	CalcV1(){
		
		frame = new JFrame("CALC_W1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textField=new JTextField();
		textField.setBounds(50,25,300,50);
		textField.setFont(myFont);
		
		frame.add(textField);
		frame.setVisible(true);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		CalcV1 calculadora= new CalcV1();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
