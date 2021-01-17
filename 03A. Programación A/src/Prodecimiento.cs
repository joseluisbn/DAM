using System;

namespace FuncionVSprocedimiento
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 15;
            int b = 54;

            suma(a, b);

        }

        //Un procedimiento se diferencia de una función en que no devuelven nada. Agregamos la palabra void
        static void suma(int num1, int num2)
        {
            int resultado = num1 + num2;
            Console.WriteLine(resultado);
        }
    }
}
