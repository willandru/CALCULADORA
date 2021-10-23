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
		textField.setEditable(false);
		
		addButton= new JButton("+");
		subButton= new JButton("-");
		mulButton= new JButton("*");
		divButton= new JButton("/");
		decButton= new JButton(".");
		equButton= new JButton("=");
		delButton= new JButton("Delete");
		clrButton= new JButton("Clear");
		
		
		functionButtons[0]=addButton;
		functionButtons[1]=subButton;
		functionButtons[2]=mulButton;
		functionButtons[3]=divButton;
		functionButtons[4]=decButton;
		functionButtons[5]=equButton;
		functionButtons[6]=delButton;
		functionButtons[7]=clrButton;
		
		for(int i=0; i<8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i=0; i<10; i++) {
			numberButtons[i]= new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		
		delButton.setBounds(50,430,145,50);
		clrButton.setBounds(205,430,145,50);
		
		panel= new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.GRAY);
		
		
		
		frame.add(textField);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(panel);
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