import java.util.Scanner;

public class Estudiantes {
    private String nombre = "";
    private String cedula = "" ;
    private int numMatricula = 0;
    private String materia1 ;
    private String materia2 ;
    private String materia3 ;

    public Estudiantes (){

    }
    public Estudiantes (String nombre,String cedula,int numMatricula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.numMatricula = numMatricula;

    }
    public Estudiantes (String nombre,String cedula,int numMatricula,String materia1,String materia2,String materia3){
        this.nombre = nombre;
        this.cedula = cedula;
        this.numMatricula = numMatricula;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;

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

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }
    public void  ingresarDatos (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = sc.next();
        System.out.println("Ingrese la cedula del estudiante: ");
        cedula = sc.next();
        System.out.println("Ingrese el numero de matricula: ");
        numMatricula = sc.nextInt();

    }

    public void imprimirDatos(){
        System.out.println("El nombre del estudiante es:"+nombre);
        System.out.println("Su cedula  es:"+cedula);
        System.out.println("Su munero de matricula es:"+numMatricula);
    }

    public void ingresarMaterias(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia 1: ");
        String materia1 = sc.next();
        System.out.println("Ingrese el nombre de l a materia 2: ");
        String materia2 = sc.next();
        System.out.println("Ingrese el nombre de la materia 3: ");
        String materia3 = sc.next();
    }


}
