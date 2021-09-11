/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.service.dao;

import ec.edu.espe.distribuidas.villarreal.mongo.model.ATM;
import ec.edu.espe.distribuidas.villarreal.mongo.model.Transaccion;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author terry
 */
public interface TransaccionRepository extends MongoRepository<Transaccion, String> {
   List<ATM> findByCantidad (Integer cantidad);
   List<ATM> listAll(); 
}