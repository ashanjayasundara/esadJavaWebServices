/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashan
 */
@Entity
@Table(name = "advertisement_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdvertisementType.findAll", query = "SELECT a FROM AdvertisementType a")
    , @NamedQuery(name = "AdvertisementType.findById", query = "SELECT a FROM AdvertisementType a WHERE a.id = :id")
    , @NamedQuery(name = "AdvertisementType.findByName", query = "SELECT a FROM AdvertisementType a WHERE a.name = :name")
    , @NamedQuery(name = "AdvertisementType.findByUnitPrice", query = "SELECT a FROM AdvertisementType a WHERE a.unitPrice = :unitPrice")})
public class AdvertisementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unit_price")
    private double unitPrice;

    public AdvertisementType() {
    }

    public AdvertisementType(Integer id) {
        this.id = id;
    }

    public AdvertisementType(Integer id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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
        if (!(object instanceof AdvertisementType)) {
            return false;
        }
        AdvertisementType other = (AdvertisementType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.AdvertisementType[ id=" + id + " ]";
    }
    
}
