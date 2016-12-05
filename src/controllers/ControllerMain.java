/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelLogin;
import views.ViewMain;
import models.ModelMain;
import views.ViewLogin;

/**
 *
 * @author sax
 */
public class ControllerMain {
    
    public ViewMain viewMain;
    public ModelMain modelMain;
    
    public ViewLogin viewLogin;
    public ModelLogin modelLogin;
    
    private ControllerItems controllerItems;
    private ControllerLogin controllerLogin;
    
    public ControllerMain(ModelMain modelMain, ViewMain viewMain, Object controllers[]){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        
        controllerItems = (ControllerItems)controllers[0];
        controllerLogin = (ControllerLogin)controllers[1];
        
        this.viewMain.jmiExit.addActionListener(actionListener);
        this.viewMain.jmiProductos.addActionListener(actionListener);
        this.viewMain.jmiLogin.addActionListener(actionListener);
        
        initView();
    }
    
    
    private void initView(){
        viewMain.setTitle("Acme Store");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == viewMain.jmiExit)
                jmiExitActionPerformed();
            else if(e.getSource() == viewMain.jmiProductos)
                jmiItemsActionPerformed();
            else if(e.getSource() == viewMain.jmiLogin)
                jmiLoginActionPerformed();
           
        }
    };
    
    private void jmiExitActionPerformed(){
        System.exit(0);
    }
    
    private void jmiItemsActionPerformed(){
        viewMain.setTitle("Productos");
        viewMain.setContentPane(controllerItems.viewItems);
        viewMain.revalidate();
        viewMain.repaint();
    }
    
     private void jmiLoginActionPerformed(){
        viewMain.setTitle("Login");
        viewMain.setContentPane(controllerLogin.viewLogin);
        viewMain.revalidate();
        viewMain.repaint();
    }
    
}
