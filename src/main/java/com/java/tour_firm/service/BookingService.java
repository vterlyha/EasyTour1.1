package com.java.tour_firm.service;

import java.util.List;

import com.java.tour_firm.dao.DAOFactory;
import com.java.tour_firm.entity.Booking;

public class BookingService {

    public void addBooking(Booking booking) {
        DAOFactory.getInstance().getBookingDAO().addElement(booking);
    }
    
    public void updateBooking(Booking booking) {
        DAOFactory.getInstance().getBookingDAO().updateElement(booking);
    }
    
    public Booking getBookingById(Integer bookingId) {
        return DAOFactory.getInstance().getBookingDAO()
                .getElementByID(bookingId);
    }
    
    public List<Booking> getAllBookings() {
        return DAOFactory.getInstance().getBookingDAO()
                .getAllElements();
    }
    
    public void deleteBooking(Booking booking) {
        DAOFactory.getInstance().getBookingDAO().deleteElement(booking);
    }
}
