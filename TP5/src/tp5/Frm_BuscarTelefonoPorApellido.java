package tp5;

import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Frm_BuscarTelefonoPorApellido extends javax.swing.JInternalFrame {

    private javax.swing.JList<String> jListApellidos;

    public Frm_BuscarTelefonoPorApellido() {
        initComponents();
        llenarListaApellido();
        jList1mostrarApellidos.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String seleccionapellido = jList1mostrarApellidos.getSelectedValue();
                cargarClientesPorApellido(seleccionapellido);
            }
        });
    }

    private void llenarListaApellido() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Cliente c : frmMenuPrincipal.directorio.values()) {
            modelo.addElement(c.getApellido());
        }
        jList1mostrarApellidos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1insertaApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1datosClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1mostrarApellidos = new javax.swing.JList<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Buscar Telefono por Apellido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Apellido");

        jTextField1insertaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String apellido = jTextField1insertaApellido.getText().trim();
                cargarClientesPorApellido(apellido);
            }
        });

        jTable1datosClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"
                }));
        jScrollPane1.setViewportView(jTable1datosClientes);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1mostrarApellidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane2.setViewportView(jList1mostrarApellidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(179, 179, 179))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jScrollPane2)
                                                        .addComponent(jTextField1insertaApellido,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 147,
                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(21, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextField1insertaApellido,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void cargarClientesPorApellido(String apellido) {
        DefaultTableModel model = (DefaultTableModel) jTable1datosClientes.getModel();
        model.setRowCount(0);

        for (Map.Entry<Long, Cliente> entry : frmMenuPrincipal.directorio.entrySet()) {
            Long telefono = entry.getKey();
            Cliente c = entry.getValue();

            if (c.getApellido().equalsIgnoreCase(apellido)) {
                model.addRow(new Object[] {
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

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1mostrarApellidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1datosClientes;
    private javax.swing.JTextField jTextField1insertaApellido;
}
