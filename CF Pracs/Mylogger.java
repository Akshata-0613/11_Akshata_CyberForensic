/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylogger;
import java.io.*;
import java.util.logging.*;
public class Mylogger
{
    public static void main(String args[])
    {
        Logger l=Logger.getLogger(Mylogger.class.getName());
        FileHandler fh;
        try
        {
            fh=new FileHandler("c:/mylogfile.log",true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter f=new SimpleFormatter();
            fh.setFormatter(f);
            l.info(" my first log");
        } 
        catch(SecurityException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();    
        }
        l.info("How r u?");
            
    }
            
    
            
}