/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan
 */
public class AsignarBrigadasView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
         @Override
    public boolean isCellEditable(int fila, int columna){
    return false;
    }
    };

    /**
     * Creates new form AsignarBrigadasView
     */
    public AsignarBrigadasView() {
        initComponents();
        armarCabecera();
        llenarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListadosDeBrigadas = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jcSeleccionDeSiniestro = new javax.swing.JComboBox<>();
        jrBrigadasEspecializadas = new javax.swing.JRadioButton();
        jrTodasLasBrigadas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jbAsignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jtListadosDeBrigadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtListadosDeBrigadas);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcSeleccionDeSiniestro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcSeleccionDeSiniestroItemStateChanged(evt);
            }
        });
        jcSeleccionDeSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSeleccionDeSiniestroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrBrigadasEspecializadas);
        jrBrigadasEspecializadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrBrigadasEspecializadas.setText("Brigadas Especializadas");
        jrBrigadasEspecializadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBrigadasEspecializadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrTodasLasBrigadas);
        jrTodasLasBrigadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrTodasLasBrigadas.setText("Todas Las Brigadas");
        jrTodasLasBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodasLasBrigadasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ASIGNACION DE BRIGADAS");

        jbAsignar.setText("Asignar");
        jbAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione el siniestro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jrBrigadasEspecializadas)
                                .addGap(165, 165, 165)
                                .addComponent(jrTodasLasBrigadas))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel1)))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcSeleccionDeSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcSeleccionDeSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodasLasBrigadas)
                    .addComponent(jrBrigadasEspecializadas))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAsignar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcSeleccionDeSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSeleccionDeSiniestroActionPerformed
        if (jrBrigadasEspecializadas.isSelected()) {
            limpiarTabla();
            SiniestroData sd = new SiniestroData();
            ArrayList<Siniestro> siniestros = sd.listarSiniestrosNoResultos();
            Siniestro s = new Siniestro();
            BrigadaData bd = new BrigadaData();
            try{
            s = siniestros.get(jcSeleccionDeSiniestro.getSelectedIndex());
            TreeMap<Double, Cuartel> tree = sd.cuartelesDisponiblesCompleto(s);
            for (Map.Entry<Double, Cuartel> entry : tree.entrySet()) {
                Double key = entry.getKey();
                Cuartel value = entry.getValue();
                ArrayList<Brigada> brigadas = bd.listarBrigadasPorCuartel(value.getCodigo());                
                for (int i = 0; i < brigadas.size(); i++) {
                    if (brigadas.get(i).getEspecialidad().equalsIgnoreCase(s.getTipo())) {
                        cargarDatos(brigadas.get(i), key);
                    }
                }
            }
            }catch(Exception e){
                
            }
        } else if (jrTodasLasBrigadas.isSelected()) {
            limpiarTabla();
            SiniestroData sd = new SiniestroData();
            ArrayList<Siniestro> siniestros = sd.listarSiniestrosNoResultos();
            Siniestro s = new Siniestro();
            BrigadaData bd = new BrigadaData();
            try{
            s = siniestros.get(jcSeleccionDeSiniestro.getSelectedIndex());
            TreeMap<Double, Cuartel> tree = sd.cuartelesDisponiblesCompleto(s);
            for (Map.Entry<Double, Cuartel> entry : tree.entrySet()) {
                Double key = entry.getKey();
                Cuartel value = entry.getValue();
                ArrayList<Brigada> brigadas = bd.listarBrigadasPorCuartel(value.getCodigo());
                for (int i = 0; i < brigadas.size(); i++) {
                    cargarDatos(brigadas.get(i), key);
                }
            }
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jcSeleccionDeSiniestroActionPerformed

    private void jrTodasLasBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodasLasBrigadasActionPerformed
        // TODAS LAS BRIGADAS MÁS CERCANAS INDISCRIMINADAS
        try {
            limpiarTabla();
            SiniestroData sd = new SiniestroData();
            ArrayList<Siniestro> siniestros = sd.listarSiniestrosNoResultos();
            Siniestro s = new Siniestro();
            BrigadaData bd = new BrigadaData();
            s = siniestros.get(jcSeleccionDeSiniestro.getSelectedIndex());
            TreeMap<Double, Cuartel> tree = sd.cuartelesDisponiblesCompleto(s);
            for (Map.Entry<Double, Cuartel> entry : tree.entrySet()) {
                Double key = entry.getKey();
                Cuartel value = entry.getValue();
                ArrayList<Brigada> brigadas = bd.listarBrigadasPorCuartel(value.getCodigo());

                for (int i = 0; i < brigadas.size(); i++) {

                    cargarDatos(brigadas.get(i), key);
                }

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jrTodasLasBrigadasActionPerformed

    private void jcSeleccionDeSiniestroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcSeleccionDeSiniestroItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcSeleccionDeSiniestroItemStateChanged

    private void jrBrigadasEspecializadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBrigadasEspecializadasActionPerformed
        // BRIGADAS CERCANAS Y ESPECILIZADAS
        try {
        limpiarTabla();
        SiniestroData sd = new SiniestroData(); 
        ArrayList<Siniestro> siniestros= sd.listarSiniestrosNoResultos();
        Siniestro s = new Siniestro();
        BrigadaData bd = new BrigadaData();        
        s = siniestros.get(jcSeleccionDeSiniestro.getSelectedIndex());
        TreeMap<Double, Cuartel> tree = sd.cuartelesDisponiblesCompleto(s);
        
        for (Map.Entry<Double, Cuartel> entry : tree.entrySet()) {
            Double key = entry.getKey();
            Cuartel value = entry.getValue();
             ArrayList<Brigada> brigadas =bd.listarBrigadasPorCuartel(value.getCodigo());             
             for (int i = 0; i < brigadas.size(); i++) {
                 if (brigadas.get(i).getEspecialidad().equalsIgnoreCase(s.getTipo())   ) {
                   cargarDatos(brigadas.get(i), key);   
                 } 
            }
        }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jrBrigadasEspecializadasActionPerformed

    private void jbAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarActionPerformed
        if (jrTodasLasBrigadas.isSelected() || jrBrigadasEspecializadas.isSelected() && jtListadosDeBrigadas.getSelectedRow()>-1) {
            BrigadaData bd = new BrigadaData();
        SiniestroData sd = new SiniestroData();
        Brigada b = new Brigada();
        int fila = jtListadosDeBrigadas.getSelectedRow();
        int codigo = (Integer) jtListadosDeBrigadas.getValueAt(fila, 0);
        b = bd.buscarBrigada(codigo);
        ArrayList<Siniestro> siniestros = sd.listarSiniestrosNoResultos();
        Siniestro s = new Siniestro();
        s = siniestros.get(jcSeleccionDeSiniestro.getSelectedIndex());
        sd.asignarBrigada(b, s.getCodigo());
        b.setLibre(false);
        bd.modificarBrigada(b);
        limpiarTabla();
        jcSeleccionDeSiniestro.removeAllItems();
        llenarComboBox();
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione alguna opcion y la brigada de la tabla");
        }
            
        
    }//GEN-LAST:event_jbAsignarActionPerformed
      
    private void cargarDatos(Brigada brigada,Double key) {    
        modelo.addRow(new Object[]{brigada.getCodigo(), brigada.getNombre(), brigada.getCuartel(), brigada.getEspecialidad(), key }); 

  }
    private void llenarComboBox(){
        SiniestroData sd = new SiniestroData();
         ArrayList<Siniestro> siniestros= sd.listarSiniestrosNoResultos();
         for (int i = 0; i < siniestros.size(); i++) {
            jcSeleccionDeSiniestro.addItem(siniestros.get(i).toString());
        }
    
    }
    
       private void limpiarTabla() {
        for (int i = 0; i < jtListadosDeBrigadas.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Brigada");
        modelo.addColumn("Cuartel");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Distancia");
        jtListadosDeBrigadas.setModel(modelo);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAsignar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcSeleccionDeSiniestro;
    private javax.swing.JRadioButton jrBrigadasEspecializadas;
    private javax.swing.JRadioButton jrTodasLasBrigadas;
    private javax.swing.JTable jtListadosDeBrigadas;
    // End of variables declaration//GEN-END:variables
}