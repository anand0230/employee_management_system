package test;

public class EmployeeBean {
	
	private String eId,eName,eDesg;
	private int bSal;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesg() {
		return eDesg;
	}
	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}
	public int getbSal() {
		return bSal;
	}
	public void setbSal(int bSal) {
		this.bSal = bSal;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getTotsal() {
		return totsal;
	}
	public void setTotsal(float totsal) {
		this.totsal = totsal;
	}
	private float hra ,da,totsal;

}
