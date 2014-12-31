package cn.oncelife.Serivce;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.oncelife.bean.PersonAccount;
@Service @Scope("prototype")
public interface PersonService {
	public void save(PersonAccount personAccount);
	public void delete(PersonAccount personAccount);
	public void update(PersonAccount personAccount);
	public PersonAccount find(String email,String password);
}
