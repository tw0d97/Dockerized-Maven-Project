package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class AppTest 
{
	private ConnectionChecker testConnection = new ConnectionChecker("localhost:8180");
	
    @Test
    public void testWhenConnected()
    {
    	assumeTrue(testConnection.connect());
    }
}
