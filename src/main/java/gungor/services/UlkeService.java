package gungor.services;

import java.util.List;

import gungor.entities.Ulke;

public interface UlkeService {
	public boolean saveOrUpdate(Ulke ulke);
	
	public List<Ulke> list();
	
	public boolean delete(Ulke ulke);
}
