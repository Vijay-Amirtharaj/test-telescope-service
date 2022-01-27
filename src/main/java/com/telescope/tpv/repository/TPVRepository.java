package com.telescope.tpv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.telescope.tpv.entity.TotalProcessingValue;

	
public interface TPVRepository extends JpaRepository<TotalProcessingValue, Integer>

{
	@Query("SELECT tpv FROM TotalProcessingValue tpv WHERE tpv.accountId = ?1 order by tpv.tpvId")
	List<TotalProcessingValue> findTPVByAccount(Integer accountId);
}
	

