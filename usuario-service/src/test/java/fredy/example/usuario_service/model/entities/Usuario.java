package com.uncledavecode.products_service.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String nombre;
    private String apellido;
    private String email;
    private Boolean status;

}
