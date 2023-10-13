public class Main {
    public static void main(String[] args) {
        System.out.println("INGRESE DATOS DEL ESTUDINATE");
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.ingresarDatos();
        estudiante1.imprimirDatos();

        System.out.println("------------------------------------------");
        System.out.println("INGRESE LAS TRES MATERIAS A ESCOGER:");
        estudiante1.ingresarMaterias();
        System.out.println("COLOQUE LOS DATOS DE LAS MATERIAS");
         Materias materia1 = new Materias();
         materia1.ingresarDatosMateria();
         Materias materia2 = new Materias();
         materia2.ingresarDatosMateria();
         Materias materia3 = new Materias ();
         materia3.ingresarDatosMateria();
        System.out.println("------------------------------------------");
        System.out.println("INGRESE LOS NOMBRES DE DEL LOS PROFESORES DE CADA MATERIA:");
        materia1.ingresarProfesores();

        materia1.imprimirDatosMateria();
        materia2.imprimirDatosMateria();
        materia3.imprimirDatosMateria();

        materia1.imprimirProfesores();



    }



}