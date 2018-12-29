package com.hclojas.erp.view;

import java.io.Serializable;


import org.apache.tomcat.util.security.MD5Encoder;


public class LoginView implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String login;
	private MD5Encoder senha;
	
	
	public void acess() {
		
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public MD5Encoder getSenha() {
		return senha;
	}


	public void setSenha(MD5Encoder senha) {
		this.senha = senha;
	}

}
