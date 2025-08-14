import javax.swing.*;

import Modelo.CineControlador;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cine Controlador");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CineControlador cine = new CineControlador(10);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton btnCrearSala = new JButton("Crear Sala");
        JButton btnVerSalas = new JButton("Ver Salas");
        JButton btnCrearPelicula = new JButton("Crear Película");
        JButton btnVerCartelera = new JButton("Ver Cartelera");

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        
        // Acción para Crear Sala
        btnCrearSala.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filas = JOptionPane.showInputDialog(frame, "Número de Filas:");
                String num = JOptionPane.showInputDialog(frame, "Número de Asientos por Fila:");
                String tipo = JOptionPane.showInputDialog(frame, "Tipo de Sala:");
                String numero = JOptionPane.showInputDialog(frame, "Número de Sala:");

                int filasInt = Integer.parseInt(filas);
                int numInt = Integer.parseInt(num);
                int numeroInt = Integer.parseInt(numero);

                if (cine.crearSala(filasInt, numInt, tipo, numeroInt)) {
                    textArea.append("Sala " + numeroInt + " creada!\n");
                } else {
                    textArea.append("No hay espacio para más salas.\n");
                }
            }
        });

        // Acción para Ver Salas
        btnVerSalas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(cine.verSalas());
            }
        });

        // Acción para Crear Película
        btnCrearPelicula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(frame, "Nombre de la película:");
                String actores = JOptionPane.showInputDialog(frame, "Actores:");
                String clasificacion = JOptionPane.showInputDialog(frame, "Clasificación:");
                String director = JOptionPane.showInputDialog(frame, "Director:");
                String duracion = JOptionPane.showInputDialog(frame, "Duración:");

                int duracionInt = Integer.parseInt(duracion);

                cine.crearPelicula(nombre, actores, clasificacion, director, duracionInt);
                textArea.append("Película '" + nombre + "' creada!\n");
            }
        });

        // Acción para Ver Cartelera
        btnVerCartelera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(cine.verPeliculas());
            }
        });

        panel.add(btnCrearSala);
        panel.add(btnVerSalas);
        panel.add(btnCrearPelicula);
        panel.add(btnVerCartelera);
        panel.add(new JScrollPane(textArea));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
