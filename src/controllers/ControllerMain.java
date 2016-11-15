/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMain;
import models.ModelMain;

/**
 *
 * @author sax
 */
public class ControllerMain {
    
    public ViewMain viewMain;
    public ModelMain modelMain;
    
    private ControllerItems controllerItems;
    
    public ControllerMain(ModelMain modelMain, ViewMain viewMain, Object controllers[]){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        
        controllerItems = (ControllerItems)controllers[0];
        
        this.viewMain.jmiExit.addActionListener(actionListener);
        this.viewMain.jmiProductos.addActionListener(actionListener);
        
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
    
}
