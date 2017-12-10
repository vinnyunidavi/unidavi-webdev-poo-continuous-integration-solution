package basketball;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

public class GamesTest {

	/**
	 * funcional way
	 */
	final static Consumer<Game> gamePrinterEffect = g -> System.out.println(g);
	final static Consumer<List<Game>> gamesPrinterEffect = l -> l.stream().forEach(gamePrinterEffect);
	final static Function<List<Game>,Game> firstGameFunction = l -> l.get(0);
	final static Function<List<Game>,Consumer<Integer>> sizeAssertionEffect = l -> s -> Assert.assertEquals((Integer)s,(Integer)l.size());
	final static Function<Game,Consumer<Game>> gameAssertionEffect = e -> a -> Assert.assertEquals(e,a);

	@Test
	public final void findAll_happy_3games_curried(){
		final List<Game> games20171208 = Games.findAllCurried(Games.games).
				apply(2017).apply(12).apply(8);
		gamesPrinterEffect.accept(games20171208);
		sizeAssertionEffect.apply(games20171208).accept(3);
	}
	@Test
	public final void findAll_happy_3games_multiparams(){
		final List<Game> games20171208 = Games.findAll(Games.games,2017,12,8);
		gamesPrinterEffect.accept(games20171208);
		sizeAssertionEffect.apply(games20171208).accept(3);
	}

	@Test
	public final void findAll_happy_first(){
		final List<Game> games20171209 = Games.findAll(Games.games,2017,12,9);
		gameAssertionEffect.apply(new Game(2017,12,9,"DET","GSW")).accept(firstGameFunction.apply(games20171209));
	}

	/**
	 * procedural way
	 */
	public static void print(List<Game> games){
		for(Game game: games) System.out.println(game);
	}

}
