/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Clases.Proyectos;
import Clases.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author FRAGATA
 */
public class editarProyectos extends javax.swing.JFrame {
    
    Proyectos proyecto = new Proyectos();
    
    String usuario = "root";
    String contra = "julian";
    String Driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    /**
     * Creates new form editarProyectos
     */
    Query query = new Query();
    public editarProyectos() {
        initComponents();
        cargarComboBox();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JCopcion = new javax.swing.JComboBox();
        CTbuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CTtitulo = new javax.swing.JTextField();
        CTdescripcion = new javax.swing.JTextField();
        CTfecha = new javax.swing.JTextField();
        CTduracion = new javax.swing.JTextField();
        CTjefe = new javax.swing.JTextField();
        BTeditar = new javax.swing.JButton();
        JCjefe = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        jLabel1.setText("Editar Proyectos");

        jLabel2.setText("Busque El Proyecto a Editar");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        JCopcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titulo", "Descripcion", "jefeProyecto" }));

        CTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTbuscarKeyReleased(evt);
            }
        });

        jLabel3.setText("Titulo");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Fecha inicio");

        jLabel6.setText("Duracion");

        jLabel7.setText("Jefe Proyecto");

        CTjefe.setText("Seleccione un Jefe....");

        BTeditar.setText("Editar");
        BTeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeditarActionPerformed(evt);
            }
        });

        JCjefe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCjefe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCjefeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CTbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JCjefe, 0, 122, Short.MAX_VALUE)
                            .addComponent(CTtitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTdescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTfecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CTduracion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(CTjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(BTeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(JCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(CTduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CTjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCjefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenu3.setText("Proyectos");

        jMenuItem1.setText("Buscar Proyectos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Menu");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeditarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de editar este proyecto", "Confirmation¡¡", JOptionPane.OK_OPTION);
        String titulo = CTtitulo.getText();
        String descripcion = CTduracion.getText();
        String fecha = CTfecha.getText();
        String Auxduracion = CTduracion.getText();
        String jefe = CTjefe.getText();

        int duracion = Integer.parseInt(Auxduracion);
        int idIntegrante = cargaridIntegrante();
        
        if(opcion == JOptionPane.OK_OPTION){
            
            query.updateProyecto(proyecto.getIdProyectos(), titulo, descripcion, fecha, duracion, jefe, idIntegrante, proyecto.getIdAdministrador());
            
        }
    }//GEN-LAST:event_BTeditarActionPerformed

    private void JCjefeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCjefeItemStateChanged
        
        String jefe = (String) JCjefe.getSelectedItem();
        
        CTjefe.setText(jefe);
        
        
        
    }//GEN-LAST:event_JCjefeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String opcion = (String) JCopcion.getSelectedItem();
        String nombre = CTbuscar.getText();
        
        buscar(opcion, nombre);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        
        
        
    }//GEN-LAST:event_jButton1KeyReleased

    private void CTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTbuscarKeyReleased
        String opcion = (String) JCopcion.getSelectedItem();
        String nombre = CTbuscar.getText();
        
        buscar(opcion, nombre);
    }//GEN-LAST:event_CTbuscarKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        buscarProyectos bP = new buscarProyectos();
        bP.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void conectar(){
        
        try{
            Class.forName(Driver);
            conexion = DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conecte correctamente");
            
            
        }catch(Exception ex){
            System.out.println("Se encontro el siguiente error conectando: "+ex.getMessage());
            ex.printStackTrace();
        }               
    }
    
    public int cargaridIntegrante(){
        int id = 0;
        String Auxid = "0";
        try{
            
            conectar();
            String sql="";
                   sql += "select idIntegrantes from integrantes ";
                   sql +="where Rol = 'Jefe  Proyecto' ";
                   sql +="and Nombre = '"+(String)JCjefe.getSelectedItem()+"';";
            pstm = conexion.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Auxid = rs.getString("idIntegrantes");
            }
        
        }catch(Exception ex){
            System.out.println("Se encontor el siguiente error: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        id = Integer.parseInt(Auxid);
        return id;
    }
    
    public void cargarComboBox(){
        
        DefaultComboBoxModel model;
        
        String items[]={};
        model = new DefaultComboBoxModel(items);
        
        JCjefe.setModel(model);
        
        System.out.println("Try catch");
        try{
            
            conectar();
            
            String sql="";
                   sql+= "select * from integrantes ";
                   sql+= "where Rol = 'Jefe  Proyecto';";
            
                   System.out.println("pstm");
            pstm = conexion.prepareStatement(sql);
            System.out.println("rs");
            rs = pstm.executeQuery();
            System.out.println("Voy a entrar al while");
            while (rs.next()){
                System.out.println("Estoy en while");
                int id=(rs.getInt("idIntegrantes"));
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
                
                System.out.println("El jefe es: "+nombre);
                
                model.addElement(nombre);
                
            }       
                           
            
            
        }catch(Exception ex){
            System.out.println("Error al cargar el combo box: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        
        
        
    }
    
    public void buscar(String opcion, String  nombre){
        
        try{
            conectar();
            
            String sql= "select * from proyectos ";
                   sql+= "where "+opcion+" like '%"+nombre+"%'";
                    //sql += "where "+Tbusq+" like '%"+busqueda+"%'"; 
            System.out.println("pstm");       
            pstm = conexion.prepareStatement(sql);
            System.out.println("rs");
            rs = pstm.executeQuery();
            System.out.println("Voy a entrar al while");
            while(rs.next()){
                proyecto.setIdProyectos(rs.getInt("idProyectos"));
                CTtitulo.setText(rs.getString("Titulo"));
                CTdescripcion.setText(rs.getString("Descripcion"));
                CTfecha.setText(rs.getString("FechaInicio"));
                int  Auxduracion = rs.getInt("Duracion");
                String duracion = Integer.toString(Auxduracion);
                CTduracion.setText(duracion);
                CTjefe.setText(rs.getString("jefeProyecto"));
                proyecto.setIdIntegrante(rs.getInt("Integrantes_idIntegrantes"));
                proyecto.setIdAdministrador(rs.getInt("Integrantes_Administrador_idAdministrador"));
                
                
            }
            
                    
                    
        }catch(Exception ex){
            System.out.println("Error al buscar: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTeditar;
    private javax.swing.JTextField CTbuscar;
    private javax.swing.JTextField CTdescripcion;
    private javax.swing.JTextField CTduracion;
    private javax.swing.JTextField CTfecha;
    private javax.swing.JTextField CTjefe;
    private javax.swing.JTextField CTtitulo;
    private javax.swing.JComboBox JCjefe;
    private javax.swing.JComboBox JCopcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
