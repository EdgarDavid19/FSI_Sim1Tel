import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Formulario editable de CONSULTAS (JFrame con pestaña Design).
 * Insertar, actualizar y eliminar mediante el procedimiento almacenado
 * gestionar_consulta. Necesita Conexion2.java en el proyecto.
 * Para editar: haz clic en un renglón de la tabla, cambia los datos y
 * presiona ACTUALIZAR.
 */
public class FConsultas extends javax.swing.JFrame {

    // --- Ajusta aquí si en tu base se llaman distinto ---
    String todo = "SELECT * FROM consultas";
    String sqlPacientes = "SELECT CONCAT(codigop, ' | ', nombrep) FROM pacientes";
    String sqlMedicos = "SELECT CONCAT(cedula, ' | ', nombrem) FROM medicos";
    // --- Datos de conexión: cambia aquí el nombre de la base si hace falta ---
    String servidor = "localhost";
    String baseDatos = "simitel1";
    String usuario = "root";
    String clave = "";
    // ----------------------------------------------------
    Conexion2 cnx;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public FConsultas() {
        initComponents();
        setLocationRelativeTo(null);
        TFecha.setText(LocalDateTime.now().format(formato));

        cnx = new Conexion2();
        if (cnx.conectar(servidor, baseDatos, usuario, clave) == 1) {
            cnx.seleccionar(sqlPacientes, CBPaciente);
            cnx.seleccionar(sqlMedicos, CBMedico);
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexion a la BD \"" + baseDatos + "\"");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInsertar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TEstatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TPresion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSintomas = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TDiagnostico = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CBPaciente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CBMedico = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAS - Interfaz editable");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BInsertar.setText("INSERTAR");
        BInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(BInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 12, 110, 36));

