package au.com.spring.batch.processor;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.batch.item.ItemProcessor;

import au.com.spring.batch.bo.Vehicle;

public class DbItemProcessor implements ItemProcessor<Vehicle,Vehicle> {

	@Override
	public Vehicle process(Vehicle vehicle) throws Exception {
		try{
			System.out.println("Processing Vehicle " + vehicle.getModelNo());
			HttpClient provider = HttpClientBuilder.create().build();
			HttpPost postMethod = new HttpPost("http://192.168.2.6:7801/xml");
			JAXBContext contextObj = JAXBContext.newInstance(Vehicle.class);  
			  
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		    StringWriter sw = new StringWriter();
		    marshallerObj.marshal(vehicle, sw);
			postMethod.setEntity(new StringEntity(sw.toString()));
			
			HttpResponse response = provider.execute(postMethod);
			System.out.println("HTTP Response status : " + response.getStatusLine());
		} catch(Exception e){
			e.printStackTrace(System.out);
			System.out.println("Error : " + vehicle);
		}
		return vehicle;
	}

}
