import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.tempuri.IC_Mobile_WcfLocator;
import org.tempuri.MobileWebService;
import org.tempuri.SecureEndpointStub;

/**
 * This is the class we'll use to interact with the web service
 * 
 * To first create the referenced needed here to org.tempuri
 * 	I accessed the web service and navigated to the wsdl link
 * 	There I saved the contents of the page to a local file as .wsdl
 * 	I imported the file into this project
 * 	I created a new Other->Web Services->Web Service Client
 * 	Set the level to Deploy and browsed to the wsdl file in the project
 * 		for the definition
 * 	Eclipse did the rest and generated the references 
 * @author James
 *
 */
public class MyWebServiceClient {
	private final static String TAG = "MyWebService";

	private final static String WEBSERVICE_URL = "";	// the address of the service
	private final static String USERNAME = "";			// the username for basic auth
	private final static String PASSWORD = "";			// the password for basic auth

	private MobileWebService mWebService;
	
	void init(){
		// create a new Stub so we can set the Username and Password
		// 	this WCF requires basic Authentication
		SecureEndpointStub stub;
		try {
			stub = new SecureEndpointStub(new URL(WEBSERVICE_URL), new IC_Mobile_WcfLocator());
			stub.setUsername(USERNAME);
			stub.setPassword(PASSWORD);
			mWebService = stub;
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	/**
	 * ctor
	 */
	public MyWebServiceClient(){
		// initialize the web service object
		init();		
	}
	
	/**
	 * Gets the web service object used to call web service methods
	 * @return The MobileWebService 
	 */
	public MobileWebService getWebServiceClient(){
		if(mWebService == null){
			init();
			if (mWebService == null){
				return null; // not much to be done at this point
			}
		}
		// not null, return the service
		return mWebService;
	}
	
	
}
