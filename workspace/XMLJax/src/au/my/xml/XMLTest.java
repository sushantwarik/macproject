package au.my.xml;

import java.io.FileNotFoundException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLTest {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext contextObj = JAXBContext.newInstance(Customer.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
	    
	    Customer c = new Customer();
	    c.setfName("Sushant");
	    c.setlName("Warik");
	    StringWriter sw = new StringWriter();
	    marshallerObj.marshal(c, sw);
	    System.out.println("xml : " + sw.toString());
	}

}
