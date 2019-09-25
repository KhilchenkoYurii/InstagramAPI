package com.instagramAPI.util;

import org.apache.log4j.Logger;

public class BaseLogger {
    protected String loggerName;

    BaseLogger(String name) {
        this.loggerName = name;
    }

    protected Logger getLogger() {
        return Logger.getLogger(loggerName);
    }
}
