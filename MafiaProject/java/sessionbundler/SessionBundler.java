package sessionbundler;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

public class SessionBundler {

	private List<Session> sessions = new ArrayList<Session>();
	
	public void addSession(Session session) {
		sessions.add(session);
	}
	
	public void removeSession(Session session) {
		sessions.remove(session);
	}
	
	public List<Session> getSessions() {
		return sessions;
	}
	
}
