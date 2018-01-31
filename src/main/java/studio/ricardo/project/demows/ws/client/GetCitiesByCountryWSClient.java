package studio.ricardo.project.demows.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import net.webservicex.globalweather.GetCitiesByCountry;
import net.webservicex.globalweather.GetCitiesByCountryResponse;
import studio.ricardo.project.demows.config.ws.SoapWSExecutionCallBack;

public class GetCitiesByCountryWSClient extends WebServiceGatewaySupport {

	public GetCitiesByCountryResponse getCitiesByCountry(String country) {
		GetCitiesByCountry request = new GetCitiesByCountry();
		request.setCountryName(country);

		return (GetCitiesByCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapWSExecutionCallBack("http://www.webserviceX.NET/GetCitiesByCountry"));

	}

}
