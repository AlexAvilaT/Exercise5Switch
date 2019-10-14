module Exercise5Switch 

import java.util.Scanner;
public class exercise {

	public static void main(String[] args)
	{
	//Declaracion de constantes
	
	//declaracion de variables
		
	int nMonth=0;
	char answer's';
	
	//object construction
	Scanner input = new Scanner(System.in);
	
	do
	{
		
	}while(respuesta=='s')
		
	//input data validation
	
	while(nMonth<=0)
	{	
		System.out.println("Give me a month number(only positive values:");
		nMonth = inputnexInt();
		if(nMonth<=0)
		{	
		System.out.println("Not valid data!");
		}
	{
	switch(nMonth)
		case 1: System.out.println("January");
		break;
		case 2: System.out.println("February");
		break;
		case 3: System.out.println("March");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		case 6: System.out.println("June");
		break;
		case 7: System.out.println("July");
		break;
		case 8: System.out.println("August");
		break;
		break;
		case 10: System.out.println("October");
		break;
		case 11: System.out.println("November");
		break;
		case 12: System.out.println("December");
		break;
		case 13: System.out.println("Number of month not valid");
		break;
		}
		System.out.println("Do you wish to visualize another month(y/n)");
		answer = input.next().charAt(0);
	}while (answer=='y');
	
	

	