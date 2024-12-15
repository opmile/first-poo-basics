public class Main {
    public static void main(String[] args) {
        // car class
        Carro newCar = new Carro();
        newCar.marca = "Honda";
        newCar.modelo = "1.0";
        newCar.anoFabricacao = 2010;
        System.out.println(newCar.nome);
        newCar.exibirInfo();

        // person class
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();

        pessoa.endereco = endereco;
        pessoa.endereco.rua = 56;
        pessoa.endereco.numero = 79;
        pessoa.endereco.bairro = "jardins";
        pessoa.endereco.cidade = "são paulo";
        pessoa.endereco.estado = "são paulo";

        // bank account class
        ContaBancaria conta = new ContaBancaria();
        Pessoa clienteConta = new Pessoa();

        conta.titular.nome = "milena";
        conta.titular.endereco.rua = 56;
    }
}