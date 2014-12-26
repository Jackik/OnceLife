package cn.oncelife.Action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.oncelife.Serivce.PersonService;
import cn.oncelife.Serivce.Impl.PersonServiceImpl;
import cn.oncelife.bean.PersonAccount;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
@Controller @Scope("prototype")
public class RegisterAction  {
	@Resource PersonService personService;
	@Resource PersonAccount personAccount;
	
	private String msg;
	
	public  String getMessage(){
		return msg;
	}
	
	public PersonAccount getPersonAccount() {
		return personAccount;
	}

	public void setPersonAccount(PersonAccount personAccount) {
		this.personAccount = personAccount;
	}

	public String addPersonAccount(){
		this.msg="hello struts";
		personService.save(this.personAccount);
		return "success";
	}

	/*@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		this.personAccount = new PersonAccount();
	}

	@Override
	public PersonAccount getModel() {
		// TODO Auto-generated method stub
		return personAccount;
	}*/
}
