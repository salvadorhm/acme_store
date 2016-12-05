/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author sax
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Object controllers[] = new Object[2];
        
        Modeltems modeltems = new Modeltems();
        ViewItems viewItems = new ViewItems();
        ControllerItems controllerItems = new ControllerItems(modeltems, viewItems);
        
        ModelLogin modelLogin = new ModelLogin();
        ViewLogin viewLogin = new ViewLogin();
        ControllerLogin controllerLogin = new ControllerLogin(modelLogin, viewLogin);
        
        controllers[0] = controllerItems;
        controllers[1] = controllerLogin;
        
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, controllers);
        
    }
    
}
