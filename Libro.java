public class Libro {
    // 1. Definición de atributos (Encapsulamiento)
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    // 2. Constructor por defecto (vacío)
    public Libro() {
    }

    // 2. Constructor con parámetros
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // 3. Métodos get y set para cada atributo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // 4. Método préstamo
    public boolean prestamo() {
        // No se podrán prestar libros de los que no queden ejemplares disponibles
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++; // Incrementa el atributo correspondiente
            return true; // Devuelve true si se ha podido realizar
        }
        return false; // Devuelve false en caso contrario
    }

    // 5. Método devolución
    public boolean devolucion() {
        // No se podrán devolver libros que no se hayan prestado
        if (numeroEjemplaresPrestados > 0) {
            /* 
             * Nota: El texto del ejercicio indica "incrementa el atributo correspondiente" 
             * pero lógicamente, al devolver un libro, la cantidad de ejemplares prestados 
             * debe disminuir. Se implementa la resta para mantener la coherencia del sistema.
             */
            numeroEjemplaresPrestados--; 
            return true; // Devuelve true si se ha podido realizar
        }
        return false; // Devuelve false en caso contrario
    }

    // 6. Método toString para mostrar los datos de los libros
    @Override
    public String toString() {
        return "Libro [" +
               "Título='" + titulo + '\'' +
               ", Autor='" + autor + '\'' +
               ", Ejemplares Totales=" + numeroEjemplares +
               ", Ejemplares Prestados=" + numeroEjemplaresPrestados +
               ']';
    }
}