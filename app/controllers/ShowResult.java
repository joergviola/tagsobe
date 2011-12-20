package controllers;

import java.util.List;

import models.Graph;
import models.Probe;
import models.Stat;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class ShowResult extends Controller {

	public static Result show(String name, String page) {
		Probe probe = Probe.findByName(name);
		List<Stat> stats = probe.getStatForPage(page);
		Graph graph = new Graph(stats);
		return ok(show.render(probe, graph, page));
	}
}