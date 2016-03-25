package Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Booking {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "dateFrom")
    private Date dateFrom;

    @Column(name = "dateTo")
    private Date dateTo;

    @Column(name = "countryId")
    private Country country;

    @Column(name = "cityId")
    private City city;

    @Column(name = "hotelId")
    private Hotel hotel;

    @Column(name = "roomCategory")
    private RoomCategory roomCategory;

    @Column(name = "clientId")
    private Client client;

    @Column(name = "roomQuantity")
    private Integer roomQuantity;

    public Booking() {
    }
    
    public Booking(Integer id, Date dateFrom, Date dateTo, Country country, City city, Hotel hotel, 
            RoomCategory roomCategory, Client client, Integer roomQuantity ) {
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.country = country;
        this.city = city;
        this.hotel = hotel;
        this.roomCategory = roomCategory;
        this.roomCategory = roomCategory;
        this.client = client;
        this.roomQuantity = roomQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(Integer roomQuantity) {
        this.roomQuantity = roomQuantity;
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
        Booking other = (Booking) obj;
        if (id != other.id) {
            return false;
        }      
        if (dateFrom != other.dateFrom) {
            return false;
        }        
        if (dateTo != other.dateTo) {
            return false;
        }       
        if (country != other.country) {
            return false;
        }       
        if (city != other.city) {
            return false;
        }
        if (hotel != other.hotel) {
            return false;
        }
        if (roomCategory != other.roomCategory) {
            return false;
        }
        if (client != other.client) {
            return false;
        }
        if (roomQuantity != other.roomQuantity) {
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
        return "Booking [id=" + id + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", country=" + country +
               ", city=" + city + ", hotel=" + hotel + ",roomCategory=" + roomCategory + 
               ", roomQuantity=" + roomQuantity + "]";
    }

}
