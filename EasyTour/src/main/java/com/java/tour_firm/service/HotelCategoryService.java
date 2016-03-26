package com.java.tour_firm.service;

import java.util.List;

import com.java.tour_firm.dao.DAOFactory;
import com.java.tour_firm.entity.HotelCategory;

public class HotelCategoryService {

	public void addHotelCategory(HotelCategory c) {
		DAOFactory.getInstance().getHotelCategoryDAO().addElement(c);
	}
	
	public void updateHotelCategory(HotelCategory c) {
		DAOFactory.getInstance().getHotelCategoryDAO().updateElement(c);
	}
	
	public HotelCategory getHotelCategoryById(Integer hotelCategoryId) {
		return DAOFactory.getInstance().getHotelCategoryDAO()
				.getElementByID(hotelCategoryId);
	}
	
	public List<HotelCategory> getAllHotelCategories() {
		return DAOFactory.getInstance().getHotelCategoryDAO()
				.getAllElements();
	}
	
	public void deleteHotelCategory(HotelCategory c) {
		DAOFactory.getInstance().getHotelCategoryDAO().deleteElement(c);
	}
}
