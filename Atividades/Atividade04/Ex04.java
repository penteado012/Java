public class Ex04
{
	public static void main(String[] args)
	{
		int x = 2;
		switch(x)
		{
			case 1:
			x += 2;
			break;
			case 2:
			x++;
			case 3:
			x += 4;
			default:
			x += 2;
		}
		System.out.print(x);
	}
	//Como x é igual a 2, ele entra direto no case 2, estando no case 2 ele atribui mais um para o x, ficando 3, com x valendo 3 e case 2 nao possuindo break o codigo avanca para o case 3, o switch entra no case 3 que vai atribuir + 4 ao x, ficando x com valor de 7 como case 3 tambem nao possui break ele avança para o default, entrando no default que x é atribuido mais 2, logo x passa a valer 9
}