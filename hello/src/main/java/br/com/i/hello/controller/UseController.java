package br.com.i.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.i.hello.model.Usuario;

@RestController
public class UseController {

	@PostMapping("/login")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		//se user existe
		if (dadosLogin.getRacf().equals("isidro")){
			//user existe teste senha
			if (dadosLogin.getSenha().equals("1234")) {
				//ret 200 e objeto
				Usuario resposta = new Usuario();
				resposta.setId(36854);
				resposta.setNome("Professor Isidro");
				resposta.setEmail("isidro@isidro.com");
				resposta.setRacf("isidro");
				resposta.setFuncional("96854712354");
				return ResponseEntity.ok(resposta);
			}
			//senha errada, retorno 401 (unauthorized)
			return ResponseEntity.status(401).build();
		}
		//user n existe, http 404
		return ResponseEntity.status(404).build();

	}

}
