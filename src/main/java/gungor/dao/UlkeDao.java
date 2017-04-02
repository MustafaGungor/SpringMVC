package gungor.dao;

import java.util.List;

import gungor.entities.Ulke;
 
public interface UlkeDao {
    public boolean saveOrUpdate(Ulke users);
 
    public List<Ulke> list();
 
    public boolean delete(Ulke users);
}