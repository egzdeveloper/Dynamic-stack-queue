import java.util.Objects;

public class IntegerQueue {

    private Node first;
    private Node last;
    private int size;

    // Define el constructor vacío con las propiedades de tamaño 0 y nodos nulos
    public IntegerQueue() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public void insert(Integer i) {
        // Crea un nuevo nodo
        Node newNode = new Node();

        // Se le asigna el valor pasado por parámetro
        newNode.setValue(i);

        // Asignamos el nodo siguiente del nuevo como nulo
        newNode.setNext(null);

        // Comprueba si existe algún nodo
        if (first == null) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }

        last = newNode;
        size++;
    }

    public Integer remove() {
        // Crea una variable temporal para mandar en el return
        Node temp = first;

        // Comprueba si existe algún nodo
        if (first == null) {
            return null;
        }

        // Si el primer nodo coincide con el último, ambos se declaran como nulos
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
        }

        size--;
        return temp.getValue();
    }

    public Integer seek() {
        // Comprueba si hay algún nodo. Si existe lo retorna
        if (first == null) {
            return null;
        } else {
            return first.getValue();
        }
    }

    public int size() {
        return size;
    }

    public boolean search(Integer i) {
        // Para buscar hay que almacenar una variable temporal, para ir jugando con los nodos posteriores
        // y almacenar el nodo original
        Node temp = first;
        boolean exists = false;

        // Bucle que se ejecuta mientras dicho valor no exista y el nodo no sea nulo. Ocurren dos cosas:
        // 1. Que no lo encuentre, retornando falso
        // 2. Que lo encuentre y el boolean cambie a verdadero
        while (!exists && temp != null) {
            if (Objects.equals(i, temp.getValue())) {
                exists = true;
            } else {
                temp = temp.getNext();
            }
        }

        return exists;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        Node temp = this.first;

        if (size() == 0) {
            message = new StringBuilder("Empty Queue");
        } else {
            message.append("[ ");

            // Va recorriendo cada nodo y concatenando el valor en un string
            // Hay que tener en cuenta que primer elemento de la cola será el más situado a la izquierda
            while (temp != null) {
                message.append("pdf(").append(temp.getValue()).append(") ");
                temp = temp.getNext();
            }
            message.append("]");
        }

        return message.toString();
    }
}
