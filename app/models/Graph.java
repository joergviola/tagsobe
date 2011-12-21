package models;

import java.util.List;

public class Graph {
	private final List<Stat> stats;
	private int xmax;
	private int ymax;
	private int tpmax;

	static class CoordBuilder {
		StringBuilder b = new StringBuilder();

		public void append(int value) {
			if (b.length() > 0)
				b.append(",");
			b.append(value);
		}

		@Override
		public String toString() {
			return b.toString();
		}
	}

	public Graph(List<Stat> stats) {
		this.stats = stats;
		for (Stat stat : stats) {
			xmax = Math.max(xmax, stat.clients);
			ymax = Math.max(ymax, stat.average);
			tpmax = Math.max(tpmax, stat.getTP());
		}
	}

	public String xvals() {
		CoordBuilder b = new CoordBuilder();
		for (Stat stat : stats) {
			b.append(stat.clients * 100 / xmax);
		}
		return b.toString();
	}

	public String yvals() {
		CoordBuilder b = new CoordBuilder();
		for (Stat stat : stats) {
			b.append(stat.average * 100 / ymax);
		}
		return b.toString();
	}

	public String yerrs() {
		CoordBuilder b = new CoordBuilder();
		for (Stat stat : stats) {
			b.append(stat.dev * 100 / ymax);
		}
		return b.toString();
	}

	public String tps() {
		CoordBuilder b = new CoordBuilder();
		for (Stat stat : stats) {
			b.append(stat.getTP() * 100 / tpmax);
		}
		return b.toString();
	}

	public int xmax() {
		return xmax;
	}

	public int ymax() {
		return ymax;
	}

	public int tpmax() {
		return tpmax;
	}

}
