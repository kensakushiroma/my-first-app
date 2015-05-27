package models;

import javax.persistence.*;
import play.db.ebean.Model.Finder;
import play.db.ebean.Model;

@Entity
public class ThanksCard extends Model {

	@Id
	public Integer thankscard_id;
	public Integer cardmaker_id;
	public String maker_post;
	public String maker_name;
	public java.util.Date transmission_date;
	public java.util.Date help_date;
	public Integer helpcategory_id;
	public String help;
	public String thanks;
	public Integer address_id;
	public String address_post;
	public String address_name;

}
