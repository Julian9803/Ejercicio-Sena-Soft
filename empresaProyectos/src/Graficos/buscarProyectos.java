
package Graficos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Clases.Proyectos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class buscarProyectos extends javax.swing.JFrame {
    
    String usuario = "root";
    String contra = "julian";
    String Driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://127.0.0.1:3307/proyectos";
        
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
  
    public DefaultTableModel model;
    public buscarProyectos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaProyectos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tproyectos = new javax.swing.JTable();
        BTbuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        BTeliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Meditarproyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setText("Proyectos Registrados");

        Tproyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tproyectos);

        BTbuscar.setText("Buscar");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        BTeliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenu3.setText("Proyectos");

        Meditarproyecto.setText("Editar Proyectos");
        Meditarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeditarproyectoActionPerformed(evt);
            }
        });
        jMenu3.add(Meditarproyecto);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
       
        
        
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void MeditarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeditarproyectoActionPerformed
        
        editarProyectos eP = new editarProyectos();
        eP.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_MeditarproyectoActionPerformed

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
    
    
    
    public void cargarTablaProyectos(){
        
        try{
            
            String fila[][]={};
            String columnas[]={"idProyectos","Titulo","Descripcion","Fecha Inicio","Duracion (Semanas)","Jefe Del Proyecto","IdIntegrantes","idAdmnistrador"};
            model = new DefaultTableModel (fila,columnas);
            Tproyectos.setModel(model);
            conectar();
            
            String sql = "";
                   sql += "Select * from Proyectos";
            
            pstm = conexion.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                int idProyectos = rs.getInt("idProyectos");
                String titulo = rs.getString("Titulo");
                String descripcion = rs.getString("Descripcion");
                String fechaInicio = rs.getString("fechaInicio");
                String duracion = rs.getString("Duracion");
                String jefeProyecto = rs.getString("jefeProyecto");
                int Duracion = Integer.parseInt(duracion);
                int idIntegrantes = rs.getInt("Integrantes_idIntegrantes");
                int idAdministrador = rs.getInt("Integrantes_Administrador_idAdministrador");
                
                Proyectos proyecto = new Proyectos(idProyectos, titulo, descripcion, fechaInicio, Duracion, jefeProyecto, idIntegrantes, idAdministrador);
                ArrayList<Proyectos> lista = new ArrayList<Proyectos>();
                
                lista.add(proyecto);
                
                for(Proyectos item: lista){
                    model.addRow(item.arrayToVector());
                }
                
                
            }
            
            
            
        }catch(Exception ex){
            System.out.println("Error al cargar la tabla de proyecyos: "+ex.getMessage());
            ex.printStackTrace();
        }
        
        
        
        
    }
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTeliminar;
    private javax.swing.JMenuItem Meditarproyecto;
    private javax.swing.JTable Tproyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
