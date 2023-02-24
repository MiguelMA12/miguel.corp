/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infromacion;

/**
 *
 * @author ayeri
 */
public class personal {
    String nombre = "Miguel",
           apellido_paterno = "Martinez",
           apellido_materno = "Mauro";
    int centa = 1912840;
    String semestre_en_curso = "2° Semestre";
    String Primera_materia = "Programacion";
    String Primer_horario = "Martes y Jueves de 10am - 12:30pm";
    String Segunda_materia = "Teoria de algoritmos";
    String Segundo_horario = "Lunes y Miercoles de 11:30am - 13:00pm";
    String Tercera_materia = "Teoria de sistemas";
    String Tercer_horario = "Lunes y Miercoles de 9:00am - 10:30am";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " + centa);
        System.out.println("El semestre que cursa es: " + semestre_en_curso);
        System.out.println("Materias que cursa:");
        System.out.println(Primera_materia+" "+Primer_horario);
        System.out.println(Segunda_materia+" "+Segundo_horario);
        System.out.println(Tercera_materia+" "+Tercer_horario);
    }      
public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
}
    
}
