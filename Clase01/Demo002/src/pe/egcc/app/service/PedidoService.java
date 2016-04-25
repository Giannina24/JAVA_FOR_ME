
package pe.egcc.app.service;


public class PedidoService {
 
    public Double CalcImpuesto (Double importe){
     return importe*0.18;
    }
    
    public Double Total(Double importe){
    return importe+CalcImpuesto(importe);
    }
    
}
