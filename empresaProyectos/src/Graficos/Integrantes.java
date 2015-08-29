
package Graficos;

import Clases.Query;
import Clases.Integrante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Integrantes extends javax.swing.JFrame {
    int idAdministrador = 1;
    Query query = new Query();
    public DefaultTableModel model;
    Integrante integrante = new Integrante(); 
    newProyectos proyectos = new newProyectos();
    
    String usuario = "root";
    String contra = "julian";
    String Driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public Integrantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaIntegrantes();
        cajasTxtHabitacion();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CTNIdocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CTNInombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CTNIapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CTNIfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BTregistrarI = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CTNIemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CTNIcontacto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CTNIuser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CTNIpassword = new javax.swing.JPasswordField();
        JCBrol = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tintegrantes = new javax.swing.JTable();
        BTEintegrante = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CTNAuser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CTNApassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        CTNAdocumento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CTNAnombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CTNAapellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CTNAfecha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CTNAemail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CTNAcontacto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CTNArol = new javax.swing.JTextField();
        BTactualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivos = new javax.swing.JMenu();
        Mproyectos = new javax.swing.JMenu();
        MnuevoProyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel1.setText("New Integrante");

        jLabel2.setText("Documento");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Fecha Nacimiento");

        jLabel7.setText("Rol");

        BTregistrarI.setText("Registrar Proyecto");
        BTregistrarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregistrarIActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        jLabel9.setText("Numero Contacto");

        jLabel10.setText("User");

        jLabel11.setText("Password");

        JCBrol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione Una Opcion---", "Jefe  Proyecto", "Analista", "Desarrollador", "Tester" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(CTNIuser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(CTNIpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(101, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CTNIfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(CTNIdocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CTNInombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CTNIapellido, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(78, 78, 78)
                                        .addComponent(CTNIemail))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(CTNIcontacto))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JCBrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(43, 43, 43))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTregistrarI)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTNIuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(CTNIpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CTNIdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(CTNIemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CTNInombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(CTNIcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CTNIapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(JCBrol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(CTNIfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(BTregistrarI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Nuevo", jPanel2);

        Tintegrantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tintegrantes);

        BTEintegrante.setText("Eliminar ");
        BTEintegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEintegranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTEintegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BTEintegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Buscar", jPanel3);

        jLabel12.setText("User");

        jLabel13.setText("Password");

        jLabel14.setText("Documento");

        jLabel15.setText("Nombre");

        jLabel16.setText("Apellidos");

        jLabel17.setText("Fecha Nacimiento");

        jLabel18.setText("Email");

        jLabel19.setText("Numero Contacto");

        jLabel21.setText("Rol");

        BTactualizar.setText("Actualizar Registro");
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(CTNAuser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(CTNApassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGap(18, 18, 18))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(15, 15, 15)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CTNAfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(CTNAnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTNAapellido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(CTNAdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel21))
                                .addComponent(jLabel19))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTNAcontacto)
                                .addComponent(CTNArol)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                            .addComponent(CTNAemail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTNAuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(CTNApassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(BTactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CTNAdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(CTNAemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(CTNAnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(CTNAcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(CTNAapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(CTNArol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(CTNAfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(72, 72, 72)))
        );

        jTabbedPane2.addTab("Editar / Eliminar", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Integrantes", jPanel1);

        Archivos.setText("Archivo");

        Mproyectos.setText("Proyectos");

        MnuevoProyecto.setText("Nuevo Proyecto");
        MnuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuevoProyectoActionPerformed(evt);
            }
        });
        Mproyectos.add(MnuevoProyecto);

        Archivos.add(Mproyectos);

        jMenuBar1.add(Archivos);

        jMenu2.setText("Administrar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTregistrarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregistrarIActionPerformed
        
        String documento = CTNIdocumento.getText();
        String nombre = CTNInombre.getText();
        String apellidos = CTNIapellido.getText();
        String fecha = CTNIfecha.getText();
        String email = CTNIemail.getText();
        String contacto = CTNIcontacto.getText();
        String direccion = CTNIfecha.getText();
        String user = CTNIuser.getText();
        String password = CTNIpassword.getText();
        String rol = (String) JCBrol.getSelectedItem();
        int idAdmin = idAdministrador;
        
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de registrar el nuevo integrante: "+nombre, "Information", JOptionPane.OK_CANCEL_OPTION);
        
        if (opcion == JOptionPane.OK_OPTION){
            query.newIntegrante(documento, nombre, apellidos, fecha, email, contacto, direccion, user, password, rol, idAdministrador);
            JOptionPane.showMessageDialog(rootPane, "Se registro correctamente el nuevo integrante: "+nombre,"EnhoraBuena",JOptionPane.INFORMATION_MESSAGE);
            cargarTablaIntegrantes();
        }
        
        
    }//GEN-LAST:event_BTregistrarIActionPerformed

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
        String Documento=CTNAdocumento.getText();
        String Nombre = CTNAnombre.getText();
        String Apellido = CTNAapellido.getText();
        String Fecha = CTNAfecha.getText();
        String Email = CTNAemail.getText();
        String Contacto = CTNAcontacto.getText();
        //String Fecha = CTNAfecha.getText();
        String User = CTNAuser.getText();
        String Password = CTNApassword.getText();
        String Rol = CTNArol.getText();
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de registrar esta fase","Confirmation¡¡",JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            
            query.updateIntegrante(integrante.getIdIntegrante(), Documento, Nombre, Apellido, Fecha, Email, Contacto, User, Password, Rol);
            JOptionPane.showMessageDialog(rootPane, "Se actualizo correctamente el registro","Enhorabuena",JOptionPane.INFORMATION_MESSAGE);
            cargarTablaIntegrantes();
            
            
        }
        
        
    }//GEN-LAST:event_BTactualizarActionPerformed

    private void BTEintegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEintegranteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta Seguro de eliminar el registro??","Confirmation",JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            
            query.deleteIntegrante(integrante.getIdIntegrante());
            cargarTablaIntegrantes();
            
            
        }
        
    }//GEN-LAST:event_BTEintegranteActionPerformed

    private void MnuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuevoProyectoActionPerformed
        
        proyectos.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_MnuevoProyectoActionPerformed

    //Metodos Integrantes
    public void cargarTablaIntegrantes(){
         String usuario = "root";
        String contra = "julian";
        String Driver = "org.gjt.mm.mysql.Driver";
        String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
        Connection conexion = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        
            
        try{
        Class.forName(Driver);
        conexion = DriverManager.getConnection(url, usuario, contra);
        System.out.println("Conecte correctamente");
        //query.getConectar(usuario, contra, Driver, url);
        String x[][]={};
        String columnas[]={"idIntegrante","Documento","Nombre","Apellidos","fechaNacimiento","Email","numeroContacto","Direccion","User","Password","Rol","idAdministrador"};
        model = new DefaultTableModel(x,columnas);
        Tintegrantes.setModel(model);
        
        String sql= "select * from integrantes";
               
        
        
       
        
        pstm = conexion.prepareStatement(sql);
            
        rs = pstm.executeQuery();
            
            
        while(rs.next()){
            
            int idIntegrante = rs.getInt("idIntegrantes");
            String documento = rs.getString("Documento");
            String nombre = rs.getString("Nombre");
            String apellidos = rs.getString("Apellidos");
            String fechaNacimiento = rs.getString("fechaNacimiento");
            String email = rs.getString("Email");
            String numeroContacto = rs.getString("numeroContacto");
            String direccion = rs.getString("Direccion");
            String user = rs.getString("User");
            String password = rs.getString("Password");
            String rol = rs.getString("Rol");
            String idAdministrador = rs.getString("Administrador_idAdministrador");
            
            int idAdmin = Integer.parseInt(idAdministrador);
            
            Integrante integrante = new Integrante(idIntegrante, documento, nombre, apellidos, fechaNacimiento, email, numeroContacto, direccion, user, password, rol, idAdmin);

            ArrayList<Integrante> lista = new ArrayList<Integrante>();
            
            lista.add(integrante);
            
            for(Integrante item: lista){
                model.addRow(item.arrayToVector());
            }
            
            
                
        }        
        
        }catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void cajasTxtHabitacion(){
        
        
        Tintegrantes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
            public void valueChanged(ListSelectionEvent e){
                
                if(Tintegrantes.getSelectedRow() != -1){
                    int fila = Tintegrantes.getSelectedRow();
                    
                    integrante.setIdIntegrante(Tintegrantes.getValueAt(fila,0).hashCode());
                    CTNAdocumento.setText(Tintegrantes.getValueAt(fila,1).toString());
                    CTNAnombre.setText(Tintegrantes.getValueAt(fila,2).toString());
                    CTNAapellido.setText(Tintegrantes.getValueAt(fila,3).toString());
                    CTNAfecha.setText(Tintegrantes.getValueAt(fila,4).toString());
                    CTNAemail.setText(Tintegrantes.getValueAt(fila,5).toString());
                    CTNAcontacto.setText(Tintegrantes.getValueAt(fila,6).toString());
                    CTNAfecha.setText(Tintegrantes.getValueAt(fila,7).toString());
                    CTNAuser.setText(Tintegrantes.getValueAt(fila,8).toString());
                    CTNApassword.setText(Tintegrantes.getValueAt(fila,9).toString());
                    CTNArol.setText(Tintegrantes.getValueAt(fila,10).toString());
                    //idAdministrador;
                    
                    
                    
                    
                }
                
                
                
            }
        
        
        
        
        });
                
              
                    
    }
    
    
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Integrantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivos;
    private javax.swing.JButton BTEintegrante;
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton BTregistrarI;
    private javax.swing.JTextField CTNAapellido;
    private javax.swing.JTextField CTNAcontacto;
    private javax.swing.JTextField CTNAdocumento;
    private javax.swing.JTextField CTNAemail;
    private javax.swing.JTextField CTNAfecha;
    private javax.swing.JTextField CTNAnombre;
    private javax.swing.JPasswordField CTNApassword;
    private javax.swing.JTextField CTNArol;
    private javax.swing.JTextField CTNAuser;
    private javax.swing.JTextField CTNIapellido;
    private javax.swing.JTextField CTNIcontacto;
    private javax.swing.JTextField CTNIdocumento;
    private javax.swing.JTextField CTNIemail;
    private javax.swing.JTextField CTNIfecha;
    private javax.swing.JTextField CTNInombre;
    private javax.swing.JPasswordField CTNIpassword;
    private javax.swing.JTextField CTNIuser;
    private javax.swing.JComboBox JCBrol;
    private javax.swing.JMenuItem MnuevoProyecto;
    private javax.swing.JMenu Mproyectos;
    private javax.swing.JTable Tintegrantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
