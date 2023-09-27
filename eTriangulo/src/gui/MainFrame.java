package gui;

import triangulo.Triangulo;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  final private Font font = new Font("Inter", Font.BOLD, 16);
  final private Color bg_color = new Color(239, 241, 245);
  final private Color fg_color = new Color(0, 0, 0);
  final private Color header_fg = new Color(32, 159, 181);
  final private Color border = new Color(140, 143, 161);
  final private Color final_bg_color = new Color(108, 111, 133);
  private Triangulo triangulo;
  private JPanel triangleImagePanel;

  public MainFrame() {
    triangleImagePanel = setIcones("triangulo.png", "Triangulo");
  }

  public void init() {
    JPanel main = new JPanel();
    main.setLayout(new BorderLayout());
    main.setBackground(bg_color);
    main.setForeground(fg_color);
    main.add(formPanel(), BorderLayout.NORTH);
    if (triangleImagePanel != null) {
      main.add(triangleImagePanel, BorderLayout.CENTER);
    }
    add(main);
    setup();
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

  public JPanel setIcones(String image, String title) {
    String currentDir = System.getProperty("user.dir");
    String imagePath = currentDir + "/src/assets/";
    ImageIcon iconTriangulo;
    iconTriangulo = new ImageIcon(imagePath + image);

    JLabel imageTitle = new JLabel(title, JLabel.CENTER);
    imageTitle.setFont(font);
    imageTitle.setForeground(header_fg);

    JLabel imageLabel = new JLabel(iconTriangulo);
    JPanel imagePanel = new JPanel(new BorderLayout());

    imagePanel.setBackground(bg_color);
    imagePanel.setBorder(BorderFactory.createLineBorder(fg_color));
    imagePanel.setPreferredSize(new Dimension(250, 250));
    imagePanel.add(imageTitle, BorderLayout.NORTH);
    imagePanel.add(imageLabel, BorderLayout.CENTER);
    return imagePanel;
  }

  public void updateImage() {
    Byte tipo = triangulo.getTipoTriangulo();
    String image, title;
    switch (tipo) {
      case 1:
        image = "equilatero.png";
        title = "Triangulo Equilátero";
        break;
      case 2:
        image = "isosceles.png";
        title = "Triangulo Isósceles";
        break;
      case 3:
        image = "escaleno.png";
        title = "Triangulo Escaleno";
        break;
      default:
        image = "nao_triangulo.png";
        title = "Triangulo inválido!";
        break;
    }

    triangleImagePanel.removeAll();
    triangleImagePanel.add(setIcones(image, title), BorderLayout.CENTER);
    triangleImagePanel.revalidate();
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
    formJPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

    JLabel labelX = new JLabel("X:");
    labelX.setForeground(fg_color);
    formJPanel.add(labelX);

    JTextField textFieldX = styledTextField(10);
    formJPanel.add(textFieldX);

    JLabel labelY = new JLabel("Y:");
    labelY.setForeground(fg_color);
    formJPanel.add(labelY);

    JTextField textFieldY = styledTextField(10);
    formJPanel.add(textFieldY);

    JLabel labelZ = new JLabel("Z:");
    labelZ.setForeground(fg_color);
    formJPanel.add(labelZ);

    JTextField textFieldZ = styledTextField(10);
    formJPanel.add(textFieldZ);

    JButton button = new JButton("Enviar");
    button.setFont(font);
    button.setBackground(final_bg_color);
    button.setForeground(Color.WHITE);
    formJPanel.add(button);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String xText = textFieldX.getText();
        String yText = textFieldY.getText();
        String zText = textFieldZ.getText();
        try {
          float x = Float.parseFloat(xText);
          float y = Float.parseFloat(yText);
          float z = Float.parseFloat(zText);
          triangulo = new Triangulo(x, y, z);
          triangulo.getTipoTriangulo();
          updateImage();

          textFieldX.setText("");
          textFieldY.setText("");
          textFieldZ.setText("");

        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null, "Input inválido.");
          textFieldX.setText("");
          textFieldY.setText("");
          textFieldZ.setText("");
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
