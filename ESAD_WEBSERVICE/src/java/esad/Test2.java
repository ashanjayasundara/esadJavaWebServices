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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashan
 */
@Entity
@Table(name = "test2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test2.findAll", query = "SELECT t FROM Test2 t")
    , @NamedQuery(name = "Test2.findByIdtest2", query = "SELECT t FROM Test2 t WHERE t.idtest2 = :idtest2")})
public class Test2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtest2")
    private Integer idtest2;

    public Test2() {
    }

    public Test2(Integer idtest2) {
        this.idtest2 = idtest2;
    }

    public Integer getIdtest2() {
        return idtest2;
    }

    public void setIdtest2(Integer idtest2) {
        this.idtest2 = idtest2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtest2 != null ? idtest2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test2)) {
            return false;
        }
        Test2 other = (Test2) object;
        if ((this.idtest2 == null && other.idtest2 != null) || (this.idtest2 != null && !this.idtest2.equals(other.idtest2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.Test2[ idtest2=" + idtest2 + " ]";
    }
    
}
