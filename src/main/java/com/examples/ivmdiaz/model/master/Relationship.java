package com.examples.ivmdiaz.model.master;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "relationship", schema = "master")
public class Relationship implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "series_id")
    private Integer seriesId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

}
