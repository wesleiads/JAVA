package JOGOMEMORIA.logica;

import java.util.Random;

public class JogoMemoria {
    private int[][] tabuleiroNumerico;

    public JogoMemoria() {
        tabuleiroNumerico = new int[4][4];
        // sortear os numeros
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiroNumerico[i][j] = sortearNumero();
            }
        }
    }

    private int sortearNumero() {
        while (true) {
            int numeroSorteado = new Random().nextInt(8) + 1;
            int contador = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (numeroSorteado == tabuleiroNumerico[i][j]) {
                        contador++;
                    }
                }
            }
            if (contador < 2) {
                return numeroSorteado;
            }
        }

    }

    public int[][] getTabuleiroNumerico() {
        return tabuleiroNumerico;
    }
}
