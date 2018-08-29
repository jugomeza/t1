/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado {
   private String nombre;
   private String apellido;
   private char genero;
   private  String foto;
   private Fecha fNacimiento;
   private Fecha fIngreso;   

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }

}
