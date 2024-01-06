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
@Table(name = "tbl_aadhar_ocr_data")
@NamedQueries({
    @NamedQuery(name = "TblAadharOcrData.findAll", query = "SELECT t FROM TblAadharOcrData t"),
    @NamedQuery(name = "TblAadharOcrData.findById", query = "SELECT t FROM TblAadharOcrData t WHERE t.id = :id"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentId", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblAadharOcrData.findByAadharNumber", query = "SELECT t FROM TblAadharOcrData t WHERE t.aadharNumber = :aadharNumber"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentName", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentAddress", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentAddress = :studentAddress"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentCity", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentCity = :studentCity"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentState", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentState = :studentState"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentPincode", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentPincode = :studentPincode"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentContry", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentContry = :studentContry"),
    @NamedQuery(name = "TblAadharOcrData.findByStudentDob", query = "SELECT t FROM TblAadharOcrData t WHERE t.studentDob = :studentDob")})
public class TblAadharOcrData implements Serializable {

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
    @Column(name = "aadhar_number")
    private long aadharNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_name")
    private String studentName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_address")
    private String studentAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_city")
    private String studentCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_state")
    private String studentState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_pincode")
    private String studentPincode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_contry")
    private String studentContry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "student_dob")
    @Temporal(TemporalType.DATE)
    private Date studentDob;

    public TblAadharOcrData() {
    }

    public TblAadharOcrData(Integer id) {
        this.id = id;
    }

    public TblAadharOcrData(Integer id, int studentId, long aadharNumber, String studentName, String studentAddress, String studentCity, String studentState, String studentPincode, String studentContry, Date studentDob) {
        this.id = id;
        this.studentId = studentId;
        this.aadharNumber = aadharNumber;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentCity = studentCity;
        this.studentState = studentState;
        this.studentPincode = studentPincode;
        this.studentContry = studentContry;
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

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    public String getStudentPincode() {
        return studentPincode;
    }

    public void setStudentPincode(String studentPincode) {
        this.studentPincode = studentPincode;
    }

    public String getStudentContry() {
        return studentContry;
    }

    public void setStudentContry(String studentContry) {
        this.studentContry = studentContry;
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
        if (!(object instanceof TblAadharOcrData)) {
            return false;
        }
        TblAadharOcrData other = (TblAadharOcrData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblAadharOcrData[ id=" + id + " ]";
    }
    
}
