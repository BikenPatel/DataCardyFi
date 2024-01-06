/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacardyfi;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 *  
 */
@Entity
@Table(name = "tbl_lc_ocr_data")
@NamedQueries({
    @NamedQuery(name = "TblLcOcrData.findAll", query = "SELECT t FROM TblLcOcrData t"),
    @NamedQuery(name = "TblLcOcrData.findById", query = "SELECT t FROM TblLcOcrData t WHERE t.id = :id"),
    @NamedQuery(name = "TblLcOcrData.findByStudentId", query = "SELECT t FROM TblLcOcrData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblLcOcrData.findByStudentName", query = "SELECT t FROM TblLcOcrData t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "TblLcOcrData.findBySchoolName", query = "SELECT t FROM TblLcOcrData t WHERE t.schoolName = :schoolName"),
    @NamedQuery(name = "TblLcOcrData.findByStudentDob", query = "SELECT t FROM TblLcOcrData t WHERE t.studentDob = :studentDob")})
public class TblLcOcrData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "student_id")
    private int studentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_name")
    private String studentName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "school_name")
    private String schoolName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "student_dob")
    @Temporal(TemporalType.DATE)
    private Date studentDob;

    public TblLcOcrData() {
    }

    public TblLcOcrData(Integer id) {
        this.id = id;
    }

    public TblLcOcrData(Integer id, int studentId, String studentName, String schoolName, Date studentDob) {
        this.id = id;
        this.studentId = studentId;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.studentDob = studentDob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Date getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(Date studentDob) {
        this.studentDob = studentDob;
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
        if (!(object instanceof TblLcOcrData)) {
            return false;
        }
        TblLcOcrData other = (TblLcOcrData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblLcOcrData[ id=" + id + " ]";
    }
    
}
