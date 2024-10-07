import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    static JFrame jFrameCalculadora;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldCadena;
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btn0, btnCe, btnSumar, btnRestar, btnResultado, btnMultiplicar, btnDividir, btnC;
    static float x, y, resultado;
    static JPanel panelBotones = new JPanel(new GridLayout(6, 3, 5, 5));
    static JPanel panelText = new JPanel();
    static String textFieldValue, operacion = "none";
    static boolean sw = false;


    public static void main(String[] args) {
        inicializarJFrameCalculadora();
        instanciarComponentes();
        panelBotones.setBorder(new EmptyBorder(5, 5, 5, 5));
        agregarComponentesAlPanelBotones();
        panelText.setLayout(new BoxLayout(panelText, BoxLayout.Y_AXIS));
        panelText.setBorder(new EmptyBorder(5, 5, 5, 5));
        agregarComponentesAlPanelText();
        jFrameCalculadora.add(panelText, BorderLayout.NORTH);
        jFrameCalculadora.add(panelBotones, BorderLayout.CENTER);
        jFrameCalculadora.setVisible(true);
        boton1();
        boton2();
        boton3();
        boton4();
        boton5();
        boton6();
        boton7();
        boton8();
        boton9();
        botonPunto();
        botonCero();
        botonCe();
        documentListenerTexField();
        sumar();
        resultado();
    }

    private static void resultado() {
        btnResultado.addActionListener(e -> {
            switch (operacion) {
                case "sumar" -> {
                    y = Float.parseFloat(txtFieldCadena.getText());
                    resultado = x + y;
                    txtFieldCadena.setText(String.valueOf(resultado));
                    if (!btnPunto.isEnabled()){
                        btnPunto.setEnabled(true);
                    }
                    operacion = "none";
                    x = 0;
                    y = 0;
                    resultado = 0;
                }
            }
        });
    }

    private static void sumar() {
        btnSumar.addActionListener(e -> {
            operacion = "sumar";
            x = Float.parseFloat(txtFieldCadena.getText());
            txtFieldCadena.setText("");
            if (!btnPunto.isEnabled()){
                btnPunto.setEnabled(true);
            }
        });
    }

    private static void boton1() {
        btn1.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "1");
        });
    }

    private static void boton2() {
        btn2.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "2");
        });
    }

    private static void boton3() {
        btn3.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "3");
        });
    }

    private static void boton4() {
        btn4.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "4");
        });
    }

    private static void boton5() {
        btn5.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "5");
        });
    }

    private static void boton6() {
        btn6.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "6");
        });
    }

    private static void boton7() {
        btn7.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "7");
        });
    }

    private static void boton8() {
        btn8.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "8");
        });
    }

    private static void boton9() {
        btn9.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "9");
        });
    }

    private static void botonPunto() {
        btnPunto.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + ".");
            btnPunto.setEnabled(false);
        });
    }

    private static void botonCero() {
        btn0.addActionListener(e -> {
            txtFieldCadena.setText(txtFieldCadena.getText() + "0");
        });
    }

    private static void botonCe() {
        btnCe.addActionListener(e -> {
            txtFieldCadena.setText("");
            btnPunto.setEnabled(true);
        });
    }

    private static void documentListenerTexField() {
        txtFieldCadena.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTextFieldValue(txtFieldCadena);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTextFieldValue(txtFieldCadena);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTextFieldValue(txtFieldCadena);
            }

            private void updateTextFieldValue(JTextField txtFieldCadena) {
                textFieldValue = txtFieldCadena.getText();
                System.out.print(textFieldValue + " ");
            }
        });
    }

    private static void agregarComponentesAlPanelText() {
        panelText.add(txtFieldCadena);
    }

    private static void agregarComponentesAlPanelBotones() {
        panelBotones.add(btn1);
        panelBotones.add(btn2);
        panelBotones.add(btn3);
        panelBotones.add(btn4);
        panelBotones.add(btn5);
        panelBotones.add(btn6);
        panelBotones.add(btn7);
        panelBotones.add(btn8);
        panelBotones.add(btn9);
        panelBotones.add(btnPunto);
        panelBotones.add(btn0);
        panelBotones.add(btnCe);
        panelBotones.add(btnSumar);
        panelBotones.add(btnRestar);
        panelBotones.add(btnResultado);
        panelBotones.add(btnMultiplicar);
        panelBotones.add(btnDividir);
        panelBotones.add(btnC);
    }

    private static void instanciarComponentes() {
        txtFieldCadena = new JTextField();
        txtFieldCadena.setPreferredSize(new Dimension(50, 40));
        txtFieldCadena.setEditable(false);
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPunto = new JButton(".");
        btn0 = new JButton("0");
        btnCe = new JButton("CE");
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnResultado = new JButton("=");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnC = new JButton("C");
    }

    private static void inicializarJFrameCalculadora() {
        //creacion del JFrame
        jFrameCalculadora = new JFrame();
        jFrameCalculadora.setSize(300, 400);
        //jFrameInterfaz.pack();
        jFrameCalculadora.setLocationRelativeTo(null);
        jFrameCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameCalculadora.setResizable(false);
        jFrameCalculadora.setTitle("Calculadora");
    }
}
