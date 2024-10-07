import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculadora {
    static JFrame jFrameCalculadora;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldCadena;
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btn0, btnCe, btnSumar, btnRestar, btnResultado, btnMultiplicar, btnDividir, btnC;
    static int x, y;
    static JPanel panelBotones = new JPanel(new GridLayout(6, 3, 5, 5));
    static JPanel panelText = new JPanel();


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
        jFrameCalculadora.setSize(400, 400);
        //jFrameInterfaz.pack();
        jFrameCalculadora.setLocationRelativeTo(null);
        jFrameCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameCalculadora.setResizable(false);
        jFrameCalculadora.setTitle("Calculadora");
    }
}
