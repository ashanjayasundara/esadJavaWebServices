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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashan
 */
@Entity
@Table(name = "advertisement_type_has_cart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdvertisementTypeHasCart.findAll", query = "SELECT a FROM AdvertisementTypeHasCart a")
    , @NamedQuery(name = "AdvertisementTypeHasCart.findById", query = "SELECT a FROM AdvertisementTypeHasCart a WHERE a.id = :id")
    , @NamedQuery(name = "AdvertisementTypeHasCart.findByAdvertisementTypeId", query = "SELECT a FROM AdvertisementTypeHasCart a WHERE a.advertisementTypeId = :advertisementTypeId")
    , @NamedQuery(name = "AdvertisementTypeHasCart.findByCartId", query = "SELECT a FROM AdvertisementTypeHasCart a WHERE a.cartId = :cartId")
    , @NamedQuery(name = "AdvertisementTypeHasCart.findByQuantity", query = "SELECT a FROM AdvertisementTypeHasCart a WHERE a.quantity = :quantity")})
public class AdvertisementTypeHasCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "advertisement_type_id")
    private int advertisementTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cart_id")
    private int cartId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;

    public AdvertisementTypeHasCart() {
    }

    public AdvertisementTypeHasCart(Integer id) {
        this.id = id;
    }

    public AdvertisementTypeHasCart(Integer id, int advertisementTypeId, int cartId, int quantity) {
        this.id = id;
        this.advertisementTypeId = advertisementTypeId;
        this.cartId = cartId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAdvertisementTypeId() {
        return advertisementTypeId;
    }

    public void setAdvertisementTypeId(int advertisementTypeId) {
        this.advertisementTypeId = advertisementTypeId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        if (!(object instanceof AdvertisementTypeHasCart)) {
            return false;
        }
        AdvertisementTypeHasCart other = (AdvertisementTypeHasCart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.AdvertisementTypeHasCart[ id=" + id + " ]";
    }
    
}
