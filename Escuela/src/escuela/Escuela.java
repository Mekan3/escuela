package escuela;

public class Escuela {

    public static void main(String[] args) {
        
        Estudiante student = new Estudiante("1", "Julian", "12", "Basico");
        
        System.out.println("ID Alumno: "+student.getId());
        System.out.println("\nNombre: "+student.getNombre());
        System.out.println("\nCurso: "+student.getCurso());
        System.out.println("\nEspecialidad: "+student.getEspecialidad());
        
    }
    
}
