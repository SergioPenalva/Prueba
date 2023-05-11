import java.io.*;
import java.util.Scanner;

public class Problema {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        Scanner scan1= new Scanner(System.in);


        try {
            br = new BufferedReader(new FileReader("mensaje.txt"));
            bw = new BufferedWriter(new FileWriter("mensaje_cifrado.txt"));
            String linea = null;

            /* Lectura y validación  de clave */

                System.out.println("Escribe la clave que quieres utilizar");
                String clave= scan1.nextLine();
                if(clave.matches("[A-Za-z]*")){
                    /* Aquí vendría la lógica del programa */
                    while ((linea = br.readLine()) != null) {
                        StringBuilder sb = new StringBuilder(linea.length());
                        char[] mensaje= new char[sb.length()];
                        for(int i=0; i<mensaje.length; i++){
                            mensaje[i]=sb.charAt(i);
                        }
                        for(int i=0; i<mensaje.length; i++){
                            switch (mensaje[i]){
                                case 'A': {

                                }
                            }
                        }


                        bw.write(sb.toString()); /* Escribe la cadena de caracteres en el fichero*/
                        bw.newLine(); /* escribe nueva línea en el fichero */

                    }
                    System.out.println("El mensaje ha sido cifrado correctamente");
                }else{
                    System.out.println("La clave solo puede contener letras");
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}
