package gungor.dao;

import java.util.List;

import gungor.entities.Il;
 
public interface IlDao {
    public boolean saveOrUpdate(Il users);
 
    public List<Il> list();
 
    public boolean delete(Il users);
}