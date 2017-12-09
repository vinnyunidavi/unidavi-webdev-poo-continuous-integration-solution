package basketball;

public class Game {

	private String awayTeam;
	private String homeTeam;
	private int year;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + day;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (awayTeam == null) {
			if (other.awayTeam != null)
				return false;
		} else if (!awayTeam.equals(other.awayTeam))
			return false;
		if (day != other.day)
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	private int month;
	private int day;

	@Override
	public String toString() {
		return "Game [awayTeam=" + awayTeam + ", homeTeam=" + homeTeam + ", year=" + year + ", month=" + month
				+ ", day=" + day + "]";
	}

	public Game(int year, int month, int day, String awayTeam, String homeTeam) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}
