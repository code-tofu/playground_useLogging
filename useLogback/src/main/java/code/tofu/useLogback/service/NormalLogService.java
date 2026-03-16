package code.tofu.useLogback.service;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NormalLogService {

    // SLF4J’s abstract logger does not implement setLevel().
    private static final Logger logger = (Logger) LoggerFactory.getLogger(NormalLogService.class);
    private static final Logger warnlogger = (Logger) LoggerFactory.getLogger("code.tofu.useLogback.service.warnLogger");
    private static final Logger debuglogger = (Logger) LoggerFactory.getLogger("code.tofu.useLogback.service.debugLogger");
    private static final Logger filelogger = (Logger) LoggerFactory.getLogger("code.tofu.useLogback.service.fileLogger");


    public void changeLevel(Level level){
        logger.setLevel(level);
    }

    public void loginfo(String message){
        logger.info(message);
    }

    public void logdebug(String message){
        logger.debug(message);
    }

    public void logToFile(){
        filelogger.info("File Logger Normal Log Service Info Level");
        filelogger.debug("File Logger Normal Log Service Debug Level");
    }

    public void logLevelTest(){
        logger.info("root logger info");
        warnlogger.info("warn logger info");
        warnlogger.debug("warn logger debug");
        warnlogger.warn("warn logger warn");
        debuglogger.info("debug logger info");
        debuglogger.debug("debug logger debug");
        debuglogger.warn("debug logger warn");
        filelogger.info("file logger info");
        filelogger.debug("file logger debug");
        filelogger.warn("file logger warn");
        filelogger.info("PII - do not log me into file");
        filelogger.info("{} - do not log me into file", "PII");

    }

}

