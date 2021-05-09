package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//https://www.codejava.net/java-se/networking/java-socket-server-examples-tcp-ip
//First run the server code using run configuration, in program args enter 6858 as pprt no.
//Then run the client code, give args as "localhost 6858"
//the socket is the connection essentially
public class TCPTimerClient {
	public static void main(String[] args) {
		if (args.length < 2)
			return;

		String hostname = args[0];
		int port = Integer.parseInt(args[1]);

		try (Socket socket = new Socket(hostname, port)) {

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			String time = reader.readLine();

			System.out.println(time);

		} catch (UnknownHostException ex) {

			System.out.println("Server not found: " + ex.getMessage());

		} catch (IOException ex) {

			System.out.println("I/O error: " + ex.getMessage());
		}
	}

}
