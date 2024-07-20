/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.controller;

import defencesystem.Strength;
import defencesystem.view.MainController;
import java.util.ArrayList;

/**
 *
 * @author Naveen Chathurya
 */
public class DefenceObservable {
    private static DefenceObservable defenceObservable;
    private MainController mainController = MainController.getInstance();
    
    public static DefenceObservable getInstance() {
        if(defenceObservable==null) 
            defenceObservable = new DefenceObservable();
        return defenceObservable;
    }
    
    private DefenceObservable(){}
    
    final private ArrayList<DefenceObserver> list = new ArrayList<>();
    
    public void addDefences(DefenceObserver defenceObserver){
        list.add(defenceObserver);
    }

    public void areaClear(boolean b){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).areaClear(b);
        }
    }
    
    public void sendMessage(String sendMessage,int index,boolean position){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sendMessage(sendMessage,index,position);
        }
    }
    
    public void position(Strength strength){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).position(strength);
        }
    }
   
    public void setCountsSub(int soldier, int ammo) {
        mainController.setCountsSub(soldier, ammo);
    }

    public void setCountsTank(int soldier, int ammo, int sliderValue) {
        mainController.setCountsTank(soldier, ammo, sliderValue);
    }

    public void setCountsHeli(int soldier, int ammo, int sliderValue) {
        mainController.setCountsHeli(soldier, ammo, sliderValue);
    }    

    public void recieveMessageSub(String message) {
        mainController.recieveMessage(message);
    }

    public void recieveMessageTank(String message) {
        mainController.recieveMessage(message);
    }

    public void recieveMessageHeli(String message) {
        mainController.recieveMessage(message);
    }
}