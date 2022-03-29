/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop;

import javax.swing.JOptionPane;

/**
 *
 * @author INTEL
 */
public class Colaborador {
    private String puesto;
    private String departamento;
    private int salario;
    
    public Colaborador(){
        
    }

    public Colaborador(String puesto, String departamento, int salario) {
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, " El nombre es : " +getNombre()
        +"\n la edad es : "+getEdad()
        +"\n el genero es : "+getGenero()
        +"\n el Salario es : " +salario
        +"\n la edad es : " +puesto
        +"\n la edad es : " +departamento);
         
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getGenero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombre(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
