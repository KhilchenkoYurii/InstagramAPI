package com.instagramAPI.util;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class InfoLogger extends BaseLogger{

    InfoLogger(String name) {
        super(name);
    }

    public Logger loggerConfig() {
        Logger log = super.getLogger();
        log.setLevel(Level.INFO);
        log.addAppender(new ConsoleAppender(new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n")));
        return log;

    }
}
