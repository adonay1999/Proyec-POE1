/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance;

import AppPackage.AnimationClass;
import java.awt.Dimension;


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
public class PerformanceTienda extends javax.swing.JPanel {

    /**
     * Creates new form PerformanceAmigos
     */
    public PerformanceTienda() {
        initComponents();
      
     
    }
    
     /////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ContenedorProductos = new javax.swing.JPanel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        jPanel7.setBackground(new java.awt.Color(33, 33, 33));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/editar1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/editar2.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/editar2.png"))); // NOI18N
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 10, -1, 60));

        jTextField1.setBackground(new java.awt.Color(24, 24, 24));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(50, 168, 255));
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIENDA DE");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1002, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("nombre usuario");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1002, 29));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/tienda.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 101, 121, 42));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/buscador.png"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 380, 70));

        jButton1.setText("Nuevo producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 193, 130, 40));

        jButton2.setText("no hay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jButton3.setText("crearTiend");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        ContenedorProductos.setBackground(new java.awt.Color(32, 32, 32));
        ContenedorProductos.setOpaque(false);
        ContenedorProductos.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenedorProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContenedorProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

pd_InterfacesGraficas_Performance_Productos.producto1 prod1 = new pd_InterfacesGraficas_Performance_Productos.producto1();  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
ContenedorProductos.add(prod1); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
ContenedorProductos.revalidate(); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
prod1.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
pd_InterfacesGraficas_Performance_Productos.ProductosNull nullprod = new pd_InterfacesGraficas_Performance_Productos.ProductosNull();  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
ContenedorProductos.add(nullprod); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
ContenedorProductos.revalidate(); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
nullprod.setVisible(true);   //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
