/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.org.hims.jdashboard.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author buddhika
 */
@Named(value = "fileController")
@SessionScoped
public class FileController implements Serializable {

    private UploadedFile file;

    /**
     * Creates a new instance of FileController
     */
    public FileController() {
    }

    public String uploadFile(){
        if (file == null) {
//            JsfUtil.addErrorMessage("File ?");
            return "";
        }
        
        return "";
    }
    
}
