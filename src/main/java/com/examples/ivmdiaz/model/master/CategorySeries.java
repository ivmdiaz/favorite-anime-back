package com.examples.ivmdiaz.model.master;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category_series", schema = "master")
public class CategorySeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
}
