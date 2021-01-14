using System;
using System.IO;

namespace TratamientoFicheros
{
    class Program
    {
        static void Main(string[] args)
        {
            
            //Lectura de un fichero binario

            FileStream fichero = new FileStream("C:/Pruebas/imagen.jpg", FileMode.Open, FileAccess.Read);
            byte[] buffer = new byte[fichero.Length]; //Un entero de 8 bits sin signo.
            fichero.Read(buffer, 0, buffer.Length);
            for (int i = 0; i < buffer.Length; i++)
            {
                Console.WriteLine(buffer[i]);
            }
            fichero.Close();
        }
    }
}
