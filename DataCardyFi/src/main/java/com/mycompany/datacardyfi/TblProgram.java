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
@Table(name = "tbl_program")
@NamedQueries({
    @NamedQuery(name = "TblProgram.findAll", query = "SELECT t FROM TblProgram t"),
    @NamedQuery(name = "TblProgram.findByProgramCode", query = "SELECT t FROM TblProgram t WHERE t.programCode = :programCode"),
    @NamedQuery(name = "TblProgram.findByCollegeId", query = "SELECT t FROM TblProgram t WHERE t.collegeId = :collegeId"),
    @NamedQuery(name = "TblProgram.findByProgramName", query = "SELECT t FROM TblProgram t WHERE t.programName = :programName"),
    @NamedQuery(name = "TblProgram.findByProgramFees", query = "SELECT t FROM TblProgram t WHERE t.programFees = :programFees"),
    @NamedQuery(name = "TblProgram.findByProgramDuration", query = "SELECT t FROM TblProgram t WHERE t.programDuration = :programDuration")})
public class TblProgram implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "program_code")
    private Integer programCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "college_id")
    private int collegeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "program_name")
    private String programName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "program_fees")
    private int programFees;
    @Basic(optional = false)
    @NotNull
    @Column(name = "program_duration")
    private int programDuration;

    public TblProgram() {
    }

    public TblProgram(Integer programCode) {
        this.programCode = programCode;
    }

    public TblProgram(Integer programCode, int collegeId, String programName, int programFees, int programDuration) {
        this.programCode = programCode;
        this.collegeId = collegeId;
        this.programName = programName;
        this.programFees = programFees;
        this.programDuration = programDuration;
    }

    public Integer getProgramCode() {
        return programCode;
    }

    public void setProgramCode(Integer programCode) {
        this.programCode = programCode;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getProgramFees() {
        return programFees;
    }

    public void setProgramFees(int programFees) {
        this.programFees = programFees;
    }

    public int getProgramDuration() {
        return programDuration;
    }

    public void setProgramDuration(int programDuration) {
        this.programDuration = programDuration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programCode != null ? programCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProgram)) {
            return false;
        }
        TblProgram other = (TblProgram) object;
        if ((this.programCode == null && other.programCode != null) || (this.programCode != null && !this.programCode.equals(other.programCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datacardyfi.TblProgram[ programCode=" + programCode + " ]";
    }
    
}
