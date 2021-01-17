using System;

namespace FuncionSimple
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 15;
            int b = 54;

            //Creamos una variable (aunque no es necesario) para realizar la llamada a la función

            int final = suma(a, b);

            Console.WriteLine(final);
        }

        //Creación de la función fuera del método Main. Ponemos la directiva static
        static int suma(int num1, int num2)
        {
            int resultado = num1 + num2;
            return resultado;
        }
    }
}
