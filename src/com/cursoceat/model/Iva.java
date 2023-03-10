package com.cursoceat.model;

public enum Iva {

	NORMAL(21), MEDICINAS(4), ALIMENTACION(10), OTROS(5), EXENTO(0);
	
	private double porcentaje;
	
	private Iva(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

}
