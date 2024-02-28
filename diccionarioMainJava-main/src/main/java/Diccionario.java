import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("camiseta ", "t-shirt");
        diccionario.put("conejo", "rabbit");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("celular", "smart-phone");
        diccionario.put("correo electronico", "email");
        diccionario.put("carro", "car");
        diccionario.put("avión", "plane");
        diccionario.put("mesa", "table");
        diccionario.put("camara", "camera");
        diccionario.put("teléfono", "phone");
        diccionario.put("ventana", "window");
        diccionario.put("reloj", "clock");
        diccionario.put("fresa", "strawberry");
        diccionario.put("plátano", "banana");
        diccionario.put("naranja", "orange");
        diccionario.put("limón", "lemon");
        diccionario.put("agua", "water");
        diccionario.put("leche", "milk");
        diccionario.put("chocolate", "chocolate");

        // Seleccionar 5 palabras al azar
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspanol[random.nextInt(palabrasEspanol.length)];
        }

        // Pedir palabra
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce \"" + palabra + "\": ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals(diccionario.get(palabra))) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
