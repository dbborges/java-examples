package xstreamObjectToXml;

import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class App {
	
	public static void main(String[] args) {
		
	   Client client = new Client();
	   client.setCode(123);
	   client.setBirthDate(new Date());
	   client.setName("DANIEL BORGES");

	   XStream stream = new XStream(new DomDriver());
	   System.out.println(stream.toXML(client));
		
	}

}
