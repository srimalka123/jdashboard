/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.org.hims.jdashboard.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lk.org.hims.jdashboard.enums.CellValueType;

/**
 *
 * @author buddhika
 */
@Entity
public class FileCell implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private File file;
    @ManyToOne
    private FileColumn fileColumn;
    @Enumerated
    private CellValueType cellValueType;
    private String callValueString;
    @Lob
    private String cellValueMemo;
    private Double cellValueDouble;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof FileCell)) {
            return false;
        }
        FileCell other = (FileCell) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.org.hims.jdashboard.entity.FileCell[ id=" + id + " ]";
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileColumn getFileColumn() {
        return fileColumn;
    }

    public void setFileColumn(FileColumn fileColumn) {
        this.fileColumn = fileColumn;
    }

    public CellValueType getCellValueType() {
        return cellValueType;
    }

    public void setCellValueType(CellValueType cellValueType) {
        this.cellValueType = cellValueType;
    }

    public String getCallValueString() {
        return callValueString;
    }

    public void setCallValueString(String callValueString) {
        this.callValueString = callValueString;
    }

    public String getCellValueMemo() {
        return cellValueMemo;
    }

    public void setCellValueMemo(String cellValueMemo) {
        this.cellValueMemo = cellValueMemo;
    }

    public Double getCellValueDouble() {
        return cellValueDouble;
    }

    public void setCellValueDouble(Double cellValueDouble) {
        this.cellValueDouble = cellValueDouble;
    }

}
