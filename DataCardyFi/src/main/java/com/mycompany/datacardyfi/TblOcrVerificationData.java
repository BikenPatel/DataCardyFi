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
import javax.persistence.Lob;
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
@Table(name = "tbl_ocr_verification_data")
@NamedQueries({
    @NamedQuery(name = "TblOcrVerificationData.findAll", query = "SELECT t FROM TblOcrVerificationData t"),
    @NamedQuery(name = "TblOcrVerificationData.findById", query = "SELECT t FROM TblOcrVerificationData t WHERE t.id = :id"),
    @NamedQuery(name = "TblOcrVerificationData.findByStudentId", query = "SELECT t FROM TblOcrVerificationData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblOcrVerificationData.findByAadharNameVerifed", query = "SELECT t FROM TblOcrVerificationData t WHERE t.aadharNameVerifed = :aadharNameVerifed"),
    @NamedQuery(name = "TblOcrVerificationData.findByAadharAddressVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.aadharAddressVerified = :aadharAddressVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByAadharNoVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.aadharNoVerified = :aadharNoVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thNameVerified = :thNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThMarksVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thMarksVerified = :thMarksVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThPercentageVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thPercentageVerified = :thPercentageVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSchoolNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSchoolNameVerified = :thSchoolNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThMarksVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thMarksVerified1 = :thMarksVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByThNameVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thNameVerified1 = :thNameVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByThPercentageVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thPercentageVerified1 = :thPercentageVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSchoolNameVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSchoolNameVerified1 = :thSchoolNameVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByCollegeNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.collegeNameVerified = :collegeNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByUniversityNameVerifed", query = "SELECT t FROM TblOcrVerificationData t WHERE t.universityNameVerifed = :universityNameVerifed"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSemCgpaVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSemCgpaVerified = :thSemCgpaVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSemCpiVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSemCpiVerified = :thSemCpiVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSemCgpaVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSemCgpaVerified1 = :thSemCgpaVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByThSemCpiVerified1", query = "SELECT t FROM TblOcrVerificationData t WHERE t.thSemCpiVerified1 = :thSemCpiVerified1"),
    @NamedQuery(name = "TblOcrVerificationData.findByLcNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.lcNameVerified = :lcNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByLcSchoolNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.lcSchoolNameVerified = :lcSchoolNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByCasteCertiNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.casteCertiNameVerified = :casteCertiNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByCasteCertiDateVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.casteCertiDateVerified = :casteCertiDateVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByNonCraemyLayerNameVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.nonCraemyLayerNameVerified = :nonCraemyLayerNameVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByNonCreamyLayerDateVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.nonCreamyLayerDateVerified = :nonCreamyLayerDateVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByAadharDobVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.aadharDobVerified = :aadharDobVerified"),
    @NamedQuery(name = "TblOcrVerificationData.findByLcDobVerified", query = "SELECT t FROM TblOcrVerificationData t WHERE t.lcDobVerified = :lcDobVerified")})
public class TblOcrVerificationData implements Serializable {

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
    @Column(name = "aadhar_name_verifed")
    private boolean aadharNameVerifed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aadhar_address_verified")
    private boolean aadharAddressVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aadhar_no_verified")
    private boolean aadharNoVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "10th_name_verified")
    private boolean thNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "10th_marks_verified")
    private boolean thMarksVerified;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "10th_verified_marks_list")
    private String thVerifiedMarksList;
    @Basic(optional = false)
    @NotNull
    @Column(name = "10th_percentage_verified")
    private boolean thPercentageVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "10th_school_name_verified")
    private boolean thSchoolNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "12th_marks_verified")
    private boolean thMarksVerified1;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "12th_verified_marks_list")
    private String thVerifiedMarksList1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "12th_name_verified")
    private boolean thNameVerified1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "12th_percentage_verified")
    private boolean thPercentageVerified1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "12th_school_name_verified")
    private boolean thSchoolNameVerified1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "college_name_verified")
    private boolean collegeNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "university_name_verifed")
    private boolean universityNameVerifed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "5th_sem_cgpa_verified")
    private boolean thSemCgpaVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "5th_sem_cpi_verified")
    private boolean thSemCpiVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "6th_sem_cgpa_verified")
    private boolean thSemCgpaVerified1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "6th_sem_cpi_verified")
    private boolean thSemCpiVerified1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lc_name_verified")
    private boolean lcNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lc_school_name_verified")
    private boolean lcSchoolNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "caste_certi_name_verified")
    private boolean casteCertiNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "caste_certi_date_verified")
    private boolean casteCertiDateVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "non_craemy_layer_name_verified")
    private boolean nonCraemyLayerNameVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "non_creamy_layer_date_verified")
    private boolean nonCreamyLayerDateVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aadhar_dob_verified")
    private boolean aadharDobVerified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lc_dob_verified")
    private boolean lcDobVerified;

    public TblOcrVerificationData() {
    }

    public TblOcrVerificationData(Integer id) {
        this.id = id;
    }

    public TblOcrVerificationData(Integer id, int studentId, boolean aadharNameVerifed, boolean aadharAddressVerified, boolean aadharNoVerified, boolean thNameVerified, boolean thMarksVerified, String thVerifiedMarksList, boolean thPercentageVerified, boolean thSchoolNameVerified, boolean thMarksVerified1, String thVerifiedMarksList1, boolean thNameVerified1, boolean thPercentageVerified1, boolean thSchoolNameVerified1, boolean collegeNameVerified, boolean universityNameVerifed, boolean thSemCgpaVerified, boolean thSemCpiVerified, boolean thSemCgpaVerified1, boolean thSemCpiVerified1, boolean lcNameVerified, boolean lcSchoolNameVerified, boolean casteCertiNameVerified, boolean casteCertiDateVerified, boolean nonCraemyLayerNameVerified, boolean nonCreamyLayerDateVerified, boolean aadharDobVerified, boolean lcDobVerified) {
        this.id = id;
        this.studentId = studentId;
        this.aadharNameVerifed = aadharNameVerifed;
        this.aadharAddressVerified = aadharAddressVerified;
        this.aadharNoVerified = aadharNoVerified;
        this.thNameVerified = thNameVerified;
        this.thMarksVerified = thMarksVerified;
        this.thVerifiedMarksList = thVerifiedMarksList;
        this.thPercentageVerified = thPercentageVerified;
        this.thSchoolNameVerified = thSchoolNameVerified;
        this.thMarksVerified1 = thMarksVerified1;
        this.thVerifiedMarksList1 = thVerifiedMarksList1;
        this.thNameVerified1 = thNameVerified1;
        this.thPercentageVerified1 = thPercentageVerified1;
        this.thSchoolNameVerified1 = thSchoolNameVerified1;
        this.collegeNameVerified = collegeNameVerified;
        this.universityNameVerifed = universityNameVerifed;
        this.thSemCgpaVerified = thSemCgpaVerified;
        this.thSemCpiVerified = thSemCpiVerified;
        this.thSemCgpaVerified1 = thSemCgpaVerified1;
        this.thSemCpiVerified1 = thSemCpiVerified1;
        this.lcNameVerified = lcNameVerified;
        this.lcSchoolNameVerified = lcSchoolNameVerified;
        this.casteCertiNameVerified = casteCertiNameVerified;
        this.casteCertiDateVerified = casteCertiDateVerified;
        this.nonCraemyLayerNameVerified = nonCraemyLayerNameVerified;
        this.nonCreamyLayerDateVerified = nonCreamyLayerDateVerified;
        this.aadharDobVerified = aadharDobVerified;
        this.lcDobVerified = lcDobVerified;
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

    public boolean getAadharNameVerifed() {
        return aadharNameVerifed;
    }

    public void setAadharNameVerifed(boolean aadharNameVerifed) {
        this.aadharNameVerifed = aadharNameVerifed;
    }

    public boolean getAadharAddressVerified() {
        return aadharAddressVerified;
    }

    public void setAadharAddressVerified(boolean aadharAddressVerified) {
        this.aadharAddressVerified = aadharAddressVerified;
    }

    public boolean getAadharNoVerified() {
        return aadharNoVerified;
    }

    public void setAadharNoVerified(boolean aadharNoVerified) {
        this.aadharNoVerified = aadharNoVerified;
    }

    public boolean getThNameVerified() {
        return thNameVerified;
    }

    public void setThNameVerified(boolean thNameVerified) {
        this.thNameVerified = thNameVerified;
    }

    public boolean getThMarksVerified() {
        return thMarksVerified;
    }

    public void setThMarksVerified(boolean thMarksVerified) {
        this.thMarksVerified = thMarksVerified;
    }

    public String getThVerifiedMarksList() {
        return thVerifiedMarksList;
    }

    public void setThVerifiedMarksList(String thVerifiedMarksList) {
        this.thVerifiedMarksList = thVerifiedMarksList;
    }

    public boolean getThPercentageVerified() {
        return thPercentageVerified;
    }

    public void setThPercentageVerified(boolean thPercentageVerified) {
        this.thPercentageVerified = thPercentageVerified;
    }

    public boolean getThSchoolNameVerified() {
        return thSchoolNameVerified;
    }

    public void setThSchoolNameVerified(boolean thSchoolNameVerified) {
        this.thSchoolNameVerified = thSchoolNameVerified;
    }

    public boolean getThMarksVerified1() {
        return thMarksVerified1;
    }

    public void setThMarksVerified1(boolean thMarksVerified1) {
        this.thMarksVerified1 = thMarksVerified1;
    }

    public String getThVerifiedMarksList1() {
        return thVerifiedMarksList1;
    }

    public void setThVerifiedMarksList1(String thVerifiedMarksList1) {
        this.thVerifiedMarksList1 = thVerifiedMarksList1;
    }

    public boolean getThNameVerified1() {
        return thNameVerified1;
    }

    public void setThNameVerified1(boolean thNameVerified1) {
        this.thNameVerified1 = thNameVerified1;
    }

    public boolean getThPercentageVerified1() {
        return thPercentageVerified1;
    }

    public void setThPercentageVerified1(boolean thPercentageVerified1) {
        this.thPercentageVerified1 = thPercentageVerified1;
    }

    public boolean getThSchoolNameVerified1() {
        return thSchoolNameVerified1;
    }

    public void setThSchoolNameVerified1(boolean thSchoolNameVerified1) {
        this.thSchoolNameVerified1 = thSchoolNameVerified1;
    }

    public boolean getCollegeNameVerified() {
        return collegeNameVerified;
    }

    public void setCollegeNameVerified(boolean collegeNameVerified) {
        this.collegeNameVerified = collegeNameVerified;
    }

    public boolean getUniversityNameVerifed() {
        return universityNameVerifed;
    }

    public void setUniversityNameVerifed(boolean universityNameVerifed) {
        this.universityNameVerifed = universityNameVerifed;
    }

    public boolean getThSemCgpaVerified() {
        return thSemCgpaVerified;
    }

    public void setThSemCgpaVerified(boolean thSemCgpaVerified) {
        this.thSemCgpaVerified = thSemCgpaVerified;
    }

    public boolean getThSemCpiVerified() {
        return thSemCpiVerified;
    }

    public void setThSemCpiVerified(boolean thSemCpiVerified) {
        this.thSemCpiVerified = thSemCpiVerified;
    }

    public boolean getThSemCgpaVerified1() {
        return thSemCgpaVerified1;
    }

    public void setThSemCgpaVerified1(boolean thSemCgpaVerified1) {
        this.thSemCgpaVerified1 = thSemCgpaVerified1;
    }

    public boolean getThSemCpiVerified1() {
        return thSemCpiVerified1;
    }

    public void setThSemCpiVerified1(boolean thSemCpiVerified1) {
        this.thSemCpiVerified1 = thSemCpiVerified1;
    }

    public boolean getLcNameVerified() {
        return lcNameVerified;
    }

    public void setLcNameVerified(boolean lcNameVerified) {
        this.lcNameVerified = lcNameVerified;
    }

    public boolean getLcSchoolNameVerified() {
        return lcSchoolNameVerified;
    }

    public void setLcSchoolNameVerified(boolean lcSchoolNameVerified) {
        this.lcSchoolNameVerified = lcSchoolNameVerified;
    }

    public boolean getCasteCertiNameVerified() {
        return casteCertiNameVerified;
    }

    public void setCasteCertiNameVerified(boolean casteCertiNameVerified) {
        this.casteCertiNameVerified = casteCertiNameVerified;
    }

    public boolean getCasteCertiDateVerified() {
        return casteCertiDateVerified;
    }

    public void setCasteCertiDateVerified(boolean casteCertiDateVerified) {
        this.casteCertiDateVerified = casteCertiDateVerified;
    }

    public boolean getNonCraemyLayerNameVerified() {
        return nonCraemyLayerNameVerified;
    }

    public void setNonCraemyLayerNameVerified(boolean nonCraemyLayerNameVerified) {
        this.nonCraemyLayerNameVerified = nonCraemyLayerNameVerified;
    }

    public boolean getNonCreamyLayerDateVerified() {
        return nonCreamyLayerDateVerified;
    }

    public void setNonCreamyLayerDateVerified(boolean nonCreamyLayerDateVerified) {
        this.nonCreamyLayerDateVerified = nonCreamyLayerDateVerified;
    }

    public boolean getAadharDobVerified() {
        return aadharDobVerified;
    }

    public void setAadharDobVerified(boolean aadharDobVerified) {
        this.aadharDobVerified = aadharDobVerified;
    }

    public boolean getLcDobVerified() {
        return lcDobVerified;
    }

    public void setLcDobVerified(boolean lcDobVerified) {
        this.lcDobVerified = lcDobVerified;
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
        if (!(object instanceof TblOcrVerificationData)) {
            return false;
        }
        TblOcrVerificationData other = (TblOcrVerificationData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblOcrVerificationData[ id=" + id + " ]";
    }
    
}
