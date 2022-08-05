/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.renatocorporation.ecommerce.repo;

import com.renatocorporation.ecommerce.dtos.FaturamentoMensal;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RenatoCampos
 */
public interface PedidoRepository extends CrudRepository<FaturamentoMensal, Integer>{
    
    /*
        Consultas mais elaboradas retornando DTO
        Consultas usando Queries JPA
    */
    @Query("SELECT new "
            + "com.renatocorporation.ecommerce.dtos.FaturamentoMensal(month(p.data), SUM(p.valorLiquido))"
            + " FROM Pedido p "
            + " WHERE YEAR(p.data) = :ano "
            + " GROUP BY MONTH(p.data)"
            + " ORDER BY MONTH(P.data)")
    public ArrayList<FaturamentoMensal> recoryMonthBilling(@Param("ano") Integer numero);
    
}
