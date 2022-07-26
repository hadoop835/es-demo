package com.es.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author chenzhh
 */
@Document(indexName = "user_entity_index",shards = 1,replicas = 1,createIndex = false)
public class UserEntity {
    @Id
    private String id;

    @Field(type = FieldType.Keyword, store = true)
    private String userName;

    @Field(type = FieldType.Keyword, store = true)
    private String userCode;

    @Field(type = FieldType.Text, store = true,index = false)
    private String userAddress;

    @Field(type = FieldType.Keyword, store = true)
    private String userMobile;

    @Field(type = FieldType.Integer, store = true)
    private Integer userGrade;

    @Field(type = FieldType.Keyword, store = true)
    private String status;

    @Field(type = FieldType.Integer, store = true,index = false)
    private Integer userAge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}


