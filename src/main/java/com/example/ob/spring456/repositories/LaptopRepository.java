package com.example.ob.spring456.repositories;

import com.example.ob.spring456.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
