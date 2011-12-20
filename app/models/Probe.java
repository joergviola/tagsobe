package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Probe {

	public static List<Probe> ranking() {
		ArrayList<Probe> result = new ArrayList<Probe>();
		result.add(springJsp());
		return result;
	}

	public static Probe findByName(String name) {
		if ("spring-jsp".equals(name))
			return springJsp();
		return null;
	}

	public String name;
	public String title;
	public String techpage;
	public String blogpage;
	public String developer;
	public String repository;
	public Date date;
	public int rank;
	private Stat[] stats;
	public int maxTP;
	public int scaling;

	private static Probe springJsp() {
		Probe p = new Probe();
		p.name = "spring-jsp";
		p.title = "Spring JSP";
		p.techpage = "http://www.springsource.org/spring-framework";
		p.blogpage = "http://tagsobe.wordpress.com/category/spring/";
		p.developer = "Joerg Viola";
		p.repository = "https://github.com/joergviola/tagsobe-spring-jsp";
		Calendar cal = Calendar.getInstance();
		cal.set(2011, 11, 21);
		p.date = cal.getTime();
		p.rank = 1;
		p.stats = new Stat[] { new Stat("1.", 1, 6, 2, 0),
				new Stat("2.", 1, 8, 4, 1), new Stat("3.", 1, 7, 2, 1),
				new Stat("4.", 1, 25, 31, 0), new Stat("5.", 1, 50, 32, 1),
				new Stat("6.", 1, 68, 35, 3), new Stat("7.", 1, 60, 36, 1),
				new Stat("all", 1, 32, 35, 1), new Stat("1.", 2, 20, 32, 0),
				new Stat("2.", 2, 10, 13, 0), new Stat("3.", 2, 16, 32, 0),
				new Stat("4.", 2, 26, 30, 2), new Stat("5.", 2, 108, 65, 3),
				new Stat("6.", 2, 78, 51, 5), new Stat("7.", 2, 106, 79, 0),
				new Stat("all", 2, 52, 62, 1), new Stat("1.", 3, 30, 45, 0),
				new Stat("2.", 3, 16, 29, 8), new Stat("3.", 3, 25, 62, 2),
				new Stat("4.", 3, 27, 40, 0), new Stat("5.", 3, 110, 78, 14),
				new Stat("6.", 3, 126, 101, 2), new Stat("7.", 3, 146, 113, 3),
				new Stat("all", 3, 68, 89, 4), new Stat("1.", 4, 36, 59, 0),
				new Stat("2.", 4, 35, 59, 0), new Stat("3.", 4, 27, 56, 5),
				new Stat("4.", 4, 36, 51, 3), new Stat("5.", 4, 161, 112, 0),
				new Stat("6.", 4, 147, 97, 6), new Stat("7.", 4, 202, 126, 3),
				new Stat("all", 4, 92, 109, 2), new Stat("1.", 5, 33, 64, 0),
				new Stat("2.", 5, 22, 61, 3), new Stat("3.", 5, 37, 86, 7),
				new Stat("4.", 5, 41, 51, 0), new Stat("5.", 5, 178, 104, 6),
				new Stat("6.", 5, 203, 126, 6), new Stat("7.", 5, 307, 174, 6),
				new Stat("all", 5, 117, 146, 4), new Stat("1.", 7, 41, 79, 0),
				new Stat("2.", 7, 42, 94, 3), new Stat("3.", 7, 31, 80, 12),
				new Stat("4.", 7, 64, 64, 3), new Stat("5.", 7, 258, 140, 1),
				new Stat("6.", 7, 259, 145, 5), new Stat("7.", 7, 478, 231, 7),
				new Stat("all", 7, 167, 204, 4),
				new Stat("1.", 10, 69, 103, 0), new Stat("2.", 10, 65, 119, 8),
				new Stat("3.", 10, 51, 92, 6), new Stat("4.", 10, 116, 114, 6),
				new Stat("5.", 10, 385, 196, 7),
				new Stat("6.", 10, 421, 197, 7),
				new Stat("7.", 10, 859, 312, 6),
				new Stat("all", 10, 281, 328, 6),
				new Stat("1.", 12, 72, 124, 0), new Stat("2.", 12, 69, 132, 4),
				new Stat("3.", 12, 75, 120, 13),
				new Stat("4.", 12, 120, 111, 9),
				new Stat("5.", 12, 421, 200, 3),
				new Stat("6.", 12, 483, 250, 8),
				new Stat("7.", 12, 1235, 434, 8),
				new Stat("all", 12, 353, 453, 6),
				new Stat("1.", 15, 108, 168, 0),
				new Stat("2.", 15, 67, 141, 15),
				new Stat("3.", 15, 81, 155, 14),
				new Stat("4.", 15, 150, 131, 13),
				new Stat("5.", 15, 558, 286, 4),
				new Stat("6.", 15, 613, 284, 15),
				new Stat("7.", 15, 1901, 556, 6),
				new Stat("all", 15, 497, 674, 9),
				new Stat("1.", 17, 112, 200, 0),
				new Stat("2.", 17, 92, 188, 8),
				new Stat("3.", 17, 86, 151, 14),
				new Stat("4.", 17, 178, 200, 4),
				new Stat("5.", 17, 599, 318, 8),
				new Stat("6.", 17, 738, 396, 11),
				new Stat("7.", 17, 2554, 727, 5),
				new Stat("all", 17, 623, 902, 7),
				new Stat("1.", 20, 165, 261, 0),
				new Stat("2.", 20, 111, 178, 16),
				new Stat("3.", 20, 88, 155, 16),
				new Stat("4.", 20, 271, 301, 11),
				new Stat("5.", 20, 812, 434, 9),
				new Stat("6.", 20, 900, 443, 13),
				new Stat("7.", 20, 3538, 972, 8),
				new Stat("all", 20, 841, 1236, 10),
				new Stat("1.", 25, 175, 277, 0),
				new Stat("2.", 25, 158, 289, 18),
				new Stat("3.", 25, 171, 307, 11),
				new Stat("4.", 25, 276, 314, 14),
				new Stat("5.", 25, 1021, 610, 10),
				new Stat("6.", 25, 1083, 547, 26),
				new Stat("7.", 25, 5528, 1435, 11),
				new Stat("all", 25, 1202, 1923, 13),
				new Stat("1.", 30, 296, 493, 0),
				new Stat("2.", 30, 252, 436, 16),
				new Stat("3.", 30, 223, 333, 11),
				new Stat("4.", 30, 378, 437, 13),
				new Stat("5.", 30, 1173, 773, 17),
				new Stat("6.", 30, 1233, 752, 23),
				new Stat("7.", 30, 7833, 2091, 17),
				new Stat("all", 30, 1627, 2734, 14),
				new Stat("1.", 40, 630, 822, 0),
				new Stat("2.", 40, 491, 809, 15),
				new Stat("3.", 40, 445, 689, 22),
				new Stat("4.", 40, 526, 712, 17),
				new Stat("5.", 40, 1815, 1255, 15),
				new Stat("6.", 40, 1874, 1192, 34),
				new Stat("7.", 40, 12529, 3652, 23),
				new Stat("all", 40, 2616, 4402, 18),
				new Stat("1.", 50, 624, 1023, 0),
				new Stat("2.", 50, 701, 1021, 19),
				new Stat("3.", 50, 559, 951, 27),
				new Stat("4.", 50, 695, 1152, 18),
				new Stat("5.", 50, 2270, 1694, 22),
				new Stat("6.", 50, 2535, 1637, 41),
				new Stat("7.", 50, 19089, 5101, 10),
				new Stat("all", 50, 3782, 6691, 20) };
		p.evaluate();
		return p;
	}

	public void evaluate() {
		List<Stat> stats = getStatForPage("all");
		int lastAv = 0;
		int lastClients = -1;
		double sc = 0.0;
		for (Stat stat : stats) {
			maxTP = Math.max(maxTP, stat.getTP());
			if (lastClients > 0)
				sc += ((double) (stat.average - lastAv))
						/ (stat.clients - lastClients);
			lastAv = stat.average;
			lastClients = stat.clients;
		}
		scaling = (int) sc / stats.size();
	}

	public List<Stat> getStatForPage(String page) {
		ArrayList<Stat> result = new ArrayList<Stat>();
		for (int i = 0; i < stats.length; i++) {
			Stat stat = stats[i];
			if (page.equals(stat.page))
				result.add(stat);
		}
		return result;
	}

}
