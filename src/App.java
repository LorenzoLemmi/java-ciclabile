public class App {
    public static void main(String[] args) {
        // Test con costruttore che accetta array
        int[] numeri = {1, 2, 3, 4, 5};
        ArrayCiclabile array = new ArrayCiclabile(numeri);
        
        System.out.println("Test con array esistente:");
        while (array.hasAncoraElementi()) {
            System.out.println(array.getElementoSuccessivo());
        }

        // Test con costruttore vuoto e addElemento
        ArrayCiclabile arrayDinamico = new ArrayCiclabile();
        arrayDinamico.addElemento(10);
        arrayDinamico.addElemento(20);
        arrayDinamico.addElemento(30);

        System.out.println("\nTest con array dinamico:");
        while (arrayDinamico.hasAncoraElementi()) {
            System.out.println(arrayDinamico.getElementoSuccessivo());
        }
    }
}
