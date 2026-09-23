Parcial-1---Sistema de Gestion de Biblioteca (Programacion 2 -G411)

POO: Abstraccion, Encapasulamiento y herencia, con estructura Maven.

###Integrantes

Juan Sebastian Charrupi
Adrian Andrade


Como ejecutar?

javac src/main/java/*.java
java -cp src/main/java Main

El programa pedirá por consola los datos de libro2 
(título, autor, número de ejemplares y número de ejemplares prestados).

1) Diagrama UML de clases (0.5)
https://claude.ai/chat/diagrama_uml.png


LibroTexto hereda de Libro.
LibroTextoUNIAC hereda de LibroTexto (herencia de dos niveles).
Novela hereda de Libro y usa el enum TipoNovela para representar histórica, romántica, policíaca, realista, ciencia ficción o aventuras.




2) Algoritmo en Java (0.5)

Implementado en src/main/java/: Libro.java, LibroTexto.java, LibroTextoUNIAC.java, Novela.java, Main.java. Compila y ejecuta correctamente.

3) Los 4 objetos y pruebas de préstamo/devolución (1.0)

Todo se construye y prueba en Main.java:

libro1: creado con el constructor con parámetros.
libro2: creado con el constructor por defecto y luego se llenan sus datos por consola usando los setters.
libroTextoUNIAC: creado con todos sus atributos (título, autor, ejemplares, prestados, curso y facultad).
novela: creado indicando su tipo (Novela.TipoNovela.POLICIACA).

Main también prueba prestamo() y devolucion() en casos normales y en los dos casos límite exigidos: pedir prestado un libro sin ejemplares disponibles (debe devolver false) y devolver un libro que no tiene préstamos activos (debe devolver false).

4) Dos situaciones donde la herencia NO se podría realizar (0.5)

Situación 1 — Clase o método marcados como final. Si Libro se declarara final, ninguna subclase podría extenderla. De igual forma, si un método como toString() se declarara final dentro de Libro, las subclases no podrían redefinirlo (perderían la posibilidad de mostrar sus atributos adicionales).

java
// Fragmento hipotético que ROMPERÍA la herencia:
public final class Libro {              
    public final String toString() {   
        return "...";
    }
}

public class LibroTexto extends Libro { 
    // "cannot inherit from final Libro"
}

Situación 2 — Constructor private (o clase con solo constructores privados). Si el único constructor de Libro fuera private, ninguna clase externa —incluidas sus propias subclases— podría invocar super(...), por lo que la herencia efectiva quedaría bloqueada (patrón típico de clases singleton o utility, que intencionalmente no deben tener subclases).

java

public class Libro {
    private Libro(String titulo, String autor, int n, int p) { ... } // <- privado
}

public class LibroTexto extends Libro {
    public LibroTexto(...) {
        super(titulo, autor, n, p); // 
    }
}

Nota: en el código entregado no se usan final ni constructores private; ambos fragmentos son ejemplos ilustrativos de escenarios que impedirían la herencia, tal como pide el enunciado.

5) Dos nuevos atributos y un método adicional (0.5)

Atributos nuevos para Libro:

isbn: String — identificador único internacional del libro, útil para búsquedas exactas y evitar duplicados en el catálogo.
anioPublicacion: int — año de publicación, útil para ordenar/filtrar el catálogo y para reportes de antigüedad del material bibliográfico.

Método adicional:

estaDisponible(): boolean — retorna true si numEjemplares - numEjemplaresPrestados > 0. Tiene sentido porque centraliza en un solo lugar la regla de disponibilidad que hoy está implícita dentro de prestamo(), permitiendo consultarla desde otras partes del sistema sin duplicar la lógica.
Estructura Maven
parcial-1/
├── pom.xml
├── diagrama_uml.png
├── README.md
└── src/main/java/
    ├── Libro.java
    ├── LibroTexto.java
    ├── LibroTextoUNIAC.java
    ├── Novela.java
    └── Main.java
