package it.unical.asde2018.model;

import java.util.Date;

public class Prenotazione {
	private String aula;
	private Date inizio,fine;
	private User prenotatore;


	public Prenotazione(String aula, Date inizio, Date fine, User prenotatore) {
		super();
		this.aula = aula;
		this.inizio = inizio;
		this.fine = fine;
		this.prenotatore = prenotatore;
	}
	public String getAula() {
		return aula;
	}
	public Date getFine() {
		return fine;
	}
	public Date getInizio() {
		return inizio;
	}
	public User getPrenotatore() {
		return prenotatore;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public void setFine(Date fine) {
		this.fine = fine;
	}
	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}
	public void setPrenotatore(User prenotatore) {
		this.prenotatore = prenotatore;
	}

}
