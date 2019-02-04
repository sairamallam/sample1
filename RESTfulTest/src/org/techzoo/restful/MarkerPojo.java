package org.techzoo.restful;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="markers")
public class MarkerPojo {
	
 String marker=null;
 
 GoogleXmlPojo gp= null;
 
 List<GoogleXmlPojo> li=new ArrayList<GoogleXmlPojo>();
/*
 @XmlElement (name="marker")
public GoogleXmlPojo getGp() {
	return new GoogleXmlPojo("1","sai ram","hyderabad","-33.840282", "151.207474","restaurant");
}

public void setGp(GoogleXmlPojo gp) {
	this.gp = gp;
}*/

 @XmlElement (name="marker")
public List<GoogleXmlPojo> getLi() {
	return li;
}

public void setLi(List<GoogleXmlPojo> li) {
	this.li = li;
}


}
