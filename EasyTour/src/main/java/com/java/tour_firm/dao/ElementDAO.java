package com.java.tour_firm.dao;

import java.util.List;

public interface ElementDAO<E> {
	
	public void addElement(E element);
    public void updateElement(E element);
    public E getElementByID(Integer elementId);
    public List<E> getAllElements();
    public void deleteElement(E element);
}
