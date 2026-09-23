public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

   
    public Libro() {
    }

    
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    
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

    
    public boolean prestamo() {
        
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++; 
            return true;
        }
        return false; 
    }

    
    public boolean devolucion() {
        
        if (numeroEjemplaresPrestados > 0) {
            
            numeroEjemplaresPrestados--; 
            return true; 
        }
        return false; 
    }

    
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
