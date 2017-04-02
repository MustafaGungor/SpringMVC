package gungor.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gungor.entities.Ulke;

@Repository
@Transactional
public class UlkeImpl {
	@Autowired
	SessionFactory session;
	
	public boolean saveOrUpdate(Ulke ulke){
		session.getCurrentSession().saveOrUpdate(ulke);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<Ulke> list(){
		return session.getCurrentSession().createQuery("from ulke").list();
	}
	
	public boolean delete(Ulke ulke){
		try{
		session.getCurrentSession().delete(ulke);
		} catch(Exception ex){
			return false;
		}
		
		return true;
	}
}
