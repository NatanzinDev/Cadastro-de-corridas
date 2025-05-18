package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Corrida extends Model{
	public double kmPercorridos;
	public String local;
	public String periodo;
	
}
