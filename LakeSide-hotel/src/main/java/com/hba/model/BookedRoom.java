package com.hba.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;	
	
	@Column(name = "check_In")
	private LocalDate checkInDate;
	
	@Column(name = "check_Out")
	private LocalDate checkOutDate;
	
	@Column(name = "guest_FullName")
	private String guestFullName;
	
	@Column(name = "guest_Email")
	private String guestEmail;
	
	@Column(name = "adults")
	private int numOfAdults;
	
	@Column(name = "children")
	private int numOfChildren;
	
	@Column(name = "total_guest")
	private int totalNumOfGuest;
	
	@Column(name = "confirmation_Code")
	private String bookingConfirmationCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	
	@JoinColumn(name = "room_Id")
	private Room room;
	
	
	public void calculateTotalNumberOfGuest() {
		this.totalNumOfGuest = this.numOfAdults + numOfChildren;
	}


	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
		calculateTotalNumberOfGuest();
	}

	
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
		calculateTotalNumberOfGuest();
	}


	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	
	public void setRoom(Room room) {
		// TODO Auto-generated method stub
		
	}


	public Long getBookingId() {
		return bookingId;
	}


	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}


	public LocalDate getCheckInDate() {
		return checkInDate;
	}


	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}


	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}


	public String getGuestFullName() {
		return guestFullName;
	}


	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}


	public String getGuestEmail() {
		return guestEmail;
	}


	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}


	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}


	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}


	public int getNumOfAdults() {
		return numOfAdults;
	}


	public int getNumOfChildren() {
		return numOfChildren;
	}


	public String getBookingConfirmationCode() {
		return bookingConfirmationCode;
	}


	public Room getRoom() {
		return room;
	}
	
	
	
	
	
	
	
	
}
