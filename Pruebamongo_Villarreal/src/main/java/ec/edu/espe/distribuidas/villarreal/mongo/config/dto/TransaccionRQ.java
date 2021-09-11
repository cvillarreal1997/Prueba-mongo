/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.config.dto;

/**
 *
 * @author terry
 */

import java.math.BigDecimal;
import lombok.Data;

@Data
public class TransaccionRQ {
    
    private String codigoCajero;
    private String tipo;
    private BigDecimal monto;
    private Integer cantidad10;
    private Integer cantidad20;
    
}