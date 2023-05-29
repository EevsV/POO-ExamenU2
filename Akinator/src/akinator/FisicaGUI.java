/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

/**
 *
 * @author Fabian
 */
import Superclases.Fisica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FisicaGUI extends JFrame implements ActionListener {
    private JLabel velocidadLabel, tiempoLabel, aceleracionLabel, resultadoLabel;
    private JTextField velocidadTextField, tiempoTextField, aceleracionTextField, resultadoTextField;
    private JButton calcularButton;

    public FisicaGUI() {
        // Configurar el JFrame
        this.setTitle("Física");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new GridLayout(4, 2));

        // Crear los componentes
        velocidadLabel = new JLabel("Velocidad (m/s):");
        tiempoLabel = new JLabel("Tiempo (s):");
        aceleracionLabel = new JLabel("Aceleración (m/s²):");
        resultadoLabel = new JLabel("Resultado:");

        velocidadTextField = new JTextField();
        tiempoTextField = new JTextField();
        aceleracionTextField = new JTextField();
        resultadoTextField = new JTextField();
        resultadoTextField.setEditable(false);

        calcularButton = new JButton("Calcular");

        // Agregar los componentes al JFrame
        this.add(velocidadLabel);
        this.add(velocidadTextField);
        this.add(tiempoLabel);
        this.add(tiempoTextField);
        this.add(aceleracionLabel);
        this.add(aceleracionTextField);
        this.add(resultadoLabel);
        this.add(resultadoTextField);
        this.add(new JLabel()); // Espacio vacío
        this.add(calcularButton);

        // Agregar un ActionListener al botón de calcular
        calcularButton.addActionListener(this);

        // Hacer visible el JFrame
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            try {
                double velocidad = Double.parseDouble(velocidadTextField.getText());
                double tiempo = Double.parseDouble(tiempoTextField.getText());
                double aceleracion = Double.parseDouble(aceleracionTextField.getText());

                double resultado = Fisica.velocidad(velocidad, tiempo, aceleracion);

                resultadoTextField.setText(Double.toString(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.");
            }
        }
    }

    
}
