package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post extends Model {

	@Id
	public Integer Post_ID;
	public String Post_name;

}
