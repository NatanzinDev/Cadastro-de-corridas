package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import play.db.jpa.Model;

@Entity
public class Corrida extends Model{
	public double kmpercorridos;
	public String local;
	public String periodo;
	
	@Enumerated(EnumType.STRING)
	public Status status;
	
	public Corrida() {
		this.status = Status.Normal;
	}
	
}
