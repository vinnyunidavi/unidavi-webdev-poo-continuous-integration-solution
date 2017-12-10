package basketball;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Games {

	static List<Game> games = new LinkedList<>();

	static {
		games.add(new Game(2017, 12, 8, "LAL", "SAS"));
		games.add(new Game(2017, 12, 8, "BOS", "MIA"));
		games.add(new Game(2017, 12, 8, "NYK", "CLE"));
		games.add(new Game(2017, 12, 9, "DET", "GSW"));
	}


	public static Function<Integer,
					Function<Integer,
						Function<Integer,List<Game>>>> findAllCurried(List<Game> games){
		return year -> month -> day -> {
			Predicate<Game> condition =
					game -> year == game.getYear()
					&& month == game.getMonth()
					&& day == game.getDay();
			return games.stream().
					filter(condition).
					collect(Collectors.toList());
		};
	}

	public static List<Game> findAll(List<Game> games, int year, int month, int day) {
		Predicate<Game> condition =
				game -> year == game.getYear()
				&& month == game.getMonth()
				&& day == game.getDay();
		return games.stream().
				filter(condition).
				collect(Collectors.toList());
	}

}
