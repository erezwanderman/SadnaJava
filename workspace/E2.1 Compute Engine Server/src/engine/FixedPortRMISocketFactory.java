package engine;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.RMISocketFactory;

public class FixedPortRMISocketFactory extends RMISocketFactory {

	@Override
	public ServerSocket createServerSocket(int port) throws IOException {
		port = (port == 0 ? 1098 : port);
		System.out.println("creating ServerSocket on port " + port);
		return new ServerSocket(port);
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException {
		System.out.println("creating socket to host : " + host + " on port " + port);
		return new Socket(host, port);
	}

}
