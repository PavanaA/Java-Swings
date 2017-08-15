import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BasicForms extends JFrame implements ActionListener{
	
	private JTextField tf;
	private JPasswordField pf;
	private JComboBox cb;
	private String[] data={"Select","India","USA","Japan"};
	public static JPanel P1,P2;
	private JButton submit,cancel;
	private JLabel username,password,country;
	
	
	public void CreateUi(){
		tf=new JTextField(" ");
		pf=new JPasswordField("");
		cb=new JComboBox(data);
		P1=new JPanel();
		P1.setLayout(new GridLayout(3,2));
		P2=new JPanel();
		
		username=new JLabel("username");
		password=new JLabel("password");
		country=new JLabel("country");
		submit=new JButton("Submit");
		cancel=new JButton("Cancel");
		submit.addActionListener(this);
		cancel.addActionListener(this);
		
		P1.add(username);
		P1.add(tf);
		P1.add(password);
		P1.add(pf);
		P1.add(country);
		P1.add(cb);
		P2.add(submit);
		P2.add(cancel);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==submit){
			String password=pf.getText();
			if(password.length()<5){
				JOptionPane.showMessageDialog(null,"Password too short");
				pf.setText("");
				
			}
		}
		else{
			tf.setText("");
			pf.setText("");
		}
		
		
	}
	public static void main(String...args){
		
		BasicForms bf=new BasicForms();
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