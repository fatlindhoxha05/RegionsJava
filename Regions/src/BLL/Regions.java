/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fatlind B. Hoxha
 */
@Entity
@Table(name = "Regions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regions.findAll", query = "SELECT r FROM Regions r"),
    @NamedQuery(name = "Regions.findByRegionID", query = "SELECT r FROM Regions r WHERE r.regionID = :regionID"),
    @NamedQuery(name = "Regions.findByRegionDescription", query = "SELECT r FROM Regions r WHERE r.regionDescription = :regionDescription")})
public class Regions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RegionID")
    private Integer regionID;
    @Basic(optional = false)
    @Column(name = "RegionDescription")
    private String regionDescription;

    public Regions() {
    }

    public Regions(Integer regionID) {
        this.regionID = regionID;
    }

    public Regions(Integer regionID, String regionDescription) {
        this.regionID = regionID;
        this.regionDescription = regionDescription;
    }

    public Integer getRegionID() {
        return regionID;
    }

    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionID != null ? regionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regions)) {
            return false;
        }
        Regions other = (Regions) object;
        if ((this.regionID == null && other.regionID != null) || (this.regionID != null && !this.regionID.equals(other.regionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Regions[ regionID=" + regionID + " ]";
    }
    
}
