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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import java.io.Serializable;

@Entity
@Table(name="person")
public class person {

	public int pid;
	public String pname;
	public int page;
	public passport psn;
	@OneToOne(mappedBy ="per",cascade=CascadeType.ALL)
    public passport getPsn() {
		return psn;
	}
	public void setPsn(passport psn) {
		this.psn = psn;
	}
	
	
	public List<mobile> mob;
	@OneToMany(mappedBy ="pers",cascade=CascadeType.ALL)	
	public List<mobile> getMob() {
		return mob;
	}
	public void setMob(List<mobile> mob) {
		this.mob = mob;
	}
	
	public List<courses> cer;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="pcourses",joinColumns= {@JoinColumn(name="fkpid")},inverseJoinColumns= {@JoinColumn(name="fkcid")})

public List<courses> getCer() {
		return cer;
	}
	public void setCer(List<courses> cer) {
		this.cer = cer;
	}
@Id
@GeneratedValue
@Column(name="pid")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(name="pname")
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Column(name="page")
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	}

