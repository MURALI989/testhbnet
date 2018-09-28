package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="address")
@SecondaryTables({@SecondaryTable(name="adding"),
	@SecondaryTable(name="printing")})


public class addressd 
{
	

	public int aid;
	public String aloc;
	public String amailid;
	public String apincode;
	
	@Id
	@GeneratedValue
	@Column(name="aloc",table="address")
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Column(name="aloc",table="adding")
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	@Column(name="amailid",table="address")
	
	public String getAmailid() {
		return amailid;
	}
	public void setAmailid(String amailid) {
		this.amailid = amailid;
	}
	
	@Column(name="apincode",table="printing")
	public String getApincode() {
		return apincode;
	}
	public void setApincode(String apincode) {
		this.apincode = apincode;
	}
	
}
