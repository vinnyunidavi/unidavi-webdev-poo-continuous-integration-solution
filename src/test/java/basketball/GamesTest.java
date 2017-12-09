package basketball;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GamesTest {

	@Test
	public void findAll_happy_3games(){
		List<Game> games = Games.findAll(2017,12,8);
		Assert.assertEquals(3, games.size());
	}

	@Test
	public void findAll_happy_firstAsDETAndGSW(){
		List<Game> games = Games.findAll(2017,12,9);
		Assert.assertEquals(new Game(2017,12,9,"DET","GSW"), games.get(0));
	}

}
