/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import javax.swing.*;
import modelos.*;
import operaciones.*;

public class Empresas {
    public static void main(String[] args) {
        IOperacionEmpleado operacionEmpleado = new OperacionEmpleado();
        IOperacionEmpresa operacionEmpresa = new OperacionEmpresa();

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de Operaciones:\n" +
                "1. Agregar Empresa\n" +
                "2. Agregar Empleado\n" +
                "3. Listar Empresas\n" +
                "4. Listar Empleados\n" +
                "5. Buscar Empleado por Documento\n" +
                "6. Calcular Sueldo de Empleado\n" +
                "7. Contar Empleados en una Empresa\n" +
                "8. Salir"
            ));

            switch (opcion) {
                case 1:
                    Empresa nuevaEmpresa = crearEmpresa();
                    operacionEmpresa.agregarEmpresa(nuevaEmpresa);
                    JOptionPane.showMessageDialog(null, "Empresa agregada correctamente.");
                    break;

                case 2:
                    Empleado nuevoEmpleado = crearEmpleado();
                    operacionEmpleado.agregarEmpleado(nuevoEmpleado);

                    String nitEmpresa = JOptionPane.showInputDialog("Ingrese el NIT de la empresa donde pertenece el empleado:");
                    Empresa empresaAsignada = operacionEmpresa.buscarEmpresa(nitEmpresa);
                    if (empresaAsignada != null) {
                        empresaAsignada.agregarEmpleado(nuevoEmpleado);
                        JOptionPane.showMessageDialog(null, "Empleado agregado correctamente a la empresa.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la empresa con el NIT ingresado.");
                    }
                    break;

                case 3:
                    operacionEmpresa.listarEmpresas();
                    break;

                case 4:
                    operacionEmpleado.listarEmpleados();
                    break;

                case 5:
                    String docBusqueda = JOptionPane.showInputDialog("Ingrese el documento del empleado a buscar:");
                    Empleado empleadoBuscado = operacionEmpleado.buscarEmpleado(docBusqueda);
                    if (empleadoBuscado != null) {
                        JOptionPane.showMessageDialog(null, empleadoBuscado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un empleado con el documento ingresado.");
                    }
                    break;

                case 6:
                    String docCalculo = JOptionPane.showInputDialog("Ingrese el documento del empleado para calcular sueldo:");
                    Empleado empleadoCalculo = operacionEmpleado.buscarEmpleado(docCalculo);
                    if (empleadoCalculo != null) {
                        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
                        float sueldoTotal = operacionEmpleado.calcularSueldo(empleadoCalculo, horasTrabajadas);
                        JOptionPane.showMessageDialog(null, "El sueldo total del empleado es: " + sueldoTotal);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un empleado con el documento ingresado.");
                    }
                    break;

                case 7:
                    String nitConteo = JOptionPane.showInputDialog("Ingrese el NIT de la empresa para contar empleados:");
                    Empresa empresaConteo = operacionEmpresa.buscarEmpresa(nitConteo);
                    if (empresaConteo != null) {
                        int cantidadEmpleados = operacionEmpresa.contarEmpleadosEnEmpresa(empresaConteo);
                        JOptionPane.showMessageDialog(null, "La empresa tiene " + cantidadEmpleados + " empleados.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la empresa con el NIT ingresado.");
                    }
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        } while (opcion != 8);
    }

    private static Empresa crearEmpresa() {
        String nit = JOptionPane.showInputDialog("Ingrese el NIT de la empresa:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección de la empresa:");
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad de la empresa:");

        Empresa nuevaEmpresa = new Empresa();
        nuevaEmpresa.setNit(nit);
        nuevaEmpresa.setNombre(nombre);
        nuevaEmpresa.setDireccion(direccion);
        nuevaEmpresa.setCiudad(ciudad);

        return nuevaEmpresa;
    }

    private static Empleado crearEmpleado() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        float sueldoHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo por hora del empleado:"));

        Empleado nuevoEmpleado = new Empleado(documento, nombre, sueldoHora);
        return nuevoEmpleado;
    }
}




