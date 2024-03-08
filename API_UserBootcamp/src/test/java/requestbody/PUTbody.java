package requestbody;

import java.io.IOException;

import payload.Userpayload;
import utilities.RestUtils;

public class PUTbody extends RestUtils{
	
	//put body valid user updating by contact number creation
			public static Userpayload PutBody() throws IOException   {
				
				
				UserPayload.setUser_first_name(xlutils.getCellData("Putdata", 1, 0));
				UserPayload.setUser_last_name(xlutils.getCellData("Putdata", 1, 1));
				UserPayload.setUser_contact_number(xlutils.getCellData("Putdata", 1, 2));
				UserPayload.setUser_email_id(xlutils.getCellData("Putdata", 1, 3));
				UserPayload.getUserAddress();
				
				Useraddresspayload.setPlotNumber(xlutils.getCellData("Putdata", 1, 4));
				Useraddresspayload.setStreet(xlutils.getCellData("Putdata", 1, 5));
				Useraddresspayload.setState(xlutils.getCellData("Putdata", 1, 6));
				Useraddresspayload.setCountry(xlutils.getCellData("Putdata", 1, 7));
				Useraddresspayload.setZipCode(xlutils.getCellData("Putdata", 1, 8));
				
				
				return UserPayload;
			}

			
			//put body invalid user updating  with the existing emailid
			public static Userpayload Postexistingemail() throws IOException   {
				
				
				UserPayload.setUser_first_name(xlutils.getCellData("Putdata", 2, 0));
				UserPayload.setUser_last_name(xlutils.getCellData("Putdata", 2, 1));
				UserPayload.setUser_contact_number(xlutils.getCellData("Putdata", 2, 2));
				UserPayload.setUser_email_id(xlutils.getCellData("Putdata", 2, 3));
				UserPayload.getUserAddress();
				
				Useraddresspayload.setPlotNumber(xlutils.getCellData("Putdata", 2, 4));
				Useraddresspayload.setStreet(xlutils.getCellData("Putdata", 2, 5));
				Useraddresspayload.setState(xlutils.getCellData("Putdata", 2, 6));
				Useraddresspayload.setCountry(xlutils.getCellData("Putdata", 2, 7));
				Useraddresspayload.setZipCode(xlutils.getCellData("Putdata", 2, 8));
				
				
				return UserPayload;
			}
}
