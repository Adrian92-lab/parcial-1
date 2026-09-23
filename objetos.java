import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 1. Creación de libro1 ---");
        // Crear objeto libro1 utilizando el constructor con parámetros[cite: 4].
        Libro libro1 = new Libro("Estructuras de Datos en Java", "Mark Allen Weiss", 5, 2);
        System.out.println(libro1.toString());

        System.out.println("\n--- 2. Creación de libro2 ---");
        // Crear objeto libro2 utilizando el constructor por defecto[cite: 4].
        Libro libro2 = new Libro();
        
        // Obtener datos para libro2 por consola[cite: 4].
        System.out.println("Ingrese los datos para el libro 2:");
        System.out.print("Título: ");
        libro2.setTitulo(scanner.nextLine());
        
        System.out.print("Autor: ");
        libro2.setAutor(scanner.nextLine());
        
        System.out.print("Número de ejemplares totales: ");
        libro2.setNumeroEjemplares(scanner.nextInt());
        
        System.out.print("Número de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer de entrada de la consola
        
        System.out.println(libro2.toString());

        System.out.println("\n--- 3. Creación de libroTextoUNIAC ---");
        // Crear un objeto libroTextoUNIAC con todos sus atributos[cite: 4].
        // (Asumiendo los parámetros: Título, Autor, Ejemplares, Prestados, Curso, Facultad)
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
            "Ingeniería de Software", 
            "Ian Sommerville", 
            10, 
            3, 
            "Tecnología en Sistemas", 
            "Facultad de Ingeniería"
        );
        System.out.println(libroTextoUNIAC.toString());

        System.out.println("\n--- 4. Creación de novela ---");
        // Crear un objeto novela indicando su tipo[cite: 4].
        // (Asumiendo los parámetros: Título, Autor, Ejemplares, Prestados, Tipo)
        Novela novela = new Novela(
            "Cien años de soledad", 
            "Gabriel García Márquez", 
            7, 
            7, 
            "Realista"
        );
        System.out.println(novela.toString());

        System.out.println("\n--- 5. Pruebas de préstamo y devolución ---");
        // Probar los métodos de préstamo y devolución desde la clase main[cite: 4].
        
        System.out.println("Estado inicial novela: " + novela.toString());
        // Se intenta prestar un libro que ya tiene todos sus ejemplares prestados (7 de 7)
        System.out.println("Intentando PRESTAR novela (ejemplares agotados): " + novela.prestamo());
        System.out.println("Intentando DEVOLVER novela: " + novela.devolucion());
        System.out.println("Estado final novela: " + novela.toString());

        System.out.println("\nEstado inicial libro1: " + libro1.toString());
        System.out.println("Intentando PRESTAR libro1: " + libro1.prestamo());
        System.out.println("Intentando DEVOLVER libro1: " + libro1.devolucion());
        System.out.println("Estado final libro1: " + libro1.toString());

        scanner.close();
    }
}