package gungor.dao;

import java.util.List;

import gungor.entities.Users;
 
public interface UsersDao {
    public boolean saveOrUpdate(Users users);
 
    public List<Users> list();
 
    public boolean delete(Users users);
}