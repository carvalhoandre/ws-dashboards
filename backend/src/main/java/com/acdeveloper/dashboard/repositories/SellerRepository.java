package com.acdeveloper.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acdeveloper.dashboard.entitites.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}