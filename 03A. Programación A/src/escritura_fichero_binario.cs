using System;
using System.IO;

namespace TratamientoFicheros
{
    class Program
    {
        static void Main(string[] args)
        {
        
            //Escritura en un fichero binario

            FileStream fichero = new FileStream("C:/Pruebas/imagen.jpg", FileMode.Open, FileAccess.Read);
            byte[] buffer = new byte[fichero.Length]; //Un entero de 8 bits sin signo.
            fichero.Read(buffer, 0, buffer.Length);
            for (int i = 1000; i < 2000; i++)
            {
                buffer[i] = 0;
            }
            
            FileStream fichero2 = new FileStream("C:/Pruebas/imagen2.jpg", FileMode.Create, FileAccess.Write);
            fichero2.Write(buffer, 0, buffer.Length);
            fichero.Close();
            fichero2.Close();
        }
    }
}
