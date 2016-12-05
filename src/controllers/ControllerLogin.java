/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            if(e.getSource() == viewLogin.jbtn_login)
                login();
        }
    };
    
    private void login(){
        modelLogin.setUser(viewLogin.jtf_user.getText());
        modelLogin.setPassword(viewLogin.jtf_password.getText());
        modelLogin.login();
    }
}
