import java.util.Scanner;

public class Profesores {
    private String nombre;
    private String cedula;
    private String codigo;

public Profesores (){

}
public Profesores (String nombre,String cedula,String codigo){
    this.nombre = nombre;
    this.cedula = cedula;
    this.codigo = codigo;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void ingresarDatosProfesor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor:");
        String nombre= sc.next();
        System.out.println("Ingrese la cedula del profesor:");
        String cedula= sc.next();
        System.out.println("Ingrese el codigo del profesor:");
        String codigo= sc.next();
    }
    public void imprimirDatosProfesor(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("CEDULA: "+cedula);
        System.out.println("CODIGO: "+codigo);

    }


}
