
package JOGOMEMORIA.grafica;

import java.awt.*;

import javax.swing.*;

import JOGOMEMORIA.logica.JogoMemoria;

public class FrmJogoMemoria extends JFrame {
    private BtnPeca[][] tabuleiro;
    private JogoMemoria jogo;

    public FrmJogoMemoria() {
        // SETAR PROPRIEDADES DE FUNCIONAMENTO GERAL
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setTitle("Jogo da Memória");

        // inicia lógica do jogo
        jogo = new JogoMemoria();
        int[][] tabuleiroNumerico = jogo.getTabuleiroNumerico();

        // CONSTRUCAO DA PARTE VISUAL
        tabuleiro = new BtnPeca[4][4];
        setLayout(new GridLayout(4, 4, 10, 10));
        ActionConferir action = new ActionConferir(tabuleiro);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                BtnPeca btn = new BtnPeca(tabuleiroNumerico[i][j]);// 5 é teste
                add(btn);
                tabuleiro[i][j] = btn;
                btn.addActionListener(action);

            }
        }
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiro[i][j].mostrar();
            }
        }
    }

    public void ocultarTabuleiro() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiro[i][j].ocultar();
            }
        }
    }
}
