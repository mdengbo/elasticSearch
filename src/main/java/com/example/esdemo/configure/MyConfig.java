package com.example.esdemo.configure;

/**
 * @author madengbo
 * @create 2018-10-17 16:48
 * @desc
 * @Version 1.0
 **/
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class MyConfig {

    /**
     * es的构造
     * @return
     * @throws UnknownHostException
     */
    @Bean
    public TransportClient client() throws UnknownHostException {

        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("192.168.1.21"),
                9300
        );

        Settings settings = Settings.builder()
                .put("cluster.name", "my-application")
                .build();

        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(node);
        return client;
    }
}
