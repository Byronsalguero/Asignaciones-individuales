// Clase abstracta Empleado
abstract class Empleado {
    // Atributos
    protected String nombre;
    protected String id;
    protected double salario_base;

    // Constructor
    public Empleado(String nombre, String id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método concreto para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: $" + salario_base);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}

// Clase concreta EmpleadoAsalariado que extiende de Empleado
class EmpleadoAsalariado extends Empleado {

    // Constructor
    public EmpleadoAsalariado(String nombre, String id, double salario_base) {
        super(nombre, id, salario_base);
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        // Para un empleado asalariado, el salario total es simplemente el salario base
        return salario_base;
    }
}

// Clase concreta EmpleadoPorHoras que extiende de Empleado
class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoPorHoras(String nombre, String id, double salario_base, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, salario_base);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        // El salario total se calcula como la tarifa por hora multiplicada por las horas trabajadas
        return tarifaPorHora * horasTrabajadas;
    }
}

// Clase principal para probar la implementación
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de EmpleadoAsalariado
        Empleado asalariado = new EmpleadoAsalariado("Byron salguero", "0905-19-8408", 3000.00);

        // Crear una instancia de EmpleadoPorHoras
        Empleado porHoras = new EmpleadoPorHoras("Jose salguero ", "H456", 0, 20.00, 160);

        // Mostrar información de ambos empleados
        System.out.println("Empleado Asalariado:");
        asalariado.mostrarInformacion();
        System.out.println();

        System.out.println("Empleado Por Horas:");
        porHoras.mostrarInformacion();
    }
}
