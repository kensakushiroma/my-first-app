package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelpCategory extends Model {

	@Id
	public Integer help_id;
	public String help_name;

    public static Finder<Long,HelpCategory> find = new Finder<Long,HelpCategory>(
            Long.class, HelpCategory.class
        );


}
