package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Read extends Model {

	@Id
	public Integer Read_ID;
	public String Read;

}
