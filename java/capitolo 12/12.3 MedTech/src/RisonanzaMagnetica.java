public class RisonanzaMagnetica extends MacchinarioDiagnostico {

    public RisonanzaMagnetica(String codiceSeriale, int annoInstallazione) {
        super(codiceSeriale, annoInstallazione);
    }

    @Override
    void eseguiScansione() {
        System.out.println("Scansione 3D in corso... Generazione immagini...");
    }
}
