package controllers;

import models.Member;
import models.ThanksCard;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;
import play.mvc.*;
import views.html.authentication.*;
import java.util.List;

public class Authentication extends Controller {

	//ログイン認証
	public static class Login {
        public String username;
        public String password;


        public String validate() {
            if (authenticate(username, password)) {
                return null;
            }
            return "Invalid username and password";
        }

        //ユーザとパスワードの比較
        private Boolean authenticate(String username, String password) {

            //return (username.equals("gongo") && password.equals("pizza"));
        	return Member.authenticate(username, password);

        }
    }


	//よくわからない
	public static List<ThanksCard> thanks = ThanksCard.find.all();
    public static Form<Login> loginForm = Form.form(Login.class);

    public static Result index() {

    	if (session("login") != null) {
           return ok("あなたは既に " + session("login") + "としてログインしています");
        }
        return ok(index.render(loginForm));
    }

    public static Result authenticate() {
    	Form<Login> form = loginForm.bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Login login = form.get();
            session("login", login.username);

            //System.out.println("ようこそ " + login.username + " さん!!");
            return ok(main.render(thanks));
        }

    }
//ログアウト処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }
}