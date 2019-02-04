package org.techzoo.restful;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="marker")
public class GoogleXmlPojo {
	
			String id=null;
			String name=null;
			String address=null;
			String lat=null;
			String lng=null;
			String type=null;
			String marker=null;
			String ACCOUNTNO=null;
			
			String MTR_NUMBER=null;
			String DISCONNECTION_DATE=null;
			String RCDC_AMOUNT=null;
			
			public String getMarker() {
				return marker;
			}

			public void setMarker(String marker) {
				this.marker = marker;
			}
			
			@XmlAttribute(name = "acc")
			public String getACCOUNTNO() {
				return ACCOUNTNO;
			}

			public void setACCOUNTNO(String aCCOUNTNO) {
				ACCOUNTNO = aCCOUNTNO;
			}

			@XmlAttribute(name = "meternum")
			public String getMTR_NUMBER() {
				return MTR_NUMBER;
			}

			public void setMTR_NUMBER(String mTR_NUMBER) {
				MTR_NUMBER = mTR_NUMBER;
			}
			
			@XmlAttribute(name = "discdate")
			public String getDISCONNECTION_DATE() {
				return DISCONNECTION_DATE;
			}

			public void setDISCONNECTION_DATE(String dISCONNECTION_DATE) {
				DISCONNECTION_DATE = dISCONNECTION_DATE;
			}
			
			
			@XmlAttribute(name = "rcdc")
			public String getRCDC_AMOUNT() {
				return RCDC_AMOUNT;
			}

			public void setRCDC_AMOUNT(String rCDC_AMOUNT) {
				RCDC_AMOUNT = rCDC_AMOUNT;
			}
			
			public GoogleXmlPojo() {}
			
				public GoogleXmlPojo(String id,
			String name,
			String address,
			String lat,
			String lng,
			String type
			) {
					
					this.id=id;
					this.name=name;
					this.address=address;
					this.lat=lat;
					this.lng=lng;
					this.type=type;
					
				
			}
			
			
			
			
			
		/*	
			@XmlElement (name="marker")
			public String getMarker() {
				return marker;
			}
			public void setMarker(String marker) {
				this.marker = marker;
			}*/
			
			@XmlAttribute(name = "id")
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			
			@XmlAttribute(name = "name")
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			@XmlAttribute(name = "address")
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			
			@XmlAttribute(name = "lat")
			public String getLat() {
				return lat;
			}
			public void setLat(String lat) {
				this.lat = lat;
			}
			
			@XmlAttribute(name = "lng")
			public String getLng() {
				return lng;
			}
			public void setLng(String lng) {
				this.lng = lng;
			}
			
			
			@XmlAttribute(name = "type")
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}

}
