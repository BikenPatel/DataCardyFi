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
@Table(name = "tbl_student_acadamic_data")
@NamedQueries({
    @NamedQuery(name = "TblStudentAcadamicData.findAll", query = "SELECT t FROM TblStudentAcadamicData t"),
    @NamedQuery(name = "TblStudentAcadamicData.findById", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.id = :id"),
    @NamedQuery(name = "TblStudentAcadamicData.findByStudentId", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TblStudentAcadamicData.findByPreviousProgram", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.previousProgram = :previousProgram"),
    @NamedQuery(name = "TblStudentAcadamicData.findByQualifyingUniversity", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.qualifyingUniversity = :qualifyingUniversity"),
    @NamedQuery(name = "TblStudentAcadamicData.findByQualifyingBoard", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.qualifyingBoard = :qualifyingBoard"),
    @NamedQuery(name = "TblStudentAcadamicData.findByGraduationClass", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.graduationClass = :graduationClass"),
    @NamedQuery(name = "TblStudentAcadamicData.findByLastCollege", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.lastCollege = :lastCollege"),
    @NamedQuery(name = "TblStudentAcadamicData.findByYearlyBasedGraduation", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.yearlyBasedGraduation = :yearlyBasedGraduation"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemTotalattampt", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemTotalattampt = :thSemTotalattampt"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemTotalattampt1", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemTotalattampt1 = :thSemTotalattampt1"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemAggregateMarks", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemAggregateMarks = :thSemAggregateMarks"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemAggregateMarks1", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemAggregateMarks1 = :thSemAggregateMarks1"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemExternalMarks", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemExternalMarks = :thSemExternalMarks"),
    @NamedQuery(name = "TblStudentAcadamicData.findByThSemExternalMarks1", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.thSemExternalMarks1 = :thSemExternalMarks1"),
    @NamedQuery(name = "TblStudentAcadamicData.findByGraduationAttampt", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.graduationAttampt = :graduationAttampt"),
    @NamedQuery(name = "TblStudentAcadamicData.findByFinalYearCgpaGraduation", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.finalYearCgpaGraduation = :finalYearCgpaGraduation"),
    @NamedQuery(name = "TblStudentAcadamicData.findByTotalCgpa", query = "SELECT t FROM TblStudentAcadamicData t WHERE t.totalCgpa = :totalCgpa")})
public class TblStudentAcadamicData implements Serializable {

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
    @Column(name = "previous_program")
    private String previousProgram;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "qualifying_university")
    private String qualifyingUniversity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "qualifying_board")
    private String qualifyingBoard;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "graduation_class")
    private String graduationClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "last_college")
    private String lastCollege;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "yearly_based_graduation")
    private String yearlyBasedGraduation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "5th_sem_totalattampt")
    private String thSemTotalattampt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "6th_sem_totalattampt")
    private String thSemTotalattampt1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "5th_sem_aggregate_marks")
    private String thSemAggregateMarks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "6th_sem_aggregate_marks")
    private String thSemAggregateMarks1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "5th_sem_external_marks")
    private String thSemExternalMarks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "6th_sem_external_marks")
    private String thSemExternalMarks1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "graduation_attampt")
    private String graduationAttampt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "final_year_cgpa_graduation")
    private String finalYearCgpaGraduation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "total_cgpa")
    private String totalCgpa;

    public TblStudentAcadamicData() {
    }

    public TblStudentAcadamicData(Integer id) {
        this.id = id;
    }

    public TblStudentAcadamicData(Integer id, int studentId, String previousProgram, String qualifyingUniversity, String qualifyingBoard, String graduationClass, String lastCollege, String yearlyBasedGraduation, String thSemTotalattampt, String thSemTotalattampt1, String thSemAggregateMarks, String thSemAggregateMarks1, String thSemExternalMarks, String thSemExternalMarks1, String graduationAttampt, String finalYearCgpaGraduation, String totalCgpa) {
        this.id = id;
        this.studentId = studentId;
        this.previousProgram = previousProgram;
        this.qualifyingUniversity = qualifyingUniversity;
        this.qualifyingBoard = qualifyingBoard;
        this.graduationClass = graduationClass;
        this.lastCollege = lastCollege;
        this.yearlyBasedGraduation = yearlyBasedGraduation;
        this.thSemTotalattampt = thSemTotalattampt;
        this.thSemTotalattampt1 = thSemTotalattampt1;
        this.thSemAggregateMarks = thSemAggregateMarks;
        this.thSemAggregateMarks1 = thSemAggregateMarks1;
        this.thSemExternalMarks = thSemExternalMarks;
        this.thSemExternalMarks1 = thSemExternalMarks1;
        this.graduationAttampt = graduationAttampt;
        this.finalYearCgpaGraduation = finalYearCgpaGraduation;
        this.totalCgpa = totalCgpa;
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

    public String getPreviousProgram() {
        return previousProgram;
    }

    public void setPreviousProgram(String previousProgram) {
        this.previousProgram = previousProgram;
    }

    public String getQualifyingUniversity() {
        return qualifyingUniversity;
    }

    public void setQualifyingUniversity(String qualifyingUniversity) {
        this.qualifyingUniversity = qualifyingUniversity;
    }

    public String getQualifyingBoard() {
        return qualifyingBoard;
    }

    public void setQualifyingBoard(String qualifyingBoard) {
        this.qualifyingBoard = qualifyingBoard;
    }

    public String getGraduationClass() {
        return graduationClass;
    }

    public void setGraduationClass(String graduationClass) {
        this.graduationClass = graduationClass;
    }

    public String getLastCollege() {
        return lastCollege;
    }

    public void setLastCollege(String lastCollege) {
        this.lastCollege = lastCollege;
    }

    public String getYearlyBasedGraduation() {
        return yearlyBasedGraduation;
    }

    public void setYearlyBasedGraduation(String yearlyBasedGraduation) {
        this.yearlyBasedGraduation = yearlyBasedGraduation;
    }

    public String getThSemTotalattampt() {
        return thSemTotalattampt;
    }

    public void setThSemTotalattampt(String thSemTotalattampt) {
        this.thSemTotalattampt = thSemTotalattampt;
    }

    public String getThSemTotalattampt1() {
        return thSemTotalattampt1;
    }

    public void setThSemTotalattampt1(String thSemTotalattampt1) {
        this.thSemTotalattampt1 = thSemTotalattampt1;
    }

    public String getThSemAggregateMarks() {
        return thSemAggregateMarks;
    }

    public void setThSemAggregateMarks(String thSemAggregateMarks) {
        this.thSemAggregateMarks = thSemAggregateMarks;
    }

    public String getThSemAggregateMarks1() {
        return thSemAggregateMarks1;
    }

    public void setThSemAggregateMarks1(String thSemAggregateMarks1) {
        this.thSemAggregateMarks1 = thSemAggregateMarks1;
    }

    public String getThSemExternalMarks() {
        return thSemExternalMarks;
    }

    public void setThSemExternalMarks(String thSemExternalMarks) {
        this.thSemExternalMarks = thSemExternalMarks;
    }

    public String getThSemExternalMarks1() {
        return thSemExternalMarks1;
    }

    public void setThSemExternalMarks1(String thSemExternalMarks1) {
        this.thSemExternalMarks1 = thSemExternalMarks1;
    }

    public String getGraduationAttampt() {
        return graduationAttampt;
    }

    public void setGraduationAttampt(String graduationAttampt) {
        this.graduationAttampt = graduationAttampt;
    }

    public String getFinalYearCgpaGraduation() {
        return finalYearCgpaGraduation;
    }

    public void setFinalYearCgpaGraduation(String finalYearCgpaGraduation) {
        this.finalYearCgpaGraduation = finalYearCgpaGraduation;
    }

    public String getTotalCgpa() {
        return totalCgpa;
    }

    public void setTotalCgpa(String totalCgpa) {
        this.totalCgpa = totalCgpa;
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
        if (!(object instanceof TblStudentAcadamicData)) {
            return false;
        }
        TblStudentAcadamicData other = (TblStudentAcadamicData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblStudentAcadamicData[ id=" + id + " ]";
    }
    
}
