// Clase Libro para la Gestion de Biblioteca
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, el libro esta disponible al crear la instancia
    }

    // Metodo para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
        }
    }

    // Metodo para devolver el libro
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto y esta disponible nuevamente.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible.");
        }
    }

    // Metodo para consultar la disponibilidad del libro
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' esta disponible para prestamo.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
        }
    }

    // Metodos getters para los atributos (si los necesitas)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    // Metodo toString para representar el libro como una cadena
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Disponible: " + (disponible ? "Si" : "No");
    }

    // Metodo principal para probar la clase
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell");
        
        // Consultar disponibilidad
        libro1.consultarDisponibilidad(); // Deberia mostrar que el libro esta disponible
        
        // Prestar el libro
        libro1.prestar(); // Deberia indicar que el libro ha sido prestado
        
        // Consultar disponibilidad despues de prestar
        libro1.consultarDisponibilidad(); // Deberia mostrar que el libro no esta disponible
        
        // Devolver el libro
        libro1.devolver(); // Deberia indicar que el libro ha sido devuelto
        
        // Consultar disponibilidad despues de devolver
        libro1.consultarDisponibilidad(); // Deberia mostrar que el libro esta disponible
    }
}
