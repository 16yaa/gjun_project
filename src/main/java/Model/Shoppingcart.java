package Model;

public class Shoppingcart {
	private Integer sciphome13;
	private Integer scairpads;
	private Integer scphonecable;
	private Integer scphonecase;
	private Integer scprotector;
	private Integer sum;
	public Integer getSciphome13() {
		return sciphome13;
	}
	public void setSciphome13(Integer sciphome13) {
		this.sciphome13 = sciphome13;
	}
	public Integer getScairpads() {
		return scairpads;
	}
	public void setScairpads(Integer scairpads) {
		this.scairpads = scairpads;
	}
	public Integer getScphonecable() {
		return scphonecable;
	}
	public void setScphonecable(Integer scphonecable) {
		this.scphonecable = scphonecable;
	}
	public Integer getScphonecase() {
		return scphonecase;
	}
	public void setScphonecase(Integer scphonecase) {
		this.scphonecase = scphonecase;
	}
	public Integer getScprotector() {
		return scprotector;
	}
	public void setScprotector(Integer scprotector) {
		this.scprotector = scprotector;
	}
	
	public Integer getSum() {
		sum=sciphome13*22900+scairpads*5990+scphonecable*590+scphonecase*1490+scprotector*1390;
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Shoppingcart(Integer sciphome13, Integer scairpads, Integer scphonecable, Integer scphonecase,
			Integer scprotector) {
		super();
		this.sciphome13 = sciphome13;
		this.scairpads = scairpads;
		this.scphonecable = scphonecable;
		this.scphonecase = scphonecase;
		this.scprotector = scprotector;
		sum=sciphome13*22900+scairpads*5990+scphonecable*590+scphonecase*1490+scprotector*1390;
	}
	public Shoppingcart() {}
}
