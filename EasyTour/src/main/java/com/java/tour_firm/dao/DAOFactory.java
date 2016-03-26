package com.java.tour_firm.dao;

public class DAOFactory {
	
	private CountryDAO countryDAO = null;
	private CityDAO cityDAO = null;
	private HotelDAO hotelDAO = null;
	private HotelCategoryDAO hotelCategoryDAO = null;
	private RoomCategoryDAO roomCategoryDAO = null;
	
	private static DAOFactory instance = null;
	
	private DAOFactory() {
		countryDAO = new CountryDAO();
		cityDAO = new CityDAO();
		hotelDAO = new HotelDAO();
		hotelCategoryDAO = new HotelCategoryDAO();
		roomCategoryDAO = new RoomCategoryDAO();
	}
	
	public static synchronized DAOFactory getInstance() {
		if (instance == null)
			instance = new DAOFactory();
		return instance;
	}

	public CountryDAO getCountryDAO() {
		return countryDAO;
	}

	public CityDAO getCityDAO() {
		return cityDAO;
	}

	public HotelDAO getHotelDAO() {
		return hotelDAO;
	}

	public HotelCategoryDAO getHotelCategoryDAO() {
		return hotelCategoryDAO;
	}

	public RoomCategoryDAO getRoomCategoryDAO() {
		return roomCategoryDAO;
	}	
}
