package com.java.tour_firm.service;

import java.util.List;

import com.java.tour_firm.dao.DAOFactory;
import com.java.tour_firm.entity.Visa;

public class ServiceVisa {

    public void addVisa(Visa visa) {
        DAOFactory.getInstance().getVisaDAO().addElement(visa);
    }
    
    public void updateVisa(Visa visa) {
        DAOFactory.getInstance().getVisaDAO().updateElement(visa);
    }
    
    public Visa getVisaById(Integer visaId) {
        return DAOFactory.getInstance().getVisaDAO()
                .getElementByID(visaId);
    }
    
    public List<Visa> getAllVisas() {
        return DAOFactory.getInstance().getVisaDAO()
                .getAllElements();
    }
    
    public void deleteVisa(Visa visa) {
        DAOFactory.getInstance().getVisaDAO().deleteElement(visa);
    }
}
