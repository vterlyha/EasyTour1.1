package entity;

import java.util.Set;

public class Visa {

    private Integer id;
    private Country country;
    private Set<Client> clients;
    
    public Visa() {
    }
    
    public Visa(Integer id, String countryName) {
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
    
    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
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
