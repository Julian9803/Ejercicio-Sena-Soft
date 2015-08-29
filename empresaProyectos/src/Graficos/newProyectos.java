
package Graficos;

import Clases.Integrante;
import Clases.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class newProyectos extends javax.swing.JFrame {
    int idIntegrantes = 2;
    int idAdmiistrador = 1;
    
    String usuario = "root";
    String contra = "julian";
    String Driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    Integrante integrante = new Integrante();
    Query query = new Query();
    
    public newProyectos() {
        initComponents();
        cargarComboBox();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CTtitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CTdescripcion = new javax.swing.JTextField();
        CTfecha = new javax.swing.JTextField();
        CTduracion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JCjefe = new javax.swing.JComboBox();
        BTregistrar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Mproyectos = new javax.swing.JMenu();
        MEproyectos = new javax.swing.JMenuItem();
        MBproyectos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setText("Nuevo Proyecto");

        jLabel2.setText("Titulo Proyecto");

        jLabel3.setText("Descripcion");

        jLabel5.setText("Fecha Inicio");

        jLabel6.setText("Duracion (Semanas)");

        jLabel7.setText("Jefe de Proyecto");

        JCjefe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BTregistrar.setText("Registrar");
        BTregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CTtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(CTdescripcion))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CTfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(CTduracion)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(jLabel7)
                            .addGap(40, 40, 40)
                            .addComponent(JCjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(CTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTduracion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel6))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JCjefe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(BTregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jMenu3.setText("Archivo");

        Mproyectos.setText("Proyectos");

        MEproyectos.setText("Editar Proyectos");
        MEproyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEproyectosActionPerformed(evt);
            }
        });
        Mproyectos.add(MEproyectos);

        MBproyectos.setText("Buscar Proyectos");
        MBproyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBproyectosActionPerformed(evt);
            }
        });
        Mproyectos.add(MBproyectos);

        jMenu3.add(Mproyectos);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Menu");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregistrarActionPerformed
        String titulo = CTtitulo.getText();
        String descripcion = CTdescripcion.getText();
        String fecha = CTfecha.getText();
        String duracion = CTduracion.getText();
        String jefe = (String) JCjefe.getSelectedItem();
        
        int opcion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de registrar este proyecto: "+titulo,"Confirmation",JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            
            query.newProyecto(titulo, descripcion, fecha, duracion, jefe, idIntegrantes, idAdmiistrador);
            
        }
        
    }//GEN-LAST:event_BTregistrarActionPerformed

    private void MBproyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBproyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MBproyectosActionPerformed

    private void MEproyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEproyectosActionPerformed
       
        editarProyectos edP = new editarProyectos();
        edP.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_MEproyectosActionPerformed

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
                integrante.setIdAdministrador(rs.getInt("idIntegrantes"));
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
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTregistrar;
    private javax.swing.JTextField CTdescripcion;
    private javax.swing.JTextField CTduracion;
    private javax.swing.JTextField CTfecha;
    private javax.swing.JTextField CTtitulo;
    private javax.swing.JComboBox JCjefe;
    private javax.swing.JMenuItem MBproyectos;
    private javax.swing.JMenuItem MEproyectos;
    private javax.swing.JMenu Mproyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
