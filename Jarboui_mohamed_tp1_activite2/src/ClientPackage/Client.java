package ClientPackage;

import java.net.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {
	public static void main(String[] args) {
		try {
		 int n;
		 Scanner scanner= new Scanner(System.in);
		 
		 Socket socket=new Socket("localhost",1234);
		 System.out.println("je suis connecte");
		 System.out.println("je suis connecte");
		 System.out.println("le nombre est =  ");
		 n=scanner.nextInt();
		 InputStream is=socket.getInputStream();
		 OutputStream os=socket.getOutputStream();	
		 os.write(n);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
