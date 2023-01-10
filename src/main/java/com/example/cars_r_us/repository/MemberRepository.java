package com.example.cars_r_us.repository;

import com.example.cars_r_us.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
