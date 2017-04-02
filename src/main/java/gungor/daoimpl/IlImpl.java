package gungor.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import gungor.dao.IlDao;
import gungor.entities.Il;
 
@Repository
@Transactional
public class IlImpl implements IlDao {
 
    @Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(Il il) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(il);
        return true;
    }
 
    @SuppressWarnings("unchecked")
	public List<Il> list() {
        return session.getCurrentSession().createQuery("from Il").list();
    }
 
    public boolean delete(Il il) {
        try {
            session.getCurrentSession().delete(il);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}
