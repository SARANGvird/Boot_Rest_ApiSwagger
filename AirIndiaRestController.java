package com.shivila.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivila.boot.request.PassengerInfo;
import com.shivila.boot.response.Ticketinfo;

@RestController
public class AirIndiaRestController {

	@PostMapping("/bookFlight Ticket")
	public ResponseEntity<Ticketinfo> bookTicket (PassengerInfo pinfo){
		
		// logic book ticket 
		
		// send ticket info
		
		Ticketinfo ticket=new Ticketinfo();
		ticket.setLname(pinfo.getFname()+""+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketstatus("Confirmed");
		ticket.setTicketPrice("4500.00 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		
	return	new ResponseEntity<>(ticket, HttpStatus.CREATED);
		
	}
}
