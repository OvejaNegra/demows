package studio.ricardo.project.demows.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import studio.ricardo.project.demows.service.impl.GetCitiesByCountryServiceImpl;

@RestController
@RequestMapping("/")
public class DemoRestController {

	@Autowired
	private GetCitiesByCountryServiceImpl getCitiesByCountryService;

	@GetMapping
	public String index(@RequestParam(value = "country") String country) {
		return getCitiesByCountryService.getCitiesByCountry(country);
	}
}
