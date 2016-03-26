package com.java.tour_firm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roomCategory")
public class RoomCategory {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "category")
	private String category;

	public RoomCategory(){}
	
	public RoomCategory(Integer id, String category) {
		super();
		this.id = id;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	    	return false;
        if (getClass() != obj.getClass())
            return false;
        RoomCategory other = (RoomCategory) obj;
        if (id != other.id) {
            return false;
        }
        if (category != other.category) {
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
        return "RoomCategory [id=" + id + ", category=" + category + "]";
    }
}
