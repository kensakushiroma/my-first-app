package controllers;

import models.Member;

import models.*;
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
        public Integer userid;
        public String password;


        public String validate() {
            if (authenticate(userid, password)) {
                return null;
            }
            return "Invalid userid and password";
        }

        //ユーザとパスワードの比較
        private Boolean authenticate(Integer userid, String password) {

            //return (username.equals("gongo") && password.equals("pizza"));
        	return Member.authenticate(userid, password);

        }
    }


	//よくわからない

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
        //    session("login", login.userid);

            //System.out.println("ようこそ " + login.username + " さん!!");
            return ok(main.render());
        }

    }


    public static Result main(){
    	return ok(main.render());
    }

//ログアウト処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }
}