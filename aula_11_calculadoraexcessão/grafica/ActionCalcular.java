package grafica;

import java.awt.event.*;

import javax.swing.*;

import logica.Calculadora;

public class ActionCalcular extends AbstractAction {
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;

    //// construtura
    public ActionCalcular(JTextField txtX, JTextField txtY, JComboBox<String> cbxOperacao) {
        this.txtX = txtX;
        this.txtY = txtY;
        this.cbxOperacao = cbxOperacao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double x = Double.parseDouble(txtX.getText());
            double y = Double.parseDouble(txtY.getText());
            Calculadora calc = new Calculadora(x, y);
            if (cbxOperacao.getSelectedItem().equals("Soma")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f + %f é %f,", x, y,
                        calc.somar()), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (cbxOperacao.getSelectedItem().equals("Divisao")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f / %f é %f,", x, y,
                        calc.dividir()), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            } else if (cbxOperacao.getSelectedItem().equals("Multiplicacao")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f * %f é %f,", x, y,
                        calc.multiplicar()), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            } else if (cbxOperacao.getSelectedItem().equals("Subtracao")) {
                JOptionPane.showMessageDialog(null, String.format("O resultado de %f * %f é %f,", x, y,
                        calc.subtrair()), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Número inválido", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
