package models;

import javax.persistence.Entity;

import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class Member extends Model {
    @Id
	public Long Member_ID;
	public Integer Post_ID;
	public String Member_name;
	public String Login_password;
	public Integer Authority_ID;

    public static Finder<Long, Member> find = new Finder<Long,Member>(
            Long.class, Member.class
        );

    public static Boolean authenticate(String Member_name, String Login_password) {
       Member member = find.where().eq("Member_name", Member_name).findUnique();
        return (member != null && member.Login_password.equals(Login_password));
    }

    public static Long create(String username, String password) {
        Member member = new Member();
        member.Member_name = username;
        member.Login_password = password;
        member.save();

        return member.Member_ID;
    }
}