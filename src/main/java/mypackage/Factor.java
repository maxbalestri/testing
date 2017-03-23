package mypackage;

public class Factor {
	
	public static int factor( int valore )
	{
		if (valore == 0)
			return 1;

		if (valore > 0)
			return valore * factor(valore - 1);		
		
		return 0;
	}
}
