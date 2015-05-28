package models;

import javax.persistence.*;

import javax.persistence.Id;
import play.db.ebean.Model;
import javax.validation.*;
import play.data.validation.*;
import javax.persistence.*;
import models.*;

@Entity
public class Member extends Model {
    @Id
	public Integer member_id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Post post;

//public Post post_id;
	public String member_name;
	public String login_password;
	public Integer authority_id;

    public static Finder<Long, Member> find = new Finder<Long,Member>(
            Long.class, Member.class
        );

    public static Boolean authenticate(Integer member_id, String login_password) {
       Member member = find.where().eq("member_id", member_id).findUnique();
        return (member != null && member.login_password.equals(login_password));
    }

    public Post getPost() {
        return this.post;
    }

}