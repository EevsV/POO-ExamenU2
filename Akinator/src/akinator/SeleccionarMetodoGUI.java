/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SeleccionarMetodoGUI extends JFrame implements ActionListener {
    private JComboBox<String> metodoComboBox;
    private JLabel metodoLabel;
    private JButton continuarButton;

    public SeleccionarMetodoGUI() {
        // Configurar el JFrame
        this.setTitle("Seleccionar método");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 150);
        this.setLayout(new GridLayout(3, 2));

        // Crear los componentes
        metodoLabel = new JLabel("Seleccione un método:");
        metodoComboBox = new JComboBox<>(new String[] {"Física", "Química"});
        continuarButton = new JButton("Continuar");

        // Agregar los componentes al JFrame
        this.add(metodoLabel);
        this.add(metodoComboBox);
        this.add(new JLabel()); // Espacio vacío
        this.add(continuarButton);
        this.add(new JLabel()); // Espacio vacío
        this.add(new JLabel()); // Espacio vacío

        // Agregar un ActionListener al botón de continuar
        continuarButton.addActionListener(this);

        // Hacer visible el JFrame
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continuarButton) {
            String metodoSeleccionado = (String) metodoComboBox.getSelectedItem();

            if (metodoSeleccionado.equals("Física")) {
                FisicaGUI fisicaGUI = new FisicaGUI();
            } else if (metodoSeleccionado.equals("Química")) {
                QuimicaGUI quimicaGUI = new QuimicaGUI();
            }

            this.dispose();
        }
    }

    public static void main(String[] args) {
        SeleccionarMetodoGUI seleccionarMetodoGUI = new SeleccionarMetodoGUI();
    }
}