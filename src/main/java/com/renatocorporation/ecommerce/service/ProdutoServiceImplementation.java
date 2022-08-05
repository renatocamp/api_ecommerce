
package com.renatocorporation.ecommerce.service;

import com.renatocorporation.ecommerce.model.Produto;
import com.renatocorporation.ecommerce.repo.ProdutoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RenatoCampos
 */
@Service
public class ProdutoServiceImplementation implements IProdutoService{

    @Autowired
    private ProdutoRepository repository;
    
    @Override
    public ArrayList<Produto> findAll() {
        return (ArrayList<Produto>)repository.findAll();
    }

    @Override
    public Produto findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Produto createNew(Produto novo) {
        return repository.save(novo);
    }
    
}
