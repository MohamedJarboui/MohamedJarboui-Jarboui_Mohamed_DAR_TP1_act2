package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
public class Server {
	public static void main(String[] args)
	{
		try {
			int n;
			ServerSocket s=new ServerSocket(1234);	
			System.out.println("je suis un serveur en attente");
			Socket ss=s.accept();
			System.out.println(" tapez un nombre");
			
			
			InputStream is=ss.getInputStream();
			OutputStream os=ss.getOutputStream();
			n=is.read();
			System.out.println("le nombre est : " +n);
			System.out.println("le multiplucation est "+n*5);;
			ss.close();
			}
			catch(IOException e){
			e.printStackTrace();	
				
			}

	
	}
}
	
