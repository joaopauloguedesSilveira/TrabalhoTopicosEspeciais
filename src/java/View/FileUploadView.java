/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.Scanner;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author aluno1
 */
@ManagedBean(name = "FileUploadView")
@SessionScoped
public class FileUploadView {
     String conteudoDoArquivo;
  
    
    public void handleFileUpload(FileUploadEvent event) throws IOException {
         conteudoDoArquivo = new Scanner(event.getFile().getInputstream(),"UTF-8").useDelimiter("\\A").next();
        
    }

    public String getConteudoDoArquivo() {
        return conteudoDoArquivo;
    }

    public void setConteudoDoArquivo(String conteudoDoArquivo) {
        this.conteudoDoArquivo = conteudoDoArquivo;
    }
    
    
    
}