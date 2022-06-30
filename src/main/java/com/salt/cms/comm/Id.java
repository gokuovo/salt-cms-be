package com.salt.cms.comm;


import java.util.UUID;

public class Id {

    public String id(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
