public class App {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.nombre = "Franco";
        cliente.edad = 25;
        cliente.telefono = 123456789;
        cliente.credito = 12345;

        System.out.println("Cliente "+"  Nombre: "+cliente.nombre+".  Edad: "+cliente.edad+".  Telefono: "+cliente.telefono+".   Credito: "+cliente.credito);


        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Jose";
        trabajador.edad = 30;
        trabajador.telefono = 987654321;
        trabajador.salario = 1500;

        System.out.println("Trabajador "+" Nombre: "+trabajador.nombre+".   Edad: "+trabajador.edad+".  Telefono: "+trabajador.telefono+".   Salario: "+trabajador.salario);
 
    }
}

class Persona{

    String nombre;
    int edad,telefono;
}

class Cliente extends Persona{

    int credito;
}

class Trabajador extends Persona{

    int salario;
}


