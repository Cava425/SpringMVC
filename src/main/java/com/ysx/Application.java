package com.ysx;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Application {
    public static void main(String[] args) throws Exception {
        run();
    }

    public static void run() throws Exception {

        String baseDir = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir(baseDir);
        tomcat.setPort(8080);

        Context context = tomcat.addWebapp("", baseDir);
        context.setParentClassLoader(Thread.currentThread().getContextClassLoader());
        context.setRequestCharacterEncoding("UTF-8");

        Connector connector = tomcat.getConnector();


        tomcat.start();
        tomcat.getServer().await();

    }
}

