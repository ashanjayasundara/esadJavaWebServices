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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashan
 */
@Entity
@Table(name = "sample")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sample.findAll", query = "SELECT s FROM Sample s")
    , @NamedQuery(name = "Sample.findByIdsample", query = "SELECT s FROM Sample s WHERE s.idsample = :idsample")
    , @NamedQuery(name = "Sample.findByName", query = "SELECT s FROM Sample s WHERE s.name = :name")})
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsample")
    private Integer idsample;
    @Size(max = 45)
    @Column(name = "name")
    private String name;

    public Sample() {
    }

    public Sample(Integer idsample) {
        this.idsample = idsample;
    }

    public Integer getIdsample() {
        return idsample;
    }

    public void setIdsample(Integer idsample) {
        this.idsample = idsample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsample != null ? idsample.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sample)) {
            return false;
        }
        Sample other = (Sample) object;
        if ((this.idsample == null && other.idsample != null) || (this.idsample != null && !this.idsample.equals(other.idsample))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "esad.Sample[ idsample=" + idsample + " ]";
    }
    
}
