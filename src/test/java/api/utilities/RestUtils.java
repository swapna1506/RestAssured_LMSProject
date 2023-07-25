package api.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import api.payload.AssignmentPayload;
import api.payload.AssignmentSubmitPayload;
import api.payload.BatchPayload;
import api.payload.ProgramPayload;
import api.payload.UserPayload;
import api.payload.UserRoleMap;
import io.restassured.response.Response;

public class RestUtils {
	
	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");
	public static Logger log = LogManager.getLogger();
	public static String path =".\\src\\test\\resources\\TestData\\DataExcel.xlsx";
	public static String jsonPath =".\\src\\test\\resources\\JsonSchema\\programSchema.json";
	public static XLUtils xlutils=new XLUtils(path);
	public static Response response;
	public static ProgramPayload ProgramPayload = new ProgramPayload();
	public static BatchPayload BatchPayload = new BatchPayload();
	public static UserPayload UserPayload = new UserPayload();
	public static UserRoleMap UserRoleMap = new UserRoleMap();
	public static AssignmentPayload AssignmentPayload = new AssignmentPayload();
	public static AssignmentSubmitPayload AssignmentSubmitPayload = new AssignmentSubmitPayload();
	public static String AdminUser;
	public static String StudentUser;	
	
	
	public static PrintStream Logger() throws FileNotFoundException {	
	PrintStream logs = new PrintStream(new FileOutputStream("logging.txt"));
	return logs;
	}
	//public static File Batchpostjson = new File(".\\src\\test\\resources\\assignmentSubmit.json");

}
