package cn.oncelife.Action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.oncelife.Serivce.PersonService;
import cn.oncelife.bean.PersonAccount;

@Controller @Scope("prototype")
public class LoginAction {
	@Resource PersonService personService;
	@Resource PersonAccount personAccount;
	
	public String checkUser(){
		if(personService.find(personAccount.getEmail(),personAccount.getPassword())!=null)
		return "success";
		else{
			return "error";
		}
	}

	public PersonAccount getPersonAccount() {
		return personAccount;
	}

	public void setPersonAccount(PersonAccount personAccount) {
		this.personAccount = personAccount;
	}
}
