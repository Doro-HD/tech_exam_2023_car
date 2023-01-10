package com.example.cars_r_us.config;

import com.example.cars_r_us.entity.Car;
import com.example.cars_r_us.entity.Member;
import com.example.cars_r_us.entity.Reservation;
import com.example.cars_r_us.repository.CarRepository;
import com.example.cars_r_us.repository.MemberRepository;
import com.example.cars_r_us.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@RequiredArgsConstructor
@Component
public class SetupData implements CommandLineRunner {

    private final CarRepository carRepository;
    private final ReservationRepository reservationRepository;
    private final MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        var car1 = Car.builder()
                .brand("Toyota")
                .model("Yaris")
                .pricePerDay(100)
                .bestDiscount(50)
                .build();
        var car2 = Car.builder()
                .brand("Cupra")
                .model("Libre")
                .pricePerDay(500)
                .bestDiscount(350)
                .build();

        this.carRepository.save(car1);
        this.carRepository.save(car2);

        var member1 = Member.builder()
                .firstName("David")
                .lastName("Borja-Jakobsen")
                .city("Copenhagen")
                .street("test Street")
                .zip("2730")
                .build();
        var member2 = Member.builder()
                .firstName("Lasse")
                .lastName("Lassesen")
                .city("Copenhagen")
                .street("test Street")
                .zip("2730")
                .build();

        this.memberRepository.save(member1);
        this.memberRepository.save(member2);

        var reservation1 = Reservation.builder()
                .car(car1)
                .member(member1)
                .rentalDate(LocalDate.now().plusMonths(3))
                .build();
        var reservation2 = Reservation.builder()
                .car(car2)
                .member(member2)
                .rentalDate(LocalDate.now().plusMonths(3))
                .build();

        this.reservationRepository.save(reservation1);
        this.reservationRepository.save(reservation2);
    }
}
