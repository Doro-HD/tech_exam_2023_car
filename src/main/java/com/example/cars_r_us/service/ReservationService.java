package com.example.cars_r_us.service;

import com.example.cars_r_us.dto.ReservationResponse;
import com.example.cars_r_us.entity.Reservation;
import com.example.cars_r_us.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public List<ReservationResponse> getAll() {
        return this.reservationRepository.findAll().stream()
                .map(reservation -> new ReservationResponse(reservation)).toList();
    }

    public List<ReservationResponse> findAllByCarId(int carId) {
        return this.reservationRepository.findAllByCar_Id(carId).stream()
                .map(reservation -> new ReservationResponse(reservation))
                .toList();
    }
}
