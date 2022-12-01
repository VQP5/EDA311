package ColaDeClientes;

public class ColaDeClientes {

    private int max;
    private int ini;
    private int fin;
    private Cliente[] clientes;

    public ColaDeClientes(int max) {
        this.max = max;
        this.clientes = new Cliente[this.max + 1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        if (this.ini == 0 && this.fin == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (this.fin == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return this.fin - this.ini;
    }

    public void adicionar(Cliente nuevoCliente) {
        if (esLlena() == false) {
            this.fin = this.fin + 1;
            this.clientes[this.fin] = nuevoCliente;
        } else {
            System.out.println("La Cola de Clientes esta llena.");
        }
    }

    public Cliente eliminar() {
        Cliente elementoEliminado = null;
        if (this.esVacia() == false) {
            this.ini = this.ini + 1;
            elementoEliminado = this.clientes[this.ini];
            if (this.ini == this.fin) {
                this.ini = 0;
                this.fin = 0;
            }
        } else {
            System.out.println("La Cola de Clientes esta vacía.");
        }
        return elementoEliminado;
    }

    public void vaciar(ColaDeClientes cola) {
        while (cola.esVacia() == false) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        if (esVacia() == true) {
            System.out.println("La Cola de Clientes esta vacía, no hay elementos que mostrar.");
        } else {
            Cliente elemEliminado = null;
            System.out.println("Mostrando datos de la Cola");
            ColaDeClientes aux = new ColaDeClientes(max);
            while (this.esVacia() == false) {
                elemEliminado = this.eliminar();
                elemEliminado.muestraCliente();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }

}
