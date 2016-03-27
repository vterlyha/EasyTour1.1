package com.java.tour_firm.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(optional=false, targetEntity=City.class)
	@JoinColumn(name = "cityId")
	private City city;
	
	@ManyToOne(optional=false, targetEntity=HotelCategory.class)
	@JoinColumn(name = "categoryId")
	private HotelCategory hotelCategory;
	
	@OneToMany(mappedBy="hotel")
	private Set<RoomCategoryHotel> roomCategoryHotel;

	public Hotel(){}
	
	public Hotel(Integer id, String name, City city, HotelCategory category) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.hotelCategory = category;
	}

	public Set<RoomCategoryHotel> getRoomCategoryHotel() {
		return roomCategoryHotel;
	}

	public void setRoomCategoryHotel(Set<RoomCategoryHotel> roomCategoryHotel) {
		this.roomCategoryHotel = roomCategoryHotel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public HotelCategory getCategory() {
		return hotelCategory;
	}

	public void setCategory(HotelCategory category) {
		this.hotelCategory = category;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	    	return false;
        if (getClass() != obj.getClass())
            return false;
        Hotel other = (Hotel) obj;
        if (id != other.id) {
            return false;
        }
        if (name != other.name) {
            return false;
        }
        if (city != other.city) {
            return false;
        }
        if (hotelCategory != other.hotelCategory) {
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
        return "Hotel [id=" + id + ", name=" + name + ", "
        		+ "city=" + city + ", category=" + hotelCategory
        		+ ", roomCategoryHotel=" + roomCategoryHotel + "]";
    }
}
