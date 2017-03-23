package mypackage;
import junit.framework.TestCase;

public class TestFactor extends TestCase {
	
	public void testfactor1()
	{
	assertTrue( Factor.factor( 0 ) == 1 );
	}
	
	public void testfactor2()
	{
	assertTrue( Factor.factor( 2 ) == 2 );
	}
	
	public void testfactor3()
	{
	assertTrue( Factor.factor( 5 ) == 120 );
	}
}
