
import fredy.example.usuario_service.model.datos.UsuarioRequest;
import fredy.example.usuario_service.model.model.datos.UsuarioResponse;
import fredy.example.usuario_service.services.UsuarioService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUsuario(@RequestBody UsuarioRequest usuarioRequest){
        this.UsuarioServices.addUsuario(usuarioRequest);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<UsusarioResponse> getMethodUserALl(){
        return this.UsuarioServices.getMethodUserALl();
    }

}
