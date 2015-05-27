package controllers;

import play.*;

import play.mvc.*;
import play.data.Form;
import views.html.*;
import models.ThanksCard;


    public class Application extends Controller {

        public static Result index() {
            return ok(index.render("Your new application is ready."));
        }

        public static Result addThanks() {
        	ThanksCard thanks = Form.form(ThanksCard.class).bindFromRequest().get();
        	thanks.save();
        	return redirect(routes.Application.index());
        }

    }


