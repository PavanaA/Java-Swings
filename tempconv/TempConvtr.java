import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConvtr extends JFrame implements ActionListener{
	
	private JComboBox cb1;
	 private static final String[] tempType = { "Fahrenheit", "Celsius", "Kelvin" }; 
	private JComboBox cb2; 
	private JTextField FromWhat,ToWhat;
	public static JPanel P1,P2;
	private JButton convert;
	
	
	
	public void CreateUi(){
		cb1=new JComboBox(tempType);
		cb2=new JComboBox(tempType);
		FromWhat=new JTextField();
		ToWhat=new JTextField();
		P1=new JPanel();
		P1.setLayout(new GridLayout(2,2));
		P2=new JPanel();
		
	
		
		convert=new JButton("Convert");
		
		convert.addActionListener(this);
		
		P1.add(cb1);
		P1.add(FromWhat);
		//P1.add(cb1);
		P1.add(cb2);
		P1.add(ToWhat);
		//P1.add(cb2);
		P2.add(convert);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==convert){
			try{
			if((String)cb1.getSelectedItem()=="Celsius"&&(String)cb2.getSelectedItem()=="Fahrenheit"){
			
				double tempFahr = (double) ((Double.parseDouble(FromWhat.getText())) * 1.8 + 32);
				ToWhat.setText(tempFahr+"");
			}
			if((String)cb1.getSelectedItem()=="Celsius"&&(String)cb2.getSelectedItem()=="Kelvin"){
			double tempKel = (double) ((Double.parseDouble(FromWhat.getText())) +273.15);
			
				ToWhat.setText(tempKel+"");
			}
			if((String)cb1.getSelectedItem()=="Fahrenheit"&&(String)cb2.getSelectedItem()=="Celsius"){
			
				double tempFahr = (double) (((Double.parseDouble(FromWhat.getText())) -32)* 0.5555);
				ToWhat.setText(tempFahr+"");
			}
			if((String)cb1.getSelectedItem()=="Fahrenheit"&&(String)cb2.getSelectedItem()=="Kelvin"){
			
				double tempFahr = ((double) 5/9*((Double.parseDouble(FromWhat.getText()))-32) +2);
				ToWhat.setText(tempFahr+"");
			}
			if((String)cb1.getSelectedItem()=="Kelvin"&&(String)cb2.getSelectedItem()=="Celsius"){
			
				double tempFahr = (double) ((Double.parseDouble(FromWhat.getText())) -273.0);
				ToWhat.setText(tempFahr+"");
			}
			if((String)cb1.getSelectedItem()=="Kelvin"&&(String)cb2.getSelectedItem()=="Fahrenheit"){
			
				double tempFahr = ((double) ((Double.parseDouble(FromWhat.getText()))* 9/5) - 459.67);
				ToWhat.setText(tempFahr+"");
			}
			}
			catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,"Enter a valid Temperature");
			FromWhat.setText("");
			ToWhat.setText("");
			}
		}
		
		
	}
	public static void main(String...args){
		
		TempConvtr bf=new TempConvtr();
		bf.setSize(300,200);
		bf.CreateUi();
		bf.setLayout(new BorderLayout());
		bf.setLocation(300,200);
		bf.setVisible(true);
		bf.add(P1,BorderLayout.CENTER);
		bf.add(P2,BorderLayout.SOUTH);
		bf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	 
	
}