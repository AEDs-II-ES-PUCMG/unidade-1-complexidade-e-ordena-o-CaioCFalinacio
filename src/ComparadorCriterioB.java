import java.util.Comparator;

/**
 * Critério B - Volume Total de Itens (crescente).
 * Desempate 1: Data do Pedido.
 * Desempate 2: Código Identificador do pedido.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        if(o1.getTotalItens() == o2.getTotalItens()){
            ComparadorPorData comparadorPorData = new ComparadorPorData(); 
            return comparadorPorData.compare(o1, o2);          
        }else if(o1.getTotalItens() > o2.getTotalItens()){
            return 1;
        }else{
            return -1;
        }
    }
}
