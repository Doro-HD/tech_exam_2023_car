package com.example.cars_r_us.api;

import com.example.cars_r_us.dto.ReservationResponse;
import com.example.cars_r_us.entity.Reservation;
import com.example.cars_r_us.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping
    public List<ReservationResponse> getAll() {
        return this.reservationService.getAll();
    }

    @GetMapping("/{carId}")
    public List<ReservationResponse> findByCarId(@PathVariable("carId") int carId) {
        return this.reservationService.findAllByCarId(carId);
    }
}
