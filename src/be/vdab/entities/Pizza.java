package be.vdab.entities;

import java.math.BigDecimal;

public class Pizza {
	private long id;
	private String naam;
	private BigDecimal prijs;
	private boolean pikant;
	// je maakt getters voor alle private variabelen
	public Pizza(String naam, BigDecimal prijs, boolean pikant) {
		setNaam(naam);
		setPrijs(prijs);
		setPikant(pikant);
	}
	public Pizza(long id, String naam, BigDecimal prijs, boolean pikant) {
		this(naam, prijs, pikant);
		setId(id);
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNaam(String naam) {
		if (!isNaamValid(naam)) {
			 throw new IllegalArgumentException();
		}
		this.naam = naam;
	}
	public void setPrijs(BigDecimal prijs) {
		if ( !isPrijsValid(prijs)) {
			 throw new IllegalArgumentException();
		}
		this.prijs = prijs;
	}
	public void setPikant(boolean pikant) {
		this.pikant = pikant;
	}
	public static boolean isNaamValid(String naam) { // Deze static function
		 // valideert de naam zonder een Pizza instance te moeten maken (zie verder)
		 return naam != null && ! naam.trim().isEmpty();
	}
	public static boolean isPrijsValid(BigDecimal prijs) {
		 return prijs != null && prijs.compareTo(BigDecimal.ZERO) >= 0;
	}
	public long getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getPrijs() {
		return prijs;
	}
	public boolean isPikant() {
		return pikant;
	}
	
}
