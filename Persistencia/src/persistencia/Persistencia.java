package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Persistencia {

    public static void main(String[] args) {
        // instanciações rebuscadas kakakajota
        Scanner x = new Scanner(System.in);
        File dados = new File("dados.txt");
        Pessoa pessoa;
        
        try {
            if (!dados.exists()) {
                dados.createNewFile();
                System.out.println("Aquivo criado com sucesso\n");
            } else {
                System.out.println("Arquivo criado\n");
            }
        } catch (IOException e) {
            System.out.println("Erro na criação do arquivo 'dados.txt'.");
        }

        // uma mera opção
        int op;

        System.out.println("Digite:\n0 para inserir novos dados no arquivo \n1 para ler os dados do arquivo");
        op = x.nextInt();

        switch (op) {
            case 0:
                try {
                    FileWriter fwriter = new FileWriter(dados);
                    BufferedWriter bfwriter = new BufferedWriter(fwriter);

                    FileReader freader = new FileReader(dados);
                    BufferedReader bfreader = new BufferedReader(freader);

                    int novo;

                    do {
                        pessoa = new Pessoa();
                        Random random = new Random(1000000);

                        pessoa.id = random.nextInt(100000);
                        System.out.print("Nome completo: ");
                        pessoa.nome = x.nextLine();
                        x.nextLine();
                        System.out.print("Endereco: ");
                        pessoa.endereco = x.nextLine();
                        System.out.print("CPF: ");
                        pessoa.cpf = x.nextLine();
                        System.out.print("Data de Nascimento: ");
                        pessoa.data_nasc = x.nextLine();
                        System.out.print("Altura (cm): ");
                        pessoa.altura = x.nextInt();
                        System.out.print("Peso (kg): ");
                        pessoa.peso = x.nextFloat();
                        System.out.print("Salario (R$): ");
                        pessoa.salario = x.nextFloat();

                        // criação do arquivo caso não exista
                        String texto;
                        texto = pessoa.id.toString() + "&" + pessoa.nome + "&" + pessoa.cpf + "&" + pessoa.endereco + "&"
                                + pessoa.data_nasc + "&" + pessoa.altura.toString() + "&" + pessoa.peso.toString() + "&" + pessoa.salario.toString() + "\n";
                        bfwriter.write(texto);

                        System.out.println("Para adicionar outro usuário, digite 0.");
                        novo = x.nextInt();

                    } while (novo == 0);

                    bfwriter.close();
                    fwriter.close();

                } catch (IOException e) {
                    System.out.println("Erro ao salvar dados.");
                }

                break;
            case 1:
                try {
                    FileReader freader = new FileReader(dados);
                    BufferedReader bfreader = new BufferedReader(freader);
                    
                    pessoa = new Pessoa();
                    String linha;
                    int cont = 0;

                    System.out.println("Dados do arquivo \n");
                    while ((linha = bfreader.readLine()) != null) {
                        cont++;
                        String conteudo[] = linha.split("&");

                        pessoa.id = Integer.parseInt(conteudo[0]);
                        pessoa.nome = conteudo[1];
                        pessoa.cpf = conteudo[2];
                        pessoa.endereco = conteudo[3];
                        pessoa.data_nasc = conteudo[4];
                        pessoa.altura = Integer.parseInt(conteudo[5]);
                        pessoa.peso = Float.parseFloat(conteudo[6]);
                        pessoa.salario = Float.parseFloat(conteudo[7]);

                        System.out.println("Usuário: " + cont);
                        System.out.println("Id: " + pessoa.id);
                        System.out.println("Nome completo: " + pessoa.nome);
                        System.out.println("CPF: " + pessoa.cpf);
                        System.out.println("Endereço: " + pessoa.endereco);
                        System.out.println("Data de Nascimento: " + pessoa.data_nasc);
                        System.out.println("Altura: " + pessoa.altura);
                        System.out.println("Peso: " + pessoa.peso);
                        System.out.println("Salário: " + pessoa.salario + "\n");
                    }

                    bfreader.close();
                    freader.close();

                } catch (IOException e) {
                    System.out.println("Erro ao ler os dados.");
                }

                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}

//                        informações do Usuário
//                        String nome;
//                        String cpf;
//                        String data_nasc;
//                        String endereco;
//                        Integer id;
//                        Integer altura;
//                        Float peso;
//                        Float salario;

//                        id = random.nextInt();
//                        x.nextLine();
//                        System.out.print("Nome completo: ");
//                        nome = x.nextLine();
//                        x.nextLine();
//                        System.out.print("Endereço: ");
//                        endereco = x.nextLine();
//                        System.out.print("Data de Nascimento: ");
//                        data_nasc = x.nextLine();
//                        System.out.print("CPF: ");
//                        cpf = x.nextLine();
//                        System.out.print("Altura (cm): ");
//                        altura = x.nextInt();
//                        System.out.print("Peso (kg): ");
//                        peso = x.nextFloat();
//                        System.out.print("Salário (R$): ");
//                        salario = x.nextFloat();
//                        x.nextLine();
/*
                        bfwriter.write("Id: " + id.toString());
                        bfwriter.newLine();
                        bfwriter.write("Nome completo: " + nome);
                        bfwriter.newLine();
                        bfwriter.write("CPF: " + cpf);
                        bfwriter.newLine();
                        bfwriter.write("Endereço: " + endereco);
                        bfwriter.newLine();
                        bfwriter.write("Data de Nascimento: " + data_nasc);
                        bfwriter.newLine();
                        bfwriter.write("Altura: " + altura.toString());
                        bfwriter.newLine();
                        bfwriter.write("Peso: " + peso.toString());
                        bfwriter.newLine();
                        bfwriter.write("Salário: " + salario.toString());
                        bfwriter.newLine();
                        bfwriter.write("&&%&");
                        bfwriter.newLine();
 */
//                        StringTokenizer st = new StringTokenizer(linha, "|&|");
//
//                        while (st.hasMoreTokens()) {
//                            System.out.print(st.nextToken());
//                        }
//                        System.out.println();
