/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.model;

import java.math.BigDecimal;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author terry
 */
@Data
@Document(collection = "ATM")
public class ATM {
    @Id
    private String id;
    private String nombre;
    private Integer cantidad;
     private Integer disponible;
}
