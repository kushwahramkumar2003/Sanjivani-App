/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.AppointmentDao;
import sanjeevaniapp.dao.DoctorsDao;
import sanjeevaniapp.dao.PatientDao;
import sanjeevaniapp.pojo.AppointmentPojo;
import sanjeevaniapp.pojo.PatientPojo;
import sanjeevaniapp.utility.OTPSender;
import sanjeevaniapp.utility.Sender;

/**
 *
 * @author Ramkumar
 */
public class AddPatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientFrame
     */
    List<String>doctorIds;
    String patientId;
    java.sql.Date dt;
    private PatientPojo patient;
    private boolean flag=false;
    private static int OTP=1000+(int)(Math.random()*999);
    public AddPatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadDoctorIds();
        getNewPatientId();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/sanjeevaniapp/icons/Logo4.png");    
        this.setIconImage(icon); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOPD = new javax.swing.JTextField();
        jcbDoctorId = new javax.swing.JComboBox<>();
        txtCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jcbGender = new javax.swing.JComboBox<>();
        jcbMarialStatus = new javax.swing.JComboBox<>();
        btnResendOtp = new javax.swing.JButton();
        btnVerifyOtp = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        btnSendOtp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOTP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel14.setText("Sanjeevani  Application ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 580, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 610, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(234, 243, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("OPD");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 28));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("First Name");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 23));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Age");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 74, 20));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("City");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 20));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("DOCTOR ID");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 21));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Patient Id");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 74, 25));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Gender");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Last Name");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 94, 21));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Phone No.");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, 19));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Date");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 72, 24));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Address");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 74, 26));

        txtPatientId.setEditable(false);
        txtPatientId.setBackground(new java.awt.Color(153, 153, 255));
        txtPatientId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        jPanel5.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        txtFName.setBackground(new java.awt.Color(153, 153, 255));
        txtFName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, -1));

        txtLName.setBackground(new java.awt.Color(153, 153, 255));
        txtLName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 120, -1));

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(153, 153, 255));
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 120, -1));

        txtPhoneNo.setBackground(new java.awt.Color(153, 153, 255));
        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Marial Status");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtOPD.setBackground(new java.awt.Color(153, 153, 255));
        txtOPD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });
        jPanel5.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, -1));

        jcbDoctorId.setBackground(new java.awt.Color(153, 153, 255));
        jcbDoctorId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(jcbDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, -1));

        txtCity.setBackground(new java.awt.Color(153, 153, 255));
        txtCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, -1));

        txtAreaAddress.setBackground(new java.awt.Color(153, 153, 255));
        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 60));

        jcbGender.setBackground(new java.awt.Color(153, 153, 255));
        jcbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        jPanel5.add(jcbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 120, -1));

        jcbMarialStatus.setBackground(new java.awt.Color(153, 153, 255));
        jcbMarialStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbMarialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Merrid", "Unmerrid", " " }));
        jPanel5.add(jcbMarialStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 110, -1));

        btnResendOtp.setBackground(new java.awt.Color(153, 204, 255));
        btnResendOtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResendOtp.setForeground(new java.awt.Color(0, 153, 102));
        btnResendOtp.setText("RESEND OTP");
        btnResendOtp.setEnabled(false);
        btnResendOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResendOtpActionPerformed(evt);
            }
        });
        jPanel5.add(btnResendOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 130, 30));

        btnVerifyOtp.setBackground(new java.awt.Color(153, 204, 255));
        btnVerifyOtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyOtp.setForeground(new java.awt.Color(0, 153, 102));
        btnVerifyOtp.setText("VERIFY OTP");
        btnVerifyOtp.setEnabled(false);
        btnVerifyOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyOtpActionPerformed(evt);
            }
        });
        jPanel5.add(btnVerifyOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, 70));

        txtAge.setBackground(new java.awt.Color(153, 153, 255));
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, -1));

        btnSendOtp.setBackground(new java.awt.Color(153, 204, 255));
        btnSendOtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendOtp.setForeground(new java.awt.Color(0, 153, 102));
        btnSendOtp.setText("SEND OTP");
        btnSendOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOtpActionPerformed(evt);
            }
        });
        jPanel5.add(btnSendOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("OTP");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        txtOTP.setEditable(false);
        txtOTP.setBackground(new java.awt.Color(153, 153, 255));
        txtOTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(txtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 120, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 698, 390));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 220, 243));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("Add Doctors");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 35));

        btnBack.setBackground(new java.awt.Color(153, 255, 153));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 105, 40));

        btnLogout1.setBackground(new java.awt.Color(153, 255, 153));
        btnLogout1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 107, 40));

        btnRegister.setBackground(new java.awt.Color(153, 255, 153));
        btnRegister.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister.setText("Register");
        btnRegister.setEnabled(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 218, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 170, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1010, 430));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1010, 570));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ReceptionistOptionsFrame f = new ReceptionistOptionsFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are You Sure?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ans==JOptionPane.YES_OPTION){
            LoginFrame f= new LoginFrame();
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
try{
            AppointmentPojo appojo=new AppointmentPojo();
            appojo.setAppointmentDate(patient.getDate().toString());
            appojo.setMobileNo(patient.getMno());
            appojo.setOpd(patient.getOpd());
            appojo.setPatientId(patient.getPatientId());
            appojo.setPatientName(txtFName.getText().trim()+" "+txtLName.getText().trim());
            appojo.setStatus("REQUEST");
            String docName=DoctorsDao.getDoctorNameById(patient.getDoctorId());
            appojo.setDoctorName(docName);
            boolean result1=PatientDao.addPatient(patient);
            boolean result2=AppointmentDao.addAppointment(appojo);
            if(result1 && result2){
                JOptionPane.showMessageDialog(null,"Patient record saved!!");
                ViewAllPatientDetails viewAll=new ViewAllPatientDetails();
                this.dispose();
                viewAll.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Sorry! could not save the patient record!");
            }
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Error in DB");
           ex.printStackTrace();
       }
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOPDActionPerformed

    private void btnResendOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResendOtpActionPerformed
        
        OTP = 1000+(int)(Math.random()*999);
        patient.setOtp(OTP);
        try{
           Sender sender=new OTPSender();
           String pOtp=String.valueOf(patient.getOtp());
           boolean result=sender.send(patient.getMno(), pOtp);
           if(result){
               JOptionPane.showMessageDialog(null,"OTP sent successfully!");
               
           }else{
               JOptionPane.showMessageDialog(null,"Cannot send the OTP . Please check the number!");
              
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnResendOtpActionPerformed

    private void btnSendOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOtpActionPerformed
        if(!validateInputs()){
            return;
        }
        if(flag){
            patient.setMno(txtPhoneNo.getText().trim());
            if(!isContactNoValid())
            {
                JOptionPane.showMessageDialog(null,"Please Input valid Mobile Number!");
                return;
            }
        }
        patient.setOtp(OTP);
        patient.setAptStatus("REQUEST");
        patient.setOpd(txtOPD.getText().trim());
        try{
           Sender sender=new OTPSender();
           String pOtp=String.valueOf(patient.getOtp());
            System.out.println(pOtp);
           boolean result=sender.send(patient.getMno(), pOtp);

           if(result){
               JOptionPane.showMessageDialog(null,"OTP sent successfully!");
               btnVerifyOtp.setEnabled(true);
               btnResendOtp.setEnabled(true);
               txtOTP.setEditable(true);
               btnSendOtp.setEnabled(false);
               txtOPD.setEditable(false);
               jcbDoctorId.setEnabled(false);
               txtAge.setEditable(false);
               txtCity.setEditable(false);
               jcbMarialStatus.setEnabled(false);
               txtAreaAddress.setEditable(false);
               txtFName.setEditable(false);
               txtLName.setEditable(false);
               jcbGender.setEnabled(false);
               txtPhoneNo.setEditable(false);
           }else{
               JOptionPane.showMessageDialog(null,"Cannot send the OTP . Please check the number!");
               System.out.println(patient.getMno());
               flag=true;
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnSendOtpActionPerformed

    private void btnVerifyOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyOtpActionPerformed
        if(!isValidOTP()){
            JOptionPane.showMessageDialog(null,"Invalid OTP. Try again!","Invalid OTP",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null,"OTP Verification Successful!!");
        btnRegister.setEnabled(true);
    }//GEN-LAST:event_btnVerifyOtpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminOptionsFrame f= new AdminOptionsFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnResendOtp;
    private javax.swing.JButton btnSendOtp;
    private javax.swing.JButton btnVerifyOtp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbDoctorId;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JComboBox<String> jcbMarialStatus;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
private void loadDoctorIds() {
        try{
            doctorIds=DoctorsDao.getAllDoctorId();
            for(String docId:doctorIds){
                jcbDoctorId.addItem(docId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB:"+ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
    }

    private void getNewPatientId() {
        try{
            patientId=PatientDao.getNewPatientId();
            
            txtPatientId.setText(patientId);
            Date today=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            String dateStr=sdf.format(today);
            txtDate.setText(dateStr);
            java.util.Date d1=sdf.parse(dateStr);
            long ms=d1.getTime();
            dt=new java.sql.Date(ms);
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB:"+ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
        catch(ParseException ex){
            JOptionPane.showMessageDialog(null,"Error in date conversion:"+ex);
            ex.printStackTrace();
        }
    }
   private boolean validateInputs(){
       patient=new PatientPojo();
       patient.setPatientId(txtPatientId.getText().trim());
       //patient.setAge(txtAge.getText().trim());
       patient.setCity(txtCity.getText().trim());
       patient.setAddress(txtAreaAddress.getText().trim());
       patient.setFirstName(txtFName.getText().trim());
       patient.setLastName(txtLName.getText().trim());
       patient.setGender(jcbGender.getSelectedItem().toString());
       patient.setMarriedStatus(jcbMarialStatus.getSelectedItem().toString());
       patient.setDoctorId(jcbDoctorId.getSelectedItem().toString());
       
       
       
       
       patient.setDate(dt);
       patient.setMno(txtPhoneNo.getText().trim());
       if(patient.getCity().isEmpty()||patient.getFirstName().isEmpty()||patient.getLastName().isEmpty()||patient.getAddress().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"Please fill all the fields");
           return false;
           
       }  
           
    try{
           patient.setAge(Integer.parseInt(txtAge.getText().trim()));
           
       }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Invalid age"+ex);
          return false;
       }
    if(!isContactNoValid()){
        JOptionPane.showMessageDialog(null,"Invalid Mobile no");
        return false;
    }
    return true;
   }
   private boolean isContactNoValid(){
      char[]mob=patient.getMno().toCharArray();
      for(char ch:mob){
          if(Character.isDigit(ch)==false)
              return false;
      }
      if(patient.getMno().length()==10)
            return true;
      return false;
  }
   private boolean isValidOTP() {
        boolean result=false;
        try{
            int otp=Integer.parseInt(txtOTP.getText().trim());
            if(otp==patient.getOtp())
                result=true;
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please input digits only!");
           
        }finally{
            return result;
        }
        
    }
}
