package gungor.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gungor.dao.IlDao;
import gungor.entities.Il;
import gungor.services.IlService;
 
@Service
public class IlServiceImpl implements IlService {
 
    @Autowired
    IlDao ilDao;
 
    public boolean saveOrUpdate(Il il) {
        return ilDao.saveOrUpdate(il);
    }
 
    public List<Il> list() {
        // TODO Auto-generated method stub
        return ilDao.list();
    }
 
    public boolean delete(Il il) {
        // TODO Auto-generated method stub
        return ilDao.delete(il);
    }
 
}