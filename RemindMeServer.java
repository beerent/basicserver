package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RemindMeServer {
	
	public static void main(String [] args){
		SocketWriter writer;
		SocketReader reader;
		try {
			ServerSocket ss = new ServerSocket(1313);
			while(true){
				Socket sock = ss.accept();
				writer = new SocketWriter(sock);
				reader = new SocketReader(sock);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}