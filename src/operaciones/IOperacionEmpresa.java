/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import modelos.Empresa;

public interface IOperacionEmpresa {
    void agregarEmpresa(Empresa empresa);
    void eliminarEmpresa(String nit);
    Empresa buscarEmpresa(String nit);
    void listarEmpresas();
    int contarEmpleadosEnEmpresa(Empresa empresa);
}
