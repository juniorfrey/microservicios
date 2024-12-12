package com.uncledavecode.products_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioResponse {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean status;
}
