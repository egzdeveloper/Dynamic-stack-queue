import java.util.Objects;

public class IntegerStack {

    private Node last;
    private int size;

    // Define el constructor vacío con las propiedades de tamaño 0 y nodo nulo
    public IntegerStack() {
        this.size = 0;
        this.last = null;
    }

    public void push(Integer i) {
        // Crea un nuevo nodo
        Node newNode = new Node();

        // Se le asigna el valor pasado por parámetro
        newNode.setValue(i);

        // Comprueba si hay algún nodo
        if (last != null) {
            newNode.setNext(last);
        }

        // El último es el nuevo nodo y aumenta el tamaño en 1
        last = newNode;
        size++;
    }

    public Integer pop() {
        // Comprueba si hay algún nodo
        if (last != null) {
            // Crea una variable temporal para mandar en el return
            Node temp = last;

            // El último se extrae y el nodo anterior pasa a ser el último. Se reduce el tamaño en 1
            last = last.getNext();
            size--;

            return temp.getValue();
        }
        return null;
    }

    public Integer top() {
        // Comprueba si hay algún nodo. Si existe lo retorna
        if (last != null) {
            return last.getValue();
        }

        return null;
    }

    public int size() {
        return size;
    }

    public boolean search(Integer i) {
        // Para buscar hay que almacenar una variable temporal, para ir jugando con los nodos anteriores
        // y almacenar el nodo original
        Node temp = last;
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
        Node temp = this.last;

        if (size() == 0) {
            message = new StringBuilder("Empty Stack");
        } else {
            message.append("[ ");

            // Va recorriendo cada nodo y concatenando el valor en un string
            // Hay que tener en cuenta que el elemento superior de la pila será el más situado a la izquierda
            while (temp != null) {
                message.append("url(").append(temp.getValue()).append(") ");
                temp = temp.getNext();
            }
            message.append("]");
        }

        return message.toString();
    }
}
