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

import gungor.entities.Ulke;
import gungor.services.UlkeService;

@Controller
@RequestMapping("ulke")
public class UlkeController {
	@Autowired
	UlkeService ulkeService;
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("ulke");
        return view;
    }
 
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getSaved(Ulke ulke) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (ulkeService.saveOrUpdate(ulke)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }
 
        return map;
    }
 
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(Ulke ulke) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Ulke> list = ulkeService.list();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }
 
        return map;
    }
 
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> delete(Ulke ulke) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (ulkeService.delete(ulke)) {
            map.put("status", "200");
            map.put("message", "Your record have been deleted successfully");
        }
 
        return map;
    }
}
