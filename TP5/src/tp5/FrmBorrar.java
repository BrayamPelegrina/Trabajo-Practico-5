/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp5;

import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryzen3
 */
public class FrmBorrar extends javax.swing.JInternalFrame {

private javax.swing.JList<Integer> jListDni;
private javax.swing.DefaultListModel<Integer> modeloListaDni;


    /**
     * Creates new form FrmBorrar
     */
    public FrmBorrar() {
        initComponents();
            llenarListaDNI();

    // Evento de selección de DNI en la lista
    jListDni.addListSelectionListener(evt -> {
        if (!evt.getValueIsAdjusting()) {
            Integer dni = jListDni.getSelectedValue();
            if (dni != null) {
                mostrarClienteEnTabla(dni);
            }
        }
    });
    }
    
    private void llenarListaDNI() {
    modeloListaDni = new DefaultListModel<>();
    for (Cliente c : frmMenuPrincipal.directorio.values()) {
        modeloListaDni.addElement(c.getDni());
    }
    jListDni.setModel(modeloListaDni);
}


  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1DNI = new javax.swing.JTextField();
        jTextField2ListaDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarClienteEnTabla = new javax.swing.JTable();
        jButton1BorrarClientes = new javax.swing.JButton();
        jButton2Salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Borrar Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DNI:");

        jTextField1DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1DNIActionPerformed(evt);
            }
        });

        jTextField2ListaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ListaDNIActionPerformed(evt);
            }
        });

        mostrarClienteEnTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(mostrarClienteEnTabla);

        jButton1BorrarClientes.setText("Borrar Clientes");
        jButton1BorrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BorrarClientesActionPerformed(evt);
            }
        });

        jButton2Salir.setText("Salir");
        jButton2Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2ListaDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextField1DNI))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1BorrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(jButton2Salir)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2ListaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1BorrarClientes)
                    .addComponent(jButton2Salir))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );

        pack();
    }

    private void mostrarClienteEnTabla(Integer dni) {
    DefaultTableModel model = (DefaultTableModel) mostrarClienteEnTabla.getModel();
    model.setRowCount(0); 

    for (Map.Entry<Long, Cliente> entry : frmMenuPrincipal.directorio.entrySet()) {
        Cliente c = entry.getValue();
        if (c.getDni() == dni) {
            model.addRow(new Object[]{
                c.getDni(),
                c.getApellido(),
                c.getNombre(),
                c.getDireccion(),
                c.getCiudad(),
                entry.getKey() 
            });
        }
    }
}
    private void jButton2SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SalirActionPerformed
        System.exit(0);
    }

    private void jButton1BorrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BorrarClientesActionPerformed
        // TODO add your handling code here:
    }

    private void jTextField1DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DNIActionPerformed
        // TODO add your handling code here:
    }

    private void jTextField2ListaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ListaDNIActionPerformed
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1BorrarClientes;
    private javax.swing.JButton jButton2Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1DNI;
    private javax.swing.JTextField jTextField2ListaDNI;
    private javax.swing.JTable mostrarClienteEnTabla;
    // End of variables declaration//GEN-END:variables
}
