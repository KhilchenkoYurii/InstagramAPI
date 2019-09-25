package com.instagramAPI.util;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.qameta.allure.Attachment;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.instagramAPI.util.Paths.filePath;

public class LogListener implements ITestListener {
    private Logger logger;
    private Logger infoLogger = new InfoLogger(LogListener.class.getName()).loggerConfig();
    private ByteArrayOutputStream byteStream;
    public static PrintStream printStream;
    private ByteArrayOutputStream request = new ByteArrayOutputStream();
    private ByteArrayOutputStream response = new ByteArrayOutputStream();

    private PrintStream requestVar = new PrintStream(request, true);
    private PrintStream responseVar = new PrintStream(response, true);

    public void onTestStart(ITestResult result) {
        infoLogger.info("Test " + result.getName() + " starts");
        byteStream = new ByteArrayOutputStream();
        printStream = new PrintStream(byteStream, true);

        try {
             logger = new FileLogger(result.getName()).loggerConfig();//new LoggerFileConfig(result.getName()).loggerConfig();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onTestSuccess(ITestResult result) {
        infoLogger.info("Test " + result.getName() + " is success");
        logger.debug(byteStream);
        attach(result.getName());
       // logRequest(request);
        //logResponse(response);
    }

    public void onTestFailure(ITestResult result) {
        infoLogger.error("Test " + result.getName() + " failed");
        logger.fatal(result.getName() + "Failed", result.getThrowable());
        attach(result.getName());
        //onTestSuccess(iTestResult);
    }

/*    @Attachment(value = "request", type ="image/png")
    public byte[] logRequest(ByteArrayOutputStream stream) {
        return attach(stream);
    }

    @Attachment(value = "request", type ="image/png")
    public byte[] logResponse(ByteArrayOutputStream stream) {
        return attach(stream);
    }*/

    private void attach(String fileName) {
        try {
            addFile(  filePath+fileName + ".log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Attachment(value = "My attach", type = "text/plain")
    private byte[] addFile(String path) throws IOException {
        return Files.readAllBytes(Paths.get(path));
    }
}
