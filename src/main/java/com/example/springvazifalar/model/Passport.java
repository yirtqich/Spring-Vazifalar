package com.example.springvazifalar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String surname;
    @Column(nullable = true)
    private String brithDate;
    @Column(nullable = true)
    private String issued_date;
    @Column(nullable = true)
    private String country;
    @Column(nullable = true,unique = true)
    private String pasportId;
    @Column(nullable = true)
    private String region;
}
