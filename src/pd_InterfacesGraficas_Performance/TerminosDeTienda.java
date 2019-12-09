/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance;

/**
Propiedad: Colectiva de uso gratuito público
Desarrollado por: Sebastian Viscarra, Autor y compilador del proyecto PX para red social discreta de aplicación.
Todo el contenido de esta aplicación excepto los logos de PD y PX design son 100% editables para todo el desarrollo colectivo de cualquier usuario de información.
Así como su libre edición y utilización es 100% responsabilidad de cada usuario como utilice o mal utilice esta plataforma para fines comerciales o lucrativos. 
El contenido de esta plataforma está disponible desde su origen de forma libre y gratuita y de ser vendido o redistribuido por usuarios externos que no den soporte a sus clientes, 
PD y PX design no se hace responsable de dar soporte a ningún usuario que haya obtenido esta plataforma desde otro medio. 
Usted puede aprender como realizar esta plataforma desde su origen hasta su final de forma pratica 100% gratuita en el siguiente enlace:
https://www.youtube.com/watch?v=nqPzNS-pARY&list=PLshdAl3NxgtfaAB1Ef2I4McKfEulp6P9i
 */
public class TerminosDeTienda extends javax.swing.JFrame {

    /**
     * Creates new form TerminosDeTienda
     */
    public TerminosDeTienda() {
        initComponents();
        panel_Crear.setVisible(false);
        btnAtras.setVisible(false);
        this.setLocationRelativeTo(null);
       
    }

    //////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panel_Terminos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        panel_Botones = new javax.swing.JPanel();
        btnAdelante = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        panel_Crear = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        cLabel1 = new com.bolivia.label.CLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(28, 28, 28));

        panel_Terminos.setOpaque(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/terminosDeTienda.jpg"))); // NOI18N
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout panel_TerminosLayout = new javax.swing.GroupLayout(panel_Terminos);
        panel_Terminos.setLayout(panel_TerminosLayout);
        panel_TerminosLayout.setHorizontalGroup(
            panel_TerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_TerminosLayout.setVerticalGroup(
            panel_TerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        panel_Botones.setOpaque(false);
        panel_Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/siguiente1.png"))); // NOI18N
        btnAdelante.setBorder(null);
        btnAdelante.setBorderPainted(false);
        btnAdelante.setContentAreaFilled(false);
        btnAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdelante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/siguiente2.png"))); // NOI18N
        btnAdelante.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/siguiente2.png"))); // NOI18N
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        panel_Botones.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 60));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/atras1.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/atras2.png"))); // NOI18N
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/atras2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        panel_Botones.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        panel_Crear.setBackground(new java.awt.Color(28, 28, 28));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btncrearTienda1.jpg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btncrearTienda2.jpg"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btncrearTienda2.jpg"))); // NOI18N

        cLabel1.setBackground(new java.awt.Color(51, 51, 51));
        cLabel1.setText("");
        cLabel1.setLineColor(new java.awt.Color(28, 28, 28));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Identidad de usuario");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Propietario de la tienda");

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jTextArea1.setBackground(new java.awt.Color(37, 37, 37));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(112, 112, 112));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("descripcion sobre lo que vendes.");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Comenta a que tipo de usuarios esta orientada tu tienda, y añade una ");

        javax.swing.GroupLayout panel_CrearLayout = new javax.swing.GroupLayout(panel_Crear);
        panel_Crear.setLayout(panel_CrearLayout);
        panel_CrearLayout.setHorizontalGroup(
            panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_CrearLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_CrearLayout.createSequentialGroup()
                                .addComponent(cLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_CrearLayout.setVerticalGroup(
            panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_CrearLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Terminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel_Terminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(91, 91, 91)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 483, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        panel_Crear.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        panel_Terminos.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        btnAdelante.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        btnAtras.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       panel_Crear.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
       panel_Terminos.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
       btnAtras.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
       btnAdelante.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TerminosDeTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminosDeTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminosDeTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminosDeTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminosDeTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAdelante;
    public static javax.swing.JButton btnAtras;
    private com.bolivia.label.CLabel cLabel1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panel_Botones;
    public static javax.swing.JPanel panel_Crear;
    public static javax.swing.JPanel panel_Terminos;
    // End of variables declaration//GEN-END:variables
}
