package com.hba.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import org.springframework.web.multipart.MultipartFile;

import com.hba.model.Room;

public interface IRoomService {

	String addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;

}
