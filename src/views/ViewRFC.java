/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Jose Felix
 */
public class ViewRFC extends javax.swing.JFrame {

    /**
     * Creates new form ViewRFC
     */
    public ViewRFC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_nombre = new javax.swing.JLabel();
        jl_apellidop = new javax.swing.JLabel();
        jl_apellidom = new javax.swing.JLabel();
        jl_dia = new javax.swing.JLabel();
        jl_mes = new javax.swing.JLabel();
        jl_anio = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_apellidop = new javax.swing.JTextField();
        jtf_apellidom = new javax.swing.JTextField();
        jtf_dia = new javax.swing.JTextField();
        jtf_mes = new javax.swing.JTextField();
        jtf_anio = new javax.swing.JTextField();
        jb_calcular = new javax.swing.JButton();
        jl_rfc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jl_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_nombre.setText("Nombre(s)");

        jl_apellidop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_apellidop.setText("Apellido paterno");

        jl_apellidom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_apellidom.setText("Apellido materno");

        jl_dia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_dia.setText("Dia");

        jl_mes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_mes.setText("Mes");

        jl_anio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_anio.setText("Año");

        jtf_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtf_apellidop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtf_apellidom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtf_dia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtf_mes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtf_anio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jb_calcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_calcular.setText("Calcular");

        jl_rfc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_rfc.setText("RFC:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_apellidop)
                            .addComponent(jl_apellidom)
                            .addComponent(jl_dia)
                            .addComponent(jl_mes)
                            .addComponent(jl_anio)
                            .addComponent(jl_rfc))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_nombre)
                            .addComponent(jtf_apellidop)
                            .addComponent(jtf_apellidom)
                            .addComponent(jtf_dia)
                            .addComponent(jtf_mes)
                            .addComponent(jtf_anio, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jb_calcular)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_apellidop)
                    .addComponent(jtf_apellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_apellidom)
                    .addComponent(jtf_apellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_dia)
                    .addComponent(jtf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_mes)
                    .addComponent(jtf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_anio)
                    .addComponent(jtf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jb_calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jl_rfc)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRFC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jb_calcular;
    public javax.swing.JLabel jl_anio;
    public javax.swing.JLabel jl_apellidom;
    public javax.swing.JLabel jl_apellidop;
    public javax.swing.JLabel jl_dia;
    public javax.swing.JLabel jl_mes;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_rfc;
    public javax.swing.JTextField jtf_anio;
    public javax.swing.JTextField jtf_apellidom;
    public javax.swing.JTextField jtf_apellidop;
    public javax.swing.JTextField jtf_dia;
    public javax.swing.JTextField jtf_mes;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}