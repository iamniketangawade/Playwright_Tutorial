package Playwright_API;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;

public class Playwright_setupAPIRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setup for API request :
		Playwright playwright =Playwright.create();
		APIRequestContext request=playwright.request().newContext();
	
		//GET ::
		// Status code ::
		APIResponse response =request.get("https://reqres.in/api/users/2");
		System.out.println("Status code :: " + response.status());   //return status code  (response.status())
		
		//Responce body ::
		String responsebody =response.text();
		//System.out.println("Responce body : " +responsebody);
		
		 JsonObject jsonResponce =JsonParser.parseString(responsebody).getAsJsonObject();
		 String firstname =jsonResponce.get("first_name").getAsString();
		 System.out.println(firstname);
		 
		 //----------------------------------------------------------------------
		 //POST ::
		 Map<String, Object> data =new HashMap<String, Object>();
		 data.put("firstname","Niketan");
		 data.put("LastName", "GG");
		 
			APIResponse response1 =request.post("https://reqres.in/api/users/2",RequestOptions.create().setData(data));
			System.out.println("Status code :: " + response1.status());   //return status code  (response.status())
		 request.dispose();
		 playwright.close();
		
	}

}
