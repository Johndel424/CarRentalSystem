
package component;



import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import main.Main;
import net.miginfocom.swing.MigLayout;
import swing.Button;
import swing.ButtonOutLine;

import main.Buycar;
import main.Cars;
import main.RentCarMain;
import main.Rentcar;
import main.TradeCar;
import main.Transactionmain;
import main.clients;
public class PanelLoginAndRegister extends javax.swing.JLayeredPane {
private ButtonOutLine button;
private ActionListener event;
private JLabel description;
    private JLabel description1;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Gear1Auto Service Offered");
        label.setFont(new Font("Ocr a extended", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        register.add(label);
        
        Button cmd = new Button();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("Buy a Car");
        register.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                Buycar jd = new Buycar();
                jd.setVisible(true);
            }
        });
        Button cdmd = new Button();
        cdmd.setBackground(new Color(7, 164, 121));
        cdmd.setForeground(new Color(250, 250, 250));
        cdmd.setText("Rent a Car");
        register.add(cdmd, "w 40%, h 40");
        cdmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                Rentcar jd = new Rentcar();
                jd.setVisible(true);
                Main jgd = new Main();
                jgd.setVisible(false);
            }
        });
        Button cmmd = new Button();
        cmmd.setBackground(new Color(7, 164, 121));
        cmmd.setForeground(new Color(250, 250, 250));
        cmmd.setText("Trade a Car");
        register.add(cmmd, "w 40%, h 40");
        cmmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                TradeCar jd = new TradeCar();
                jd.setVisible(true);
                
            }
        });
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        
        JLabel label = new JLabel("GearOneAuto");
        label.setFont(new Font("Ocr a extended", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        login.add(label);
        JLabel gqiqlabel = new JLabel("");
        gqiqlabel.setFont(new Font("sansserif", 1, 30));
        gqiqlabel.setForeground(new Color(7, 164, 121));
        login.add(gqiqlabel);
        
        
        Button cmd = new Button();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("List of All Cars");
        login.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                Cars jd = new Cars();
                jd.setVisible(true);
                
            }
        });
        Button cejmd = new Button();
        cejmd.setBackground(new Color(7, 164, 121));
        cejmd.setForeground(new Color(250, 250, 250));
        cejmd.setText("List of Clients");
        login.add(cejmd, "w 40%, h 40");
        cejmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                clients jd = new clients();
                jd.setVisible(true);
                
            }
        });
        Button cemd = new Button();
        cemd.setBackground(new Color(7, 164, 121));
        cemd.setForeground(new Color(250, 250, 250));
        cemd.setText("Transactions Here");
        login.add(cemd, "w 40%, h 40");
        cemd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                Transactionmain jd = new Transactionmain();
                jd.setVisible(true);
                
            }
        });
        JLabel glabel = new JLabel("Est.2023");
        glabel.setFont(new Font("sansserif", 1, 30));
        glabel.setForeground(new Color(7, 164, 121));
        login.add(glabel);
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(217, 218, 139));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
