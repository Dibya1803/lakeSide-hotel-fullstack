package com.hba.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
	
	private Long bookingId;	
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String guestFullName;
	private String guestEmail;
	private int numOfAdults;
	private int numOfChildren;
	private int totalNumOfGuest;
	private String bookingConfirmationCode;
	private RoomResponse room;
	
	
	public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate,
			String bookingConfirmationCode) {
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
	
	
}
