/*Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo 
all’ultimo).
Dovrà offrire due metodi :
- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato 
invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene 
gestito internamente)
Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.
Bonus :
prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un 
nuovo intero all’elenco da ciclare. */

class ArrayCiclabile {
    private int[] elementi;
    private int posizioneCorrente;
    private int dimensione;
    private static final int DIMENSIONE_INIZIALE = 10;

    // Costruttore che accetta un array di interi
    public ArrayCiclabile(int[] array) {
        this.elementi = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.elementi[i] = array[i];
        }
        this.dimensione = array.length;
        this.posizioneCorrente = 0;
    }

    // Costruttore senza parametri (bonus)
    public ArrayCiclabile() {
        this.elementi = new int[DIMENSIONE_INIZIALE];
        this.dimensione = 0;
        this.posizioneCorrente = 0;
    }

    // Metodo per aggiungere un elemento (bonus)
    public void addElemento(int elemento) {
        if (dimensione == elementi.length) {
        
            int[] nuovoArray = new int[elementi.length * 2];
            for (int i = 0; i < elementi.length; i++) {
                nuovoArray[i] = elementi[i];
            }
            elementi = nuovoArray;
        }
        elementi[dimensione] = elemento;
        dimensione++;
    }

    // Restituisce il prossimo elemento
    public int getElementoSuccessivo() {
        if (!hasAncoraElementi()) {
            System.out.println("Non ci sono più elementi da ciclare");
            return -1;
        }
        int elemento = elementi[posizioneCorrente];
        posizioneCorrente++;
        return elemento;
    }

    // Verifica se ci sono ancora elementi da ciclare
    public boolean hasAncoraElementi() {
        return posizioneCorrente < dimensione;
    }
}