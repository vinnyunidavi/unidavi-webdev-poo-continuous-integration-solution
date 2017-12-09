package basketball;

import java.util.LinkedList;
import java.util.List;

public class Games {

	private static List<Game> games = new LinkedList<>();

	static {
		games.add(new Game(2017,12,8,"LAL","SAS"));
		games.add(new Game(2017,12,8,"BOS","MIA"));
		games.add(new Game(2017,12,8,"NYK","CLE"));
		games.add(new Game(2017,12,9,"DET","GSW"));
	}

	public static List<Game> findAll(int year, int month, int day) {
		 List<Game> result = new LinkedList<>();
		for (Game game: games) {
			if (year == game.getYear() &&
				month == game.getMonth() &&
				day == game.getDay()){
				result.add(game);
			}
		}
		return result;
	}

}
