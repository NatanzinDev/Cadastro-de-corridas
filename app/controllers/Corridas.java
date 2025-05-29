package controllers;

import java.util.List;

import models.Corrida;
import play.mvc.Controller;

public class Corridas extends Controller {
	public static void form() {
		render();
	}

	public static void principal() {
		// recebe o valor que esta no input de pesquisa no html
		String busca = params.get("busca");
		List<Corrida> corridas = null;
		float meutotal = 0;
		

		if (busca == null) {
			corridas = Corrida.findAll();
		} else {
			corridas = Corrida.find("byLocal", busca).fetch();
		}

		for (Corrida cc : corridas) {

			meutotal += cc.kmpercorridos;
		}
		render(meutotal, corridas);
	}

	public static void salvar(Corrida c) {
		if (c != null) {
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
		Corrida c = Corrida.findById(id);
		renderTemplate("Corridas/form.html", c);
	}
}
