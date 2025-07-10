package _18_InterfacciaGrafica;

import javax.swing.*;
import java.awt.*;

public class GraphicInterface extends JFrame {
	private static final long serialVersionUID = 1L;

	
    private JTextField campoNome;
    private JTextField campoCognome;

    public GraphicInterface() {
        super("Inserisci nome e cognome");

        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Nome:"));
        campoNome = new JTextField(15);
        add(campoNome);

        add(new JLabel("Cognome:"));
        campoCognome = new JTextField(15);
        add(campoCognome);

        add(new JLabel(""));

        JButton okButton = new JButton("OK");
        add(okButton);

        okButton.addActionListener(e -> {
            String nome = campoNome.getText().trim();
            String cognome = campoCognome.getText().trim();

            if (nome.isEmpty() || cognome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Inserisci sia il nome che il cognome.", "Errore", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ciao " + nome + " " + cognome + "!");
            }
        });

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    } 
}
