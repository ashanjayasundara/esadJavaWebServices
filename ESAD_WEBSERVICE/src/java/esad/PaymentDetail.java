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
@Table(name = "payment_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentDetail.findAll", query = "SELECT p FROM PaymentDetail p")
    , @NamedQuery(name = "PaymentDetail.findById", query = "SELECT p FROM PaymentDetail p WHERE p.id = :id")
    , @NamedQuery(name = "PaymentDetail.findByCardNumber", query = "SELECT p FROM PaymentDetail p WHERE p.cardNumber = :cardNumber")
    , @NamedQuery(name = "PaymentDetail.findByGoodThru", query = "SELECT p FROM PaymentDetail p WHERE p.goodThru = :goodThru")
    , @NamedQuery(name = "PaymentDetail.findByCvv", query = "SELECT p FROM PaymentDetail p WHERE p.cvv = :cvv")
    , @NamedQuery(name = "PaymentDetail.findByName", query = "SELECT p FROM PaymentDetail p WHERE p.name = :name")
    , @NamedQuery(name = "PaymentDetail.findByUserId", query = "SELECT p FROM PaymentDetail p WHERE p.userId = :userId")})
public class PaymentDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "card_number")
    private int cardNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "good_thru")
    private String goodThru;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cvv")
    private int cvv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;

    public PaymentDetail() {
    }

    public PaymentDetail(Integer id) {
        this.id = id;
    }

    public PaymentDetail(Integer id, int cardNumber, String goodThru, int cvv, String name, int userId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.goodThru = goodThru;
        this.cvv = cvv;
        this.name = name;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getGoodThru() {
        return goodThru;
    }

    public void setGoodThru(String goodThru) {
        this.goodThru = goodThru;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        if (!(object instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail other = (PaymentDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.PaymentDetail[ id=" + id + " ]";
    }
    
}
