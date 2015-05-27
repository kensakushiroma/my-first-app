package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post extends Model {

	@Id
	public Integer post_id;
	public String post_name;

    public static Finder<Long, Post> find = new Finder<Long,Post>(
            Long.class, Post.class
        );

}
