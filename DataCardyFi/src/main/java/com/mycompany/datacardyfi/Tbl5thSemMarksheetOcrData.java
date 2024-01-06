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
@Table(name = "tbl_5th_sem_marksheet_ocr_data")
@NamedQueries({
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findAll", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findById", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.id = :id"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByStudentId", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByStudentName", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByCollegeName", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.collegeName = :collegeName"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByCourse", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.course = :course"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByCgpa", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.cgpa = :cgpa"),
    @NamedQuery(name = "Tbl5thSemMarksheetOcrData.findByCpi", query = "SELECT t FROM Tbl5thSemMarksheetOcrData t WHERE t.cpi = :cpi")})
public class Tbl5thSemMarksheetOcrData implements Serializable {

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
    @Column(name = "college_name")
    private String collegeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "course")
    private String course;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cgpa")
    private float cgpa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpi")
    private float cpi;

    public Tbl5thSemMarksheetOcrData() {
    }

    public Tbl5thSemMarksheetOcrData(Integer id) {
        this.id = id;
    }

    public Tbl5thSemMarksheetOcrData(Integer id, int studentId, String studentName, String collegeName, String course, float cgpa, float cpi) {
        this.id = id;
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.course = course;
        this.cgpa = cgpa;
        this.cpi = cpi;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCpi() {
        return cpi;
    }

    public void setCpi(float cpi) {
        this.cpi = cpi;
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
        if (!(object instanceof Tbl5thSemMarksheetOcrData)) {
            return false;
        }
        Tbl5thSemMarksheetOcrData other = (Tbl5thSemMarksheetOcrData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.Tbl5thSemMarksheetOcrData[ id=" + id + " ]";
    }
    
}
