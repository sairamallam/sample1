package org.techzoo.restful;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import disconnection.dataBase.DataBaseConnection.DataBaseConnection;

public class GoogleXmlDataBase {

	
	public List GoogleXmlDatabase(String Query) {

/* Data base data writing in xml file --start*/
        
        DataBaseConnection db=new DataBaseConnection();
		PreparedStatement ps=null;
		Connection con=null;
		ResultSet rs=null;
	
		GoogleXmlPojo gp=null;
		MarkerPojo mp=null;
		
		Map<String, MarkerPojo> mapxml=null;
		
		 
		 List<GoogleXmlPojo> li=new ArrayList<GoogleXmlPojo>();
		
		
		try {
		
		con=db.getRaipurConnection2();
//		System.out.println("select * from DISCONNCTION_LOGIN where id='"+User_id+"'");
		ps=con.prepareStatement(Query);
		rs=ps.executeQuery();
		
		int i=0;
		while(rs.next()) {
			
			/*mapxml = new HashMap<String, MarkerPojo>();*/
			mp=new MarkerPojo(); 
			gp=new GoogleXmlPojo();
        //append first child element to root element
        gp.setId(rs.getString("ACCOUNTNO"));
       // rs.getString("SCNO");
        //rs.getString("BOOK_CODE"); 
        gp.setName(rs.getString("NAME"));
        gp.setAddress(rs.getString("ADDRESS1")); 
        gp.setLat(rs.getString("LATITUDE")); 
        gp.setLng(rs.getString("LONGITUDE"));
        gp.setDISCONNECTION_DATE(rs.getString("DISCONNECTION_DATE"));
        gp.setACCOUNTNO(rs.getString("ACCOUNTNO"));
        gp.setRCDC_AMOUNT(rs.getString("RCDC_AMOUNT"));
        
        
        li.add(gp);
       /* mp.setGp(gp);
        mapxml.put(""+(i++), mp);*/
        
		}
	/**/
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null)
					rs.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				if (ps!=null)
					ps.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			
			try {
				if (con!=null)
					con.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return li;
		
		/* Data base data writing in xml file --end*/
		
	
	}
	
	
	public static void main(String[] args) {

	}

}
