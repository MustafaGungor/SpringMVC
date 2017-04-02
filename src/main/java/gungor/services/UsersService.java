package gungor.services;

import java.util.List;
import gungor.entities.Users;
 
public interface UsersService {
    public boolean saveOrUpdate(Users users);
 
    public List<Users> list();
 
    public boolean delete(Users users);
}
