package com.example.cars_r_us.dto;

import com.example.cars_r_us.entity.Car;
import com.example.cars_r_us.entity.Member;
import com.example.cars_r_us.entity.Reservation;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public class ReservationResponse {

    public ReservationResponse(Reservation reservation) {
        this.reservationDate = reservation.getReservationDate();
        this.rentalDate = reservation.getRentalDate();
        this.car = reservation.getCar();
        this.member = reservation.getMember();
    }

    private LocalDateTime reservationDate;
    private LocalDate rentalDate;
    private Member member;
    private Car car;
}
