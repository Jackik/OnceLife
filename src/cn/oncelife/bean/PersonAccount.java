package cn.oncelife.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller @Scope("prototype")
public class PersonAccount {
	private Integer id;
	private String email;
	private String userName;
	private String password;
	private String phoneNum;
	private String safeAccount;
	public PersonAccount() {
		super();
	}
	public String getSafeAccount() {
		return safeAccount;
	}
	public void setSafeAccount(String safeAccount) {
		this.safeAccount = safeAccount;
	}
	public Integer getid() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}	
	
}
