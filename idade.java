package Java;
import java.util.Scanner;
import java.util.Calendar;


public class idade{

    public static void main(String[] args){

        //Declaração de variáveis
        String nome = new String();
        int dia, mes, ano, idade;
        
        //Variáveis de datas atuais
        Calendar data_atual = Calendar.getInstance();
        int ano_atual = data_atual.get(Calendar.YEAR);
        int mes_atual = data_atual.get(Calendar.MONTH) + 1; //É necessário acrescentar 1 pois nesse calendário a contagem dos meses começa em 0
        int dia_atual = data_atual.get(Calendar.DAY_OF_MONTH);
        
        //Obtenção de dados do usuário
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: \n");
        nome = input.next();

        System.out.print("Digite o dia do seu nascimento (dd): \n");
        dia = input.nextInt();
        
        System.out.print("Digite o mês do seu nascimento (mm): \n");
        mes = input.nextInt();

        System.out.print("Digite o ano do seu nascimento (yyyy): \n");
        ano = input.nextInt();

        input.close();

        //Subtração do ano atual pelo ano digitado pelo usuário
        idade = ano_atual - ano;

        //Caso seja aniversário do usuário :D
        if(dia == dia_atual && mes == mes_atual){
            
            System.out.print("Parabéns, " + nome + "!" + "\nHoje é seu aniversário de " + idade + " anos");
        }
        
        //Caso o usuário ainda não tenha feito aniversário, deve ser subtraído 1 do valor da variável 'idade'
        else if(dia > dia_atual && mes >= mes_atual){
            
            idade = idade - 1;
            System.out.print("Nome: " + nome + "\nIdade: " + idade);
        } 
        
        //Caso ele já tenha feito aniversário a o valor da variável 'idade' não é alterado
        else{
            
            System.out.print("Nome: " + nome + "\nIdade: " + idade);
        }
        
    }

}