        BActualizar.setText("ACTUALIZAR");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 12, 110, 36));

        BEliminar.setText("ELIMINAR");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 12, 110, 36));

        BLimpiar.setText("LIMPIAR");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 12, 110, 36));

        jLabel1.setText("FOLIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(TFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 65, 480, 28));

        jLabel2.setText("FECHA (aaaa-mm-dd hh:mm):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, -1, -1));
        getContentPane().add(TFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 480, 28));

        jLabel3.setText("PESO (kg):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        getContentPane().add(TPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 135, 480, 28));

        jLabel4.setText("ESTATURA (m):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 175, -1, -1));
        getContentPane().add(TEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 480, 28));

        jLabel5.setText("PRESIÓN:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        getContentPane().add(TPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 205, 480, 28));

        jLabel6.setText("SÍNTOMAS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 245, -1, -1));

        TSintomas.setColumns(20);
        TSintomas.setRows(3);
        jScrollPane1.setViewportView(TSintomas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 480, 55));

        jLabel7.setText("DIAGNÓSTICO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        TDiagnostico.setColumns(20);
        TDiagnostico.setRows(3);
        jScrollPane2.setViewportView(TDiagnostico);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 305, 480, 55));

        jLabel8.setText("ESTADO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 375, -1, -1));

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendada", "Atendida", "Cancelada", "Inasistencia" }));
        getContentPane().add(CBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 480, 28));

        jLabel9.setText("PACIENTE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        getContentPane().add(CBPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 405, 480, 28));

        jLabel10.setText("MÉDICO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 445, -1, -1));
        getContentPane().add(CBMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 480, 28));

        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TConsultas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 485, 730, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarActionPerformed
        ejecutar("INSERT");
    }//GEN-LAST:event_BInsertarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        ejecutar("UPDATE");
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        ejecutar("DELETE");
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BLimpiarActionPerformed

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        cargarRenglon();
    }//GEN-LAST:event_TConsultasMousePressed


    // "74" -> "74 kg"; si se deja vacío -> "N/A" (como en la tabla)
    private String conUnidad(String texto, String unidad) {
        String num = soloNumero(texto);
        return num.isEmpty() ? "N/A" : num + unidad;
    }

    // Quita letras y unidades: "74 kg" -> "74", "N/A" -> ""
    private String soloNumero(String texto) {
        return texto == null ? "" : texto.replaceAll("[^0-9.]", "");
    }

    // Llama al procedimiento con "INSERT", "UPDATE" o "DELETE"
    private void ejecutar(String accion) {
        try {
            // Al INSERTAR el folio puede ir vacío: la base lo genera sola (AUTO_INCREMENT)
            String textoFolio = TFolio.getText().trim();
            Integer folio = null;
            if (!(accion.equals("INSERT") && textoFolio.isEmpty())) {
                folio = Integer.parseInt(textoFolio);
            }
            Object[] datos;

            if (accion.equals("DELETE")) {
                int resp = JOptionPane.showConfirmDialog(this,
                        "¿Eliminar la consulta con folio " + folio + "?",
                        "Confirmar", JOptionPane.YES_NO_OPTION);
                if (resp != JOptionPane.YES_OPTION) {
                    return;
                }
                datos = new Object[]{accion, folio, null, null, null, null, null, null, null, null, null};
            } else {
                if (CBPaciente.getSelectedItem() == null || CBMedico.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(this, "Primero deben existir pacientes y médicos.");
                    return;
                }
                LocalDateTime fecha = LocalDateTime.parse(TFecha.getText().trim(), formato);
                String peso = conUnidad(TPeso.getText(), " kg");
                String estatura = conUnidad(TEstatura.getText(), " m");
                String paciente = CBPaciente.getSelectedItem().toString().split(" \\| ")[0];
                String medico = CBMedico.getSelectedItem().toString().split(" \\| ")[0];

                datos = new Object[]{
                    accion, folio, fecha, peso, estatura,
                    TPresion.getText().trim(),
                    TSintomas.getText().trim(),
                    TDiagnostico.getText().trim(),
                    CBEstado.getSelectedItem().toString(),
                    paciente, medico
                };
            }

            Object[] res = cnx.ejecutarCRUD("gestionar_consulta", datos);
            JOptionPane.showMessageDialog(this, "Estado: " + res[0] + "\nMensaje: " + res[1]);
            if (Integer.parseInt(res[0].toString()) == 1) {
                cnx.entablar(todo, TConsultas);
                limpiar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El folio debe ser un número (déjalo vacío al insertar).");
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "La fecha debe verse así: 2026-08-01 17:45");
        }
    }

    // Pasa el renglón seleccionado al formulario
    private void cargarRenglon() {
        int r = TConsultas.getSelectedRow();
        if (r < 0) {
            return;
        }
        TFolio.setText(valor(r, 0));
        String fecha = valor(r, 1);
        TFecha.setText(fecha.length() >= 16 ? fecha.substring(0, 16) : fecha);
        TPeso.setText(soloNumero(valor(r, 2)));
        TEstatura.setText(soloNumero(valor(r, 3)));
        TPresion.setText(valor(r, 4));
        TSintomas.setText(valor(r, 5));
        TDiagnostico.setText(valor(r, 6));
        CBEstado.setSelectedItem(valor(r, 7));
        seleccionarPorCodigo(CBPaciente, valor(r, 8));
        seleccionarPorCodigo(CBMedico, valor(r, 9));
    }

    private String valor(int renglon, int columna) {
        Object v = TConsultas.getValueAt(renglon, columna);
        return v == null ? "" : v.toString();
    }

    private void seleccionarPorCodigo(JComboBox<String> combo, String codigo) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (combo.getItemAt(i).startsWith(codigo + " | ")) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }

    private void limpiar() {
        TFolio.setText("");
        TFecha.setText(LocalDateTime.now().format(formato));
        TPeso.setText("");
        TEstatura.setText("");
        TPresion.setText("");
        TSintomas.setText("");
        TDiagnostico.setText("");
        TConsultas.clearSelection();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        java.awt.EventQueue.invokeLater(() -> new FConsultas().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BInsertar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBMedico;
    private javax.swing.JComboBox<String> CBPaciente;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextArea TDiagnostico;
    private javax.swing.JTextField TEstatura;
    private javax.swing.JTextField TFecha;
    private javax.swing.JTextField TFolio;
    private javax.swing.JTextField TPeso;
    private javax.swing.JTextField TPresion;
    private javax.swing.JTextArea TSintomas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
