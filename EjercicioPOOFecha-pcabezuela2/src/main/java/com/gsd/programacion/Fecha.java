package com.gsd.programacion;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 2026;
	}
	
	public Fecha (int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {return dia;}

	public void setDia(int dia) {this.dia = dia;}
	
	public int getMes() {return mes;}
	
	public void setMes(int mes) {this.mes = mes;}
	
	public int getAño() {return año;}
	
	public void setAño(int año) {this.año = año;}
	
	public void fechaCorrecta() {
	    boolean esValida = true;
	    int maxDias = 31;

	    if (mes < 1 || mes > 12) {
	        System.err.println("Mes inválido");
	        esValida = false;
	    } else {
	        // Determinar días del mes
	        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            maxDias = 30;
	        } else if (mes == 2) {
	            maxDias = esBisiesto() ? 29 : 28;
	        }

	        if (dia < 1 || dia > maxDias) {
	            System.err.println("Día inválido para el mes " + mes + ". Máximo: " + maxDias);
	            esValida = false;
	        }
	    }

	    if (esValida) System.out.println("¡La fecha es correcta!");
	}

	private boolean esBisiesto() {
		return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
	}
	
	public void diaSiguiente() {
	    int maxDias = 31;
	    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) maxDias = 30;
	    else if (mes == 2) maxDias = esBisiesto() ? 29 : 28;
	    dia++;
	    if (dia > maxDias) {
	        dia = 1;
	        mes++;
	        if (mes > 12) {
	            mes = 1;
	            año++;
	        }
	    }
	}

	public String toString() {
	    String d = (dia < 10) ? "0" + dia : "" + dia;
	    String m = (mes < 10) ? "0" + mes : "" + mes;
	    
	    return d + "-" + m + "-" + año;
	}

}
