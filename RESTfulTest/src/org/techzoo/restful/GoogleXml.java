package org.techzoo.restful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xml/map")
public class GoogleXml {

/*private Map<String, GoogleXmlPojo> mapxml;
	
	public GoogleXml(){
		mapxml = new HashMap<String, GoogleXmlPojo>();
		mapxml .put("nano", new GoogleXmlPojo("1","Billy Kwong","1/28 Macleay Street Elizabeth Bay NSW","-33.869843", "-151.225769","restaurant"));
		mapxml.put("tavera", new GoogleXmlPojo(2, "Tavera", "Chervolet", 865000));
		mapxml.put("scorpio", new GoogleXmlPojo(2, "Scorpio", "Mahindra", 870000));
	}*/
	
	
private Map<String, MarkerPojo> mapxml;
	
	public GoogleXml(){
		mapxml = new HashMap<String, MarkerPojo>();
		mapxml .put("nano", new MarkerPojo());
		/*mapxml.put("tavera", new GoogleXmlPojo(2, "Tavera", "Chervolet", 865000));
		mapxml.put("scorpio", new GoogleXmlPojo(2, "Scorpio", "Mahindra", 870000));*/
	}
	
	
	
/*	@GET
	@Path("/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public GoogleXmlPojo getCarDetailsByName(@PathParam("name") String name) {
		if(cars.containsKey(name)) return cars.get(name);
		else throw new CarNotFoundException(
			"Car with name = "+name+" not found.");
		
		return mapxml.get("nano");
	}
	
	*/
	@GET
	@Path("/{name}/{name2}")
	@Produces (MediaType.APPLICATION_XML)
	public MarkerPojo getCarDetailsByName(@PathParam("name") String name,@PathParam("name") String name2) {
		/*if(cars.containsKey(name)) return cars.get(name);
		else throw new CarNotFoundException(
			"Car with name = "+name+" not found.");*/
	
						
		return mapxml.get("nano");
	}
	
	
	@GET
	@Path("/{name}/{name2}/{name2}")
	@Produces (MediaType.APPLICATION_XML)
	public MarkerPojo getCarDetailsByNameBulk(@PathParam("name") String name,@PathParam("name") String name2) {
		
		List<GoogleXmlPojo> li=new ArrayList<GoogleXmlPojo>();
		
		
		GoogleXmlDataBase db=new GoogleXmlDataBase();
		li=db.GoogleXmlDatabase("select * from DISCONNECTION_ANDROID");
		MarkerPojo mp=new MarkerPojo();
		mp.setLi(li);
		
		/*if(cars.containsKey(name)) return cars.get(name);
		else throw new CarNotFoundException(
			"Car with name = "+name+" not found.");*/
//		li.add(mapxml.get("nano"));
		
		return mp;
	}
	
	
}
