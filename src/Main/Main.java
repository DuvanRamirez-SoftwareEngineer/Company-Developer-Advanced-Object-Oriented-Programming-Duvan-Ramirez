/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import modelos.Empleado;
import modelos.Empresa;
import operaciones.OperacionEmpleado;
import operaciones.OperacionEmpresa;
import operaciones.IOperacionEmpleado;
import operaciones.IOperacionEmpresa;

public class Main {
    public static void main(String[] args) {
        // Crear empleados y empresas
        Empleado empleado1 = new Empleado("12345", "Duvan Ramirez", 10.0f);
        Empleado empleado2 = new Empleado("67890", "Jennifer Lopez", 12.0f);

        Empresa empresa1 = new Empresa();
        empresa1.setNit("ABC123");
        empresa1.setNombre("IU Digital");
        empresa1.setDireccion("Calle 123");
        empresa1.setCiudad("Medellin");

        // Crear instancias de las operaciones
        IOperacionEmpleado operacionEmpleado = new OperacionEmpleado();
        IOperacionEmpresa operacionEmpresa = new OperacionEmpresa();

        // Agregar empleados y empresas
        operacionEmpleado.agregarEmpleado(empleado1);
        operacionEmpleado.agregarEmpleado(empleado2);

        operacionEmpresa.agregarEmpresa(empresa1);

        // Listar empleados y empresas
        operacionEmpleado.listarEmpleados();
        operacionEmpresa.listarEmpresas();

        // Buscar empleado y empresa por documento y NIT
        Empleado empleadoEncontrado = operacionEmpleado.buscarEmpleado("12345");
        Empresa empresaEncontrada = operacionEmpresa.buscarEmpresa("ABC123");

        if (empleadoEncontrado != null) {
            System.out.println("Empleado encontrado: " + empleadoEncontrado.getNombre());
        } else {
            System.out.println("Empleado no encontrado.");
        }

        if (empresaEncontrada != null) {
            System.out.println("Empresa encontrada: " + empresaEncontrada.getNombre());
        } else {
            System.out.println("Empresa no encontrada.");
        }
    }
}



