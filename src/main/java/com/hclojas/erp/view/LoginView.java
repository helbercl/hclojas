package com.hclojas.erp.view;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;



@ManagedBean(name = "loginView")
@ViewScoped
public class LoginView implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;
	private boolean checkCaptcha;
	
	
	public void acess() {
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Correct","Marcou!");
		FacesContext.getCurrentInstance().addMessage(null,mensagem);
	}

    public void validarCaptcha() {
    	
    }
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isCheckCaptcha(ValueChangeEvent valueChagedEvent) {
		if (valueChagedEvent.getOldValue().equals(false)) {
			checkCaptcha=false;
		}
		return checkCaptcha;
	}

	public void setCheckCaptcha(boolean checkCaptcha) {
		this.checkCaptcha = checkCaptcha;
	}


	

}
