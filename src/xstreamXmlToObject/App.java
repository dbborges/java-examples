package xstreamXmlToObject;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class App {
	
	public static void main(String[] args) {
		
		String XML = "<xstreamXmlToObject.Client>"+
				"<name>DANIEL BORGES</name>"+
				"<code>123</code>"+
				"<birthDate>2015-01-16 01:52:16.666 UTC</birthDate>"+
				"</xstreamXmlToObject.Client>";
				           XStream stream = new XStream(new DomDriver());
				           Client client = (Client) stream.fromXML(XML);

				           System.out.println(client.getCode() + " | " 
				           + client.getName()+" | " + 
				           client.getBirthDate());
				     }
		

}
