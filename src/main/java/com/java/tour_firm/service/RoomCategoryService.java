package com.java.tour_firm.service;

import java.util.List;

import com.java.tour_firm.dao.DAOFactory;
import com.java.tour_firm.entity.RoomCategory;

public class RoomCategoryService {

	public void addRoomCategory(RoomCategory c) {
		DAOFactory.getInstance().getRoomCategoryDAO().addElement(c);
	}
	
	public void updateRoomCategory(RoomCategory c) {
		DAOFactory.getInstance().getRoomCategoryDAO().updateElement(c);
	}
	
	public RoomCategory getRoomCategoryById(Integer roomCategoryId) {
		return DAOFactory.getInstance().getRoomCategoryDAO()
				.getElementByID(roomCategoryId);
	}
	
	public List<RoomCategory> getAllRoomCategories() {
		return DAOFactory.getInstance().getRoomCategoryDAO()
				.getAllElements();
	}
	
	public void deleteRoomCategory(RoomCategory c) {
		DAOFactory.getInstance().getRoomCategoryDAO().deleteElement(c);
	}
}
