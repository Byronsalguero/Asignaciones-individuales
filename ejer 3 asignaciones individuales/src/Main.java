// Clase abstracta Producto
abstract class Producto {
    // Atributos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void agregar_cantidad(int cantidad);

    public abstract void vender(int cantidad);

    // Método concreto
    public void consultar_inventario() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }
}

// Clase concreta Electronico que extiende de Producto
class Electronico extends Producto {

    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método abstracto agregar_cantidad
    @Override
    public void agregar_cantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se han agregado " + cantidad + " unidades al inventario.");
        } else {
            System.out.println("La cantidad a agregar debe ser positiva.");
        }
    }

    // Implementación del método abstracto vender
    @Override
    public void vender(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= this.cantidad) {
                this.cantidad -= cantidad;
                System.out.println("Se han vendido " + cantidad + " unidades del producto.");
            } else {
                System.out.println("No hay suficiente cantidad para vender.");
            }
        } else {
            System.out.println("La cantidad a vender debe ser positiva.");
        }
    }
}

// Clase principal para probar la implementación
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Electronico
        Electronico laptop = new Electronico("Laptop Gaming", 1200.00, 10);

        // Consultar inventario
        laptop.consultar_inventario();

        // Agregar cantidad
        laptop.agregar_cantidad(5);
        laptop.consultar_inventario();

        // Vender cantidad
        laptop.vender(3);
        laptop.consultar_inventario();

        // Intentar vender más de la cantidad disponible
        laptop.vender(15);
        laptop.consultar_inventario();
    }
}

