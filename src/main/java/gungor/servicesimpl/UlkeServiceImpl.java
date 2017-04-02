package gungor.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gungor.dao.UlkeDao;
import gungor.entities.Ulke;
import gungor.services.UlkeService;

@Service
public class UlkeServiceImpl implements UlkeService{
	
	@Autowired
	UlkeDao ulkeDao;
	
	
	public boolean saveOrUpdate(Ulke ulke) {
		// TODO Auto-generated method stub
		return ulkeDao.saveOrUpdate(ulke);
	}

	public List<Ulke> list() {
		// TODO Auto-generated method stub
		return ulkeDao.list();
	}

	public boolean delete(Ulke ulke) {
		// TODO Auto-generated method stub
		return ulkeDao.delete(ulke);
	}

}
