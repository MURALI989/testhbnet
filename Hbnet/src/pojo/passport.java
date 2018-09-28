package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class passport {

	public person per;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkid")
	
	public person getPer() {
		return per;
	}
	public void setPer(person per) {
		this.per = per;
	}
	public int pid;
	public String ploc;
	public int pisd;
	public int pexd;
	
	
	@Id
	@GeneratedValue
	@Column(name="pid")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(name="ploc")
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	@Column(name="pisd")
	public int getPisd() {
		return pisd;
	}
	public void setPisd(int pisd) {
		this.pisd = pisd;
	}
	@Column(name="pexd")
	public int getPexd() {
		return pexd;
	}
	public void setPexd(int pexd) {
		this.pexd = pexd;
	}
	
}
