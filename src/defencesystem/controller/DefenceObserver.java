/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.controller;

import defencesystem.Strength;
import defencesystem.Strength;

/**
 *
 * @author Naveen Chathurya
 */
public interface DefenceObserver {
    public void areaClear(boolean b);
    public void sendMessage(String sendMessage,int index,boolean position);
    public void position(Strength strength);
}