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
@Table(name = "tbl_10th_marksheet_ocr_data")
@NamedQueries({
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findAll", query = "SELECT t FROM Tbl10thMarksheetOcrData t"),
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findById", query = "SELECT t FROM Tbl10thMarksheetOcrData t WHERE t.id = :id"),
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findByStudentId", query = "SELECT t FROM Tbl10thMarksheetOcrData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findByStudentName", query = "SELECT t FROM Tbl10thMarksheetOcrData t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findBySchoolName", query = "SELECT t FROM Tbl10thMarksheetOcrData t WHERE t.schoolName = :schoolName"),
    @NamedQuery(name = "Tbl10thMarksheetOcrData.findByPercentage", query = "SELECT t FROM Tbl10thMarksheetOcrData t WHERE t.percentage = :percentage")})
public class Tbl10thMarksheetOcrData implements Serializable {

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
    @Column(name = "percentage")
    private float percentage;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "subject_list")
    private String subjectList;

    public Tbl10thMarksheetOcrData() {
    }

    public Tbl10thMarksheetOcrData(Integer id) {
        this.id = id;
    }

    public Tbl10thMarksheetOcrData(Integer id, int studentId, String studentName, String schoolName, float percentage, String subjectList) {
        this.id = id;
        this.studentId = studentId;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.percentage = percentage;
        this.subjectList = subjectList;
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

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
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
        if (!(object instanceof Tbl10thMarksheetOcrData)) {
            return false;
        }
        Tbl10thMarksheetOcrData other = (Tbl10thMarksheetOcrData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.Tbl10thMarksheetOcrData[ id=" + id + " ]";
    }
    
}
