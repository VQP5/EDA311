package ColaDeClientes;

public class Main {

    public static void main(String[] args) {

        ColaDeClientes cola = new ColaDeClientes(10);

        Cliente Cli1 = new Cliente("Saul", "Flores", 15, "Bolivia", "Femenino", "GOLD");
        Cliente Cli2 = new Cliente("Maria", "Apaza", 25, "Bolivia", "Femenino", "SILVER");
        Cliente Cli3 = new Cliente("Jose", "Ticona", 45, "Bolivia", "Masculino", "GOLD");
        Cliente Cli4 = new Cliente("Saul", "Paredes", 65, "Argentina", "Masculino", "SILVER");
        Cliente Cli5 = new Cliente("Carlos", "Morales", 80, "Brasil", "Masculino", "GOLD");

        ColaDeClientes cola2 = new ColaDeClientes(10);

        Cliente Cli6 = new Cliente("Carlos", "Flores", 15, "Bolivia", "Femenino", "GOLD");
        Cliente Cli7 = new Cliente("Raul", "Apaza", 25, "Bolivia", "Femenino", "SILVER");
        Cliente Cli8 = new Cliente("Jose", "Ticona", 45, "Bolivia", "Masculino", "GOLD");
        Cliente Cli9 = new Cliente("Maria", "Paredes", 65, "Argentina", "Masculino", "SILVER");
        Cliente Cli10 = new Cliente("Ana", "Morales", 80, "Brasil", "Masculino", "GOLD");

        cola.adicionar(Cli1);
        cola.adicionar(Cli2);
        cola.adicionar(Cli3);
        cola.adicionar(Cli4);
        cola.adicionar(Cli5);

        cola2.adicionar(Cli6);
        cola2.adicionar(Cli7);
        cola2.adicionar(Cli8);
        cola2.adicionar(Cli9);
        cola2.adicionar(Cli10);

        //cola.mostrar();]
        //asignarVIP(cola, "GOLD", "Bolivia");
        //mayoresAlInicio(cola, 60);
        //moverSaul(cola, cola2, "Saul");
    }

    public static void asignarVIP(ColaDeClientes cola, String Tipo, String Pais) {
        ColaDeClientes aux = new ColaDeClientes(10);
        Cliente valorExtraidoDeLaCola = null;
        while (cola.esVacia() == false) {
            valorExtraidoDeLaCola = cola.eliminar();
            if (valorExtraidoDeLaCola.getTipo().equals(Tipo)) {
                if (valorExtraidoDeLaCola.getPais().equals(Pais)) {
                    valorExtraidoDeLaCola.setTipo("VIP");
                }
            }
            aux.adicionar(valorExtraidoDeLaCola);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

    public static void mayoresAlInicio(ColaDeClientes cola, int edad) {
        ColaDeClientes aux = new ColaDeClientes(10);
        ColaDeClientes aux2 = new ColaDeClientes(10);
        Cliente valorExtraidoDeLaCola = null;
        while (cola.esVacia() == false) {
            valorExtraidoDeLaCola = cola.eliminar();
            if (valorExtraidoDeLaCola.getEdad() > edad) {
                aux.adicionar(valorExtraidoDeLaCola);
            } else {
                aux2.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola.vaciar(aux);
        cola.vaciar(aux2);
        cola.mostrar();
    }

    public static void moverSaul(ColaDeClientes cola, ColaDeClientes cola2, String Nombre) {
        ColaDeClientes saul = new ColaDeClientes(10);
        ColaDeClientes aux = new ColaDeClientes(10);
        ColaDeClientes aux2 = new ColaDeClientes(10);
        Cliente valorExtraidoDeLaCola = null;
        Cliente valorExtraidoDeLaCola2 = null;
        while (cola.esVacia() == false) {
            valorExtraidoDeLaCola = cola.eliminar();
            if (valorExtraidoDeLaCola.getNombres().equals(Nombre)) {
                saul.adicionar(valorExtraidoDeLaCola);
            } else {
                aux.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola.vaciar(aux);
        while (cola2.esVacia() == false) {
            valorExtraidoDeLaCola2 = cola2.eliminar();
            aux2.adicionar(valorExtraidoDeLaCola2);
        }
        cola2.vaciar(saul);
        cola2.vaciar(aux2);
        cola.mostrar();
        System.out.println("--------------------------------------------");
        cola2.mostrar();
    }

}
