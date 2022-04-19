package com.bridgelabz.iopackageconcept;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class JsonConcept {
    public static void main(String[] args) throws JsonProcessingException {
        JsonDemo demo = new JsonDemo("Ram", "Kumar");
// JsonDemo2 demo2 = demo;
        ObjectMapper mapper = new ObjectMapper();
// try {
        String jsonString = mapper.writeValueAsString(demo);
// } catch (Exception e) {
//
// }
        System.out.println(jsonString);

        JsonDemo[] jsonDemos = new JsonDemo[3];
        jsonDemos[0] = demo;
        jsonDemos[1] = demo;
        jsonDemos[2] = demo;
// System.out.println(jsonDemos);

        String arrJsonString = mapper.writeValueAsString(jsonDemos);
        System.out.println(arrJsonString);
/**
 * [{"name" : "Ram", "surName" : "Kumar"}, {"name" : "Ram", "surName" : "Kumar"}, {"name" : "Ram", "surName" : "Kumar"}]
 */

        JsonDemo demo1 = mapper.readValue(jsonString, JsonDemo.class);


// System.out.println(jsonString.getName());
        System.out.println(demo1.toString());
        System.out.println(demo1.getName() + " ::::::::: " + demo1.getSurName());

        System.out.println();
        System.out.println();
        System.out.println();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonDemo2 demo2 = mapper.readValue(jsonString, JsonDemo2.class);
        System.out.println(demo2.toString());
        System.out.println(demo2.getName2() + " ::::::::: " + demo2.getSurName());

        JsonDemo2[] jsonDemo2s = mapper.readValue(arrJsonString, new TypeReference<JsonDemo2[]>() {
        });
        System.out.println(Arrays.deepToString(jsonDemo2s));

        JsonDemo[] jsonDemos1 = mapper.readValue(arrJsonString, new TypeReference<JsonDemo[]>() {
        });
        System.out.println(Arrays.deepToString(jsonDemos1));
    }
}

class JsonDemo {
    private String name;
    private String surName;

    public JsonDemo(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public JsonDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "JsonDemo{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}


class JsonDemo2 {
    private String name2;
    private String surName;

    public JsonDemo2(String name, String surName) {
        this.name2 = name;
        this.surName = surName;
    }

    public JsonDemo2() {
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name) {
        this.name2 = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "JsonDemo2{" +
                "name2='" + name2 + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}