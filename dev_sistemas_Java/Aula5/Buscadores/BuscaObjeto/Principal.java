package Aula5.Buscadores.BuscaObjeto;

public class Principal {
    public static void main(String[] args) {
        Item[] itens = {
            new Item("uva",10),
            new Item("maça",8),
            new Item("pera",12),
            new Item("arroz",9),
            new Item("batata",12),
            new Item("milho",12),
        };

        for (int i=0; i<itens.length; i++) {
            System.out.println(" - Nome: " +itens[i].nome+ " - Valor R$ " +itens[i].valor);
        }

        BuscaObjeto.selectionSortPorNome(itens);
        System.out.println("\n\n");
        for (int i=0; i<itens.length; i++) {
            System.out.println(" - Nome: " +itens[i].nome+ " - Valor R$ " +itens[i].valor);
        }
    }
}
