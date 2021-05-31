package com.acdeveloper.dashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.acdeveloper.dashboard.dto.SaleSucessDTO;
import com.acdeveloper.dashboard.dto.SaleSumDTO;
import com.acdeveloper.dashboard.entitites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.acdeveloper.dashboard.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " 
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupdBySeller();
	
	@Query("SELECT new com.acdeveloper.dashboard.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " 
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
}
