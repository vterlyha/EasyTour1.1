package Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "clients4")
public class Client {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue         
    private Integer id;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phoneNumber")
    private Integer phoneNumber;
    
    @Column (name = "adress")
    private Adress adress;

    private Set<Visa> visas;
    
    public Client() {
    }
    
    public Client(Integer id, String firstName, String lastName, String sex, String email, Integer phoneNumber, 
            Adress adress) {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Adress getAdress() {
        return adress;
    }
    
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Set<Visa> getVisas() {
        return visas;
    }

    public void setVisas(Set<Visa> visas) {
        this.visas = visas;
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
        Client other = (Client) obj;
        if (id != other.id) {
            return false;
        }      
        if (firstName != other.firstName) {
            return false;
        }        
        if (lastName != other.lastName) {
            return false;
        }       
        if (sex != other.sex) {
            return false;
        }       
        if (email != other.email) {
            return false;
        }
        if (phoneNumber != other.phoneNumber) {
            return false;
        }
        if (adress != other.adress) {
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
        return "CLient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex +
               ", email=" + email + ", phoneNumber=" + phoneNumber + ",adress=" + adress + "]";
    }
}
