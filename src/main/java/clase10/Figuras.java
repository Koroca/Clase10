package clase10;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTEL
 */
public class Figuras {
    public void  cuadrado(){
        int lado,area;
        lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
        area = lado*lado;
        JOptionPane.showMessageDialog(null,"El area del cuadrado es : "+ area);
    }
    public void triangulo(){
    
        double base,altura,area;
        
        base= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null," El area del triangulo es : " + area);
    } 
    public void circulo(){
        double radio,pi=3.14,area;
        
        radio = radio= Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el radio del circulo " ));
        area = pi*Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null," El area del ciruclo es : " + area);
    }
}
