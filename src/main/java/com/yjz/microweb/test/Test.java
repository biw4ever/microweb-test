package com.yjz.microweb.test;

import java.security.cert.CertificateException;

import javax.net.ssl.SSLException;

import com.yjz.microweb.http.HttpCoreServer;
import com.yjz.microweb.transport.HttpServer;
import com.yjz.microweb.transport.HttpServerConf;

public class Test
{
    public static void main(String[] args)
    {
        HttpCoreServer.instance().init();
        
        HttpServerConf conf = new HttpServerConf();
        conf.setPort(8088);
        
        HttpServer httpServer = new HttpServer(conf);
 
        try
        {
            httpServer.doStart();
        }
        catch (CertificateException | SSLException e)
        {
            e.printStackTrace();
        }
        
    }
}
