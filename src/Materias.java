import java.util.Scanner;

public class Materias {
    private String nombre;
    private String codigo;
    private int numHoras;
    private String profesor1;
    private String profesor2;

    private String profesor3;

    public Materias (){

    }
    public  Materias (String nombre,String codigo,int numHoras){
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
    }
    public  Materias (String nombre,String codigo,int numHoras, String profesor1,String profesor2, String profesor3){
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(String profesor1) {
        this.profesor1 = profesor1;
    }

    public String getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(String profesor2) {
        this.profesor2 = profesor2;
    }

    public String getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(String profesor3) {
        this.profesor3 = profesor3;
    }

    public void ingresarDatosMateria(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia 1: ");
        nombre = sc.next();
        System.out.println("Ingrese el codigo de la materia 2: ");
        codigo = sc.next();
        System.out.println("Ingrese la catidad de horas a tomar de la materia 3: ");
        numHoras = sc.nextInt();

    }

    public void ingresarProfesores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor  de la materia 1: ");
        profesor1 = sc.next();
        System.out.println("Ingrese el nombre del profesor  de la materia 2 : ");
        profesor2= sc.next();
        System.out.println("Ingrese el nombre del profesor de la materia 3: ");
        profesor3= sc.next();
    }

    public  void imprimirProfesores(){
        System.out.println("El nombre del profesor: "+ profesor1);
        System.out.println("El nombre del profesor: "+ profesor2);
        System.out.println("El nombre del profesor: "+ profesor3);
    }

    public  void imprimirDatosMateria(){
        System.out.println("MATERIA: "+ nombre);
        System.out.println("CODIGO: "+ codigo);
        System.out.println("HORAS: "+ numHoras);
    }


}
