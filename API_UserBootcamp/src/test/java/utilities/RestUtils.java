package utilities;

import java.io.File;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import io.restassured.response.Response;
import payload.Userpayload;
import payload.Useraddresspayload;
public class RestUtils {
	
	public static Response response;

	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");

	public static Logger log = LogManager.getLogger();

	//Schema and xcell path
	public static ResourceBundle path = ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));

	//user schema path
	public static File Updatejson = xlutils.getJSONFile(path.getString("UpdateSchemajson"));
	public static File Postjson = xlutils.getJSONFile(path.getString("Postschemajson"));	

    //payload objects
	public static Userpayload UserPayload = new Userpayload();
	public static Useraddresspayload Useraddresspayload = new Useraddresspayload();
	
   
	
}
