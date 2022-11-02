package Model;

public class Employee {
	private String username,password,createtime,admin;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public Employee(String username, String password,String createtime, int id) {
		this.username = username;
		this.password = password;
		this.createtime = createtime;
		this.id = id;
	}
	public Employee() {}
	public Employee(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
