package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mobile")

public class mobile {
	public person pers;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkpid")
	public person getPers() {
		return pers;
	}
	public void setPers(person pers) {
		this.pers = pers;
	}

	
	
	
	public int mid;
	public int mnum;
	public String msp;
	
	@Id
	@GeneratedValue
	@Column(name="mid")
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	@Column(name="mnum")
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	
	@Column(name="msp")
	public String getMsp() {
		return msp;
	}
	public void setMsp(String msp) {
		this.msp = msp;
	}
	

}
