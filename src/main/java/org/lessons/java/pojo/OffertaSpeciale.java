package org.lessons.java.pojo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OffertaSpeciale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private LocalDate data_inizio;
	private LocalDate data_fine;
	private String titolo;
	private int sconto;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pizza pizza;
	
	public OffertaSpeciale() {}
	public OffertaSpeciale(LocalDate data_inizio, LocalDate data_fine, String titolo, int sconto, Pizza pizza) {
		setDataFine(data_fine);
		setDataInizio(data_inizio);
		setTitolo(titolo);
		setSconto(sconto);
		setPizza(pizza);
	}
 	
	//get e set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataInizio() {
		return data_inizio;
	}
	public void setDataInizio(LocalDate data_inizio) {
		this.data_inizio = data_inizio;
	}
	public LocalDate getDataFine() {
		return data_fine;
	}
	public void setDataFine(LocalDate data_fine) {
		this.data_fine = data_fine;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getSconto() {
		return sconto;
	}
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
			
		return "[" + getId() + "] " + getTitolo() + " - " + getSconto() + "%" + getDataInizio() + getDataFine();
	}
}
