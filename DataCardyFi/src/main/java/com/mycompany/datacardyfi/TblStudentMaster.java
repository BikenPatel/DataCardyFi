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
@Table(name = "tbl_student_master")
@NamedQueries({
    @NamedQuery(name = "TblStudentMaster.findAll", query = "SELECT t FROM TblStudentMaster t"),
    @NamedQuery(name = "TblStudentMaster.findByStudentId", query = "SELECT t FROM TblStudentMaster t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblStudentMaster.findByStudentName", query = "SELECT t FROM TblStudentMaster t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "TblStudentMaster.findByEmail", query = "SELECT t FROM TblStudentMaster t WHERE t.email = :email"),
    @NamedQuery(name = "TblStudentMaster.findByMobileNumber", query = "SELECT t FROM TblStudentMaster t WHERE t.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "TblStudentMaster.findByPassword", query = "SELECT t FROM TblStudentMaster t WHERE t.password = :password")})
public class TblStudentMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_id")
    private Integer studentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "student_name")
    private String studentName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "program")
    private String program;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "college")
    private String college;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobile_number")
    private long mobileNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;

    public TblStudentMaster() {
    }

    public TblStudentMaster(Integer studentId) {
        this.studentId = studentId;
    }

    public TblStudentMaster(Integer studentId, String studentName, String program, String college, String email, long mobileNumber, String password) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.program = program;
        this.college = college;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblStudentMaster)) {
            return false;
        }
        TblStudentMaster other = (TblStudentMaster) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblStudentMaster[ studentId=" + studentId + " ]";
    }
    
}
