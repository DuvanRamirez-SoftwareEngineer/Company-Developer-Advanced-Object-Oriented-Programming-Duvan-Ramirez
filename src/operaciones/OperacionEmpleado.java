/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import modelos.Empleado;

import java.util.ArrayList;
import java.util.List;

public class OperacionEmpleado implements IOperacionEmpleado {
    private List<Empleado> empleados;

    public OperacionEmpleado() {
        empleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void eliminarEmpleado(String documento) {
        empleados.removeIf(empleado -> empleado.getDocumento().equals(documento));
    }

    @Override
    public Empleado buscarEmpleado(String documento) {
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    @Override
    public void listarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    @Override
    public float calcularSueldo(Empleado empleado, int horasTrabajadas) {
        return empleado.getSueldoHora() * horasTrabajadas;
    }
}
