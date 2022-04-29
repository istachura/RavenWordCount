package WordCountTesting;

import java.io.*;
import java.net.*;

public class RavenWordCountServer {

	public static void main(String[] args) {
		try{
	           ServerSocket serverSocket=new ServerSocket(8080);
	           
	           //establishes connection
	           
	           Socket socket =serverSocket.accept();
	           
	           DataInputStream inputStream=new DataInputStream(socket.getInputStream());
	           DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());

outputStream.flush();

outputStream.close();
serverSocket.close();

}catch(Exception e){
System.out.println(e);
}
}
}