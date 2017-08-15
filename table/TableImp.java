import java.util.*;
public class TableImp implements TableIntr{
	private Vector<String> colnames;
	private Vector<Vector> rownames;
	public Vector<String> getColNames(){
		colnames=new Vector<String>();
		colnames.add("USN");
		colnames.add("NAME");
		colnames.add("SEM");
		return colnames;
	
	
	}
	public Vector<Vector> getRowNames(){
		rownames=new Vector<>();
		Vector<String> row1=new Vector<>();
		row1.add("1RN14CS111");
		row1.add("SWATHI");
		row1.add("6");
		
	    Vector<String> row2=new Vector<>();
		row2.add("1RN14CS001");
		row2.add("Stark");
		row2.add("6");
		
		Vector<String> row3=new Vector<>();
		row3.add("1RN14CS134");
		row3.add("Mani");
		row3.add("6");
		
		rownames.add(row1);
		rownames.add(row2);
		rownames.add(row3);
		return rownames;
	
	} 



}