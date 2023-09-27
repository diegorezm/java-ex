package gui;

import imc.Atleta;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MainFrame extends JFrame {
    final private Font font = new Font("Inter", Font.BOLD, 16);
    final private Color bg_color = new Color(239, 241, 245);
    final private Color fg_color = new Color(0, 0, 0);
    final private Color border = new Color(140, 143, 161);
    final private Color final_bg_color = new Color(108, 111, 133);
    private JPanel resultado;

    public MainFrame(){
        resultado = setResultado("Aguardando...", 0,"", "", "");
    }

    public void setup() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int h = screenSize.height / 2;
        int w = screenSize.width / 2;
        setSize(w, h);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void init() {
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        main.setBackground(bg_color);
        main.setForeground(fg_color);
        main.add(formPanel(), BorderLayout.NORTH);
        if (resultado != null) {
            main.add(resultado, BorderLayout.CENTER);
        }
        add(main);
        setup();
    }

    public JPanel setResultado(String imcCalc, double imc, String nome, String altura, String peso) {
        JPanel resultField = new JPanel();
        Font largeFont = new Font("Inter", Font.BOLD, 24);

        resultField.setLayout(new BoxLayout(resultField, BoxLayout.Y_AXIS)); 
    
        resultField.setBackground(bg_color);
    
        JLabel imcCalcJ = new JLabel(imcCalc);
        imcCalcJ.setFont(largeFont);
        imcCalcJ.setAlignmentX(Component.CENTER_ALIGNMENT); 
        resultField.add(imcCalcJ);
    
        JLabel nomeJ = new JLabel(nome);
        nomeJ.setFont(largeFont);
        nomeJ.setAlignmentX(Component.CENTER_ALIGNMENT);
        resultField.add(nomeJ);
    
        DecimalFormat numberFormat = new DecimalFormat("#.00");
    
        JLabel imcJ = new JLabel("IMC: " + numberFormat.format(imc));
        imcJ.setFont(largeFont);
        imcJ.setAlignmentX(Component.CENTER_ALIGNMENT); 
        resultField.add(imcJ);
    
        JLabel alturaJ = new JLabel("Altura: " + altura);
        alturaJ.setFont(largeFont);
        alturaJ.setAlignmentX(Component.CENTER_ALIGNMENT); 
        resultField.add(alturaJ);
    
        JLabel pesoJ = new JLabel("Peso: " + peso);
        pesoJ.setFont(largeFont);
        pesoJ.setAlignmentX(Component.CENTER_ALIGNMENT); 
        resultField.add(pesoJ);
    
        return resultField;
    }
    
    
    public void updateResultado(Atleta atleta) {
        String nome = atleta.getNomeCompleto();
        String peso = atleta.getPeso();
        String altura = atleta.getAltura();
        double imc = atleta.imc();
        String res = "";
        if (imc >= 18.5) {
            res = "Abaixo do peso";
        } else if (imc <= 18.5 && imc >= 24.9) {
            res = "Peso normal";
        } else if (imc <= 25.0 && imc >= 29.9) {
            res = "Excesso de peso";
        } else {
            res = "Obesidade";
        }
        

        resultado.removeAll();
        resultado.add(setResultado(res,imc, nome,altura,peso), BorderLayout.CENTER);
        resultado.revalidate();
    }

    private JTextField styledTextField(int columns) {
        JTextField textField = new JTextField(columns);
        textField.setFont(font);
        textField.setBackground(bg_color);
        textField.setForeground(fg_color);
        textField.setBorder(BorderFactory.createLineBorder(border));
        textField.setCaretColor(fg_color);
        return textField;
    }

    public JPanel formPanel() {
        JPanel formJPanel = new JPanel();
        formJPanel.setLayout(new FlowLayout(1, 5, 5));

        JLabel nome = new JLabel("nome:", JLabel.TRAILING);
        nome.setForeground(fg_color);
        formJPanel.add(nome);

        JTextField nomeTxt = styledTextField(10);
        nome.setLabelFor(nomeTxt);
        formJPanel.add(nomeTxt);

        JLabel peso = new JLabel("peso:");
        peso.setForeground(fg_color);
        formJPanel.add(peso);

        JTextField pesoTxt = styledTextField(10);
        formJPanel.add(pesoTxt);

        JLabel altura = new JLabel("altura:");
        altura.setForeground(fg_color);
        formJPanel.add(altura);

        JTextField alturaTxt = styledTextField(10);
        formJPanel.add(alturaTxt);

        JButton button = new JButton("Enviar");
        button.setFont(font);
        button.setBackground(final_bg_color);
        button.setForeground(Color.WHITE);
        formJPanel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTxt.getText();
                String pesoJ = pesoTxt.getText();
                String alturaJ = alturaTxt.getText();
                try {
                    double peso = Double.parseDouble(pesoJ);
                    double altura = Double.parseDouble(alturaJ);
                    String[] parseNome = nome.split(" ");
                    String pNome = parseNome[0];
                    StringBuilder sNomeBuilder = new StringBuilder();
                    for (int i = 1; i < parseNome.length; i++) {
                        sNomeBuilder.append(parseNome[i]);
                        if (i < parseNome.length - 1) {
                            sNomeBuilder.append(" ");
                        }
                    }
                    String sNome = sNomeBuilder.toString();
                    Atleta atleta = new Atleta(pNome, sNome, peso, altura);
                    updateResultado(atleta);
                    nomeTxt.setText("");
                    pesoTxt.setText("");
                    alturaTxt.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input inválido.");
                    nomeTxt.setText("");
                    pesoTxt.setText("");
                    alturaTxt.setText("");
                }
            }
        });
        formJPanel.setBackground(bg_color);
        formJPanel.setForeground(fg_color);
        return formJPanel;
    }

    public static void main(String[] args) {
        MainFrame main = new MainFrame();
        main.init();

    }

}
