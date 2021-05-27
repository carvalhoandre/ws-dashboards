package com.acdeveloper.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acdeveloper.dashboard.entitites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
