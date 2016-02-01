// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.spt.priceofriceservicerequestor.base;

import com.spt.priceofriceservicerequestor.base.BaseEntity;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect BaseEntity_Roo_Json {
    
    public String BaseEntity.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String BaseEntity.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static BaseEntity BaseEntity.fromJsonToBaseEntity(String json) {
        return new JSONDeserializer<BaseEntity>()
        .use(null, BaseEntity.class).deserialize(json);
    }
    
    public static String BaseEntity.toJsonArray(Collection<BaseEntity> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String BaseEntity.toJsonArray(Collection<BaseEntity> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<BaseEntity> BaseEntity.fromJsonArrayToBaseEntitys(String json) {
        return new JSONDeserializer<List<BaseEntity>>()
        .use("values", BaseEntity.class).deserialize(json);
    }
    
}
