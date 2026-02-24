import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos la contraseña correcta
        String contrasena = "contraseña";
        //Creamos la variable intentoContrasena para utilizarla en los intentos
        String intentoContrasena;
        //Creamos los intentos
        int intentos = 3;
        //Comprobamos la contrasenaAcertada siendo false de primera para luego cambiarlo si
        boolean contrasenaAcertada = false;
        //Comprobamos que mientras la contrasenaAcertada sea false e intentos no sea 0 que continue el bucle
        while (!contrasenaAcertada && intentos != 0) {
            if (intentos > 0) {
                System.out.println("Introduce la contraseña");
                intentoContrasena = sc.nextLine();
                if (intentoContrasena.equals(contrasena)) {
                    //Si acierta convierte la contrasenaAcertada a true
                    contrasenaAcertada = true;
                } else {
                    //Restamos intentos cada vez que falla
                    intentos--;
                    System.out.println("Te has equivocado de la contraseña, te quedan " + intentos);

                }

            }

        }
        if (contrasenaAcertada) {
            System.out.println("Has acertado la contraseña!");
        } else {
            System.out.println("Te has quedado sin intentos!");
        }

    sc.close();
    }
}