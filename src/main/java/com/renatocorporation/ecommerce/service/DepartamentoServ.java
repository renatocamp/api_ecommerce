    
package com.renatocorporation.ecommerce.service;

import com.renatocorporation.ecommerce.model.Departamento;
import com.renatocorporation.ecommerce.repo.DepartamentoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RenatoCampos
 */
@Service
public class DepartamentoServ implements IDepartamentoServices{

    @Autowired
    private DepartamentoRepository deptoRepository;
    
    @Override
    public Departamento createNew(Departamento departamento) {
        if(departamento.getNome() != null){
            deptoRepository.save(departamento);
        }
        return null;
    }

    @Override
    public Departamento updateDepto(Departamento departamento) {
        if(departamento.getNumero() != null && departamento.getNome() != null){
            deptoRepository.save(departamento);
        }
        return null;
    }

    @Override
    public ArrayList<Departamento> searchAll() {
        return(ArrayList<Departamento>)deptoRepository.findAll();
    };
    
    

    @Override
    public Departamento findById(Integer id) {
        return deptoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        deptoRepository.deleteById(id);
    }
    
}
