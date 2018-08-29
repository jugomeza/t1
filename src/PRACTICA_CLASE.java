/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
public class PRACTICA_CLASE {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fNacimiento = new Fecha(10,10,1980);
        Fecha fIngreso = new Fecha(29,8,2018);
        Empleado  empleado = new Empleado("v","g", fNacimiento);
        empleado.setfIngreso(fIngreso);
        System.out.println(empleado.getNombre());
        
        // TODO code application logic here
    
    }
    
}
