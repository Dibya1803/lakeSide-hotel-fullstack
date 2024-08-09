package com.hba.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hba.model.Room;
import com.hba.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements IRoomService {
	
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public String addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws IOException, SQLException {
		
		System.out.println(file.getOriginalFilename());
		Room room = new Room();
		room.setRoomType(roomType);
		room.setRoomPrice(roomPrice);
		
		if(!file.isEmpty()) {
			byte[] photoBytes = file.getBytes();
			Blob photoBlob = new SerialBlob(photoBytes);
			room.setPhoto(photoBlob);
			roomRepository.save(room);
		}
		return "success";
	}
	
	

}
