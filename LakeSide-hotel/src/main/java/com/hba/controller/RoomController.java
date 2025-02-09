package com.hba.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hba.model.PhotoReceiver;
import com.hba.model.Room;
import com.hba.response.RoomResponse;
import com.hba.service.IRoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
	private IRoomService roomService;
	
	
	@PostMapping("/add/new-room")
	public ResponseEntity<String> addNewRoom(@ModelAttribute PhotoReceiver photoReceiver) throws IOException, SQLException {
		

		MultipartFile photo=null;
		String savedRoom = roomService.addNewRoom(photoReceiver.getPhoto(),photoReceiver.getRoomType(),photoReceiver.getRoomPrice());
		
//		RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(), 
//				savedRoom.getRoomPrice());
		
		return ResponseEntity.ok(savedRoom);
		
	}
}
