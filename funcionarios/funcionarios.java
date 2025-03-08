import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantidade, dia, mes, ano;
        String nome, sexo;
        
        do {
            System.out.println("Digite a quantidade de funcionarios para adicionar, minimo 10");
            quantidade = s.nextInt();
        } while(quantidade < 10);
        
        Database[] funcionarios = new Database[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            s.nextLine();

            System.out.println("Digite o nome do funcionario " + (i + 1));
            nome = s.nextLine();  
            
            System.out.println("Digite o sexo do funcionario " + (i + 1));
            sexo = s.nextLine();  
            
            System.out.println("Digite o dia do nascimento do funcionario " + (i + 1));
            dia = s.nextInt();  
            
            System.out.println("Digite o mes do nascimento do funcionario " + (i + 1));
            mes = s.nextInt(); 
            
            System.out.println("Digite o ano do nascimento do funcionario " + (i + 1));
            ano = s.nextInt(); 
            
            Data dataNascimento = new Data(dia, mes, ano); 
            funcionarios[i] = new Database(nome, sexo, dataNascimento); 
        }

        imprimirRelatorio(funcionarios);
        
        s.close();
    }

    public static void imprimirRelatorio(Database[] funcionarios) {
        int totalFeminino = 0;
        int totalMasculino = 0;
        int idadeTotal = 0;
        int idadeFeminino = 0;
        int idadeMasculino = 0;
        int countFeminino = 0;
        int countMasculino = 0;
        
        for (Database funcionario : funcionarios) {
            if (funcionario.getSexo().equalsIgnoreCase("F")) {
                totalFeminino++;
                idadeFeminino += funcionario.calculoIdade();
                countFeminino++;
            } else if (funcionario.getSexo().equalsIgnoreCase("M")) {
                totalMasculino++;
                idadeMasculino += funcionario.calculoIdade();
                countMasculino++;
            }
            idadeTotal += funcionario.calculoIdade();
        }

        System.out.println("Total de funcionários: " + funcionarios.length);
        double percentualFeminino = (totalFeminino * 100.0) / funcionarios.length;
        System.out.println("Funcionários do sexo feminino: " + totalFeminino + " (" + String.format("%.2f", percentualFeminino) + "%)");
        double percentualMasculino = (totalMasculino * 100.0) / funcionarios.length;
        System.out.println("Funcionários do sexo masculino: " + totalMasculino + " (" + String.format("%.2f", percentualMasculino) + "%)");

        double idadeMediaTotal = idadeTotal / (double) funcionarios.length;
        System.out.println("Idade média geral: " + String.format("%.2f", idadeMediaTotal));

        double idadeMediaFeminino = countFeminino > 0 ? (double) idadeFeminino / countFeminino : 0;
        System.out.println("Idade média das funcionárias do sexo feminino: " + String.format("%.2f", idadeMediaFeminino));

        double idadeMediaMasculino = countMasculino > 0 ? (double) idadeMasculino / countMasculino : 0;
        System.out.println("Idade média dos funcionários do sexo masculino: " + String.format("%.2f", idadeMediaMasculino));
    }
