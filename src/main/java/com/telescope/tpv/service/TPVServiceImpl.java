package com.telescope.tpv.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telescope.tpv.entity.TotalProcessingValue;
import com.telescope.tpv.repository.TPVRepository;


@Service
public class TPVServiceImpl implements TPVService {
	
	@Autowired
	TPVRepository repository;

	@Override
	public List<TotalProcessingValue> findTPVByAccount(Integer accountId) {
				
      return repository.findTPVByAccount(accountId);
      
	}
		
}
