package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelpCategory extends Model {

	@Id
	public Integer HelpCategory_ID;
	public String HelpCategory;

}
