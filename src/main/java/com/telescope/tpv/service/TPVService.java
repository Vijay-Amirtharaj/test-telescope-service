package com.telescope.tpv.service;

import java.util.List;


import com.telescope.tpv.entity.TotalProcessingValue;

public interface TPVService {
	
	List<TotalProcessingValue> findTPVByAccount(Integer accountId);
	
}
