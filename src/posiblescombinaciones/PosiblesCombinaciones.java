package posiblescombinaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PosiblesCombinaciones extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JButton boton1;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    
    String palabra = "";
    String texto = "";

    public PosiblesCombinaciones() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);

        boton1 = new JButton("Generar");
        boton1.setBounds(250, 10, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
    }

    public static void main(String[] args) {
        PosiblesCombinaciones ventana = new PosiblesCombinaciones();
        ventana.setBounds(0, 0, 540, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            palabra = textfield1.getText().trim();
            List<String> listCombinacion = ListaCombinaciones.combinacion(palabra);
             texto += palabra + " generó " + listCombinacion.size() + " combinaciones posibles\n";
            for (String p : listCombinacion) {      
                texto += p + "\n";
            }
            textarea1.setText(texto);
            textfield1.setText("");
        }
    }

}
