/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import modelos.Empresa;

import java.util.ArrayList;
import java.util.List;

public class OperacionEmpresa implements IOperacionEmpresa {
    private List<Empresa> empresas;

    public OperacionEmpresa() {
        empresas = new ArrayList<>();
    }

    @Override
    public void agregarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    @Override
    public void eliminarEmpresa(String nit) {
        empresas.removeIf(empresa -> empresa.getNit().equals(nit));
    }

    @Override
    public Empresa buscarEmpresa(String nit) {
        for (Empresa empresa : empresas) {
            if (empresa.getNit().equals(nit)) {
                return empresa;
            }
        }
        return null;
    }

    @Override
    public void listarEmpresas() {
        System.out.println("Lista de empresas:");
        for (Empresa empresa : empresas) {
            System.out.println(empresa);
        }
    }

    @Override
    public int contarEmpleadosEnEmpresa(Empresa empresa) {
        return empresa.contarEmpleados();
    }
}
