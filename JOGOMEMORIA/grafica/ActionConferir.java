package JOGOMEMORIA.grafica;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class ActionConferir extends AbstractAction {
    private boolean aguardando;
    private BtnPeca primeiraPeca;
    private BtnPeca[][] tabuleiro;
    private int pontuacao;

    public ActionConferir(BtnPeca[][] tabuleiro) {
        this.tabuleiro = tabuleiro;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BtnPeca pecaAtual = (BtnPeca) e.getSource();
        if (aguardando) {
            if (primeiraPeca == pecaAtual) {
                pecaAtual.mostrar();
                return;
            }
            // logica para conferir o valor das pecas

            if (pecaAtual.getNumero() == primeiraPeca.getNumero()) {
                // condicao de acerto
                pontuacao += 5;
                pecaAtual.mostrar();
                pecaAtual.setEnabled(false);
                primeiraPeca.setEnabled(false);
                // conferir se é fim de jogo
                int contador = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (tabuleiro[i][j].isSelected()) {
                            contador++;
                        }
                    }
                }
                if (contador == 16) {
                    JOptionPane.showMessageDialog(null, String.format("Fim de jogo! Pontuação: %d", pontuacao),
                            "Jogo da Memória",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                // condicao de erro
                pontuacao -= 3;
                new Thread() {
                    public void run() {
                        pecaAtual.mostrar();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        pecaAtual.ocultar();
                        primeiraPeca.ocultar();
                    };

                }.start();
            }
            aguardando = false;
        } else {
            primeiraPeca = pecaAtual;
            primeiraPeca.mostrar();
            aguardando = true;

        }
    }
}
