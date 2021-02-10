package br.com.i.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.i.hello.model.Produto;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World! Meu primeiro projeto!";
	}

	@GetMapping("/produto")
	public Produto exibirproduto1() {
		Produto prod = new Produto();
		prod.setId(10012);
		prod.setDescricao("Mesa com luz");
		prod.setPreco(998.10);
		prod.setQtdeEstoque(1);
		return prod;
	}
	@PostMapping("/novoproduto")
	public String cadastrarProduto (@RequestBody Produto novo) {
		System.out.println("Recebi "+novo.getId()+"/"+novo.getDescricao()+"/"+novo.getPreco()+"/"+novo.getDescricao()+"/"+novo.getQtdeEstoque());
		return "Produto Cadastrado";
	}

}
