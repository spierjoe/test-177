package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
	private String nameFirma;
    
    @PostConstruct  
    public void init() {
    }

    public void save() {
        FacesMessage msg = new FacesMessage("Successful", "Hello " + nameFirma);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
