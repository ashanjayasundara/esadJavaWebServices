/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashan
 */
@Entity
@Table(name = "advertisement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advertisement.findAll", query = "SELECT a FROM Advertisement a")
    , @NamedQuery(name = "Advertisement.findById", query = "SELECT a FROM Advertisement a WHERE a.id = :id")
    , @NamedQuery(name = "Advertisement.findByTitle", query = "SELECT a FROM Advertisement a WHERE a.title = :title")
    , @NamedQuery(name = "Advertisement.findByDescription", query = "SELECT a FROM Advertisement a WHERE a.description = :description")
    , @NamedQuery(name = "Advertisement.findByContact", query = "SELECT a FROM Advertisement a WHERE a.contact = :contact")
    , @NamedQuery(name = "Advertisement.findByLocation", query = "SELECT a FROM Advertisement a WHERE a.location = :location")
    , @NamedQuery(name = "Advertisement.findByPrice", query = "SELECT a FROM Advertisement a WHERE a.price = :price")
    , @NamedQuery(name = "Advertisement.findByDiscount", query = "SELECT a FROM Advertisement a WHERE a.discount = :discount")
    , @NamedQuery(name = "Advertisement.findByDatetime", query = "SELECT a FROM Advertisement a WHERE a.datetime = :datetime")
    , @NamedQuery(name = "Advertisement.findByStatus", query = "SELECT a FROM Advertisement a WHERE a.status = :status")
    , @NamedQuery(name = "Advertisement.findByUserId", query = "SELECT a FROM Advertisement a WHERE a.userId = :userId")
    , @NamedQuery(name = "Advertisement.findByAdvertisementTypeId", query = "SELECT a FROM Advertisement a WHERE a.advertisementTypeId = :advertisementTypeId")})
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "contact")
    private String contact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount")
    private int discount;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "images")
    private String images;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "advertisement_type_id")
    private int advertisementTypeId;

    public Advertisement() {
    }

    public Advertisement(Integer id) {
        this.id = id;
    }

    public Advertisement(Integer id, String title, String description, String contact, String location, double price, int discount, String images, Date datetime, short status, int userId, int advertisementTypeId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.contact = contact;
        this.location = location;
        this.price = price;
        this.discount = discount;
        this.images = images;
        this.datetime = datetime;
        this.status = status;
        this.userId = userId;
        this.advertisementTypeId = advertisementTypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAdvertisementTypeId() {
        return advertisementTypeId;
    }

    public void setAdvertisementTypeId(int advertisementTypeId) {
        this.advertisementTypeId = advertisementTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advertisement)) {
            return false;
        }
        Advertisement other = (Advertisement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.Advertisement[ id=" + id + " ]";
    }
    
}
