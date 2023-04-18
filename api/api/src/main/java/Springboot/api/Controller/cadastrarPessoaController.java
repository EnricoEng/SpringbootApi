package Springboot.api.Controller;

import java.util.Date;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Springboot.api.Pessoa.Pessoa;

@RestController
@RequestMapping("cadastrarPessoa")
public class cadastrarPessoaController {
    
    @PostMapping
    public void cadastrarPessoa(@RequestBody Pessoa dados) {
        System.out.println(dados);
        System.out.println(dados.getNome());
        System.out.println(dados.getDataNascimento());
        System.out.println(dados.getClass());
    }

}
