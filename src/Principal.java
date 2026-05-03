import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;


public class Principal {

    public static void imprimirListaFucionarios (List<Funcionario> listaFuncionarios) {
        for(Funcionario f : listaFuncionarios) {
            System.out.printf("%-15s | %-15s | %-15.2f | %-15s%n",
                    f.getNome(),
                    f.getDataNascimento(),
                    f.getSalario(),
                    f.getFuncao());
        }}
    public static void listaFucionariosFormatados (List<Funcionario> listaFuncionarios) {
        for(Funcionario f : listaFuncionarios) {
            System.out.printf("%-15s | %-15s | %-15s | %-15s%n",
                    f.getNome(),
                    f.getdataNascimentoFormatada(),
                    f.getSalarioFormatado(),
                    f.getFuncao());
        }}
    public static void main(String[] args) {
        int opcaoEscolhida;
        Scanner listaOpcoes = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Map<String,List<Funcionario>>funcionarioPorFuncao = new HashMap<>();
        do {
            System.out.println("=====================Menu Principal=====================");
            System.out.println("1 - Inserir Funcionarios.");
            System.out.println("2 - Remover Funcionario João.");
            System.out.printf("3 - Listar Funcionarios.%n         ∟ informação de data deve ser exibido no formato dd/mm/aaaa;%n         ∟ informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula;%n");
            System.out.println("4 - Atualizar salário com reajuste de 10%.");
            System.out.println("5 - Agrupar Funcionarios em um MAP.");
            System.out.println("6 - Imprimir Lista de funcionarios agrupados por função.");
            System.out.println("7 - Imprimir os funcionários que fazem aniversário no mês 10 e 12.");
            System.out.println("8 - Imprimir o funcionario mais velho, Mostrar os atributos 'NOME' e 'IDADE'.");
            System.out.println("9 - Imprimir os funcionrios em ordem alfabetica.");
            System.out.println("10 - Imprimir o somatório dos salários dos funcionarios.");
            System.out.println("11 - Imprimir os salarios em salarios minimos. Salário minino 1212,00.");
            System.out.println("0 - Sair.");
            opcaoEscolhida = listaOpcoes.nextInt();

            switch (opcaoEscolhida) {
                //Inserir todos os funcionários, na mesma ordem e informações da tabela;
                case 1:
                    listaFuncionarios.add(new Funcionario("Maria", LocalDate.of(2000,10,18), BigDecimal.valueOf(2009.44),"Operador"));
                    listaFuncionarios.add(new Funcionario("João", LocalDate.of(1990,5,12),BigDecimal.valueOf(2284.38),"Operador"));
                    listaFuncionarios.add(new Funcionario("Caio", LocalDate.of(1961,5,2),BigDecimal.valueOf(9836.14),"Coordenador"));
                    listaFuncionarios.add(new Funcionario("Miguel", LocalDate.of(1988,10,14),BigDecimal.valueOf(19119.88),"Diretor"));
                    listaFuncionarios.add(new Funcionario("Alice", LocalDate.of(1998, 1, 5),BigDecimal.valueOf(2234.68),"Recepcionista"));
                    listaFuncionarios.add(new Funcionario("Heitor", LocalDate.of(1999,11,19),BigDecimal.valueOf(1582.72),"Operador"));
                    listaFuncionarios.add(new Funcionario("Arthur", LocalDate.of(1993,3,31),BigDecimal.valueOf(4071.84),"Contador"));
                    listaFuncionarios.add(new Funcionario("Laura", LocalDate.of(1994,7,8),BigDecimal.valueOf(3017.45),"Gerente"));
                    listaFuncionarios.add(new Funcionario("Heloísa", LocalDate.of(2003,5,24),BigDecimal.valueOf(1606.85),"Eletricista"));
                    listaFuncionarios.add(new Funcionario("Helena", LocalDate.of(1996,9,2),BigDecimal.valueOf(2799.93),"Gerente"));
                    System.out.println("Funcionarios inseridos com sucesso!");
                    imprimirListaFucionarios(listaFuncionarios);
                    break;

                //Remover o funcionário “João” da lista
                case 2:
                    listaFuncionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));
                    imprimirListaFucionarios(listaFuncionarios);
                    break;

               //Imprimir todos os funcionários com todas suas informações, sendo que:
                  // ∟ informação de data deve ser exibido no formato dd/mm/aaaa
                  // ∟ informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula
                case 3:
                    listaFucionariosFormatados(listaFuncionarios);
                    break;

                //Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
                case 4:
                    listaFuncionarios.forEach(f -> f.setSalario(f.getSalario().multiply(new BigDecimal("1.10"))));
                    imprimirListaFucionarios(listaFuncionarios);
                    break;

                //Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”
                case 5:
                    for(Funcionario f : listaFuncionarios) {
                        
                    }
                    System.out.println("Map Criado com  sucesso!");
                    break;

                //Imprimir os funcionários, agrupados por função.
                case 6:
                    funcionarioPorFuncao.forEach((funcao, listaFuncionarios))
            }
        }
    while (opcaoEscolhida != 0);
    listaOpcoes.close();
    }
}