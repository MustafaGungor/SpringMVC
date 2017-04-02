package gungor.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gungor.dao.UsersDao;
import gungor.entities.Users;
import gungor.services.UsersService;
 
@Service
public class UsersServiceImpl implements UsersService {
 
    @Autowired
    UsersDao userDao;
 
    public boolean saveOrUpdate(Users users) {
        return userDao.saveOrUpdate(users);
    }
 
    public List<Users> list() {
        // TODO Auto-generated method stub
        return userDao.list();
    }
 
    public boolean delete(Users users) {
        // TODO Auto-generated method stub
        return userDao.delete(users);
    }
 
}
