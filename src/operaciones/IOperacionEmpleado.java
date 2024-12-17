/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import modelos.Empleado;

public interface IOperacionEmpleado {
    void agregarEmpleado(Empleado empleado);
    void eliminarEmpleado(String documento);
    Empleado buscarEmpleado(String documento);
    void listarEmpleados();
    float calcularSueldo(Empleado empleado, int horasTrabajadas);
}
