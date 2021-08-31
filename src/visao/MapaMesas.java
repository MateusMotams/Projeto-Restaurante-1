/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import gerenciamento.de.mesas.de.restaurante.gmr.Mesa;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.SEGURANÇA;
import javax.swing.JOptionPane;


/**
 *
 * @author laram
 */
public class MapaMesas extends javax.swing.JFrame {
    public Mesa[][] matMesa;
    

    /**
     * Creates new form MapaMesas
     * @param vetMesa
     */
    private MapaMesas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MapaMesas(Mesa matMesa[][]) {
        initComponents();
        this.matMesa = matMesa;
        label1.setText("" + this.matMesa[0][0].getEstadoAtual());
        label2.setText("" + this.matMesa[0][1].getEstadoAtual());
        label3.setText("" + this.matMesa[0][2].getEstadoAtual());
        label4.setText("" + this.matMesa[0][3].getEstadoAtual());
        label5.setText("" + this.matMesa[0][4].getEstadoAtual());
        label6.setText("" + this.matMesa[0][5].getEstadoAtual());
        label7.setText("" + this.matMesa[1][0].getEstadoAtual());
        label8.setText("" + this.matMesa[1][1].getEstadoAtual());
        label9.setText("" + this.matMesa[1][2].getEstadoAtual());
        label10.setText("" + this.matMesa[1][3].getEstadoAtual());
        label11.setText("" + this.matMesa[1][4].getEstadoAtual());
        label12.setText("" + this.matMesa[1][5].getEstadoAtual());
        label13.setText("" + this.matMesa[2][0].getEstadoAtual());
        label14.setText("" + this.matMesa[2][1].getEstadoAtual());
        label15.setText("" + this.matMesa[2][2].getEstadoAtual());
        label16.setText("" + this.matMesa[2][3].getEstadoAtual());
        label17.setText("" + this.matMesa[2][4].getEstadoAtual());
        label18.setText("" + this.matMesa[2][5].getEstadoAtual());
        label19.setText("" + this.matMesa[3][0].getEstadoAtual());
        label20.setText("" + this.matMesa[3][1].getEstadoAtual());
        label21.setText("" + this.matMesa[3][2].getEstadoAtual());
        label22.setText("" + this.matMesa[3][3].getEstadoAtual());
        label23.setText("" + this.matMesa[3][4].getEstadoAtual());
        label24.setText("" + this.matMesa[3][5].getEstadoAtual());
        label25.setText("" + this.matMesa[4][0].getEstadoAtual());
        label26.setText("" + this.matMesa[4][1].getEstadoAtual());
        label27.setText("" + this.matMesa[4][2].getEstadoAtual());
        label28.setText("" + this.matMesa[4][3].getEstadoAtual());
        label29.setText("" + this.matMesa[4][4].getEstadoAtual());
        label30.setText("" + this.matMesa[4][5].getEstadoAtual());
        
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MESA1 = new javax.swing.JButton();
        MESA2 = new javax.swing.JButton();
        MESA3 = new javax.swing.JButton();
        MESA4 = new javax.swing.JButton();
        MESA5 = new javax.swing.JButton();
        mesa9 = new javax.swing.JButton();
        mesa10 = new javax.swing.JButton();
        mesa14 = new javax.swing.JButton();
        mesa15 = new javax.swing.JButton();
        MESA6 = new javax.swing.JButton();
        MESA7 = new javax.swing.JButton();
        mesa8 = new javax.swing.JButton();
        mesa11 = new javax.swing.JButton();
        mesa12 = new javax.swing.JButton();
        mesa13 = new javax.swing.JButton();
        mesa16 = new javax.swing.JButton();
        mesa17 = new javax.swing.JButton();
        mesa18 = new javax.swing.JButton();
        mesa19 = new javax.swing.JButton();
        mesa20 = new javax.swing.JButton();
        mesa21 = new javax.swing.JButton();
        mesa22 = new javax.swing.JButton();
        mesa23 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        mesa24 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        mesa25 = new javax.swing.JButton();
        mesa26 = new javax.swing.JButton();
        mesa27 = new javax.swing.JButton();
        mesa28 = new javax.swing.JButton();
        mesa29 = new javax.swing.JButton();
        mesa30 = new javax.swing.JButton();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        label23 = new java.awt.Label();
        label24 = new java.awt.Label();
        label25 = new java.awt.Label();
        label26 = new java.awt.Label();
        label27 = new java.awt.Label();
        label28 = new java.awt.Label();
        label29 = new java.awt.Label();
        label30 = new java.awt.Label();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE MESAS DE RESTAURANTE (GMR) ");

        MESA1.setText("MESA 01");
        MESA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA1ActionPerformed(evt);
            }
        });

        MESA2.setText("MESA 02");
        MESA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA2ActionPerformed(evt);
            }
        });

        MESA3.setText("MESA 03");
        MESA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA3ActionPerformed(evt);
            }
        });

        MESA4.setText("MESA 04");
        MESA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA4ActionPerformed(evt);
            }
        });

        MESA5.setText("MESA 05");
        MESA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA5ActionPerformed(evt);
            }
        });

        mesa9.setText("MESA 09");
        mesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa9ActionPerformed(evt);
            }
        });

        mesa10.setText("MESA 10");
        mesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa10ActionPerformed(evt);
            }
        });

        mesa14.setText("MESA 14");
        mesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa14ActionPerformed(evt);
            }
        });

        mesa15.setText("MESA 15");
        mesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa15ActionPerformed(evt);
            }
        });

        MESA6.setText("MESA 06");
        MESA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA6ActionPerformed(evt);
            }
        });

        MESA7.setText("MESA 07");
        MESA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA7ActionPerformed(evt);
            }
        });

        mesa8.setText("MESA 08");
        mesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa8ActionPerformed(evt);
            }
        });

        mesa11.setText("MESA 11");
        mesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa11ActionPerformed(evt);
            }
        });

        mesa12.setText("MESA 12");
        mesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa12ActionPerformed(evt);
            }
        });

        mesa13.setText("MESA 13");
        mesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa13ActionPerformed(evt);
            }
        });

        mesa16.setText("MESA 16");
        mesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa16ActionPerformed(evt);
            }
        });

        mesa17.setText("MESA 17");
        mesa17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa17ActionPerformed(evt);
            }
        });

        mesa18.setText("MESA 18");
        mesa18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa18ActionPerformed(evt);
            }
        });

        mesa19.setText("MESA 19");
        mesa19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa19ActionPerformed(evt);
            }
        });

        mesa20.setText("MESA 20");
        mesa20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa20ActionPerformed(evt);
            }
        });

        mesa21.setText("MESA 21");
        mesa21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa21ActionPerformed(evt);
            }
        });

        mesa22.setText("MESA 22");
        mesa22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa22ActionPerformed(evt);
            }
        });

        mesa23.setText("MESA 23");
        mesa23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa23ActionPerformed(evt);
            }
        });

        label1.setText("label1");

        mesa24.setText("MESA 24");
        mesa24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa24ActionPerformed(evt);
            }
        });

        label2.setText("label2");

        label3.setText("label3");

        label4.setText("label4");

        label5.setText("label5");

        label6.setText("label6");

        label7.setText("label7");

        mesa25.setText("MESA 25");
        mesa25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa25ActionPerformed(evt);
            }
        });

        mesa26.setText("MESA 26");
        mesa26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa26ActionPerformed(evt);
            }
        });

        mesa27.setText("MESA 27");
        mesa27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa27ActionPerformed(evt);
            }
        });

        mesa28.setText("MESA 28");
        mesa28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa28ActionPerformed(evt);
            }
        });

        mesa29.setText("MESA 29");
        mesa29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa29ActionPerformed(evt);
            }
        });

        mesa30.setText("MESA 30");
        mesa30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa30ActionPerformed(evt);
            }
        });

        label8.setText("label8");

        label9.setText("label9");

        label10.setText("label10");

        label11.setText("label11");

        label12.setText("label12");

        label13.setText("label13");

        label14.setText("label14");

        label15.setText("label15");

        label16.setText("label16");

        label17.setText("label17");

        label18.setText("label18");

        label19.setText("label19");

        label20.setText("label20");

        label21.setText("label21");

        label22.setText("label22");

        label23.setText("label23");

        label24.setText("label24");

        label25.setText("label25");

        label26.setText("label26");

        label27.setText("label27");

        label28.setText("label28");

        label29.setText("label29");

        label30.setText("label30");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MESA7)
                    .addComponent(mesa13)
                    .addComponent(mesa25)
                    .addComponent(MESA1)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MESA2)
                            .addComponent(mesa8)
                            .addComponent(mesa14)
                            .addComponent(mesa20)
                            .addComponent(mesa26)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(MESA3)
                                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(MESA4)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mesa9)
                                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mesa10))))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MESA5)
                                        .addComponent(mesa11)
                                        .addComponent(mesa17)
                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mesa15)
                                                .addComponent(mesa27))
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mesa22)
                                                .addComponent(mesa16)
                                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mesa29, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(mesa23, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mesa21)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mesa28)
                                            .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(135, 135, 135))))
                    .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MESA6)
                            .addComponent(mesa12)
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesa18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesa24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesa30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesa19)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MESA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MESA2)
                            .addComponent(MESA3)
                            .addComponent(MESA4)
                            .addComponent(MESA5)
                            .addComponent(MESA6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa8)
                    .addComponent(mesa9)
                    .addComponent(mesa10)
                    .addComponent(mesa11)
                    .addComponent(MESA7)
                    .addComponent(mesa12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesa13)
                            .addComponent(mesa14)
                            .addComponent(mesa15)
                            .addComponent(mesa18)
                            .addComponent(mesa16)
                            .addComponent(mesa17)))
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesa22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mesa19)
                                .addComponent(mesa20)
                                .addComponent(mesa21)
                                .addComponent(mesa24)
                                .addComponent(mesa23))))
                    .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(label23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesa25)
                            .addComponent(mesa26)
                            .addComponent(mesa27)
                            .addComponent(mesa28)
                            .addComponent(mesa29)
                            .addComponent(mesa30)))
                    .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(802, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mesa30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa30ActionPerformed
        if(matMesa[4][5].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][5].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][5].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 5);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 5;
            dispose();
        }
    }//GEN-LAST:event_mesa30ActionPerformed

    private void mesa29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa29ActionPerformed
        if(matMesa[4][4].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][4].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][4].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 4);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 4;
            dispose();
        }
    }//GEN-LAST:event_mesa29ActionPerformed

    private void mesa28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa28ActionPerformed
        if(matMesa[4][3].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][3].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][3].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 3);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 3;
            dispose();
        }
    }//GEN-LAST:event_mesa28ActionPerformed

    private void mesa27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa27ActionPerformed
        if(matMesa[4][2].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][2].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][2].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 2);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 2;
            dispose();
        }
    }//GEN-LAST:event_mesa27ActionPerformed

    private void mesa26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa26ActionPerformed
        if(matMesa[4][1].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][1].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 1);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 1;
            dispose();
        }
    }//GEN-LAST:event_mesa26ActionPerformed

    private void mesa25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa25ActionPerformed
        if(matMesa[4][0].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[4][0].getNumeroMesa() + " está bloqueada por " + this.matMesa[4][0].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 4, 0);
            jMesa1.setVisible(true);
            jMesa1.linha = 4;
            jMesa1.coluna = 0;
            dispose();
        }
    }//GEN-LAST:event_mesa25ActionPerformed

    private void mesa24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa24ActionPerformed
        if(matMesa[3][5].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][5].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][5].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 5);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 5;
            dispose();
        }
    }//GEN-LAST:event_mesa24ActionPerformed

    private void mesa23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa23ActionPerformed
        if(matMesa[3][4].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][4].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][4].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 4);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 4;
            dispose();
        }
    }//GEN-LAST:event_mesa23ActionPerformed

    private void mesa22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa22ActionPerformed
        if(matMesa[3][3].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][3].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][3].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 3);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 3;
            dispose();
        }
    }//GEN-LAST:event_mesa22ActionPerformed

    private void mesa21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa21ActionPerformed
        if(matMesa[3][2].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][2].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][2].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 2);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 2;
            dispose();
        }
    }//GEN-LAST:event_mesa21ActionPerformed

    private void mesa20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa20ActionPerformed
        if(matMesa[3][1].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][1].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 1);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 1;
            dispose();
        }
    }//GEN-LAST:event_mesa20ActionPerformed

    private void mesa19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa19ActionPerformed
        if(matMesa[3][0].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[3][0].getNumeroMesa() + " está bloqueada por " + this.matMesa[3][0].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 3, 0);
            jMesa1.setVisible(true);
            jMesa1.linha = 3;
            jMesa1.coluna = 0;
            dispose();
        }
    }//GEN-LAST:event_mesa19ActionPerformed

    private void mesa18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa18ActionPerformed
        if(matMesa[2][5].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][5].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][5].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 5);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 5;
            dispose();
        }
    }//GEN-LAST:event_mesa18ActionPerformed

    private void mesa17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa17ActionPerformed
        if(matMesa[2][4].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][4].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][4].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 4);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 4;
            dispose();
        }
    }//GEN-LAST:event_mesa17ActionPerformed

    private void mesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa16ActionPerformed
        if(matMesa[2][3].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][3].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][3].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 3);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 3;
            dispose();
        }
    }//GEN-LAST:event_mesa16ActionPerformed

    private void mesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa13ActionPerformed
        if(matMesa[2][0].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][0].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][0].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 0);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 0;
            dispose();
        }
    }//GEN-LAST:event_mesa13ActionPerformed

    private void mesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa12ActionPerformed
        if(matMesa[1][5].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][5].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][5].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 5);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 5;
            dispose();
        }
    }//GEN-LAST:event_mesa12ActionPerformed

    private void mesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa11ActionPerformed
        if(matMesa[1][4].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][4].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][4].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 4);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 4;
            dispose();
        }
    }//GEN-LAST:event_mesa11ActionPerformed

    private void mesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa8ActionPerformed
        if(matMesa[1][1].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][1].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 1);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 1;
            dispose();
        }
    }//GEN-LAST:event_mesa8ActionPerformed

    private void MESA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA7ActionPerformed
        if(matMesa[1][0].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][0].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][0].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 0);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 0;
            dispose();
        }
    }//GEN-LAST:event_MESA7ActionPerformed

    private void MESA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA6ActionPerformed
        if(matMesa[0][5].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][5].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][5].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 5);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 5;
            dispose();
        }
    }//GEN-LAST:event_MESA6ActionPerformed

    private void mesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa15ActionPerformed
        if(matMesa[2][2].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][2].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][2].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 2);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 2;
            dispose();
        }
    }//GEN-LAST:event_mesa15ActionPerformed

    private void mesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa14ActionPerformed
        if(matMesa[2][1].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[2][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[2][1].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 2, 1);
            jMesa1.setVisible(true);
            jMesa1.linha = 2;
            jMesa1.coluna = 1;
            dispose();
        }
    }//GEN-LAST:event_mesa14ActionPerformed

    private void mesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa10ActionPerformed
        if(matMesa[1][3].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][3].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][3].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 3);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 3;
            dispose();
        }
    }//GEN-LAST:event_mesa10ActionPerformed

    private void mesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa9ActionPerformed
        if(matMesa[1][2].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[1][2].getNumeroMesa() + " está bloqueada por " + this.matMesa[1][2].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 1, 2);
            jMesa1.setVisible(true);
            jMesa1.linha = 1;
            jMesa1.coluna = 2;
            dispose();
        }
    }//GEN-LAST:event_mesa9ActionPerformed

    private void MESA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA5ActionPerformed
        if(matMesa[0][4].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][4].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][4].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 4);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 4;
            dispose();
        }
    }//GEN-LAST:event_MESA5ActionPerformed

    private void MESA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA4ActionPerformed
        if(matMesa[0][3].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][3].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][3].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 3);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 3;
            dispose();
        }
    }//GEN-LAST:event_MESA4ActionPerformed

    private void MESA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA3ActionPerformed
        if(matMesa[0][2].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][2].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][2].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 2);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 2;
            dispose();
        }
    }//GEN-LAST:event_MESA3ActionPerformed

    private void MESA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA2ActionPerformed
        if(matMesa[0][1].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][1].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 1);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 1;
            dispose();
        }
    }//GEN-LAST:event_MESA2ActionPerformed

    private void MESA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA1ActionPerformed
        if(matMesa[0][0].getEstadoAtual() == SEGURANÇA){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][0].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][0].getEstadoAtual());
        } else {
            janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa, 0, 0);
            jMesa1.setVisible(true);
            jMesa1.linha = 0;
            jMesa1.coluna = 0;
            dispose();
        }
    }//GEN-LAST:event_MESA1ActionPerformed

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
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaMesas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MESA1;
    private javax.swing.JButton MESA2;
    private javax.swing.JButton MESA3;
    private javax.swing.JButton MESA4;
    private javax.swing.JButton MESA5;
    private javax.swing.JButton MESA6;
    private javax.swing.JButton MESA7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label26;
    private java.awt.Label label27;
    private java.awt.Label label28;
    private java.awt.Label label29;
    private java.awt.Label label3;
    private java.awt.Label label30;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JButton mesa10;
    private javax.swing.JButton mesa11;
    private javax.swing.JButton mesa12;
    private javax.swing.JButton mesa13;
    private javax.swing.JButton mesa14;
    private javax.swing.JButton mesa15;
    private javax.swing.JButton mesa16;
    private javax.swing.JButton mesa17;
    private javax.swing.JButton mesa18;
    private javax.swing.JButton mesa19;
    private javax.swing.JButton mesa20;
    private javax.swing.JButton mesa21;
    private javax.swing.JButton mesa22;
    private javax.swing.JButton mesa23;
    private javax.swing.JButton mesa24;
    private javax.swing.JButton mesa25;
    private javax.swing.JButton mesa26;
    private javax.swing.JButton mesa27;
    private javax.swing.JButton mesa28;
    private javax.swing.JButton mesa29;
    private javax.swing.JButton mesa30;
    private javax.swing.JButton mesa8;
    private javax.swing.JButton mesa9;
    // End of variables declaration//GEN-END:variables
}
