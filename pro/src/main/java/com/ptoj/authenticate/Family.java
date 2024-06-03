package com.ptoj.authenticate;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Member;
import java.util.List;

@Setter
@Getter
@Document(collection = "parentCollection")
public class Family {
    @Id
    private String id;
    private String name;
    private List<String> members;



}
