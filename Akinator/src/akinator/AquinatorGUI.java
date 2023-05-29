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

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AquinatorGUI extends JFrame {
    // Atributos de la clase
    private JLabel titleLabel, selectionLabel;
    private JComboBox<String> formulaComboBox;
    private JButton continueButton;
    private String[] formulas = {"H2O", "NaCl", "C6H12O6", "CO2"};

    public AquinatorGUI() {
        // Configuración de la ventana
        setTitle("Aquinator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);

        // Creación de los componentes de la GUI
        titleLabel = new JLabel("Bienvenido a Aquinator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        selectionLabel = new JLabel("Seleccione una fórmula:");
        formulaComboBox = new JComboBox<String>(formulas);
        continueButton = new JButton("Continuar");

        // Creación del panel y agregación de los componentes
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(titleLabel);
        panel.add(selectionLabel);
        panel.add(formulaComboBox);
        panel.add(continueButton);

        // Agregación del panel a la ventana
        add(panel);

        // Configuración del botón
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFormula = (String) formulaComboBox.getSelectedItem();
                System.out.println("Ventana actual cerrada");

                dispose(); // Cerrar la ventana actual
                new MethodSelectionGUI(selectedFormula); // Abrir la ventana de selección de método
            }
        });
    }

    public static void main(String[] args) {
        AquinatorGUI aquinatorGUI = new AquinatorGUI();
        aquinatorGUI.setVisible(true);
    }
}

class MethodSelectionGUI extends JFrame {
    
    // Atributos de la clase
    private JLabel titleLabel, selectionLabel;
    private JComboBox<String> methodComboBox;
    private JButton calculateButton;
    private String[] methods = {"Física - Densidad", "Física - Viscosidad", "Química - Balanceo de ecuaciones", "Química - Estequiometría"};
    private String selectedFormula;

    public MethodSelectionGUI(String selectedFormula) {
         System.out.println("Creando ventana MethodSelectionGUI");
        // Configuración de la ventana
        setTitle("Selección de método");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);

        this.selectedFormula = selectedFormula;

        // Creación de los componentes de la GUI
        titleLabel = new JLabel("Fórmula seleccionada: " + selectedFormula);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        selectionLabel = new JLabel("Seleccione un método:");
        methodComboBox = new JComboBox<String>(methods);
        calculateButton = new JButton("Calcular");

        // Creación del panel y agregación de los componentes
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(titleLabel);
        panel.add(selectionLabel);
        panel.add(methodComboBox);
        panel.add(calculateButton);

        // Agregación del panel a la ventana
        add(panel);

        // Configuración del botón
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMethod = (String) methodComboBox.getSelectedItem();
                System.out.println("Ventana actual cerrada");

                dispose(); // Cerrar la ventana actual
                // Aquí debería ir la lógica para realizar el cálculo con el método seleccionado
            }
        });
    }
}
