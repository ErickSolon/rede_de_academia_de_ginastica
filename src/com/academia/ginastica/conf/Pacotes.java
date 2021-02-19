package com.academia.ginastica.conf;

public class Pacotes {
	public Pacotes(String planoA, String planoB) {
		this.planoA = planoA;
		this.planoB = planoB;
	}

	protected String planoA;
	protected String planoB;

	public String getPlanoA() {
		return planoA;
	}

	public void setPlanoA(String planoA) {
		this.planoA = planoA;
	}

	public String getPlanoB() {
		return planoB;
	}

	public void setPlanoB(String planoB) {
		this.planoB = planoB;
	}

	@Override
	public String toString() {
		return "Pacotes [planoA=" + planoA + ", planoB=" + planoB + "]";
	}

}
