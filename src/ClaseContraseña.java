/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
/**
 *Nombre: Claudia Veas M.
 * @author LAB03
 * Fecha: Noviembre 06 de 2017
 * Programa: ClaseContraseña
 * Responsabilidad: Clase Principal
 */
public class ClaseContraseña 
{
   

     public static void main(String[] args) 
    {
   int contraseña = 2403 ;
   int index = 3;
   int maximo=3;
    while(index !=3 )
        {
        //stop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println(index);
        index=3;//Incrementamos la variable en 1
                
      }
    
   contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña"));
        if (contraseña!=3)
        {
            JOptionPane.showMessageDialog(null, "Intentelo nuevamente");  
        }
        else
        {
            
        }
        contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña nuevamente"));
        if (contraseña!=3)
        {
          JOptionPane.showMessageDialog(null, "Intentelo nuevamente");   
        }
        
        else
        {
        }
         contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ultimo intento"));
        if (contraseña!=3) 
        {
         JOptionPane.showMessageDialog(null, "Cuenta bloqueada, comuniquese con soporte tecnico");   
        }
        
                
      }
    
    }
