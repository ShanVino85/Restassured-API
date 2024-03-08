package requestbody;

import java.io.IOException;
import org.apache.commons.lang3.RandomStringUtils;
import payload.Userpayload;

import utilities.RestUtils;



public class POSTbody extends RestUtils  {
	
	//post body valid user creation
		public static Userpayload PostBody() throws IOException   {
			
			
			UserPayload.setUser_first_name(xlutils.getCellData("postdata", 1, 0));
			UserPayload.setUser_last_name(xlutils.getCellData("postdata", 1, 1));
			UserPayload.setUser_contact_number(xlutils.getCellData("postdata", 1, 2));
			UserPayload.setUser_email_id(xlutils.getCellData("postdata", 1, 3));
			UserPayload.getUserAddress();
			
			Useraddresspayload.setPlotNumber(xlutils.getCellData("postdata", 1, 4));
			Useraddresspayload.setStreet(xlutils.getCellData("postdata", 1, 5));
			Useraddresspayload.setState(xlutils.getCellData("postdata", 1, 6));
			Useraddresspayload.setCountry(xlutils.getCellData("postdata", 1, 7));
			Useraddresspayload.setZipCode(xlutils.getCellData("postdata", 1, 8));
			
			
			return UserPayload;
		}
		
		//post body invalid user creation with the missing mandatory value
				public static Userpayload Postmissingvalue() throws IOException   {
					
					
					UserPayload.setUser_first_name(xlutils.getCellData("postdata", 2, 0));
					UserPayload.setUser_last_name(xlutils.getCellData("postdata", 2, 1));
					UserPayload.setUser_contact_number(xlutils.getCellData("postdata", 2, 2));
					UserPayload.setUser_email_id(xlutils.getCellData("postdata", 2, 3));
					UserPayload.getUserAddress();
					
					Useraddresspayload.setPlotNumber(xlutils.getCellData("postdata", 2, 4));
					Useraddresspayload.setStreet(xlutils.getCellData("postdata", 2, 5));
					Useraddresspayload.setState(xlutils.getCellData("postdata", 2, 6));
					Useraddresspayload.setCountry(xlutils.getCellData("postdata", 2, 7));
					Useraddresspayload.setZipCode(xlutils.getCellData("postdata", 2, 8));
					
					
					return UserPayload;
				}

				
				//post body invalid user creation with the existing emailid
				public static Userpayload Postexistingemail() throws IOException   {
					
					
					UserPayload.setUser_first_name(xlutils.getCellData("postdata", 3, 0));
					UserPayload.setUser_last_name(xlutils.getCellData("postdata", 3, 1));
					UserPayload.setUser_contact_number(xlutils.getCellData("postdata", 3, 2));
					UserPayload.setUser_email_id(xlutils.getCellData("postdata", 3, 3));
					UserPayload.getUserAddress();
					
					Useraddresspayload.setPlotNumber(xlutils.getCellData("postdata", 3, 4));
					Useraddresspayload.setStreet(xlutils.getCellData("postdata", 3, 5));
					Useraddresspayload.setState(xlutils.getCellData("postdata", 3, 6));
					Useraddresspayload.setCountry(xlutils.getCellData("postdata", 3, 7));
					Useraddresspayload.setZipCode(xlutils.getCellData("postdata", 3, 8));
					
					
					return UserPayload;
				}

}
