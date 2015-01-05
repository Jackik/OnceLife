package cn.oncelife.Action;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.apache.jasper.tagplugins.jstl.core.Out;
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
	InputStream inputStream;
	
	public  String getMessage(){
		return msg;
	}
	
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public PersonAccount getPersonAccount() {
		return personAccount;
	}

	public void setPersonAccount(PersonAccount personAccount) {
		this.personAccount = personAccount;
	}

	public String addPersonAccount(){
		if(!personAccount.getEmail().equals("")&&!personAccount.getPassword().equals("")&&!personAccount.getUserName().equals("")&&!personAccount.getPhoneNum().equals("")){
			System.out.println(personAccount.getEmail());
			System.out.println(personAccount.getPassword());
			System.out.println(personAccount.getPhoneNum());
			System.out.println(personAccount.getUserName());
			personService.save(this.personAccount);
			this.msg="恭喜您，注册成功，请登录";
			return "success";
		}else{
			this.msg="注册失败，请联系管理员或者重新注册";
			return "failure";
		}
		
	}
	public String checkEmailReg(){
		if(personAccount.getEmail()!=""){
			if(personService.searchEmail(personAccount.getEmail())==null){
				inputStream= new StringBufferInputStream(transcoding("邮箱可以使用"));
		 	}else{
		 		inputStream= new StringBufferInputStream(transcoding("邮箱已注册，请直接登录，如果忘记密码，请点击找回"));
		 		//this.msg="邮箱已注册，请直接登录，如果忘记密码，请点击找回";
		 	}
		}else{
			inputStream= new StringBufferInputStream(transcoding("请输入邮箱"));
		}
		System.out.println(personAccount);
		System.out.println(personAccount.getEmail());
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
	private String transcoding(String str) {  
        try {  
            return new String(str.getBytes("utf-8"), "iso-8859-1");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        return str;  
    }  
}
