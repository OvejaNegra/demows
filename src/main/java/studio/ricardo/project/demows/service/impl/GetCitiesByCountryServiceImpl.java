package studio.ricardo.project.demows.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studio.ricardo.project.demows.service.GetCitiesByCountryService;
import studio.ricardo.project.demows.ws.client.GetCitiesByCountryWSClient;

@Service("getCitiesByCountryService")
public class GetCitiesByCountryServiceImpl implements GetCitiesByCountryService {

	@Autowired
	GetCitiesByCountryWSClient getCitiesByCountryWSClient;

	public String getCitiesByCountry(String country) {
		return getCitiesByCountryWSClient.getCitiesByCountry(country).getGetCitiesByCountryResult();
	}
}
