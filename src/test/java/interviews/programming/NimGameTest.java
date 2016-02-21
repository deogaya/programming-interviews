package interviews.programming;

import org.junit.Assert;
import org.junit.Test;

public class NimGameTest {

	@Test
	public void test() {
		NimGame game = new NimGame();
		Assert.assertTrue(game.canWinNim(6));
		Assert.assertFalse(game.canWinNim(56));
		Assert.assertTrue(game.canWinNim(7));
	}
}
