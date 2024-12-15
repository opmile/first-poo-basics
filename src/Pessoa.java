public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;

    int anoNascimento() {
        int anoAtual = 2024;
        return anoAtual - idade;

    }
}
