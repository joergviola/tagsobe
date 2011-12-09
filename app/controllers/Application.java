package controllers;

import models.Contribution;

import org.apache.commons.mail.EmailException;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import util.Mail;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		Form<Contribution> cform = form(Contribution.class);
		return ok(index.render(cform));
	}

	public static Result contribute() throws EmailException {
		Form<Contribution> form = form(Contribution.class);
		Contribution contribution = form.bindFromRequest().get();

		Mail email = new Mail();
		email.setFrom("user@gmail.com");
		email.setSubject("TestMail");
		email.setMsg(mail.render(contribution));
		email.addTo("foo@bar.com");
		email.send();

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