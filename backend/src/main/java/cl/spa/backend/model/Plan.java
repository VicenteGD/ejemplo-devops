/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.spa.backend.model;

import jakarta.persistence.*;

/**
 *
 * @author Duoc
 */

@Entity
@Table(name = "plan")
public class Plan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String description;
    private Double precio;

    public Plan() {
    }

    public Plan(String nombre, String description, Double precio) {
        this.nombre = nombre;
        this.description = description;
        this.precio = precio;
    }
    
}
