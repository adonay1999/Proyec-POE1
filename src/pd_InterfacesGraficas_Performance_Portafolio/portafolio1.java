/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance_Portafolio;

import java.awt.Color;

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
public class portafolio1 extends javax.swing.JPanel {

    /**
     * Creates new form portafolio1
     */
    public portafolio1() {
        initComponents();
        txtdescripionProyecto.setBackground(new Color(0,0,0,0));//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtAutorProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtnombreProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtdescripionProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
      
    }
     //////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces de visualizacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y su no visualizacion puede impedir el flujo de interfaces de la aplicacion
    
    pd_InterfacesGraficas_Performance.PerformancePortafolioInfo PortInfo = new pd_InterfacesGraficas_Performance.PerformancePortafolioInfo();
    void MostrarInterface_pf_portafolio_Info(){
   
         pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.add(PortInfo);
         pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.repaint();
         pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.updateUI();
         pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.revalidate();
         PortInfo.setVisible(true);
         
         
   
   } //// TAG1 : *Hace Referencia A Interfaces de visualizacion*
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAutorProyecto = new javax.swing.JLabel();
        txtnombreProyecto = new javax.swing.JLabel();
        txtdescripionProyecto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        IMGportafolio = new javax.swing.JLabel();

        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAutorProyecto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtAutorProyecto.setForeground(new java.awt.Color(50, 174, 255));
        txtAutorProyecto.setText("Identidad Usuario");
        jPanel1.add(txtAutorProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 60, 330, 20));

        txtnombreProyecto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtnombreProyecto.setForeground(new java.awt.Color(255, 255, 255));
        txtnombreProyecto.setText("Nombre del Proyecto");
        jPanel1.add(txtnombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 390, 40));

        txtdescripionProyecto.setEditable(false);
        txtdescripionProyecto.setBackground(new java.awt.Color(0, 0, 0));
        txtdescripionProyecto.setColumns(20);
        txtdescripionProyecto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtdescripionProyecto.setForeground(new java.awt.Color(255, 255, 255));
        txtdescripionProyecto.setLineWrap(true);
        txtdescripionProyecto.setRows(1);
        txtdescripionProyecto.setTabSize(1);
        txtdescripionProyecto.setText("Descripción breve del proyecto , entre esta descripcion estan las caracteristicas de este proyecto como su utilidad a que está orientado, funcionalidad, y cualquier descripción y detalle que esté directamente relacionado con el proyecto, este proyecto est, funcionalidad, y cualquier descripción y detalle que esté directamente relacionado con el proyecto, este proyecto estará visible en la pagina de interface de proyectos en donde tendrá una descripción más completa. \n");
        txtdescripionProyecto.setWrapStyleWord(true);
        txtdescripionProyecto.setBorder(null);
        txtdescripionProyecto.setOpaque(false);
        txtdescripionProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdescripionProyectoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtdescripionProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtdescripionProyectoMouseExited(evt);
            }
        });
        jPanel1.add(txtdescripionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 100, 330, 190));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnSeleccionPortafolio2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnSeleccionPortafolio2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 504, 424));

        IMGportafolio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMGportafolio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba.jpg"))); // NOI18N
        jPanel1.add(IMGportafolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 504, 428));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 504, 424));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        txtAutorProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtnombreProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtdescripionProyecto.setVisible(false);  //// TAG1 : *Hace Referencia A Interfaces de visualizacion*

    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void txtdescripionProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescripionProyectoMouseEntered
       
        txtAutorProyecto.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtnombreProyecto.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtdescripionProyecto.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        jButton1.setSelected(true);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
                 
    }//GEN-LAST:event_txtdescripionProyectoMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
            // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        txtAutorProyecto.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtnombreProyecto.setVisible(true); //// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        txtdescripionProyecto.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
         
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
   txtAutorProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
   txtnombreProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
   txtdescripionProyecto.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
   jButton1.setSelected(false);//// TAG1 : *Hace Referencia A Interfaces de visualizacion*   
  
    }//GEN-LAST:event_jButton1MouseExited

    private void txtdescripionProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescripionProyectoMouseExited
     // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripionProyectoMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.removeAll();//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        MostrarInterface_pf_portafolio_Info();//// TAG1 : *Hace Referencia A Interfaces de visualizacion*     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdescripionProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescripionProyectoMouseClicked
        pd_InterfacesGraficas.pd_perfil.panelPerformanceGeneral.removeAll();//// TAG1 : *Hace Referencia A Interfaces de visualizacion*
        MostrarInterface_pf_portafolio_Info();//// TAG1 : *Hace Referencia A Interfaces de visualizacion* 
    }//GEN-LAST:event_txtdescripionProyectoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMGportafolio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAutorProyecto;
    private javax.swing.JTextArea txtdescripionProyecto;
    private javax.swing.JLabel txtnombreProyecto;
    // End of variables declaration//GEN-END:variables
}
