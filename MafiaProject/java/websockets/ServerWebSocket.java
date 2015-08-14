package websockets;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import sessionbundler.SessionBundler;

@ApplicationScoped
@ServerEndpoint("/actions")
public class ServerWebSocket {
	
	@Inject
	private final SessionBundler sessionBundler = new SessionBundler();
	
	@OnOpen
	public void open(Session session) {
		sessionBundler.addSession(session);
	}
	
	@OnClose
	public void close(Session session) {
		sessionBundler.removeSession(session);
	}
	
	@OnMessage
	public void handleMessage(String message, Session session) {
		
	}
}