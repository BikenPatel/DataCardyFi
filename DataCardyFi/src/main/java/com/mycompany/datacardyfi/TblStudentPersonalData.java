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
@Table(name = "tbl_student_personal_data")
@NamedQueries({
    @NamedQuery(name = "TblStudentPersonalData.findAll", query = "SELECT t FROM TblStudentPersonalData t"),
    @NamedQuery(name = "TblStudentPersonalData.findById", query = "SELECT t FROM TblStudentPersonalData t WHERE t.id = :id"),
    @NamedQuery(name = "TblStudentPersonalData.findByStudentId", query = "SELECT t FROM TblStudentPersonalData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblStudentPersonalData.findByDob", query = "SELECT t FROM TblStudentPersonalData t WHERE t.dob = :dob"),
    @NamedQuery(name = "TblStudentPersonalData.findByCategory", query = "SELECT t FROM TblStudentPersonalData t WHERE t.category = :category"),
    @NamedQuery(name = "TblStudentPersonalData.findByReligion", query = "SELECT t FROM TblStudentPersonalData t WHERE t.religion = :religion"),
    @NamedQuery(name = "TblStudentPersonalData.findByGender", query = "SELECT t FROM TblStudentPersonalData t WHERE t.gender = :gender"),
    @NamedQuery(name = "TblStudentPersonalData.findByBloodGroup", query = "SELECT t FROM TblStudentPersonalData t WHERE t.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "TblStudentPersonalData.findByAadharNo", query = "SELECT t FROM TblStudentPersonalData t WHERE t.aadharNo = :aadharNo"),
    @NamedQuery(name = "TblStudentPersonalData.findByAddress", query = "SELECT t FROM TblStudentPersonalData t WHERE t.address = :address"),
    @NamedQuery(name = "TblStudentPersonalData.findByCity", query = "SELECT t FROM TblStudentPersonalData t WHERE t.city = :city"),
    @NamedQuery(name = "TblStudentPersonalData.findByState", query = "SELECT t FROM TblStudentPersonalData t WHERE t.state = :state"),
    @NamedQuery(name = "TblStudentPersonalData.findByPincode", query = "SELECT t FROM TblStudentPersonalData t WHERE t.pincode = :pincode"),
    @NamedQuery(name = "TblStudentPersonalData.findByPermanentAddress", query = "SELECT t FROM TblStudentPersonalData t WHERE t.permanentAddress = :permanentAddress"),
    @NamedQuery(name = "TblStudentPersonalData.findByPermanentCity", query = "SELECT t FROM TblStudentPersonalData t WHERE t.permanentCity = :permanentCity"),
    @NamedQuery(name = "TblStudentPersonalData.findByParmanentState", query = "SELECT t FROM TblStudentPersonalData t WHERE t.parmanentState = :parmanentState"),
    @NamedQuery(name = "TblStudentPersonalData.findByParmanentPincode", query = "SELECT t FROM TblStudentPersonalData t WHERE t.parmanentPincode = :parmanentPincode"),
    @NamedQuery(name = "TblStudentPersonalData.findByDisabillity", query = "SELECT t FROM TblStudentPersonalData t WHERE t.disabillity = :disabillity")})
public class TblStudentPersonalData implements Serializable {

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
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "category")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "religion")
    private String religion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "blood_group")
    private String bloodGroup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "aadhar_no")
    private String aadharNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pincode")
    private String pincode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "permanent_address")
    private String permanentAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "permanent_city")
    private String permanentCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "parmanent_state")
    private String parmanentState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "parmanent_pincode")
    private String parmanentPincode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "disabillity")
    private String disabillity;

    public TblStudentPersonalData() {
    }

    public TblStudentPersonalData(Integer id) {
        this.id = id;
    }

    public TblStudentPersonalData(Integer id, int studentId, Date dob, String category, String religion, String gender, String bloodGroup, String aadharNo, String address, String city, String state, String pincode, String permanentAddress, String permanentCity, String parmanentState, String parmanentPincode, String disabillity) {
        this.id = id;
        this.studentId = studentId;
        this.dob = dob;
        this.category = category;
        this.religion = religion;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.aadharNo = aadharNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.permanentAddress = permanentAddress;
        this.permanentCity = permanentCity;
        this.parmanentState = parmanentState;
        this.parmanentPincode = parmanentPincode;
        this.disabillity = disabillity;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public String getParmanentState() {
        return parmanentState;
    }

    public void setParmanentState(String parmanentState) {
        this.parmanentState = parmanentState;
    }

    public String getParmanentPincode() {
        return parmanentPincode;
    }

    public void setParmanentPincode(String parmanentPincode) {
        this.parmanentPincode = parmanentPincode;
    }

    public String getDisabillity() {
        return disabillity;
    }

    public void setDisabillity(String disabillity) {
        this.disabillity = disabillity;
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
        if (!(object instanceof TblStudentPersonalData)) {
            return false;
        }
        TblStudentPersonalData other = (TblStudentPersonalData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblStudentPersonalData[ id=" + id + " ]";
    }
    
}
