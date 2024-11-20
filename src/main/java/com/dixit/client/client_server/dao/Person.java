package com.dixit.client.client_server.dao;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "peoples")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

}
