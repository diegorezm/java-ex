
import Matriz.MatrizDeInteiros;
import javax.swing.JOptionPane;

public class views extends javax.swing.JFrame {

    MatrizDeInteiros matriz;

    public views() {
        initComponents();
    }

    public void setState(boolean state) {
        btn_limpar.setEnabled(state);
        btn_diagonal_principal.setEnabled(state);
        btn_diagonal_secundaria.setEnabled(state);
        btn_transposta.setEnabled(state);
        btn_localiza_valor.setEnabled(state);
        btn_soma.setEnabled(state);
        btn_soma_colunas.setEnabled(state);
        btn_soma_linhas.setEnabled(state);
        btn_e_simetrica.setEnabled(state);
        btn_valores_impar.setEnabled(state);
        btn_valores_par.setEnabled(state);
        btn_trocar_valores.setEnabled(state);
        btn_valores_impar.setEnabled(state);
        btn_valores_par.setEnabled(state);
        btn_substituir_par_impar.setEnabled(state);
        btn_valores_primos.setEnabled(state);
        btn_retornar_maior_valor.setEnabled(state);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModalLocaliza = new javax.swing.JDialog();
        textfield_modal_localiza = new java.awt.TextField();
        label3 = new java.awt.Label();
        btn_modal_localizar = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        input_row = new java.awt.TextField();
        input_col = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        btn_def_matriz = new java.awt.Button();
        btn_diagonal_principal = new java.awt.Button();
        btn_limpar = new java.awt.Button();
        btn_transposta = new java.awt.Button();
        btn_diagonal_secundaria = new java.awt.Button();
        btn_localiza_valor = new java.awt.Button();
        btn_soma_linhas = new java.awt.Button();
        btn_soma = new java.awt.Button();
        btn_soma_colunas = new java.awt.Button();
        btn_e_simetrica = new java.awt.Button();
        btn_sair = new java.awt.Button();
        btn_trocar_valores = new java.awt.Button();
        btn_valores_par = new java.awt.Button();
        btn_valores_impar = new java.awt.Button();
        btn_substituir_par_impar = new java.awt.Button();
        btn_valores_primos = new java.awt.Button();
        btn_retornar_maior_valor = new java.awt.Button();
        panel_resultado = new javax.swing.JPanel();
        textarea_results = new java.awt.TextArea();

        ModalLocaliza.setModal(true);

        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setText("Numero:");

        btn_modal_localizar.setLabel("Enviar");
        btn_modal_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modal_localizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModalLocalizaLayout = new javax.swing.GroupLayout(ModalLocaliza.getContentPane());
        ModalLocaliza.getContentPane().setLayout(ModalLocalizaLayout);
        ModalLocalizaLayout.setHorizontalGroup(
            ModalLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModalLocalizaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(ModalLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modal_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_modal_localiza, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        ModalLocalizaLayout.setVerticalGroup(
            ModalLocalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModalLocalizaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_modal_localiza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_modal_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                window_open(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamanho da matriz: "));

        input_row.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                linhasInputKeyTyped(evt);
            }
        });

        input_col.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colunasInputKeyTyped(evt);
            }
        });

        label1.setText("Linhas: ");

        label2.setText("Colunas: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_row, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_col, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_row, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_col, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        btn_def_matriz.setLabel("Definir matriz");
        btn_def_matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_def_matrizActionPerformed(evt);
            }
        });

        btn_diagonal_principal.setLabel("Diagonal principal");
        btn_diagonal_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diagonal_principalActionPerformed(evt);
            }
        });

        btn_limpar.setLabel("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_transposta.setLabel("Transposta");
        btn_transposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transpostaActionPerformed(evt);
            }
        });

        btn_diagonal_secundaria.setLabel("Diagonal secundaria");
        btn_diagonal_secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diagonal_secundariaActionPerformed(evt);
            }
        });

        btn_localiza_valor.setLabel("Localiza valor");
        btn_localiza_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localiza_valorActionPerformed(evt);
            }
        });

        btn_soma_linhas.setLabel("Somar linhas");
        btn_soma_linhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soma_linhasActionPerformed(evt);
            }
        });

        btn_soma.setLabel("Soma dos valores");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_soma_colunas.setLabel("Somar colunas");
        btn_soma_colunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soma_colunasActionPerformed(evt);
            }
        });

        btn_e_simetrica.setLabel("É simetrica");
        btn_e_simetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_e_simetricaActionPerformed(evt);
            }
        });

        btn_sair.setLabel("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_trocar_valores.setLabel("Trocar valores");
        btn_trocar_valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trocar_valoresActionPerformed(evt);
            }
        });

        btn_valores_par.setLabel("Valores par");
        btn_valores_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valores_parActionPerformed(evt);
            }
        });

        btn_valores_impar.setLabel("Valores impar");
        btn_valores_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valores_imparActionPerformed(evt);
            }
        });

        btn_substituir_par_impar.setLabel("Substituir par e impar");
        btn_substituir_par_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_substituir_par_imparActionPerformed(evt);
            }
        });

        btn_valores_primos.setLabel("valores primos");
        btn_valores_primos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valores_primosActionPerformed(evt);
            }
        });

        btn_retornar_maior_valor.setLabel("Maior valor");
        btn_retornar_maior_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retornar_maior_valorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_retornar_maior_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_valores_impar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_e_simetrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_soma_colunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_soma_linhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_transposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_localiza_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_diagonal_secundaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_diagonal_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_def_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_trocar_valores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_valores_par, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_substituir_par_impar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_valores_primos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_def_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_diagonal_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_diagonal_secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_localiza_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_transposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_soma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_soma_linhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_soma_colunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_e_simetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_trocar_valores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_valores_par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_valores_impar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_valores_primos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_substituir_par_impar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_retornar_maior_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panel_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado: "));

        textarea_results.setColumns(8);
        textarea_results.setEditable(false);
        textarea_results.setRows(5);

        javax.swing.GroupLayout panel_resultadoLayout = new javax.swing.GroupLayout(panel_resultado);
        panel_resultado.setLayout(panel_resultadoLayout);
        panel_resultadoLayout.setHorizontalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textarea_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_resultadoLayout.setVerticalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textarea_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 266, Short.MAX_VALUE))
                    .addComponent(panel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        matriz.Limpar();
        textarea_results.setText("Limpo!");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_transpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transpostaActionPerformed
        textarea_results.append(matriz.dados(matriz.matrizTransposta(), "A matriz transposta é:\n"));
    }//GEN-LAST:event_btn_transpostaActionPerformed

    private void btn_def_matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_def_matrizActionPerformed
        String col_raw = input_col.getText();
        String row_raw = input_row.getText();
        if (row_raw.isEmpty() || col_raw.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Os campos 'linha' e 'coluna' precisam ser preenchidos.", "Aviso", 0);
            return;
        }
        int col = Integer.parseInt(col_raw);
        int row = Integer.parseInt(row_raw);
        matriz = new MatrizDeInteiros(col, row);
        matriz.gerarMatriz();
        setState(true);
        textarea_results.setText(matriz.dados());
        input_col.setText("");
        input_row.setText("");
    }//GEN-LAST:event_btn_def_matrizActionPerformed

    private void btn_diagonal_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diagonal_principalActionPerformed
        int[][] matriz_d = matriz.diagonalPrincipal();
        textarea_results.setText(matriz.dados(matriz_d));
    }//GEN-LAST:event_btn_diagonal_principalActionPerformed

    private void window_open(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_window_open
        setState(false);
    }//GEN-LAST:event_window_open

    private void btn_diagonal_secundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diagonal_secundariaActionPerformed
        int[][] matriz_d = matriz.diagonalSecundaria();
        textarea_results.setText(matriz.dados(matriz_d));

    }//GEN-LAST:event_btn_diagonal_secundariaActionPerformed

    private void btn_modal_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modal_localizarActionPerformed
        String num_raw = textfield_modal_localiza.getText();
        int num = Integer.parseInt(num_raw);
        int[][] resultado = matriz.encontrarNumero(num);

        if (resultado != null) {
            textarea_results.setText(matriz.dados() + matriz.dados(resultado, "\nO número " + num + " foi encontrado nos indexes:\n"));

        } else {
            textarea_results.setText(matriz.dados() + "\nO número não foi encontrado...");
        }
        ModalLocaliza.dispose();
    }//GEN-LAST:event_btn_modal_localizarActionPerformed

    private void btn_localiza_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localiza_valorActionPerformed
        ModalLocaliza.setTitle("Localizar um número");
        ModalLocaliza.setSize(500, 220);
        ModalLocaliza.setVisible(true);
    }//GEN-LAST:event_btn_localiza_valorActionPerformed

    private void btn_soma_linhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soma_linhasActionPerformed
        textarea_results.setText(matriz.dados());
        int[] resultados = matriz.somaLinhas();
        textarea_results.append(matriz.dados(resultados, "A soma das linhas é: \n", "row"));

    }//GEN-LAST:event_btn_soma_linhasActionPerformed

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed
        textarea_results.setText(matriz.dados());
        textarea_results.append("A soma de todos os números é: \n" + matriz.somaTotal());
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_soma_colunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soma_colunasActionPerformed
        textarea_results.setText(matriz.dados());
        int[] resultados = matriz.somaColunas();
        textarea_results.append(matriz.dados(resultados, "A soma das colunas é: \n", "col"));
    }//GEN-LAST:event_btn_soma_colunasActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_e_simetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_e_simetricaActionPerformed
        boolean eSimetrica = matriz.eSimetrica();
        if (eSimetrica) {
            textarea_results.append("A matriz é simétrica.\n");
        } else {
            textarea_results.append("A matriz não é simétrica.\n");
        }
    }//GEN-LAST:event_btn_e_simetricaActionPerformed

    private void btn_trocar_valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trocar_valoresActionPerformed
        matriz.substituirLinha();
        textarea_results.setText(matriz.dados());
    }//GEN-LAST:event_btn_trocar_valoresActionPerformed

    private void btn_valores_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valores_imparActionPerformed
        int[] impar = matriz.valoresImpar();
        textarea_results.setText(matriz.dados(impar, "Valores impares: \n"));
    }//GEN-LAST:event_btn_valores_imparActionPerformed

    private void btn_valores_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valores_parActionPerformed
        int[] par = matriz.valoresPar();
        textarea_results.setText(matriz.dados(par, "Os valores pares: \n"));
    }//GEN-LAST:event_btn_valores_parActionPerformed

    private void btn_substituir_par_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_substituir_par_imparActionPerformed
        matriz.substituirImparPar();
        textarea_results.setText(matriz.dados());
    }//GEN-LAST:event_btn_substituir_par_imparActionPerformed

    private void btn_valores_primosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valores_primosActionPerformed
        int[] primos = matriz.valoresPrimos();
        textarea_results.setText(matriz.dados(primos, "Os valores primos são: \n"));
    }//GEN-LAST:event_btn_valores_primosActionPerformed

    private void btn_retornar_maior_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retornar_maior_valorActionPerformed
        int maiorValor = matriz.maiorValor();
        textarea_results.setText(matriz.dados(maiorValor, "O maior valor é:  "));
    }//GEN-LAST:event_btn_retornar_maior_valorActionPerformed

    private void linhasInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linhasInputKeyTyped
        char tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla)) {
            if (tecla != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_linhasInputKeyTyped

    private void colunasInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colunasInputKeyTyped
        char tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla)) {
            if (tecla != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_colunasInputKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new views().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ModalLocaliza;
    private java.awt.Button btn_def_matriz;
    private java.awt.Button btn_diagonal_principal;
    private java.awt.Button btn_diagonal_secundaria;
    private java.awt.Button btn_e_simetrica;
    private java.awt.Button btn_limpar;
    private java.awt.Button btn_localiza_valor;
    private java.awt.Button btn_modal_localizar;
    private java.awt.Button btn_retornar_maior_valor;
    private java.awt.Button btn_sair;
    private java.awt.Button btn_soma;
    private java.awt.Button btn_soma_colunas;
    private java.awt.Button btn_soma_linhas;
    private java.awt.Button btn_substituir_par_impar;
    private java.awt.Button btn_transposta;
    private java.awt.Button btn_trocar_valores;
    private java.awt.Button btn_valores_impar;
    private java.awt.Button btn_valores_par;
    private java.awt.Button btn_valores_primos;
    private java.awt.TextField input_col;
    private java.awt.TextField input_row;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPanel panel_resultado;
    private java.awt.TextArea textarea_results;
    private java.awt.TextField textfield_modal_localiza;
    // End of variables declaration//GEN-END:variables
}
