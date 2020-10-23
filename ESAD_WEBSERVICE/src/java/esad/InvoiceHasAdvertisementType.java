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
@Table(name = "invoice_has_advertisement_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvoiceHasAdvertisementType.findAll", query = "SELECT i FROM InvoiceHasAdvertisementType i")
    , @NamedQuery(name = "InvoiceHasAdvertisementType.findById", query = "SELECT i FROM InvoiceHasAdvertisementType i WHERE i.id = :id")
    , @NamedQuery(name = "InvoiceHasAdvertisementType.findByInvoiceId", query = "SELECT i FROM InvoiceHasAdvertisementType i WHERE i.invoiceId = :invoiceId")
    , @NamedQuery(name = "InvoiceHasAdvertisementType.findByAddTypeId", query = "SELECT i FROM InvoiceHasAdvertisementType i WHERE i.addTypeId = :addTypeId")
    , @NamedQuery(name = "InvoiceHasAdvertisementType.findByQuantity", query = "SELECT i FROM InvoiceHasAdvertisementType i WHERE i.quantity = :quantity")})
public class InvoiceHasAdvertisementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "invoice_id")
    private int invoiceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "add_type_id")
    private int addTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;

    public InvoiceHasAdvertisementType() {
    }

    public InvoiceHasAdvertisementType(Integer id) {
        this.id = id;
    }

    public InvoiceHasAdvertisementType(Integer id, int invoiceId, int addTypeId, int quantity) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.addTypeId = addTypeId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getAddTypeId() {
        return addTypeId;
    }

    public void setAddTypeId(int addTypeId) {
        this.addTypeId = addTypeId;
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
        if (!(object instanceof InvoiceHasAdvertisementType)) {
            return false;
        }
        InvoiceHasAdvertisementType other = (InvoiceHasAdvertisementType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.InvoiceHasAdvertisementType[ id=" + id + " ]";
    }
    
}
