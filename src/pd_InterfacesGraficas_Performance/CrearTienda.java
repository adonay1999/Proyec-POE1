/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance;

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
public class CrearTienda extends javax.swing.JPanel {

    /**
     * Creates new form CrearTienda
     */
    public CrearTienda() {
        initComponents();
        
    }
    /////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa
    
    
   ///////// INSTANCIA DE INTERFAZ PERFORMANCE /////////////////
  static pd_InterfacesGraficas_Performance.TerminosDeTienda terminos = new pd_InterfacesGraficas_Performance.TerminosDeTienda();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnCrearTienda1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnCrearTienda2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnCrearTienda2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
TerminosDeTienda.panel_Terminos.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
TerminosDeTienda.panel_Crear.setVisible(false); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
TerminosDeTienda.btnAtras.setVisible(false);     //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
TerminosDeTienda.btnAdelante.setVisible(true);  //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*   

        

        terminos.dispose(); //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        terminos.setVisible(false);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
        terminos.setVisible(true);//// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
     
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
