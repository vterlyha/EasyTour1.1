package com.java.tour_firm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="roomCategoryHotel")
public class RoomCategoryHotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@ManyToOne(optional=false, targetEntity=RoomCategory.class)
	@JoinColumn(name = "roomCategoryId")
	private RoomCategory roomCategory;
	
	@ManyToOne(optional=false, targetEntity=Hotel.class)
	@JoinColumn(name = "hotelId")
	private Hotel hotel;

	public RoomCategoryHotel() {}
	
	public RoomCategoryHotel(Integer id, Integer quantity, RoomCategory roomCategory, Hotel hotel) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.roomCategory = roomCategory;
		this.hotel = hotel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public RoomCategory getRoomCategory() {
		return roomCategory;
	}

	public void setRoomCategory(RoomCategory roomCategory) {
		this.roomCategory = roomCategory;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	    	return false;
        if (getClass() != obj.getClass())
            return false;
        RoomCategoryHotel other = (RoomCategoryHotel) obj;
        if (id != other.id) {
            return false;
        }
        if (quantity != other.quantity) {
            return false;
        }
        if (roomCategory != other.roomCategory) {
            return false;
        }
        if (hotel != other.hotel) {
        	return false;
        }
        return true;
    }    
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    
    @Override
    public String toString() {
        return "Hotel [id=" + id + ", quantity=" + quantity + ", "
        		+ "roomCategory=" + roomCategory + ", hotel=" + hotel + "]";
    }
	
}
