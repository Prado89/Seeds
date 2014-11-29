import static org.junit.Assert.*;

import org.junit.Test;


public class GameTest {
	
	@Test
	public void testMove() {
		Game game = new Game();
		int i=1;
		int container[] = new int[14];
		for (i=0;i<=5;i++) {
            container[i] = 3;
            container[i+7] = 3;
            }
        container[6] = 0;
        container[13] = 0;
		assertEquals(1,game.move(12, container));
	}
	
	@Test
	public void testCaptureSeeds(){
		Game game = new Game();
		game.round=1;
		int i;
		int container[] = new int[14];
		for (i=0;i<=5;i++) {
            container[i] = 3;
            container[i+7] = 3;
            }
        container[6] = 0;
        container[13] = 0;
        int last = 3;
        game.captureSeeds(last,container);
        int[] testcontainer={3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 0};
        assertEquals(testcontainer,game.container);
        		
	}

}
