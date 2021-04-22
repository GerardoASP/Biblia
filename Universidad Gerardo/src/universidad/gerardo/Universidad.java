/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.gerardo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author simon
 */
public class Universidad {

    public String nombre;
    public String ciudad;
    public Estudiante[] estudiantes;
    public int numeroEst;
    public int cantidadEstudiantes;
    public ArrayList<Trabajador> listaTrabajadores;
    public ArrayList<Departamento> listaDepartamentos;

    public Universidad(int numeroEst) {
        this.numeroEst = numeroEst;
        estudiantes = new Estudiante[numeroEst];
        cantidadEstudiantes = 0;
        listaTrabajadores = new ArrayList<>();
        listaDepartamentos = new ArrayList<>();
    }

    public Universidad(String nombre, String ciudad, int numeroEst) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroEst = numeroEst;
        estudiantes = new Estudiante[numeroEst];
        this.cantidadEstudiantes = 0;
        listaTrabajadores = new ArrayList<>();
        listaDepartamentos = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int CI, String direccion, long codigo, float promedio, String carrera) {
        Estudiante nuevo = new Estudiante(nombre, CI, direccion, codigo, promedio, carrera);
        estudiantes[cantidadEstudiantes] = nuevo;
        cantidadEstudiantes++;
    }

    public Estudiante buscarEstudiante(long codigo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getCodigo() == codigo) {
                return estudiantes[i];
            }
        }
        System.out.println("No se encontró");
        return null;
    }

    public String listarEstudiantes() {
        String resultado = "";
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                resultado += estudiante+"\n";
            }
        }
        return resultado;
    }
    
    public void agregarTrabajador(String nombre, long CI, String direccion,String fechaInicio,int salario) {
        Trabajador nuevo = new Trabajador(nombre, CI, direccion, fechaInicio, salario);
        listaTrabajadores.add(nuevo);
    }
    
    public Trabajador buscarTrabajador(String nombre) {
        for (Trabajador t : listaTrabajadores) {
            if (t != null && t.nombre.equals(nombre)) {
                return t;
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Trabajador");
        return null;
    }
    
    public String listarTrabajadores() {
        String resultado = "";
        for (Trabajador t: listaTrabajadores) {
            if (t != null) {
                resultado += t+"\n";
            }
        }
        return resultado;
    }
    
    public void agregarDepartamento(String nombre,String grupoInvestigacion,long codigo){
        Departamento nuevo = new Departamento(nombre, grupoInvestigacion, codigo);
        listaDepartamentos.add(nuevo);
    }
    
    public Departamento buscarDepartamento(String nombre) {
        for (Departamento departamento: listaDepartamentos) {
            if (departamento != null && departamento.nombre.equals(nombre)) {
                return departamento;
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Trabajador");
        return null;
    }
    
    public String listarDepartamentos() {
        String resultado = "";
        for (Departamento d: listaDepartamentos) {
            if (d != null) {
                resultado += d+"\n";
            }
        }
        return resultado;
    }
    
    public Estudiante mejorPromedio() {
        Estudiante aux = new Estudiante();
        float mejorPromedio = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.promedio >= mejorPromedio) {
                mejorPromedio = estudiante.promedio;
                aux = estudiante;
            }
        }
        return aux;
    }

    public Estudiante mejorPromedioForI() {
        float mejorPromedio = 0;
        int indice = -1;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].promedio >= mejorPromedio) {
                mejorPromedio = estudiantes[i].promedio;
                indice = i;
            }

        }
        return estudiantes[indice];
    }

    public void mostrarEstPromedioBajito() {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.promedio < 3) {
                System.out.println("" + estudiante);
            }
        }
    }

    public ArrayList<Estudiante> listarRiesgo() {
        ArrayList<Estudiante> estRiesgo = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.promedio < 3) {
                estRiesgo.add(estudiante);
            }
        }
               
        return estRiesgo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nCiudad: " + this.ciudad + "\nNum estudiantes: " + this.numeroEst;
    }
}
