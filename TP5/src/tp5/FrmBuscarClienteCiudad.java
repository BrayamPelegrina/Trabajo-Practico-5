/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp5;

import tp5.Cliente;
import tp5.frmMenuPrincipal;
import java.util.Map;

/**
 *
 * @author Ryzen3
 */
public class FrmBuscarClienteCiudad extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmBuscarClienteCiudad
     */
    public FrmBuscarClienteCiudad() {
        initComponents();
        rellenarComboCiudad();
    }

    private void rellenarComboCiudad() {
        jComboBox1Ciudades.removeAllItems();
    for (String ciudad : frmMenuPrincipal.ciudades) {
        jComboBox1Ciudades.addItem(ciudad);
    }
    
    jComboBox1Ciudades.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String ciudadSeleccionada = (String) jComboBox1Ciudades.getSelectedItem();
            cargarClientesPorCiudad(ciudadSeleccionada);
        }
    }
});
    }

private void cargarClientesPorCiudad(String ciudad) {
    javax.swing.table.DefaultTableModel model = 
        (javax.swing.table.DefaultTableModel) jTable1DatosClientes.getModel();

    model.setRowCount(0);
    
for (Map.Entry<Long, Cliente> entry : frmMenuPrincipal.directorio.entrySet()) {
    Long telefono = entry.getKey();
    Cliente c = entry.getValue();

    if (c.getCiudad().equalsIgnoreCase(ciudad)) {
        model.addRow(new Object[]{
            c.getDni(),
            c.getApellido(),
            c.getNombre(),
            c.getDireccion(),
            c.getCiudad(),
            telefono
        });
    }
}
}


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1Ciudades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1DatosClientes = new javax.swing.JTable();
        jButton1Salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Buscar Clientes de Directorio por Ciudad");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ciudades");

        jComboBox1Ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1CiudadesActionPerformed(evt);
            }
        });

        jTable1DatosClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1DatosClientes);

        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1Salir)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1Salir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jComboBox1CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1CiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1CiudadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JComboBox<String> jComboBox1Ciudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1DatosClientes;
    // End of variables declaration//GEN-END:variables
}
