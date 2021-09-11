/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.service.dao;

import ec.edu.espe.distribuidas.villarreal.mongo.model.ATM;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author terry
 */
public interface ATMRepository extends MongoRepository<ATM, String> {
   List<ATM> findByMonto (Integer cantidad);
}
