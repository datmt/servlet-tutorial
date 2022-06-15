package com.datmt.basic_websocket;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello-socket")
public class HelloSocket {
	
	
	private static final Logger LOG = Logger.getLogger(HelloSocket.class.getName()); 
	
	@OnOpen
	public void onOpen() {
		LOG.info("Opening the socket server");
	}
	
	
	@OnMessage
	public void onMessage2(Session session, String message) {
		
		try {
			for (Session s1: session.getOpenSessions()) {
				s1.getBasicRemote().sendText("From server: you said: " + message);
			}			
		} catch (IOException ex) {
			LOG.warning("Something bad happened: " + ex.getMessage());
		}

		
	}
	
	
	@OnClose
	public void onClose() {
		LOG.info("We are closed");
	}
	
	
	
}