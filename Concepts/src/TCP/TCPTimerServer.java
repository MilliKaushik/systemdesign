package TCP;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPTimerServer {

	public static void main(String[] args) {
		if (args.length < 1)
			return;
		int port = Integer.parseInt(args[0]);
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("Server is listening on port no : " + port);
			Socket socket = serverSocket.accept();
			System.out.println("New client connected");
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			writer.println(new Date());

		} catch (IOException e) {
			System.out.println("Server exception : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
