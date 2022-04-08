/*
Atividade:
Escreva uma classe “EntradaDeCinema” com a seguinte estrutura
(dados):
 int idade
 float horário
 int sala
 float valor
E com as seguintes ações (métodos):
 Construtor: com a finalidade de inicializar todos os atributos.
 CalculaDesconto: que deve receber como parâmetro a idade do
cliente (do tipo int) e caso seja menor de 12 anos, deve ser dado um
desconto de 50% no valor normal.
 CalculaDesconto: que deve receber como parâmetro a idade do
cliente (do tipo int) e o número de sua carteira de estudante (do tipo
int). Se o estudante tiver idade entre 12 e 15 anos, deve ser dado
um desconto de 40%, de 16 a 20 um desconto de 30% e mais que
20 anos um desconto de 20% no valor normal.
 CalculaDescontoHorário: esse método deve dar um desconto de
10% sobre o valor aferido após todas as outras opções de desconto,
caso o horário do filme seja antes das 16 horas.
 Exibir(): que deve imprimir todos os dados do ingresso.
Desenvolva uma aplicação que leia os dados necessários para
instanciar e imprimir o ingresso para clientes normais, menores de 12
anos e estudantes.
*/
package atv_Cinema;
import java.util.Scanner;
public class Teste_Cinema {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   System.out.println("Qual a idade?");
   int idade=input.nextInt();
   System.out.println("Qual o horário");
   float horario= input.nextFloat();
   System.out.println("Qual o valor integral do ingresso?");
   float valor= input.nextFloat();
   System.out.println("Qual o número da sala do filme desejado?");
   int sala = input.nextInt();
   System.out.println("Qual o numero da carteirinha? Se não tiver, digite 0");
   int carteirinha = input.nextInt();
   EntradaDeCinema cine = new EntradaDeCinema(sala,idade,horario,valor);
   System.out.println("Teve desconto pela idade menor de 12 anos? "+ cine.calculaDesconto(idade));
   System.out.println("Quanto custou o ingresso com a carteirinha? " + cine.calculaDesconto(idade, carteirinha));
   System.out.println("Teve desconto pela pelo horário?"+ cine.calculaDescontoHorario(horario));
   System.out.println("As informações do ingresso: "+ cine.exibir());
 }
}