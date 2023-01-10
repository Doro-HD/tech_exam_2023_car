package com.example.cars_r_us.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 15)
    private String brand;
    @Column(nullable = false, length = 15)
    private String model;
    @Column(nullable = false)
    private double pricePerDay;
    @Column(nullable = false)
    private double bestDiscount;
    @CreationTimestamp
    private LocalDate dateCreated;
    @UpdateTimestamp
    private LocalDate lastDateEdited;
    @OneToMany(mappedBy = "car")
    private List<Reservation> reservations = new ArrayList<>();
}
