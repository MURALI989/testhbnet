package pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")

public class courses {
	 
	public List<person> perc;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="pcourses",joinColumns= {@JoinColumn(name="fkcid")},inverseJoinColumns= {@JoinColumn(name="fkpid")})
	public List<person> getPerc() {
		return perc;
	}
	public void setPerc(List<person> perc) {
		this.perc = perc;
	}
	public int cid;
	public String cname;
	public int cdur;

	@Id
	@GeneratedValue
	@Column(name="cid")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(name="cname")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column(name="cdur")
	public int getCdur() {
		return cdur;
	}
	public void setCdur(int cdur) {
		this.cdur = cdur;
	}
	


 }
