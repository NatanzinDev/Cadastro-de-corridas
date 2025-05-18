package controllers;

import java.util.List;

import models.Corrida;
import play.mvc.Controller;

public class Corridas  extends Controller{
	public static void form() {
		render();
	}
	
	public static void principal() {
		List<Corrida> corridas = Corrida.findAll();
		float meutotal = 0;
	
		for(Corrida cc: corridas) {

			meutotal += cc.kmpercorridos;
		}
		
		render(meutotal,corridas);
	}
	
	public static void salvar(Corrida c) {
		if(c != null) {
			c.save();
		}
		principal();
	}
	
	public static void excluir(long id) {
		Corrida c = Corrida.findById(id);
		c.delete();
		principal();
	}
	public static void editar(long id) {
		
		render();
	}
}
