import javax.management.ListenerNotFoundException;
import java.lang.module.FindException;
import java.net.BindException;
import java.util.Arrays;

public class Archivio {
    private String nome;
    private Robot[] robotAttivi = new Robot[4];

    public Archivio(String nome, int dimensione) {
        this.nome = nome;
        this.robotAttivi = new Robot[dimensione];
    }

    public void aggiungiRobot(Robot robot) {
        for (int i = 0; i < robotAttivi.length; i++) {
            if (robotAttivi[i] == null) {
                robotAttivi[i] = robot;
                return;
            }
        }
    }

    public void rimuovi(String nome) {
        for (int i = 0; i < robotAttivi.length; i++) {
            Robot index = robotAttivi[i];
            if (index != null && index.getNome().equals(nome) ) {
                index = robot;
                return;
            }
        }
    }

    //cerca un robot tramite nome
    public Robot cercaRobot(String nome) {
        for (int i = 0; i < robotAttivi.length; i++) {
            Robot index = robotAttivi[i];
            if (index != null) {
                if (index.getNome().equals(nome)) {
                    return index;
                }
            }
        }
        return null;
    }

    // cerca per nome e attiva
    public void attivaRobot(String nome) {
        Robot robot = cercaRobot(nome);
        robot.attiva();
        System.out.println("Robot " + robot.getNome() + " attivato");
    }

    // cerca per nome e disattiva
    public void disattivaRobot(String nome) {
        Robot robot = cercaRobot(nome);
        robot.disattiva();
        System.out.println("Robot " + robot.getNome() + " disattivato");
    }


    @Override
    public String toString() {
        return "Archivio{" +
                "nome='" + nome + '\'' +
                ", robotAttivi=" + Arrays.toString(robotAttivi) +
                '}';
    }
}
