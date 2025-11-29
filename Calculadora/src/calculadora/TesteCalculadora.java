/**
 * <p><strong>Projeto TesteCalculadora</strong></p>
 * 
 * <p>Esta classe realiza os testes com as operações matemáticas, para que o sistema funcione corretamente
 * e trate todas as exceções, para que o usuário consiga realizar todos os calculos que deseja.</p>
 * <p>Esse Projeto é utilizado para realizar:</p>
 * <ul>
 * 		<li>Técnicas de revisão estático (caixa branca)</li>
 * 		<li>Técnicas de revisão (caixa branca)</li>
 * 		<li>Aplicação de refatoração em código java</li>
 * 		<li>Documentação com javadoc</li>
 * 
 * </ul>
 *  *<p>Após a refatoração, os métodos da classe Calculadora, tornaram-se <strong>métodos puros</strong>,
 *  sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *  
 *  @author Luiz Eduardo
 *  @version 1.0
 */
package calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		/**
		 * Print no console inserindo novos objetos com os valores e operador matemático, para a realização do cálculo
		 * 
		 * @System.out.println os valores são inseridos, logo em seguida o operador matemático
		 * @try realiza os testes de exceções
		 * @catch informa erro caso caia em exceção
		 */
		
		System.out.println(calc.calcular(2, 3, "+"));
		System.out.println(calc.calcular(10, 4, "-"));
		System.out.println(calc.calcular(3, 5, "*"));
		System.out.println(calc.calcular(8, 2, "/"));
		
		try {
			System.out.println(calc.calcular(8, 0, "/")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calc.calcular(5, 5, "x")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
