package com.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author chenzhh
 */
@SpringBootApplication
public class EsApplication {


    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class,args);
    }
}
