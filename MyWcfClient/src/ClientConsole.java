import java.rmi.RemoteException;

/**
 * Simple console application demonstrating opening a connection
 * 	to a WCF web service with a server using basic authentication
 * 	and calling a web method
 * @author James
 *
 */
public class ClientConsole {
	
	
	public static void main(String[] args) throws Exception {
		MyWebServiceClient myWS = new MyWebServiceClient();
		
		boolean connected = false;
		
		if (myWS.getWebServiceClient() != null){
			try {
				connected = myWS.getWebServiceClient().isConnected();
			} catch (RemoteException e) {
				connected = false;
				e.printStackTrace();
			}
		}
		 
		System.out.println("Web Service is available: " + connected);
	}
	
	
	
}
