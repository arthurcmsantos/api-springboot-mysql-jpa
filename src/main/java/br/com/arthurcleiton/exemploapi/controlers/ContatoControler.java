package br.com.arthurcleiton.exemploapi.controlers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arthurcleiton.exemploapi.modelos.Contato;
import br.com.arthurcleiton.exemploapi.repository.ContatoRepository;

@RestController
@RequestMapping(value = "/contatos")
public class ContatoControler {
    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping
    public Contato salvar(@RequestBody Contato contato) {
        contato.setDataDeCadastro(LocalDate.now());
        return contatoRepository.save(contato);
    }

    @GetMapping
    public List<Contato> listar() {
        return contatoRepository.findAll();
    }

    @PutMapping
    public Contato atualizar(@RequestBody Contato contato) {
        contato.setDataDeCadastro(LocalDate.now());
        return contatoRepository.save(contato);
    }

    @DeleteMapping
    public void deletar(@RequestBody Contato contato) {
        contatoRepository.delete(contato);
    }

}
