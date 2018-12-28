package com.hclojas.erp.enums;

public enum TiposEmpresas {
	MEI("MicroEmpreendedor Individual"), 
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA(" Sociedade Limitada"), 
	SA("Sociedade Anonima");

	private String descricao;

	TiposEmpresas(String descricao) {
      this.descricao =descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
