



@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUsuario(@RequestBody UsuarioRequest usuarioRequest){
        this.usuarioRequest.addUsuario(usuarioRequest);
    }

}
