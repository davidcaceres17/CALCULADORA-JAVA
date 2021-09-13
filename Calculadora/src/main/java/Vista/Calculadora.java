package Vista;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.image.ImageObserver.PROPERTIES;
import static java.awt.image.ImageObserver.SOMEBITS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author justo
 */
public class Calculadora extends javax.swing.JFrame {
    
    String memoria1;
    String signo;
    String memoria2;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        txt_operacion.setEditable(false);
        vertexto();
        lbl_realizando.setVisible(false); 
        lbl_sign.setVisible(false); 
        lbl_realizando2.setVisible(false); 
        lbl_realizado.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lbl_ver_operacion = new javax.swing.JLabel();
        txt_operacion = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_cambiar_signo = new javax.swing.JButton();
        lbl_realizando = new javax.swing.JLabel();
        lbl_realizado = new javax.swing.JLabel();
        lbl_sign = new javax.swing.JLabel();
        lbl_realizando2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcNuevo = new javax.swing.JMenuItem();
        opcHistorial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcManual_Usuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Justo Caceres");

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        lbl_ver_operacion.setText("Operacion");

        txt_operacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_operacionKeyTyped(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(102, 102, 255));
        btn_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(102, 102, 255));
        btn_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(102, 102, 255));
        btn_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(102, 102, 255));
        btn_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(102, 102, 255));
        btn_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(102, 102, 255));
        btn_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(102, 102, 255));
        btn_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(102, 102, 255));
        btn_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(102, 102, 255));
        btn_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(102, 102, 255));
        btn_0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_punto.setBackground(new java.awt.Color(102, 102, 255));
        btn_punto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_igual.setBackground(new java.awt.Color(102, 102, 255));
        btn_igual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_suma.setBackground(new java.awt.Color(102, 102, 255));
        btn_suma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_resta.setBackground(new java.awt.Color(102, 102, 255));
        btn_resta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicacion.setBackground(new java.awt.Color(102, 102, 255));
        btn_multiplicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setBackground(new java.awt.Color(102, 102, 255));
        btn_division.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(102, 102, 255));
        btn_borrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_borrar.setText("C");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_nuevo.setBackground(new java.awt.Color(102, 102, 255));
        btn_nuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_nuevo.setText("CE");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_cambiar_signo.setBackground(new java.awt.Color(102, 102, 255));
        btn_cambiar_signo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cambiar_signo.setText("+/-");
        btn_cambiar_signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiar_signoActionPerformed(evt);
            }
        });

        lbl_realizando.setText("000");

        lbl_realizado.setText("jLabel1");

        lbl_sign.setText("jLabel1");

        lbl_realizando2.setText("jLabel1");

        escritorio.setLayer(lbl_ver_operacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txt_operacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_punto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_igual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_suma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_resta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_multiplicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_division, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_nuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btn_cambiar_signo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lbl_realizando, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lbl_realizado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lbl_sign, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lbl_realizando2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_operacion)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cambiar_signo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_ver_operacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_realizando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_realizando2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_realizado)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ver_operacion)
                    .addComponent(lbl_realizando)
                    .addComponent(lbl_realizado)
                    .addComponent(lbl_sign)
                    .addComponent(lbl_realizando2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cambiar_signo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Opciones");

        opcNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opcNuevo.setText("Nuevo");
        opcNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(opcNuevo);

        opcHistorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opcHistorial.setText("Historial");
        opcHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcHistorialActionPerformed(evt);
            }
        });
        jMenu1.add(opcHistorial);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        opcManual_Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opcManual_Usuario.setText("Manual de usuario");
        opcManual_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcManual_UsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(opcManual_Usuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"1");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"2");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"3");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"4");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"5");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"6");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"7");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"8");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"9");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+"0");
        lbl_realizando.setVisible(true); 
        lbl_realizando.setText("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        String cadena;
        cadena=txt_operacion.getText();
        
        if (cadena.length()<=0) {
            txt_operacion.setText("0.");
            
        }
        else{
            if (!existepunto(txt_operacion.getText())) {
                txt_operacion.setText(txt_operacion.getText()+".");
                lbl_realizando.setVisible(true); 
                lbl_realizando.setText(lbl_realizando.getText()+".");
                                
            }
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        if (!txt_operacion.getText().equals("")) {
            memoria1=txt_operacion.getText();
            signo="+";
            txt_operacion.setText("");
            lbl_sign.setVisible(true); 
            lbl_sign.setText("+");
        }
       
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        if (!txt_operacion.getText().equals("")) {
            memoria1=txt_operacion.getText();
            signo="-";
            txt_operacion.setText("");
            lbl_sign.setVisible(true); 
            lbl_sign.setText("-");
        }
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        if (!txt_operacion.getText().equals("")) {
            memoria1=txt_operacion.getText();
            signo="*";
            txt_operacion.setText("");
            lbl_sign.setVisible(true); 
            lbl_sign.setText("*");
        }
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        if (!txt_operacion.getText().equals("")) {
            memoria1=txt_operacion.getText();
            signo="/";
            txt_operacion.setText("");
            lbl_sign.setVisible(true); 
            lbl_sign.setText("/");
        }
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        String cadena;
        cadena=txt_operacion.getText();
        
        if (cadena.length()>0) {
            cadena=cadena.substring(0, cadena.length()-1);
            txt_operacion.setText(cadena);
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        txt_operacion.setText("");
        lbl_realizando.setVisible(false); 
        lbl_sign.setVisible(false); 
        lbl_realizando2.setVisible(false); 
        lbl_realizado.setVisible(false); 
        //-----------------------------
        //Escribiendo en el archivo nuevo
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("bitacoraCalculadora.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("-------------");
                linea.println("Nuevo");
                linea.println("-------------");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("-------------");
                linea.println("Nuevo");
                linea.println("-------------");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cambiar_signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_signoActionPerformed
        Double num;
        String cadena;
        cadena=txt_operacion.getText();
        if (cadena.length()>0) {
            num=(-1)*Double.parseDouble(cadena);
            txt_operacion.setText(num.toString());
        }
    }//GEN-LAST:event_btn_cambiar_signoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        String resultado;
        String ig = "=";
        memoria2=txt_operacion.getText();
      
        if (!memoria2.equals("")) {
            resultado=calculadora(memoria1,memoria2,signo);
            txt_operacion.setText(resultado);
            lbl_realizado.setVisible(true); 
            lbl_realizado.setText(memoria1 + signo + memoria2 + ig + resultado);
        }
        
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void txt_operacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_operacionKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
            txt_operacion.select(SOMEBITS, PROPERTIES);
        }
    }//GEN-LAST:event_txt_operacionKeyTyped

    private void opcHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcHistorialActionPerformed
        Historial ventanaHistorial = new Historial();
        escritorio.add(ventanaHistorial);
        ventanaHistorial.show();
    }//GEN-LAST:event_opcHistorialActionPerformed

   
    private void opcNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcNuevoActionPerformed
        txt_operacion.setText("");
        lbl_realizando.setVisible(false); 
        lbl_sign.setVisible(false); 
        lbl_realizando2.setVisible(false); 
        lbl_realizado.setVisible(false); 
        //-----------------------------
        //Escribiendo en el archivo nuevo
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("bitacoraCalculadora.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("-------------");
                linea.println("Nuevo");
                linea.println("-------------");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println("-------------");
                linea.println("Nuevo");
                linea.println("-------------");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_opcNuevoActionPerformed

    private void opcManual_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcManual_UsuarioActionPerformed
        abrirarchivo("README.pdf");
    }//GEN-LAST:event_opcManual_UsuarioActionPerformed

    
    //=============================
    //--------Metodos agregados----
    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado=true;
                break;           
            }
            
        }
        return resultado;           
    }
    
    
    public static String calculadora(String memoria1,String memoria2,String signo){
        Double resultado=0.0;
        String respuesta;


        if (signo.equals("-")) {
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);

        }
        if (signo.equals("+")) {
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);

        }
        if (signo.equals("*")) {
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

        }
        if (signo.equals("/")) {
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);

        }

        respuesta=resultado.toString();


        //-----------------------------
        //Escribiendo en el historial
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            archivo = new File("bitacoraCalculadora.txt");
            if(!archivo.exists()){
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    linea.println(memoria1 + signo + memoria2 + "=" + resultado);
                    linea.println("-------------");
                    linea.println("\r\n");
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {

                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    linea.println(memoria1 + signo + memoria2 + "=" + resultado);
                    linea.println("-------------");
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        return respuesta;
        
    }
    
    
    public void abrirarchivo(String archivo){
        try {

               File objetofile = new File (archivo);
               Desktop.getDesktop().open(objetofile);

        }catch (IOException ex) {

               System.out.println(ex);

        }
    }
    
    public void vertexto(){
      
        KeyListener escucharTeclado=new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 //campoTexto2.setText("Metodo 1");
            }

            @Override
            public void keyPressed(KeyEvent e) {
              // campoTexto2.setText("Metodo 2");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyChar() == '1'){
                    txt_operacion.setText(txt_operacion.getText()+"1");  
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("1");
                }
                if(e.getKeyChar() == '2'){
                    txt_operacion.setText(txt_operacion.getText()+"2");
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("2");
                }
                if(e.getKeyChar() == '3'){
                    txt_operacion.setText(txt_operacion.getText()+"3");
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("3");
                }
                if(e.getKeyChar() == '4'){
                    txt_operacion.setText(txt_operacion.getText()+"4");  
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("4");
                }
                if(e.getKeyChar() == '5'){
                    txt_operacion.setText(txt_operacion.getText()+"5");
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("5");
                }
                if(e.getKeyChar() == '6'){
                    txt_operacion.setText(txt_operacion.getText()+"6"); 
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("6");
                }
                if(e.getKeyChar() == '7'){
                    txt_operacion.setText(txt_operacion.getText()+"7");
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("7");
                }
                if(e.getKeyChar() == '8'){
                    txt_operacion.setText(txt_operacion.getText()+"8");   
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("8");
                }
                if(e.getKeyChar() == '9'){
                    txt_operacion.setText(txt_operacion.getText()+"9");
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("9");
                }
                if(e.getKeyChar() == '0'){
                    txt_operacion.setText(txt_operacion.getText()+"0"); 
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText("0");
                }
                if(e.getKeyChar() == '.'){
                    txt_operacion.setText(txt_operacion.getText()+"."); 
                      Toolkit.getDefaultToolkit().beep();
                      lbl_realizando.setVisible(true); 
                      lbl_realizando.setText(".");
                }
                if(e.getKeyChar() == '+'){
                    if (!txt_operacion.getText().equals("")) {
                        memoria1=txt_operacion.getText();
                        signo="+";
                        txt_operacion.setText("");
                    }    
                   
                      Toolkit.getDefaultToolkit().beep();
                      lbl_sign.setVisible(true); 
                      lbl_sign.setText("+");
                }
                if(e.getKeyChar() == '*'){
                    if (!txt_operacion.getText().equals("")) {
                        memoria1=txt_operacion.getText();
                        signo="*";
                        txt_operacion.setText("");
                    }
                    Toolkit.getDefaultToolkit().beep();
                    lbl_sign.setVisible(true); 
                    lbl_sign.setText("*");
                }
                
                if(e.getKeyChar() == '/'){
                    if (!txt_operacion.getText().equals("")) {
                        memoria1=txt_operacion.getText();
                        signo="/";
                        txt_operacion.setText("");
                    }
                    Toolkit.getDefaultToolkit().beep();
                    lbl_sign.setVisible(true); 
                    lbl_sign.setText("/");
                }
                
                if(e.getKeyChar() == '-'){
                    if (!txt_operacion.getText().equals("")) {
                        memoria1=txt_operacion.getText();
                        signo="-";
                        txt_operacion.setText("");
                    }
                    Toolkit.getDefaultToolkit().beep();
                    lbl_sign.setVisible(true); 
                    lbl_sign.setText("-");
                }
                
            }
        
        };
        txt_operacion.addKeyListener(escucharTeclado);
        add(txt_operacion);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //=============================
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cambiar_signo;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_realizado;
    private javax.swing.JLabel lbl_realizando;
    private javax.swing.JLabel lbl_realizando2;
    private javax.swing.JLabel lbl_sign;
    private javax.swing.JLabel lbl_ver_operacion;
    private javax.swing.JMenuItem opcHistorial;
    private javax.swing.JMenuItem opcManual_Usuario;
    private javax.swing.JMenuItem opcNuevo;
    private javax.swing.JTextField txt_operacion;
    // End of variables declaration//GEN-END:variables
}
