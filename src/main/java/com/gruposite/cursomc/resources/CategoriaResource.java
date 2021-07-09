package com.gruposite.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gruposite.cursomc.domain.Categoria;

@RestController // INDICA QUE CLASSE VAI SER UM CONTROLADOR REST.
@RequestMapping(value = "/categorias") // ESTA CLASSE RESPONDE POR ESSE VALOR REQUISITADO.
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET) // REQUISIÇÃO HTTP GET PARA OBTER UM DADO DO METODO.

	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "informatica");
		Categoria cat2 = new Categoria(2, "escritorio");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}

}
