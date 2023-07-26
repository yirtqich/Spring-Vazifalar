package com.example.springvazifalar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Phone01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String model;
    @Column(nullable = true,unique = true)
    private String mac_address;
    @Column(nullable = true)
    private String info;
}
