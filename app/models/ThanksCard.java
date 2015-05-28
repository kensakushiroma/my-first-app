package models;

import javax.persistence.*;
import play.db.ebean.Model.Finder;
import play.db.ebean.Model;

@Entity
public class ThanksCard extends Model {

	@Id
	public Integer thankscard_id;

	@ManyToOne(cascade = CascadeType.ALL)

	public Member member;

	@ManyToOne(cascade = CascadeType.ALL)
	public Post post;

	public java.util.Date transmission_date;
	public java.util.Date help_date;

	@ManyToOne(cascade = CascadeType.ALL)
	public HelpCategory helpcategory_id;

	public String thanks;

	@ManyToOne(cascade = CascadeType.ALL)
	public Post address_post;

	@ManyToOne(cascade = CascadeType.ALL)
	public Member address_member;



    public static Finder<Long, ThanksCard> find = new Finder<Long,ThanksCard>(
            Long.class, ThanksCard.class
        );

}