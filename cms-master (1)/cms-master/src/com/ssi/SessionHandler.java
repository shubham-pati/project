package com.ssi;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionHandler implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("SESSION CREATED ==============>");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("SESSION DESTROYED ==============>");
    }
	
}
