package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.InputStreamReader;

public class ClientPre {

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("localhost", 12360);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			PrintWriter out = new PrintWriter(client.getOutputStream());
			
			out.println("hello, server");
			
			String message = in.readLine();
			System.out.println(message);

			
			in.close();
			out.close();
			client.close();
			
			
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
