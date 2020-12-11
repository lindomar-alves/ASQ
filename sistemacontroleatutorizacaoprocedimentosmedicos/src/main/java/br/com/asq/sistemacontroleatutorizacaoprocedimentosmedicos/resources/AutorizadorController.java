package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.resources;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autorizador")
public class AutorizadorController {

    @Autowired
    private IdadeProcedimentoService idadeProcedimentoService;

    @RequestMapping(value = "/cadastro/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}/autoriza/{autoriza}", method=RequestMethod.POST)
    public ResponseEntity cadastrarProcedimento(@PathVariable Integer numeroProcediemtno, @PathVariable Integer idade,
                                               @PathVariable String sexo, @PathVariable String autoriza) {
        idadeProcedimentoService.verificarIdadeProcedimentoExiste(numeroProcediemtno, idade, sexo, autoriza);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}", method=RequestMethod.GET)
    public String buscarIdadeProcedimento(@PathVariable Integer numeroProcediemtno, @PathVariable Integer idade,
                                                     @PathVariable String sexo) {

        return idadeProcedimentoService.buscarIdadeProcedimento(numeroProcediemtno, idade, sexo).getExecutaProcediemto().getDescricao();
    }

}
