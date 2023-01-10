package com.example.cars_r_us.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name", length = 15, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 15, nullable = false)
    private String lastName;
    @Column(length = 15, nullable = false)
    private String street;
    @Column(length = 10, nullable = false)
    private String city;
    @Column(length = 5, nullable = false)
    private String zip;
    private boolean approved;
    private int ranking;
    @OneToMany(mappedBy = "member")
    private List<Reservation> reservations = new ArrayList<>();
}
