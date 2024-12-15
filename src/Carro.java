public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    String nome = "car";

    void exibirInfo() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anoFabricacao);
        System.out.println(nome);
    }

    void atualizarAno(int ano) {
        anoFabricacao = ano;
    }
}
