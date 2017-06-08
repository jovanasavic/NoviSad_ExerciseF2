import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	
	@Test
	public void test_movingForthOnce() throws PlanetExplorerException{
		PlanetExplorer planeta = new PlanetExplorer(3,3);
		String result = planeta.executeCommand("f");
		
		assertEquals("Not moving forth", "(0,1,N)", result);
		
	}
	
	@Test
	public void test_MovingBack() throws PlanetExplorerException{
		
		PlanetExplorer planeta = new PlanetExplorer(3,3);
		planeta.setxExplorer(0);
		planeta.setyExplorer(1);
		String result = planeta.executeCommand("b");
		
		assertEquals("Not moving back", "(0,0,N)", result);
	}
	
	@Test (expected = PlanetExplorerException.class)
	public void test_exception_errorCommand() throws PlanetExplorerException
	{
		PlanetExplorer planeta = new PlanetExplorer(3,3);
		String result = planeta.executeCommand("a");
	}
	

}
