package cn.oncelife.Serivce.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.oncelife.Serivce.PersonService;
import cn.oncelife.bean.PersonAccount;
@Service @Transactional @Scope("prototype")
public class PersonServiceImpl implements PersonService {
	@Resource SessionFactory sessionFactory;
	public void save(PersonAccount personAccount){
		sessionFactory.getCurrentSession().persist(personAccount);
	}

	@Override
	public void delete(PersonAccount personAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PersonAccount personAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonAccount find(String email,String password) {
		// TODO Auto-generated method stub
		//return (PersonAccount) sessionFactory.getCurrentSession().get(PersonAccount.class,email);
		String hql="from PersonAccount as personAccount where personAccount.email=? and personAccount.password=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, email);
		query.setString(1, password);
		List<PersonAccount> list=query.list();
		for(PersonAccount personAccount:list){
				return personAccount;
		}
		return null;
		
	}	
	public PersonAccount searchEmail(String email){
		String hql="from PersonAccount as personAccount where personAccount.email=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, email);
		List<PersonAccount> list=query.list();
		for(PersonAccount personAccount:list){
				return personAccount;
		}
		return null;
	}
}
