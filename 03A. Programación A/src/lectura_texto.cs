using System;
using System.IO;

namespace TratamientoFicheros
{
    class Program
    {
        static void Main(string[] args)
        {
            //Lectura de ficheros de texto

            FileStream fichero = new FileStream("C:/Pruebas/texto.txt", FileMode.Open, FileAccess.Read);
            StreamReader fs = new StreamReader(fichero); // Proporciona una vista genérica de una secuencia de bytes
            string linea = "";
            while ((linea = fs.ReadLine()) != null)
                Console.WriteLine(linea);
            fs.Close();
            fichero.Close();
        }
    }
}
