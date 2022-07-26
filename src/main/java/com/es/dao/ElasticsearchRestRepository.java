package com.es.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhh
 */
@RestController
@RequestMapping(value ="/v1")
public class ElasticsearchRestRepository {
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @GetMapping(value = "/index")
    public void createIndex() {
        IndexCoordinates indexCoordinates = IndexCoordinates.of("user_entity_index");
        IndexOperations indexOperations = elasticsearchOperations.indexOps(indexCoordinates);
        if(!indexOperations.exists()){
            indexOperations.create();
            indexOperations.refresh();
            indexOperations.createMapping(UserEntity.class);
            indexOperations.refresh();

        }
    }
}
