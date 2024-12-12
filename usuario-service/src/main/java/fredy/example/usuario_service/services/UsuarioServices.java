
import fredy.example.usuario_service.model.datos.UsuarioRequest;
import fredy.example.usuario_service.model.datos.UsuarioResponse;
import fredy.example.usuario_service.model.entities.Usuario;
import fredy.example.usuario_service.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Services
@RequiredArgsConstructor
public class UsuarioServices {

    private final UsuarioRepository usuarioRepository;

    public void addUsuario(UsuarioRequest usuarioRequest) {
        var usuario = Usuario.builder()
                .nombre(usuarioRequest.getNombre())
                .apellido(usuarioRequest.getApellido())
                .email(usuarioRequest.getEmail())
                .status(usuarioRequest.getStatus())
                .build();

        usuarioRepository.save(usuario);

        log.info("Usuario added: {}", usuario);
    }

    public List<UsuarioResponse> getMethodUserALl() {
        var usuarios = usuarioRepository.findAll();

        return usuarios.stream().map(this::mapToUsuarioResponse).toList();
    }

    private UsuarioResponse mapToUsuarioResponse(Usuario usuario) {
        return UsuarioResponse.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .email(usuario.getEmail())
                .status(usuario.getStatus())
                .build();
    }

}
