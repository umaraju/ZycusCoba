package ZycusCobaTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import ZycusCobaObj.User;

public class OnBoardingNewCustomerCreate {
	
	@Test
	public void validateCustomerInfo() throws JsonParseException, JsonMappingException, IOException {
		
		//Object mapping from JSON to Java object
		ObjectMapper om = new ObjectMapper();
		User OnBoardingCustomerData = om.readValue(new File(System.getProperty("User.dir")+"//data//CustomerCreate.json"), User.class);
		
		//Validating if customer age and Phone Numbers data is correct
		assert OnBoardingCustomerData.getAge().equals(25):"user age is wrong !!!";
		assert OnBoardingCustomerData.getPhoneNumbers().size() == 2:"Not all phone numbers are available";
		
	}

}
