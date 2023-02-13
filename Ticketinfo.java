package com.shivila.boot.response;

import lombok.Data;

@Data
public class Ticketinfo {
	private String fname;
	private String lname;
	private String from;
	private  String to;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketstatus;
}
