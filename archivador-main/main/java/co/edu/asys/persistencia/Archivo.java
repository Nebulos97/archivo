package co.edu.asys.persistencia;
import java.io.*;
import co.edu.asys.entidades.Persona;

public class Archivo implements co.edu.asys.persistencia.Almacenamiento {

        @Override
        public String guardar(Persona p) {
            try {
                FileWriter archivo = new FileWriter("personas.txt", true);
                PrintWriter escritor = new PrintWriter(archivo);

                escritor.println(p.formatearNombre());

                escritor.close();
                archivo.close();
                return p.nombre()+" Guardado exitosamente";

            } catch (IOException e) {
                return "La persona "+p.nombre()+" no pudo ser guardada";
            }
        }

        @Override
        public String eliminar(Persona p) {

            try {

                File archivo = new File("personas.txt");
                File temp = new File("temp.txt");

                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                PrintWriter escritor = new PrintWriter(new FileWriter(temp));

                String linea;
                boolean eliminado = false;

                while ((linea = lector.readLine()) != null) {

                    if (linea.contains(p.numeroDocumento())) {
                        eliminado = true;
                        continue; // salta esa línea
                    }

                    escritor.println(linea);
                }

                lector.close();
                escritor.close();

                archivo.delete();
                temp.renameTo(archivo);

                if (eliminado) {
                    return "Persona eliminada correctamente";
                } else {
                    return "No se encontró la persona";
                }

            } catch (IOException e) {
                return "Error al eliminar la persona";
            }
        }

        @Override
        public String buscar(Persona p) {

            try {
                BufferedReader lector = new BufferedReader(new FileReader("personas.txt"));
                String linea;

                while ((linea = lector.readLine()) != null) {

                    if (linea.contains(p.nombre()) || linea.contains(String.valueOf(p.numeroDocumento()))) {
                        lector.close();
                        return "No se encuntro la persona";
                    }
                }

                lector.close();
                return "Persona no encontrada";

            } catch (IOException e) {
                return "Error al buscar en el archivo";
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

