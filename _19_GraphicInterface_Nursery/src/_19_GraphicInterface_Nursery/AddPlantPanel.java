package _19_GraphicInterface_Nursery;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddPlantPanel extends JPanel {
    private JTextField nameField;
    private JTextArea descriptionArea;
    private JTextField priceField;
    private JComboBox<String> typeComboBox;
    private JButton addButton;

    private ArrayList<Plant> plantList;

    public AddPlantPanel(ArrayList<Plant> plantList) {
        this.plantList = plantList;

        setLayout(new BorderLayout(10, 10));
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        // Name
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        // Description
        formPanel.add(new JLabel("Description:"));
        descriptionArea = new JTextArea(3, 15);
        JScrollPane scroll = new JScrollPane(descriptionArea);
        formPanel.add(scroll);

        // Price
        formPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        formPanel.add(priceField);

        // Type
        formPanel.add(new JLabel("Plant Type:"));
        String[] plantTypes = {"Succulent", "Herb", "Tree", "Flower"};
        typeComboBox = new JComboBox<>(plantTypes);
        formPanel.add(typeComboBox);

        // Add button
        addButton = new JButton("Add Plant");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action listener
        addButton.addActionListener(e -> addPlant());
    }

    private void addPlant() {
        String name = nameField.getText().trim();
        String description = descriptionArea.getText().trim();
        String priceText = priceField.getText().trim();
        String type = (String) typeComboBox.getSelectedItem();

        if (name.isEmpty() || description.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double price;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create correct subclass
        Plant newPlant;
        switch (type) {
            case "Succulent":
                newPlant = new Succulent(name, description);
                break;
            case "Herb":
                newPlant = new Herb(name, description);
                break;
            case "Tree":
                newPlant = new Tree(name, description);
                break;
            case "Flower":
                newPlant = new Flower(name, description);
                break;
            default:
                newPlant = new Plant(name, description);
        }
        newPlant.setPrice(price);  // Attenzione: dobbiamo aggiungere setPrice a Plant!

        // Add to list
        plantList.add(newPlant);

        JOptionPane.showMessageDialog(this, "Plant added successfully!");

        // Reset form
        nameField.setText("");
        descriptionArea.setText("");
        priceField.setText("");
        typeComboBox.setSelectedIndex(0);
    }
}

