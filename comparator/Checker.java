package comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
	@Override
	public int compare(Player p1, Player p2) {
		return (p1.score == p2.score) ? p1.name.compareTo(p2.name) : p2.score - p1.score;
	}
}
