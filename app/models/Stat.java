package models;

public class Stat {

	public final String page;
	public final int clients;
	public final int dev;
	public final int parse;
	public final int average;

	public Stat(String page, int clients, int average, int dev, int parse) {
		this.page = page;
		this.clients = clients;
		this.dev = dev;
		this.parse = parse;
		this.average = average;
	}

	public int getTP() {
		return 1000 * clients / average;
	}

}
