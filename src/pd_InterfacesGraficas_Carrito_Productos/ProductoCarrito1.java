/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Carrito_Productos;

import java.awt.Color;

/**
 *
Propiedad: Colectiva de uso gratuito público
Desarrollado por: Sebastian Viscarra, Autor y compilador del proyecto PX para red social discreta de aplicación.
Todo el contenido de esta aplicación excepto los logos de PD y PX design son 100% editables para todo el desarrollo colectivo de cualquier usuario de información.
Así como su libre edición y utilización es 100% responsabilidad de cada usuario como utilice o mal utilice esta plataforma para fines comerciales o lucrativos. 
El contenido de esta plataforma está disponible desde su origen de forma libre y gratuita y de ser vendido o redistribuido por usuarios externos que no den soporte a sus clientes, 
PD y PX design no se hace responsable de dar soporte a ningún usuario que haya obtenido esta plataforma desde otro medio. 
Usted puede aprender como realizar esta plataforma desde su origen hasta su final de forma pratica 100% gratuita en el siguiente enlace:
https://www.youtube.com/watch?v=nqPzNS-pARY&list=PLshdAl3NxgtfaAB1Ef2I4McKfEulp6P9i
 */
public class ProductoCarrito1 extends javax.swing.JPanel {

    /**
     * Creates new form ProductoCarrito1
     */
    public ProductoCarrito1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eliminaProducto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/producto.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre del producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 510, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("POR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 40, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("categoria");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 520, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 180, 255));
        jLabel5.setText("Identidad del usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 380, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("YA EN TU CARRITO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 520, 30));

        eliminaProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminaProducto.setForeground(new java.awt.Color(153, 153, 153));
        eliminaProducto.setText(" Eliminar");
        eliminaProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminaProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminaProductoMouseExited(evt);
            }
        });
        jPanel1.add(eliminaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 144, 80, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("$USD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 24, 60, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("10.00");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 24, 110, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/contenedorProducto.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 176));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminaProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaProductoMouseEntered
eliminaProducto.setForeground(new Color(255,255,255));//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_eliminaProductoMouseEntered

    private void eliminaProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaProductoMouseExited
eliminaProducto.setForeground(new Color(153,153,153));//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    }//GEN-LAST:event_eliminaProductoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eliminaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
