package _19_GraphicInterface_Nursery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private ArrayList<Plant> plantList;

    public MainFrame() {
        super("Nursery Management");

        // Inizializza la lista di piante
        plantList = new ArrayList<>();



        // Layout generale
        setLayout(new BorderLayout());

        // Barra superiore con bottoni
        JPanel topPanel = new JPanel();
        JButton addButton = new JButton("Add Plant");
        JButton viewButton = new JButton("View Plants");
        topPanel.add(addButton);
        topPanel.add(viewButton);
        add(topPanel, BorderLayout.NORTH);

        // Area centrale con CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Pannelli figli (per ora segnaposto)
        JPanel addPlantPanel = new JPanel();
        addPlantPanel.add(new JLabel("Add Plant Form Here"));

        JPanel viewPlantsPanel = new JPanel();
        viewPlantsPanel.add(new JLabel("Plant List Here"));

        // Aggiungi i pannelli al cardPanel
        cardPanel.add(addPlantPanel, "ADD");
        cardPanel.add(viewPlantsPanel, "VIEW");

        add(cardPanel, BorderLayout.CENTER);

        // Bottoni per cambiare card
        addButton.addActionListener(e -> cardLayout.show(cardPanel, "ADD"));
        viewButton.addActionListener(e -> cardLayout.show(cardPanel, "VIEW"));

        // Frame settings
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
