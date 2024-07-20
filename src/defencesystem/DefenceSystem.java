/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defencesystem;

import defencesystem.controller.DefenceObservable;
import defencesystem.view.Submarine;
import defencesystem.view.MainController;
import defencesystem.view.Tank;
import defencesystem.view.Helicopter;

/**
 *
 * @author Naveen Chathurya
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController.getInstance().setDefenceObservable(DefenceObservable.getInstance());
        DefenceObservable.getInstance().addDefences(Helicopter.getInstance());
        DefenceObservable.getInstance().addDefences(Tank.getInstance());
        DefenceObservable.getInstance().addDefences(Submarine.getInstance());
    }
}