package controllers;

import models.Contribution;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		Form<Contribution> cform = form(Contribution.class);
		return ok(index.render(cform));
	}

	public static Result contribute() {
		Form<Contribution> form = form(Contribution.class);
		Contribution contribution = form.bindFromRequest().get();
		return ok(thanks.render());
	}

	public static Result download() {
		return ok(download.render());
	}

	public static Result disclaimer() {
		return ok(disclaimer.render());
	}

	public static Result about() {
		return ok(about.render());
	}

	public static Result help() {
		return ok(help.render());
	}

}