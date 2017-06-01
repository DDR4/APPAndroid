package Modelo;

public class Usuario {
  private int cod;
  private String nom;
  private String ape;
  private int dni;
  private int clave;

public Usuario(int cod, String nom, String ape, int dni, int clave) {
	super();
	this.cod = cod;
	this.nom = nom;
	this.ape = ape;
	this.dni = dni;
	this.clave = clave;
}
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getApe() {
	return ape;
}
public void setApe(String ape) {
	this.ape = ape;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public int getClave() {
	return clave;
}
public void setClave(int clave) {
	this.clave = clave;
}
 
  
}
