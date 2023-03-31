/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

/**
 *
 * @author haifa salim
 */
class SprintEntry extends Entry{
    private int repetitions;
    private int recovery;
    
 public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec) {
        super(n,d,m,y,h,min,s,dist); 
     repetitions = rep;
     recovery = rec;
     //constructor
}
public int getRepetitions() {

        return repetitions;
//getRepetitions
}
public int getRecovery() {
        return recovery;
}//getRecovery

@Override
public String getEntry(){
   String result = getName()+" sprinted " + getRepetitions() + "x" + getDistance() + "km in "
             +getHour()+":"+getMin()+":"+ getSec() + " with " + getRecovery()+ " minutes recovery on "
             +getDay()+"/"+getMonth()+"/"+getYear()
+"\n";
   return result;
}}//getEntry

