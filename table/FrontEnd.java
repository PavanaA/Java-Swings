import javax.swing.*;
import java.awt.*;
import java.util.*;
public class FrontEnd extends JFrame{

	private JTable table;
	private static JScrollPane sp;
	
	public void createGui(){
		
		TableIntr ci=FactoryClass.getInstance();
		table=new JTable(ci.getRowNames(),ci.getColNames());
		table.setRowHeight(3*table.getRowHeight());
		sp=new JScrollPane(table);
	
	
	}
	public static void main(String...args){
	
		FrontEnd fr=new FrontEnd();
		fr.createGui();
		fr.setLayout(new BorderLayout());
		fr.setLocation(300,200);
		fr.setVisible(true);
		fr.add(sp);
		fr.setSize(300,200);
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	
	
	}




}