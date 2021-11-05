package com.v51das.app.cassandra.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @PrimaryKey
    private  Long id;
    private  String address;
    private  Integer age;
    private  Map<String,String> education;
    private  String email ;
    private  Integer gender;
    private  Set<String> interest;
    private  List<String> phone ;
    private  String name;
}