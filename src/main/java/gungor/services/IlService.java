package gungor.services;

import java.util.List;
import gungor.entities.Il;
 
public interface IlService {
    public boolean saveOrUpdate(Il il);
 
    public List<Il> list();
 
    public boolean delete(Il il);
}
