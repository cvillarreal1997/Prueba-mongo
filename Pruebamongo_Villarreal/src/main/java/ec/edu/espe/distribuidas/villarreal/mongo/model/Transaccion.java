/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author terry
 */
@Data
@Document(collection = "transaccion")
public class Transaccion {
    @Id
    private String id;
    private String codigoCajero;
    private String tipo;
    private BigDecimal monto;
    private Integer dinero10;
    private Integer dinero20;
    private LocalDateTime fecha;
    private String estado;
    
}