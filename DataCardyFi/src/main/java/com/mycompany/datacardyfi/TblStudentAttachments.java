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
@Table(name = "tbl_student_attachments")
@NamedQueries({
    @NamedQuery(name = "TblStudentAttachments.findAll", query = "SELECT t FROM TblStudentAttachments t"),
    @NamedQuery(name = "TblStudentAttachments.findById", query = "SELECT t FROM TblStudentAttachments t WHERE t.id = :id"),
    @NamedQuery(name = "TblStudentAttachments.findByStudentId", query = "SELECT t FROM TblStudentAttachments t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblStudentAttachments.findByAadharcardFront", query = "SELECT t FROM TblStudentAttachments t WHERE t.aadharcardFront = :aadharcardFront"),
    @NamedQuery(name = "TblStudentAttachments.findByAadharcardRear", query = "SELECT t FROM TblStudentAttachments t WHERE t.aadharcardRear = :aadharcardRear"),
    @NamedQuery(name = "TblStudentAttachments.findByThSemMarksheet", query = "SELECT t FROM TblStudentAttachments t WHERE t.thSemMarksheet = :thSemMarksheet"),
    @NamedQuery(name = "TblStudentAttachments.findByThSemMarksheet1", query = "SELECT t FROM TblStudentAttachments t WHERE t.thSemMarksheet1 = :thSemMarksheet1"),
    @NamedQuery(name = "TblStudentAttachments.findByLeavingCerti", query = "SELECT t FROM TblStudentAttachments t WHERE t.leavingCerti = :leavingCerti"),
    @NamedQuery(name = "TblStudentAttachments.findByCasteCerti", query = "SELECT t FROM TblStudentAttachments t WHERE t.casteCerti = :casteCerti"),
    @NamedQuery(name = "TblStudentAttachments.findByNonCreamylayerCerti", query = "SELECT t FROM TblStudentAttachments t WHERE t.nonCreamylayerCerti = :nonCreamylayerCerti"),
    @NamedQuery(name = "TblStudentAttachments.findByPassportSizePhoto", query = "SELECT t FROM TblStudentAttachments t WHERE t.passportSizePhoto = :passportSizePhoto"),
    @NamedQuery(name = "TblStudentAttachments.findBySign", query = "SELECT t FROM TblStudentAttachments t WHERE t.sign = :sign")})
public class TblStudentAttachments implements Serializable {

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
    @Column(name = "aadharcard_front")
    private String aadharcardFront;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "aadharcard_rear")
    private String aadharcardRear;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "6th_sem_marksheet")
    private String thSemMarksheet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "5th_sem_marksheet")
    private String thSemMarksheet1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "leaving_certi")
    private String leavingCerti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "caste_certi")
    private String casteCerti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "non_creamylayer_certi")
    private String nonCreamylayerCerti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "passport_size_photo")
    private String passportSizePhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sign")
    private String sign;

    public TblStudentAttachments() {
    }

    public TblStudentAttachments(Integer id) {
        this.id = id;
    }

    public TblStudentAttachments(Integer id, int studentId, String aadharcardFront, String aadharcardRear, String thSemMarksheet, String thSemMarksheet1, String leavingCerti, String casteCerti, String nonCreamylayerCerti, String passportSizePhoto, String sign) {
        this.id = id;
        this.studentId = studentId;
        this.aadharcardFront = aadharcardFront;
        this.aadharcardRear = aadharcardRear;
        this.thSemMarksheet = thSemMarksheet;
        this.thSemMarksheet1 = thSemMarksheet1;
        this.leavingCerti = leavingCerti;
        this.casteCerti = casteCerti;
        this.nonCreamylayerCerti = nonCreamylayerCerti;
        this.passportSizePhoto = passportSizePhoto;
        this.sign = sign;
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

    public String getAadharcardFront() {
        return aadharcardFront;
    }

    public void setAadharcardFront(String aadharcardFront) {
        this.aadharcardFront = aadharcardFront;
    }

    public String getAadharcardRear() {
        return aadharcardRear;
    }

    public void setAadharcardRear(String aadharcardRear) {
        this.aadharcardRear = aadharcardRear;
    }

    public String getThSemMarksheet() {
        return thSemMarksheet;
    }

    public void setThSemMarksheet(String thSemMarksheet) {
        this.thSemMarksheet = thSemMarksheet;
    }

    public String getThSemMarksheet1() {
        return thSemMarksheet1;
    }

    public void setThSemMarksheet1(String thSemMarksheet1) {
        this.thSemMarksheet1 = thSemMarksheet1;
    }

    public String getLeavingCerti() {
        return leavingCerti;
    }

    public void setLeavingCerti(String leavingCerti) {
        this.leavingCerti = leavingCerti;
    }

    public String getCasteCerti() {
        return casteCerti;
    }

    public void setCasteCerti(String casteCerti) {
        this.casteCerti = casteCerti;
    }

    public String getNonCreamylayerCerti() {
        return nonCreamylayerCerti;
    }

    public void setNonCreamylayerCerti(String nonCreamylayerCerti) {
        this.nonCreamylayerCerti = nonCreamylayerCerti;
    }

    public String getPassportSizePhoto() {
        return passportSizePhoto;
    }

    public void setPassportSizePhoto(String passportSizePhoto) {
        this.passportSizePhoto = passportSizePhoto;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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
        if (!(object instanceof TblStudentAttachments)) {
            return false;
        }
        TblStudentAttachments other = (TblStudentAttachments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblStudentAttachments[ id=" + id + " ]";
    }
    
}
