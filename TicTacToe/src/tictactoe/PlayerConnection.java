package tictactoe;
//Game server:

//Message
//{
//    action: update_status
//	body: {status : game_draw}
//}
//
//{
//    action: game_init
//	body: {gameId : 123, pieceColor: cross}
//}
//Board.java was on machine M1
//
//PlayerConnectionManager is an object M1 -- has all world player connection information{
//	
//	Map<PlayerId, PlayerConnection> //might be fetching this from db
//}
//
//thread 1
//PlayerConnection -- that has websocket
//class PlayerConnection -- it manages single player to send and receive messages{
//+ sendMessage(Message message) { websocket.sendObject(message)}
//+ receiceve() { while(true) 
//{  Message msg = (Message) websocket.getObject();
//   handle(msg)   
//}
//}
//}
//------------------------------------------------------------
//
//User mobile app (Client):
//
//+ sendMessage(Message message) { websocket.sendObject(message)}
//
//+ receiceve() { while(true) 
//{  Message msg = (Message) websocket.getObject();}
//   handle(msg)
//}
//
//
//handle(Message msg) {
//	
//	if(msg.action == "game_init") {
//	   //player.setSymbol(...)
//	}
//
//	if(msg.action == "update_status") {
//	   //board.setGameStatus()
//	}
//}

public class PlayerConnection {

	public void sendMessage(Message message) {
//websocket.sendObject(message)
	}

	public void receiveMessage() {
//while(true) {
		// Message msg = (Message) websocket.getObject();
		// }
	}
}
