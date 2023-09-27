package view;

import classes.ArrayDeNumeros;
import javax.swing.JOptionPane;

public class TelaManipulaArrayDeInteiros extends javax.swing.JFrame {

    private ArrayDeNumeros objArrayDeNumeros;

    public TelaManipulaArrayDeInteiros() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDDefineTamanhoArray = new javax.swing.JDialog();
        jBConfirma = new javax.swing.JButton();
        jBTamanhoPadrao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFTamanhoArray = new javax.swing.JTextField();
        EditModal = new javax.swing.JDialog();
        jBconfirmModal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTFTnumTarget = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFTnumCH = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBAdiciona = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();

        jDDefineTamanhoArray.setTitle("Define a quantidade de elementos do array");
        jDDefineTamanhoArray.setResizable(false);

        jBConfirma.setText("Confirma");
        jBConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmaActionPerformed(evt);
            }
        });

        jBTamanhoPadrao.setText("Tamanho padrão");
        jBTamanhoPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTamanhoPadraoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Quantidade de elementos do array:");

        jTFTamanhoArray.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaCampo(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTamanhoArray, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFTamanhoArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDDefineTamanhoArrayLayout = new javax.swing.GroupLayout(jDDefineTamanhoArray.getContentPane());
        jDDefineTamanhoArray.getContentPane().setLayout(jDDefineTamanhoArrayLayout);
        jDDefineTamanhoArrayLayout.setHorizontalGroup(
            jDDefineTamanhoArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDefineTamanhoArrayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDDefineTamanhoArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBConfirma)
                    .addComponent(jBTamanhoPadrao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jDDefineTamanhoArrayLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBConfirma, jBTamanhoPadrao});

        jDDefineTamanhoArrayLayout.setVerticalGroup(
            jDDefineTamanhoArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDefineTamanhoArrayLayout.createSequentialGroup()
                .addGroup(jDDefineTamanhoArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDDefineTamanhoArrayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDDefineTamanhoArrayLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBConfirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBTamanhoPadrao)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jDDefineTamanhoArrayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBConfirma, jBTamanhoPadrao});

        EditModal.setTitle("Editar elementos");
        EditModal.setAlwaysOnTop(true);
        EditModal.setResizable(false);

        jBconfirmModal.setText("Confirma");
        jBconfirmModal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmModalActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Número para mudar");

        jTFTnumTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTnumTargetActionPerformed(evt);
            }
        });
        jTFTnumTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTnumTargetvalidaCampo(evt);
            }
        });

        jLabel6.setText("Número:");

        jTFTnumCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTnumCHActionPerformed(evt);
            }
        });
        jTFTnumCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTnumCHvalidaCampo(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTFTnumTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFTnumCH, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTnumTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTnumCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout EditModalLayout = new javax.swing.GroupLayout(EditModal.getContentPane());
        EditModal.getContentPane().setLayout(EditModalLayout);
        EditModalLayout.setHorizontalGroup(
            EditModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditModalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EditModalLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jBconfirmModal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditModalLayout.setVerticalGroup(
            EditModalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditModalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBconfirmModal)
                .addGap(12, 12, 12))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicativo para manipular Array Unidimensional - Vetor");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores:"));

        jLabel2.setText("Número:");

        jTFNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaCampo(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações:"));
        jPanel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        jBAdiciona.setText("Adiciona");
        jBAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionaActionPerformed(evt);
            }
        });

        jButton1.setText("Preenche coleção");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText(" Somar");
        jButton4.setActionCommand("Somar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar(evt);
            }
        });

        jButton5.setText(" Sort");
        jButton5.setActionCommand("Somar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(" Inverter");
        jButton6.setActionCommand("Inverter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(" Apenas par");
        jButton7.setActionCommand("Inverter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("é divisível?");
        jButton8.setActionCommand("Inverter");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Busca binaria");
        jButton9.setActionCommand("Inverter");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Main repetido");
        jButton10.setActionCommand("Inverter");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Substituir valor");
        jButton11.setActionCommand("Inverter");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Achar index");
        jButton12.setActionCommand("Inverter");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAdiciona, jButton1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBAdiciona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));
        jPResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        jTAResultado.setEditable(false);
        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setTabSize(3);
        jScrollPane1.setViewportView(jTAResultado);

        javax.swing.GroupLayout jPResultadoLayout = new javax.swing.GroupLayout(jPResultado);
        jPResultado.setLayout(jPResultadoLayout);
        jPResultadoLayout.setHorizontalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPResultadoLayout.setVerticalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validaCampo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validaCampo
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_validaCampo

    private void jBTamanhoPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTamanhoPadraoActionPerformed
        objArrayDeNumeros = new ArrayDeNumeros();
        this.setTitle("Aplicativo para manipular Array Unidimensional com " + objArrayDeNumeros.tamanhoColecao() + " números");
        jDDefineTamanhoArray.dispose();//finaliza a JDialog
    }//GEN-LAST:event_jBTamanhoPadraoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jDDefineTamanhoArray.setModal(true);
        jDDefineTamanhoArray.setSize(520, 150);
        jDDefineTamanhoArray.setLocationRelativeTo(this);
        jDDefineTamanhoArray.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void jBConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmaActionPerformed
        if (jTFTamanhoArray.getText().isEmpty() || Integer.parseInt(jTFTamanhoArray.getText()) < 2) {
            JOptionPane.showMessageDialog(this, "Informe um valor válido superior a 2", "Aviso", 0);
            jTFTamanhoArray.setText(null);
            jTFTamanhoArray.requestFocusInWindow();
            return;
        }
        objArrayDeNumeros = new ArrayDeNumeros(Integer.parseInt(jTFTamanhoArray.getText()));
        this.setTitle("Aplicativo para manipular Array Unidimensional com " + objArrayDeNumeros.tamanhoColecao() + " números");
        jDDefineTamanhoArray.dispose();//finaliza a JDialog
    }//GEN-LAST:event_jBConfirmaActionPerformed

    private void jBAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionaActionPerformed
        if (jTFNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um número", "Aviso", 0);
            jTFNumero.requestFocusInWindow();
            return;
        }
        if (!objArrayDeNumeros.adiciona(Integer.parseInt(jTFNumero.getText()))) {
            JOptionPane.showMessageDialog(this, "Não há mais espaço disponível (Overflow)!", "Aviso", 0);
        } else {
            jTFNumero.requestFocusInWindow();
            jTAResultado.setText(objArrayDeNumeros.histograma());
        }
        jTFNumero.setText(null);
    }//GEN-LAST:event_jBAdicionaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objArrayDeNumeros.cleanColect();
        objArrayDeNumeros.randomColect();
        jTAResultado.setText(objArrayDeNumeros.histograma());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        objArrayDeNumeros.cleanColect();
        jTAResultado.setText(objArrayDeNumeros.histograma());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void somar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar
        jTAResultado.setText(objArrayDeNumeros.histograma() + "=  " + objArrayDeNumeros.somar());
    }//GEN-LAST:event_somar

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTAResultado.setText(objArrayDeNumeros.histograma(objArrayDeNumeros.sort()));

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTAResultado.setText(objArrayDeNumeros.histograma(objArrayDeNumeros.inverter()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTAResultado.setText(objArrayDeNumeros.histograma(objArrayDeNumeros.valoresPar()));

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jTFNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um número", "Aviso", 0);
            jTFNumero.requestFocusInWindow();
            return;
        } else {
            jTFNumero.requestFocusInWindow();
            int[] eDivisivel = objArrayDeNumeros.eDivisivel(Integer.parseInt(jTFNumero.getText()));
            jTAResultado.setText(objArrayDeNumeros.histograma(eDivisivel));
        }
        jTFNumero.setText(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        objArrayDeNumeros.sort();
        if (jTFNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um número", "Aviso", 0);
            jTFNumero.requestFocusInWindow();
            return;
        }
        try {
            int busca = objArrayDeNumeros.binarySearch(Integer.parseInt(jTFNumero.getText()));
            if (busca == -1) {
                throw new Exception("Valor não encontrado!");
            }
            jTAResultado.setText(objArrayDeNumeros.histograma(busca));
        } catch (Exception e) {
            jTAResultado.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        objArrayDeNumeros.sort();
        int num = objArrayDeNumeros.maisRepetido();
        jTAResultado.setText(objArrayDeNumeros.histograma(num));

    }//GEN-LAST:event_jButton10ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EditModal.setSize(500, 200);
        EditModal.setLocationRelativeTo(this);
        EditModal.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jBconfirmModalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmModalActionPerformed
        String raw_target = jTFTnumTarget.getText().replaceAll("\\s+", "");
        String raw_num = jTFTnumCH.getText().replaceAll("\\s+", "");
        if (jTFTnumTarget.getText().isEmpty() || jTFTnumCH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um número", "Aviso", 0);
            jTFNumero.requestFocusInWindow();
            return;
        }

        int target = Integer.parseInt(raw_target);
        int num = Integer.parseInt(raw_num);

        try {
            objArrayDeNumeros.subistituir(target, num);
            jTAResultado.setText(objArrayDeNumeros.histograma());

        } catch (Exception e) {
            jTAResultado.setText(e.getMessage());

        } finally {
            jTFTnumCH.setText("");
            jTFTnumTarget.setText("");
            EditModal.dispose();

        }
    }//GEN-LAST:event_jBconfirmModalActionPerformed

    private void jTFTnumTargetvalidaCampo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTnumTargetvalidaCampo
    }//GEN-LAST:event_jTFTnumTargetvalidaCampo

    private void jTFTnumTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTnumTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTnumTargetActionPerformed

    private void jTFTnumCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTnumCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTnumCHActionPerformed

    private void jTFTnumCHvalidaCampo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTnumCHvalidaCampo
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTnumCHvalidaCampo

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTFNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um número", "Aviso", 0);
            jTFNumero.requestFocusInWindow();
            return;
        }
        int target = Integer.parseInt(jTFNumero.getText());
        
        try {
            jTAResultado.setText(objArrayDeNumeros.dados(objArrayDeNumeros.findIndex(target)));

        } catch (Exception e) {
            jTAResultado.setText(e.getMessage());
        }


    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayDeInteiros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayDeInteiros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayDeInteiros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayDeInteiros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManipulaArrayDeInteiros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog EditModal;
    private javax.swing.JButton jBAdiciona;
    private javax.swing.JButton jBConfirma;
    private javax.swing.JButton jBTamanhoPadrao;
    private javax.swing.JButton jBconfirmModal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDDefineTamanhoArray;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFTamanhoArray;
    private javax.swing.JTextField jTFTnumCH;
    private javax.swing.JTextField jTFTnumTarget;
    // End of variables declaration//GEN-END:variables
}
