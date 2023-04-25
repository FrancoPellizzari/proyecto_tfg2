package com.edix.eventos2;

import com.edix.eventos2.entities.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

  @Autowired
  private UserRepository reservaRepository;

  @GetMapping("/reserva")
  public String getReservas(){
    List<Usuario> lista = reservaRepository.findAll();

    return null;
  }


}
