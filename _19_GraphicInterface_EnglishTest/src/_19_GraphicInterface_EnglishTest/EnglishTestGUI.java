package _19_GraphicInterface_EnglishTest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EnglishTestGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    private JLabel labelDomanda;
    private JTextField campoRisposta;
    private JButton bottoneInvia;

    private ArrayList<String> domande = new ArrayList<>();
    private ArrayList<String> risposte = new ArrayList<>();
    private int indiceCorrente = 0;

    public EnglishTestGUI() {
        super("English Text - Entry Level");

        // Setup domande e risposte
        domande.add("Traduci in inglese: gatto");
        risposte.add("cat");

        domande.add("Traduci in inglese: cane");
        risposte.add("dog");

        domande.add("Traduci in inglese: casa");
        risposte.add("house");

        // Layout
        setLayout(new GridLayout(3, 1, 10, 10));

        labelDomanda = new JLabel(domande.get(indiceCorrente));
        campoRisposta = new JTextField();
        bottoneInvia = new JButton("Invia");

        add(labelDomanda);
        add(campoRisposta);
        add(bottoneInvia);

        bottoneInvia.addActionListener(e -> controllaRisposta());

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void controllaRisposta() {
        String rispostaUtente = campoRisposta.getText().trim().toLowerCase();
        String rispostaCorretta = risposte.get(indiceCorrente);

        if (rispostaUtente.equals(rispostaCorretta)) {
            JOptionPane.showMessageDialog(this, "Corretto!", "Risultato", JOptionPane.INFORMATION_MESSAGE);
            indiceCorrente++;

            if (indiceCorrente < domande.size()) {
                labelDomanda.setText(domande.get(indiceCorrente));
                campoRisposta.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Hai completato il quiz!", "Fine", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Risposta sbagliata. Riprova!", "Errore", JOptionPane.ERROR_MESSAGE);
            campoRisposta.setText("");
        }
    }

    public static void main(String[] args) {
        new EnglishTestGUI();
    }
}
