/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacardyfi;

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

/**
 *
 *  
 */
@Entity
@Table(name = "tbl_colleges")
@NamedQueries({
    @NamedQuery(name = "TblColleges.findAll", query = "SELECT t FROM TblColleges t"),
    @NamedQuery(name = "TblColleges.findById", query = "SELECT t FROM TblColleges t WHERE t.id = :id"),
    @NamedQuery(name = "TblColleges.findByUniversityId", query = "SELECT t FROM TblColleges t WHERE t.universityId = :universityId"),
    @NamedQuery(name = "TblColleges.findByCollege", query = "SELECT t FROM TblColleges t WHERE t.college = :college"),
    @NamedQuery(name = "TblColleges.findByIsSelfFinance", query = "SELECT t FROM TblColleges t WHERE t.isSelfFinance = :isSelfFinance")})
public class TblColleges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "university_id")
    private int universityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "college")
    private String college;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_self_finance")
    private boolean isSelfFinance;

    public TblColleges() {
    }

    public TblColleges(Integer id) {
        this.id = id;
    }

    public TblColleges(Integer id, int universityId, String college, boolean isSelfFinance) {
        this.id = id;
        this.universityId = universityId;
        this.college = college;
        this.isSelfFinance = isSelfFinance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public boolean getIsSelfFinance() {
        return isSelfFinance;
    }

    public void setIsSelfFinance(boolean isSelfFinance) {
        this.isSelfFinance = isSelfFinance;
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
        if (!(object instanceof TblColleges)) {
            return false;
        }
        TblColleges other = (TblColleges) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblColleges[ id=" + id + " ]";
    }
    
}
