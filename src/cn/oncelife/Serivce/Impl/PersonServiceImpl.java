package cn.oncelife.Serivce.Impl;

import javax.annotation.Resource;

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
		System.out.println(personAccount.getid());
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
	public PersonAccount find(PersonAccount personAccount) {
		// TODO Auto-generated method stub
		return null;
	}
}
