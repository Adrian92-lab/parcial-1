import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // libro1: constructor con parametros
        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", 5, 2);

        // libro2: constructor por defecto + datos por consola
        Libro libro2 = new Libro();
        System.out.println("== Ingreso de datos para libro2 ==");
        System.out.print("Titulo: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Numero de ejemplares: ");
        libro2.setNumEjemplares(Integer.parseInt(sc.nextLine()));
        System.out.print("Numero de ejemplares prestados: ");
        libro2.setNumEjemplaresPrestados(Integer.parseInt(sc.nextLine()));

        // libroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programacion II", "Equipo Docente UNIAC",
                10, 3, "Programacion II - G411", "Facultad de Ingenieria");

        // novela indicando su tipo
        Novela novela = new Novela("Sherlock Holmes: Estudio en Escarlata",
                "Arthur Conan Doyle", 4, 1, Novela.TipoNovela.POLICIACA);

        System.out.println("\n== Objetos creados ==");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUNIAC);
        System.out.println(novela);

        System.out.println("\n== Pruebas de prestamo y devolucion ==");

        System.out.println("Prestamo libro1: " + libro1.prestamo() + " -> " + libro1);
        System.out.println("Devolucion libro1: " + libro1.devolucion() + " -> " + libro1);
        System.out.println("Prestamo libroTextoUNIAC: " + libroTextoUNIAC.prestamo() + " -> " + libroTextoUNIAC);

        // caso limite: sin ejemplares disponibles
        novela.setNumEjemplares(1);
        novela.setNumEjemplaresPrestados(1);
        System.out.println("Prestamo novela (sin disponibilidad): " + novela.prestamo() + " -> " + novela);

        // caso limite: devolver sin prestamos previos
        Libro libroSinPrestamos = new Libro("Ejemplo", "Autor", 3, 0);
        System.out.println("Devolucion sin prestamos previos: " + libroSinPrestamos.devolucion() + " -> " + libroSinPrestamos);

        sc.close();
    }
}
