public class Novela extends Libro {

    public enum TipoNovela {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = null;
    }

    public Novela(String titulo, String autor, int numEjemplares,
                  int numEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.tipo = tipo;
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" +
                super.toString() +
                ", tipo=" + tipo +
                '}';
    }
}
