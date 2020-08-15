package br.com.gf.oracle.projeto1.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.gf.oracle.projeto1.model.Item;

public class ItemRepositorio {

	private static List<Item> listaItem;
	
	static {
		listaItem = new ArrayList<Item>();
		listaItem.add(new Item(1, "Maca", 5));
		listaItem.add(new Item(2, "Laranja", 1));
		listaItem.add(new Item(3, "Uva", 4.5));
	}
	
	public List<Item> encontrarTodos(){
		return listaItem;
	}
	
	
}

