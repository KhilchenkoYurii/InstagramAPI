package com.instagramAPI.util;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.io.IOException;

import static com.instagramAPI.util.Paths.filePath;

public class FileLogger extends BaseLogger{
    FileLogger(String name) {
        super(name);
    }

    public Logger loggerConfig() throws IOException {
        Logger log = super.getLogger();
        log.setLevel(Level.DEBUG);
        log.addAppender(new FileAppender(new PatternLayout("%m%n"),
                filePath + loggerName + ".log"));
        return log;

    }
}
