package Model;

public class mobilemember {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String mobile;
	private String address;
	private String time;
	public mobilemember()
	{
		
	}
	public mobilemember(String name,String username, String password, String mobile, String address) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
