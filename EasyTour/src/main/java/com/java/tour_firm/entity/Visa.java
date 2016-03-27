package com.java.tour_firm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "visas")
public class Visa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne(optional=false, targetEntity=Country.class, cascade={CascadeType.ALL})
    @JoinColumn(name="countryId", referencedColumnName="id")
    private Country country;
    
    public Visa() {
    }
    
    public Visa(Integer id, Country country) {
        this.id = id;
        this.country = country; 
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }        
        if (getClass() != obj.getClass()) {
            return false;
        }
        Visa other = (Visa) obj;
        if (id != other.id) {
            return false;
        }      
        if (country != other.country) {
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
        return "Visa [id=" + id + ", country=" + country + "]";
    }
}
