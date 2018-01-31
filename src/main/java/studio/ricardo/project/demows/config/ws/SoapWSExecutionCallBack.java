package studio.ricardo.project.demows.config.ws;

import java.io.IOException;

import javax.xml.soap.MimeHeaders;
import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

public class SoapWSExecutionCallBack implements WebServiceMessageCallback {

	private String soapAction;

	public SoapWSExecutionCallBack(String soapAction) {
		this.soapAction = soapAction;
	}

	@Override
	public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
		if (message instanceof SaajSoapMessage) {
			SaajSoapMessage soapMessage = (SaajSoapMessage) message;
			MimeHeaders mimeHeader = soapMessage.getSaajMessage().getMimeHeaders();
			mimeHeader.setHeader("SOAPAction", soapAction);
		}
	}

}
