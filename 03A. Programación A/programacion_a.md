## Programación A
### UF3: Fundamentos de gestión de ficheros

Todo lo que llevamos visto hasta aquí ha sido mediante variables, estructuras de datos, y hemos manipulado la información de la que disponíamos. Esta información, una vez que finaliza la ejecución del software, desaparece de memoria, ya que ha estado almacenada en la memoria principal el tiempo que dura la ejecución del software.

Una vez que llegamos al tema de los ficheros, cambia un poco la forma de trabajar que traíamos, de manera que vamos a utilizar nuevas estructuras o métodos que van a permitir que la información no se volatilice, es decir, que no se borre cuando terminemos el proceso de ejecución.

#### 1.0. Gestión de ficheros
#### 1.1. Definición y tipos de ficheros

Podemos ver los ficheros como una parte de un dispositivo no volátil a la que se le asigna un nombre, y que puede contener una cantidad de datos que va a estar limitada, o por la cantidad de espacio del que disponga el dispositivo o por las características del sistema operativo. Entendemos por dispositivos no volátiles aquellos que no pierden la información que poseen cuando apagamos nuestro ordenador.

Debido a la importancia que tienen los ficheros al actuar de almacenes no volátiles de la información, la BCL reserva un espacio de nombres denominados Systm.IO, y están destinados a trabajar con ellos.

Cada sistema operativo puede tener un formato diferente de nombres de ficheros, nosotros vamos a centrarnos en la plataforma .NET, que consiste básicamente en nombrar los ficheros utilizando como máximo 259 caracteres diferentes según el siguiente formato:


#### 1.2. Operaciones sobre ficheros secuenciales
#### 1.3. Diseño y modulación de las operaciones sobre ficheros
##### 1.3.1. Fundamentos de los flujos
##### 1.3.2. Clases de flujos
