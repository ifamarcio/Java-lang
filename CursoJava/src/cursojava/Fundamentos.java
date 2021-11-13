/**
 * 
 */
package cursojava;

/**
 * @author marcio
 *
 */
public class Fundamentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome ;
		int idade = 30;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arcondicionado = false;
		nome = "Márcio Viana";
		System.out.println("uso de variaveis na linguagem java");
		System.out.println("exempos:");
		System.out.println("Nome:" + nome);
		System.out.println("Idade:"+ idade);
		System.out.println("Sexo"+ sexo);
		System.out.println("Temperatura"+ temperatura);
		System.out.println("Arcondicionado"+ arcondicionado);
		System.out.println("_________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("operadores aritimeticos e seus atributos");
		System.out.println("exemplos:");
		System.out.println("i = "+i);
		System.out.println("i+="+i+"+5 | i ="+(i+5));
		System.out.println("i+="+i+"-5 | i ="+(i-5));
		System.out.println("i+="+i+"*5 | i ="+(i*5));
		System.out.println("i+="+i+"/5 | i ="+(i/5));
		System.out.println("i+="+i+"%5 | i ="+(i%5));
		System.out.println("i+= 5       |i ="+(i +=5));
		System.out.println("i-= 5       |i ="+(i -=5));
		System.out.println("i*= 5       |i ="+(i *=5));
		System.out.println("i/= 5       |i ="+(i /=5));
        i++;
        System.out.println("i++         |i ="+i);
        i--;
        System.out.println("i--         |i ="+i);

        System.out.println("_________________________________");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("estrutura de controle condicional");
		System.out.println("");
        System.out.println("exemplo 1 - uso do 'if'");
        if(sexo = = 'M') {
        	System.out.println("alistamento militar obrigatorio");
        }



	}

}
