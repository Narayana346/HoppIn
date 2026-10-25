package com.hoppin.repository;

import com.hoppin.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwnerId(Long ownerId);
    boolean existsByNameAndCityAndOwnerId(String name, String city, Long ownerId);
}