package gungor.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import gungor.entities.Il;
import gungor.services.IlService;

@Controller
@RequestMapping("il")
public class IlController {
	@Autowired
	IlService ilService;
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView view=new ModelAndView("il");
		return view;
	}
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Il il){
		Map<String, Object> map = new HashMap<String,Object>();
		
		if(ilService.saveOrUpdate(il)){
			map.put("status", "200");
			map.put("message", "Başarıyla işleminiz gerçekleştirildi");
		}
		
		return map;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getAll(Il il){
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Il> list = ilService.list();
		
		if(list !=null){
			map.put("status", "200");
			map.put("message", "Data Found");
			map.put("data", list);
		}else {
			map.put("status", "404");
			map.put("message", "Data not found");
		}
		
		return map;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> delete(Il il){
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(ilService.delete(il)){
			map.put("status", "200");
			map.put("message", "Kaydınız başarıyla silinmiştir");
		}
		
		return map;
	}
}
