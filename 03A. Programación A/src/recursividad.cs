using System;

namespace Recursividad
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Introduce el primer número de la suma");
            int n1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Introduce el segundo número de la suma");
            int n2 = Convert.ToInt32(Console.ReadLine());

            int suma = SumaRecursiva(n1, n2);

            Console.WriteLine(suma);

        }

        public static int SumaRecursiva(int a, int b)
        {
            int suma = a;

            if (a <= b)
            {
                a++;
                return suma = suma + SumaRecursiva(a, b);
            }

            return suma;
        }

    }
}
