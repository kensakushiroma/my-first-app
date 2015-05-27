package controllers;

import play.*;
import models.Post;
import play.mvc.*;
import play.data.Form;
import views.html.index;
import models.ThanksCard;
import models.Member;
import models.HelpCategory;
import java.util.List;
import play.mvc.Controller;
import play.mvc.Result;

    public class Application extends Controller {

        public static Result index() {
        	List<Post> post = Post.find.all();
        	List<Member> member = Member.find.all();
        	List<HelpCategory> helpcategory = HelpCategory.find.all();
            return ok(index.render(post,member,helpcategory));
        }

        public static Result addThanks() {

        	ThanksCard thanks = Form.form(ThanksCard.class).bindFromRequest().get();
        	thanks.save();
        	return redirect(routes.Application.index());
        }

    }


