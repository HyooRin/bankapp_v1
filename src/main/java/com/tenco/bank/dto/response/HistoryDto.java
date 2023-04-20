package com.tenco.bank.dto.response;

import java.sql.Timestamp;
import java.text.DecimalFormat;

import com.tenco.bank.utils.TimestampUtil;

import lombok.Data;
@Data
public class HistoryDto {
	
	private Integer id;
	private Long amount;
	private Long balance;
	private String sender;
	private String receiver;
	private Timestamp createdAt;
	
	public String formatCreatedAt() {
		
		return TimestampUtil.timestampToString(createdAt);
	}
	
	public String formatBalance() {
		
		DecimalFormat df = new DecimalFormat("#,###");
		String formatNumber = df.format(balance);
		return formatNumber + "원";
	}

}
