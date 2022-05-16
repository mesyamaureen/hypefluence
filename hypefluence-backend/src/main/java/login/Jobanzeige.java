package login;


import java.sql.Date;

public class Jobanzeige {

	private int jobanzeige_id;
	private String jobanzeige_titel;
	private String jobanzeige_beschreibung;
	private float jobanzeige_preis;
	private String jobanzeige_art_des_preises;
	private String jobanzeige_zielgruppe;
	private String jobanzeige_status;
	private Date jobanzeige_erstelldatum;

	
	public Jobanzeige() {
		
	}
	
	public Jobanzeige(int jobanzeige_id, String jobanzeige_titel, String jobanzeige_beschreibung,
			float jobanzeige_preis, String jobanzeige_art_des_preises, String jobanzeige_zielgruppe,
			String jobanzeige_status, Date jobanzeige_erstelldatum) {
		super();
		this.jobanzeige_id = jobanzeige_id;
		this.jobanzeige_titel = jobanzeige_titel;
		this.jobanzeige_beschreibung = jobanzeige_beschreibung;
		this.jobanzeige_preis = jobanzeige_preis;
		this.jobanzeige_art_des_preises = jobanzeige_art_des_preises;
		this.jobanzeige_zielgruppe = jobanzeige_zielgruppe;
		this.jobanzeige_status = jobanzeige_status;
		this.jobanzeige_erstelldatum = jobanzeige_erstelldatum;
	}

	public int getJobanzeige_id() {
		return jobanzeige_id;
	}

	public void setJobanzeige_id(int jobanzeige_id) {
		this.jobanzeige_id = jobanzeige_id;
	}

	public String getJobanzeige_titel() {
		return jobanzeige_titel;
	}

	public void setJobanzeige_titel(String jobanzeige_titel) {
		this.jobanzeige_titel = jobanzeige_titel;
	}

	public String getJobanzeige_beschreibung() {
		return jobanzeige_beschreibung;
	}

	public void setJobanzeige_beschreibung(String jobanzeige_beschreibung) {
		this.jobanzeige_beschreibung = jobanzeige_beschreibung;
	}

	public float getJobanzeige_preis() {
		return jobanzeige_preis;
	}

	public void setJobanzeige_preis(float jobanzeige_preis) {
		this.jobanzeige_preis = jobanzeige_preis;
	}

	public String getJobanzeige_art_des_preises() {
		return jobanzeige_art_des_preises;
	}

	public void setJobanzeige_art_des_preises(String jobanzeige_art_des_preises) {
		this.jobanzeige_art_des_preises = jobanzeige_art_des_preises;
	}

	public String getJobanzeige_zielgruppe() {
		return jobanzeige_zielgruppe;
	}

	public void setJobanzeige_zielgruppe(String jobanzeige_zielgruppe) {
		this.jobanzeige_zielgruppe = jobanzeige_zielgruppe;
	}

	public String getJobanzeige_status() {
		return jobanzeige_status;
	}

	public void setJobanzeige_status(String jobanzeige_status) {
		this.jobanzeige_status = jobanzeige_status;
	}

	public Date getJobanzeige_erstelldatum() {
		return jobanzeige_erstelldatum;
	}

	public void setJobanzeige_erstelldatum(Date jobanzeige_erstelldatum) {
		this.jobanzeige_erstelldatum = jobanzeige_erstelldatum;
	}
	
	

}

