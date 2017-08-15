
import java.util.*;
public class FactoryClass{

	private FactoryClass(){}
	private static TableIntr ti;
	
	public static TableIntr getInstance(){
	ti=new TableImp();
	return ti;
	
	}

}