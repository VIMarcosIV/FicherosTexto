import java.io.*;

public class FicherosTexto {
    public static void testEscribirFicherosTexto() {
        File fichero = null;
        PrintWriter f = null;

        fichero = new File("prueba.txt");
        System.out.println("Escribiendo en el fichero " + fichero.getAbsolutePath());

        try {
            f = new PrintWriter(new FileWriter(fichero, true));
            for (int i = 0; i < 10; i++) {
                f.println("Línea: " + i);
            }
            f.println(fichero.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f != null) {
                f.close();
            }
        }
    }

    public static void testLeerFicherosTexto() {
        File fichero = null;
        BufferedReader f = null;

        fichero = new File("prueba.txt");
        System.out.println("Leyendo en el fichero " + fichero.getAbsolutePath());
        try {
            f = new BufferedReader(new FileReader(fichero));
//            String linea = f.readLine();
//            while(linea!=null){
//                System.out.println(linea);
//                linea = f.readLine();
//            }
            String linea;
            while ((linea = f.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(f!= null){
                try {
                    f.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        }
    }
