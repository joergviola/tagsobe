package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
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