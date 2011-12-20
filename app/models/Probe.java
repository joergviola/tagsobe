package models;

import java.util.ArrayList;
import java.util.List;

public class Probe {

	public static Probe findByName(String name) {
		if ("spring-jsp".equals(name))
			return springJsp();
		return null;
	}

	public String name;
	public int rank;
	private Stat[] stats;

	private static Probe springJsp() {
		Probe p = new Probe();
		p.name = "Spring JSP";
		p.rank = 1;
		p.stats = new Stat[] { new Stat("1.", 1, 7, 6, 0),
				new Stat("2.", 1, 7, 3, 2), new Stat("3.", 1, 6, 4, 3),
				new Stat("4.", 1, 8, 3, 1), new Stat("5.", 1, 19, 5, 2),
				new Stat("6.", 1, 22, 10, 5), new Stat("7.", 1, 23, 6, 2),
				new Stat("all", 1, 13, 9, 2), new Stat("1.", 2, 8, 8, 0),
				new Stat("2.", 2, 12, 7, 1), new Stat("3.", 2, 12, 13, 1),
				new Stat("4.", 2, 16, 10, 0), new Stat("5.", 2, 33, 13, 0),
				new Stat("6.", 2, 29, 14, 3), new Stat("7.", 2, 40, 25, 0),
				new Stat("all", 2, 21, 18, 1), new Stat("1.", 3, 11, 8, 0),
				new Stat("2.", 3, 20, 15, 0), new Stat("3.", 3, 16, 13, 1),
				new Stat("4.", 3, 25, 21, 1), new Stat("5.", 3, 48, 35, 0),
				new Stat("6.", 3, 55, 49, 1), new Stat("7.", 3, 68, 72, 0),
				new Stat("all", 3, 35, 42, 0), new Stat("1.", 4, 18, 22, 0),
				new Stat("2.", 4, 27, 25, 0), new Stat("3.", 4, 15, 13, 1),
				new Stat("4.", 4, 27, 19, 0), new Stat("5.", 4, 61, 47, 0),
				new Stat("6.", 4, 54, 37, 2), new Stat("7.", 4, 86, 61, 0),
				new Stat("all", 4, 41, 43, 0), new Stat("1.", 5, 15, 20, 0),
				new Stat("2.", 5, 20, 21, 0), new Stat("3.", 5, 21, 17, 0),
				new Stat("4.", 5, 31, 26, 0), new Stat("5.", 5, 61, 47, 1),
				new Stat("6.", 5, 63, 45, 1), new Stat("7.", 5, 92, 52, 0),
				new Stat("all", 5, 43, 44, 0), new Stat("1.", 7, 28, 34, 0),
				new Stat("2.", 7, 41, 40, 0), new Stat("3.", 7, 31, 28, 0),
				new Stat("4.", 7, 43, 33, 0), new Stat("5.", 7, 89, 62, 0),
				new Stat("6.", 7, 92, 65, 0), new Stat("7.", 7, 131, 67, 0),
				new Stat("all", 7, 65, 61, 0), new Stat("1.", 10, 38, 43, 0),
				new Stat("2.", 10, 52, 49, 0), new Stat("3.", 10, 54, 56, 0),
				new Stat("4.", 10, 74, 67, 0), new Stat("5.", 10, 132, 98, 0),
				new Stat("6.", 10, 166, 123, 1),
				new Stat("7.", 10, 221, 127, 0),
				new Stat("all", 10, 105, 108, 0),
				new Stat("1.", 12, 47, 48, 0), new Stat("2.", 12, 61, 62, 0),
				new Stat("3.", 12, 55, 64, 0), new Stat("4.", 12, 78, 78, 0),
				new Stat("5.", 12, 160, 118, 0),
				new Stat("6.", 12, 216, 165, 1),
				new Stat("7.", 12, 308, 146, 0),
				new Stat("all", 12, 132, 141, 0),
				new Stat("1.", 15, 73, 78, 0), new Stat("2.", 15, 92, 98, 0),
				new Stat("3.", 15, 87, 85, 0), new Stat("4.", 15, 122, 127, 0),
				new Stat("5.", 15, 249, 197, 0),
				new Stat("6.", 15, 299, 217, 1),
				new Stat("7.", 15, 467, 253, 0),
				new Stat("all", 15, 198, 213, 0),
				new Stat("1.", 17, 99, 97, 0), new Stat("2.", 17, 113, 112, 0),
				new Stat("3.", 17, 123, 123, 1),
				new Stat("4.", 17, 142, 136, 0),
				new Stat("5.", 17, 275, 198, 0),
				new Stat("6.", 17, 377, 267, 1),
				new Stat("7.", 17, 583, 287, 0),
				new Stat("all", 17, 245, 252, 0),
				new Stat("1.", 20, 138, 139, 0),
				new Stat("2.", 20, 163, 166, 1),
				new Stat("3.", 20, 154, 168, 0),
				new Stat("4.", 20, 185, 189, 0),
				new Stat("5.", 20, 336, 276, 0),
				new Stat("6.", 20, 486, 356, 1),
				new Stat("7.", 20, 822, 390, 0),
				new Stat("all", 20, 326, 348, 0),
				new Stat("1.", 25, 191, 192, 0),
				new Stat("2.", 25, 236, 244, 0),
				new Stat("3.", 25, 213, 227, 0),
				new Stat("4.", 25, 287, 284, 0),
				new Stat("5.", 25, 566, 435, 0),
				new Stat("6.", 25, 645, 444, 1),
				new Stat("7.", 25, 1205, 522, 0),
				new Stat("all", 25, 477, 492, 0),
				new Stat("1.", 30, 297, 282, 0),
				new Stat("2.", 30, 397, 360, 0),
				new Stat("3.", 30, 326, 343, 0),
				new Stat("4.", 30, 413, 410, 0),
				new Stat("5.", 30, 745, 567, 0),
				new Stat("6.", 30, 932, 621, 1),
				new Stat("7.", 30, 1812, 742, 0),
				new Stat("all", 30, 703, 709, 0),
				new Stat("1.", 40, 500, 441, 0),
				new Stat("2.", 40, 668, 562, 0),
				new Stat("3.", 40, 566, 551, 0),
				new Stat("4.", 40, 708, 622, 0),
				new Stat("5.", 40, 1278, 949, 0),
				new Stat("6.", 40, 1479, 974, 1),
				new Stat("7.", 40, 2832, 1129, 0),
				new Stat("all", 40, 1147, 1099, 0),

		};
		return p;
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
