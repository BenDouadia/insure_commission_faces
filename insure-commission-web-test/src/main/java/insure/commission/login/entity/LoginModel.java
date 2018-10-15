package insure.commission.login.entity;

public class LoginModel {

	String tenant;
	String pusername;
	String password;


	public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getUsername() {
		return pusername;
	}
	public void setUsername(String pusername) {
		this.pusername = pusername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
