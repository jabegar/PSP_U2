package models;

public class ContadorVocalesTotales {
	private int numVocalesTotales;
	
	public ContadorVocalesTotales() {
		this.numVocalesTotales = 0;
	}
	
	public synchronized void incrementarVocales() {
		this.numVocalesTotales++;
	}
	
	public int getNumVocalesTotales() {
		return this.numVocalesTotales;
	}
}
