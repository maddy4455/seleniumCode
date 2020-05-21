package log4j_test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogTest2 {

	private static final Logger log=LogManager.getLogger(LogTest2.class);
	
	public static void main(String[] args) {
		
    System.out.println("Hello love");
    
    log.debug("this is a debug stamnt");
    log.debug("this is info");
    log.debug("this is warn");
    
	}

}
