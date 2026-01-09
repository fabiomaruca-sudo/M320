public interface Ricaricabile {
    int LIVELLO_MASSIMO = 100; //costante che viene implementata nelle classi figlie
    String TIPO_ENERGIA = "Elettrica";

    void ricarica();

    void mostraStato();
}
