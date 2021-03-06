package com.sofkau.demoMongoDb.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpleadoDTO {
    private String id;
    private String nombre;
    private String rol;
}
