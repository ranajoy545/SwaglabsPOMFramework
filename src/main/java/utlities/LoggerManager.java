package utlities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerManager {

	public static Logger logger;
	
	
	public static Logger getlogger(Class<?> cls) {
		
		logger= LogManager.getLogger(cls);
		return logger;
	}
	
}
