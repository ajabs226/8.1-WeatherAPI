package co.grandcircus.weatherlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String displayHome(Model model) {
		model.addAttribute("location", weatherService.getAreaDescription());
		model.addAttribute("gust", weatherService.getGust());
		model.addAttribute("winds", weatherService.getWinds());
		//System.out.println(weatherService.getAreaDescription());
		return "index";
	}

}
