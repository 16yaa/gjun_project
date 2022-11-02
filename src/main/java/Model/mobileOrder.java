package Model;

public class mobileOrder {
	private Integer id;
	private String name;
	private Integer iphome13;
	private Integer airpads;
	private Integer phonecable;
	private Integer phonecase;
	private Integer protector;
	private Integer sum;
	private String time,status;
	private int scphone,scairpads,scphonecable,scphonecase,scprotector;
	public mobileOrder(){
		
	}

	public mobileOrder(String name,Integer iphome13, Integer airpads, Integer phonecable, Integer phonecase, Integer protector) 
	{
		this.name=name;
		this.iphome13 = iphome13;
		this.airpads = airpads;
		this.phonecable = phonecable;
		this.phonecase = phonecase;
		this.protector = protector;
		sum=iphome13*22900+airpads*5990+phonecable*590+phonecase*1490+protector*1390;
	}

	public int getScphone() {
		return scphone;
	}

	public void setScphone(int scphone) {
		this.scphone = scphone;
	}

	public int getScairpads() {
		return scairpads;
	}

	public void setScairpads(int scairpads) {
		this.scairpads = scairpads;
	}

	public int getScphonecable() {
		return scphonecable;
	}

	public void setScphonecable(int scphonecable) {
		this.scphonecable = scphonecable;
	}

	public int getScphonecase() {
		return scphonecase;
	}

	public void setScphonecase(int scphonecase) {
		this.scphonecase = scphonecase;
	}

	public int getScprotector() {
		return scprotector;
	}

	public void setScprotector(int scprotector) {
		this.scprotector = scprotector;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIphome13() {
		return iphome13;
	}

	public void setIphome13(Integer iphome13) {
		this.iphome13 = iphome13;
	}

	public Integer getAirpads() {
		return airpads;
	}

	public void setAirpads(Integer airpads) {
		this.airpads = airpads;
	}

	public Integer getPhonecable() {
		return phonecable;
	}

	public void setPhonecable(Integer phonecable) {
		this.phonecable = phonecable;
	}

	public Integer getPhonecase() {
		return phonecase;
	}

	public void setPhonecase(Integer phonecase) {
		this.phonecase = phonecase;
	}

	public Integer getProtector() {
		return protector;
	}

	public void setProtector(Integer protector) {
		this.protector = protector;
	}

	public Integer getSum() {
		sum=iphome13*22900+airpads*5990+phonecable*590+phonecase*1490+protector*1390;
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
