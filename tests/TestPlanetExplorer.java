import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	
	@Test
	public void test_movingForthOnce(){
		PlanetExplorer planeta = new PlanetExplorer(3,3);
		String result = planeta.executeCommand("f");
		
		assertEquals("Not moving forth", "(0,1,N)", result);
		
	}
	

}
