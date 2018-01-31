package studio.ricardo.project.demows.config.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import studio.ricardo.project.demows.ws.client.GetCitiesByCountryWSClient;

@Configuration
public class GetCitiesByCountryWSConfig {

	@Bean
	public Jaxb2Marshaller getCitiesByCountryMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("net.webservicex.globalweather");
		return marshaller;
	}

	@Bean
	public GetCitiesByCountryWSClient getCitiesByCountryWSClient(Jaxb2Marshaller getCitiesByCountryMarshaller) {
		GetCitiesByCountryWSClient client = new GetCitiesByCountryWSClient();
		client.setMarshaller(getCitiesByCountryMarshaller);
		client.setUnmarshaller(getCitiesByCountryMarshaller);
		client.setDefaultUri("http://www.webservicex.net/globalweather.asmx");
		return client;
	}
}
