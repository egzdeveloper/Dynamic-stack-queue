public class Main {
    public static void main(String[] args) {

        // IMPLEMENTACIÓN IntegerStack
        IntegerStack stack = new IntegerStack();
        System.out.println("\n--------------- IMPLEMENTACIÓN DE IntegerStack ---------------\n");

        // Primero comprobamos que la pila está vacía
        System.out.println("Soy un navegador web que almacena las url de sitios previamente visitados.");
        System.out.println("Sólamente puedo acceder a las url ya buscadas pulsando el botón de Atrás.");
        System.out.println("Como operamos con tipos Integer, suponemos que esos números corresponden a las " +
                "IDs de las páginas.\n");

        System.out.println("Estoy en la página de inicio");
        System.out.println("\tTamaño del historial de búsquedas -> " + stack.size());
        System.out.println("\tUsando toString() -> " + stack.toString());

        // Por tanto, no podemos obtener ni extraer el último de la pila
        System.out.println("\t¿Cuál es la última búsqueda? -> " + stack.top());
        System.out.println("\tQuiero ir a la última búsqueda -> " + stack.pop());

        // Añadimos elementos a la pila
        System.out.println("\nBuscando en varias páginas...");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Imprimimos el tamaño de la pila y llamamos al toString()
        System.out.println("\t¿Cuántas urls he visitado? -> " + stack.size());
        System.out.println("\tUsando toString() -> " + stack.toString());

        // Miramos y obtenemos el último elemento
        System.out.println("\nQuiero volver a una página anterior pulsando el botón de Atrás...");
        System.out.println("\t¿Cuál es la página anterior? Uso top() -> " + stack.top());
        System.out.println("\tAccedo a dicha página usando pop() -> " + stack.pop());
        System.out.println("\t¿Cuál es la página anterior a ésta? Uso top() -> " + stack.top());
        System.out.println("\tTamaño de la pila después de volver a la página anterior -> " + stack.size());
        System.out.println("\tUsando toString() -> " + stack.toString());

        // Usar método search para buscar si existe la url visitada
        System.out.println("\nAhora quiero comprobar si he visitado una url o no...");
        System.out.println("\tLa primera página que he visitado ha sido el campus de la UNIR (1) -> "
                + stack.search(1));
        System.out.println("\tNo me acuerdo si he visitado la página de ChatGPT (99). Creo que no, voy a " +
                "comprobarlo -> " + stack.search(99));

        // Volver al punto de partida y ver si la pila funciona correctamente
        System.out.println("\nVuelvo a la página de inicio pulsando el botón de Atrás varias veces " +
                "(bucle de clicks)...");

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack.pop();
        }

        System.out.println("\tEstoy en la página de inicio. No debería haber más elementos. Compruebo usando top() " +
                "-> " + stack.top());
        System.out.println("\tVuelvo a dar otra vez al botón de atrás -> " + stack.pop());
        System.out.println("\tTamaño de la pila -> " + stack.size());
        System.out.println("\tUsando toString() -> " + stack.toString());



        // IMPLEMENTACIÓN IntegerStack
        IntegerQueue queue = new IntegerQueue();
        System.out.println("\n\n--------------- IMPLEMENTACIÓN DE IntegerQueue ---------------\n");

        // Primero comprobamos que la cola está vacía
        System.out.println("Soy una impresora que va imprimiendo documentos en cola.");
        System.out.println("Tengo una lista de espera, donde una vez se imprime un documento pasa al siguiente.");
        System.out.println("Como operamos con tipos Integer, suponemos que esos números corresponden a las " +
                "IDs de los documentos.\n");

        System.out.println("Enciendo la impresora a la espera de documentos...");
        System.out.println("\tTamaño de la cola de impresión -> " + queue.size());
        System.out.println("\tUsando toString() -> " + queue.toString());

        // Por tanto, no podemos obtener ni extraer el primer de la cola
        System.out.println("\t¿Cuál es el primer documento a imprimir? -> " + queue.seek());
        System.out.println("\tQuiero imprimir el primer documento -> " + queue.remove());

        // Añadimos elementos a la cola
        System.out.println("\nMandando pdfs a la cola de impresión...");
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        // Imprimimos el tamaño de la cola y llamamos al toString()
        System.out.println("\t¿Cuántos documentos hay en la cola de impresión? -> " + queue.size());
        System.out.println("\tUsando toString() -> " + queue.toString());

        // Miramos y obtenemos el primer elemento
        System.out.println("\nQuiero imprimir el primer pdf...");
        System.out.println("\t¿Cuál es ese documento? Uso seek() -> " + queue.seek());
        System.out.println("\tEl documento se imprime usando remove() -> " + queue.remove());
        System.out.println("\t¿Cuál es el siguiente documento? Uso seek() -> " + queue.seek());
        System.out.println("\tTamaño de la cola tras la primera impresión -> " + queue.size());
        System.out.println("\tUsando toString() -> " + queue.toString());

        // Usar método search para buscar un documento en la cola
        System.out.println("\nAhora quiero comprobar si varios documentos están en la cola...");
        System.out.println("\tEl documento con el ID (3) me interesa que esté en la cola. Lo compruebo -> "
                + queue.search(3));
        System.out.println("\tOtro documento (10) lo he mandado a imprimir sin querer y no se si está en la cola. " +
                "Esperemos que no. Lo compruebo -> " + queue.search(10));

        // Una vez impresos todos los documentos se comprueba si la cola funciona correctamente
        System.out.println("\nEspero a que la impresora acabe de imprimir todos los documentos. ¿Por qué las " +
                "haría a color si la tinta está a precio de oro...?");

        // Imprimiendo todos los documentos
        size = queue.size();
        for (int i = 0; i < size; i++) {
            queue.remove();
        }

        System.out.println("\tLa impresora ha acabado. Compruebo la cola de impresión usando seek() " +
                "-> " + queue.seek());
        System.out.println("\tPruebo a imprimir aunque la cola esta vacía -> " + queue.remove());
        System.out.println("\tTamaño de la cola -> " + queue.size());
        System.out.println("\tUsando toString() -> " + queue.toString());
    }
}