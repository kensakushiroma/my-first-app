package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class New extends Model {

	@Id
	public Integer New_ID;
	public String New;

}
