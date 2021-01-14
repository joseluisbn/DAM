using System;
using System.IO;

namespace TratamientoFicheros
{
    class Program
    {
        static void Main(string[] args)
        {
            //Escritura texto

            FileStream fichero = new FileStream("C:/Pruebas/texto.txt", FileMode.Append, FileAccess.Write);
            StreamWriter fs = new StreamWriter(fichero);
            Console.WriteLine("Introduce una frase: ");
            string frase = Console.ReadLine();

            fs.WriteLine(frase);
            fs.Close();
            fichero.Close();


        }
    }
}
