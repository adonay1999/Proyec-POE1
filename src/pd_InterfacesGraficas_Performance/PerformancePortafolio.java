/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance;

import java.awt.Color;
import javax.swing.JPanel;
import pd_InterfacesGraficas_Performance_Portafolio.portafolio1;

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
public class PerformancePortafolio extends javax.swing.JPanel {

    /**
     * Creates new form PerformanceAmigos
     */
    public PerformancePortafolio() {
        initComponents();
    }
 
 
   ///////////////////// CONTENCION DE PORTAFOLIOS DE USUARIO ////////////////
   ////////////////// TAG1 * Se refiere a visualizacion de interface de proyecto //////////////
   /////Comentario: Su no visualizacion puede afectar la visualizacion de otras interfaces graficas
 

    /**
     Autor PXDesign
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPortafolio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        contenedorPortafolio.setBackground(new java.awt.Color(28, 28, 28));
        contenedorPortafolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contenedorPortafolioMouseEntered(evt);
            }
        });
        contenedorPortafolio.setLayout(new java.awt.GridLayout(0, 2));

        jButton1.setText("Agregar Portafolio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
            .addComponent(contenedorPortafolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contenedorPortafolio, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  pd_InterfacesGraficas_Performance_Portafolio.portafolio1 port1 = new pd_InterfacesGraficas_Performance_Portafolio.portafolio1();//TAG1 * Se refiere a visualizacion de interface de proyecto //////////////
   contenedorPortafolio.add(port1);//TAG1 * Se refiere a visualizacion de interface de proyecto //////////////
   contenedorPortafolio.revalidate();//TAG1 * Se refiere a visualizacion de interface de proyecto //////////////  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void contenedorPortafolioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorPortafolioMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_contenedorPortafolioMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPortafolio;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
