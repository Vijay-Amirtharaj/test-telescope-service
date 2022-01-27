package com.telescope.tpv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "total_processing_value")
public class TotalProcessingValue {
	
		 
	@Id
	@Column(name = "tpv_id")
	private Integer tpvId;
	 
	@Column(name = "month")
	private String month;
	
	@Column(name = "year")
	private String year;
	 
	 @Column(name = "value")
	private Double value;
	 
	 @Column(name = "account_id")
	private Integer accountId;

	public Integer getTpvId() {
		return tpvId;
	}

	public void setTpvId(Integer tpvId) {
		this.tpvId = tpvId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}	 	
}
