package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        /* 
        
       Explicación:
        
        Lo que hice fue definir el ejecutor como un objeto para poder llamar
        a los metodos y almacenarlos en un objeto, tengo una varibale opcion
        para definir lo que el usuario elije, defino el arrayList y con el
        switch, los case definen el tipo de estudiante e implemento el case 3 
        donde se utiliza el for que no se podia editar que lo que hace es 
        calcular las matriculas y mostrar todo
        
        */

        EjecutaEstudiante obj = new EjecutaEstudiante();

        int opcion;

        int menuControl = 0;
        
        ArrayList<Estudiante> estudiantes = new ArrayList(); 

        do {

            opcion = obj.menu();

            switch (opcion) {

                case 1:

                    do {

                        sc.nextLine();

                        System.out.println("Ingrese los nombres del estudiante:");
                        String nombresEst = sc.nextLine();
                        
                        System.out.println("Ingrese los apellidos del estudiante:");
                        String apellidosEst = sc.nextLine();
                        
                        System.out.println("Ingrese la identificación del estudiante:");
                        String identificacionEst = sc.nextLine();
                        
                        System.out.println("Ingrese la edad del estudiante:");
                        int edadEst = sc.nextInt();

                        System.out.println("Ingrese el numero de creditos:");
                        int creditosEst = sc.nextInt();

                        System.out.println("Ingrese el costo de credito:");
                        double costoCredEst = sc.nextInt();
                        
                        EstudiantePresencial estudianteP = 
                                new EstudiantePresencial(creditosEst, 
                        costoCredEst, nombresEst, 
                        apellidosEst, identificacionEst, edadEst);    
                        
                        estudiantes.add(estudianteP);
                        
                        sc.nextLine();

                        System.out.println("Desea ingresar otro Estudiante de "
                                + "tipo Presencial (SI) (NO):");
                        String moderador = sc.nextLine();

                        if (moderador.equals("NO")) {
                            menuControl = 0;

                        } else {
                            menuControl = 1;
                        }

                    } while (menuControl == 1);

                    break;

                case 2:

                    do {

                        sc.nextLine();

                        System.out.println("Ingrese los nombres del estudiante:");
                        String nombresEst = sc.nextLine();
                        
                        System.out.println("Ingrese los apellidos del estudiante:");
                        String apellidosEst = sc.nextLine();
                        
                        System.out.println("Ingrese la identificación del estudiante:");
                        String identificacionEst = sc.nextLine();
                        
                        System.out.println("Ingrese la edad del estudiante:");
                        int edadEst = sc.nextInt();

                        System.out.println("Ingrese el numero de creditos:");
                        int asignaturaEst = sc.nextInt();

                        System.out.println("Ingrese el costo de credito:");
                        int costoAsigEst = sc.nextInt();
                        
                        EstudianteDistancia estudianteD = 
                                new EstudianteDistancia(asignaturaEst, 
                        costoAsigEst, nombresEst, 
                        apellidosEst, identificacionEst, edadEst);
                        
                        estudiantes.add(estudianteD);
                        
                        sc.nextLine();

                        System.out.println("Desea ingresar otro Estudiante de"
                                + "tipo Distancia: (SI) (NO):");
                        String moderador = sc.nextLine();

                        if (moderador.equals("NO")) {
                            menuControl = 0;

                        } else {
                            menuControl = 2;
                        }

                    } while (menuControl == 2);

                    break;

                case 3:

                    for (int i = 0; i < estudiantes.size(); i++) {

                        estudiantes.get(i).calcularMatricula();

                        System.out.printf("Datos Estudiante\n"
                                + "%s\n",
                                estudiantes.get(i));

                    }

                    menuControl = 12;

                    break;

                default:
                    break;

            }

        } while (menuControl == 0);

    }

    public static int menu() {

        int opc;

        System.out.println("Ingresar Estudiante Presencial:  [1]");
        System.out.println("Ingresar Estudiante Distancia:   [2]");
        System.out.println("Terminar y mostar todo:          [3]");

        opc = sc.nextInt();

        return opc;
    }

}
