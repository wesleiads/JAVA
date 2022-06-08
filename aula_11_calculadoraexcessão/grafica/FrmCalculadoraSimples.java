package grafica;

import javax.swing.*;
import java.awt.*;


public class FrmCalculadoraSimples extends JFrame{
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;
    private JButton btnCalcular;

    public FrmCalculadoraSimples() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(320,120));
        add(new JLabel("X:"));
        add (txtX = new JTextField(10));
        add(new JLabel("Y:"));
        add (txtY = new JTextField(10));
        String operacoes[]={"Soma", "Divisao","Multiplicacao","Subtracao"};
        add(new JLabel("Operacao:"));
        add(cbxOperacao = new JComboBox<String>(operacoes));
        add(btnCalcular = new JButton("Calcular"));
        ActionCalcular action= new ActionCalcular(txtX, txtY,cbxOperacao);
        btnCalcular.addActionListener(action);
        

    }
    
    
}
