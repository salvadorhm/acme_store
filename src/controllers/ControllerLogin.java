/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import models.ModelLogin;
import views.ViewLogin;

/**
 *
 * @author zeo
 */
public class ControllerLogin {

    public ModelLogin modelLogin;
    public ViewLogin viewLogin;

    private void initView() {
        viewLogin.setVisible(true);
    }

    public ControllerLogin(ModelLogin modelLogin, ViewLogin viewLogin) {
        this.modelLogin = modelLogin;
        this.viewLogin = viewLogin;

        this.viewLogin.jbtn_login.addActionListener(actionListener);
    }

    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewLogin.jbtn_login) {
                login();
            }
        }
    };

    private void login() {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(viewLogin.jtf_password.getText()));
            String md5_pass = String.format("%032x", new BigInteger(1, md5.digest()));
            
            modelLogin.setUser(viewLogin.jtf_user.getText());
            modelLogin.setPassword(md5_pass);
            modelLogin.login();
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(viewLogin, "Error al generar Hash");
        }
    }
}
