# Programación A
## UF1: Programación estructurada
### 1. Introducción a la programación

El **lenguaje de programación** es una herramienta para transformar un algoritmo en un programa. Entendiendo **algoritmo** como una secuencia finita de operaciones que resuelven un problema expuesto. Un programa debe de cumplir una serie de características:

- Deber ser **finito**: formado por un conjunto limitado de líneas.
- Debe ser **legible**: Es importante crear códigos “limpios” y fáciles de leer con tabulaciones y espacios que diferencien las partes del programa.
- Debe ser **modificable**: Debe ser sencillo el proceso de actualización o modificación de este ante nuevas necesidades
- Debe ser **eficiente**: Debemos crear programas que ocupen poco espacio en memoria y se ejecuten rápidamente
- Debe ser **modulable**: Debemos realizar algoritmos que se dividan a su vez en subalgoritmos de forma que se disponga de un grupo principal desde el que llamaremos al resto. Así, incitamos a la reutilización de código.
- Debe ser **estructurado**: Engloba a las características anteriores ya que, un programa estructurado será fácil de leer, modificar y estará compuesto de subprogramas que permitirán la reutilización de código.

Para tener una representación gráfica de un algoritmo utilizamos los diagramas de flujo.

Un **diagrama de flujo** es una representación gráfica de un proceso. Cada paso del proceso se representa por un símbolo diferente que contiene una breve descripción de la etapa de proceso.

Debemos usar una serie de símbolos estándar:

---

Características de los diagramas de flujo:

- Los diagramas de flujo deben escribirse de arriba abajo o de izquierda a derecha
- Debemos evitar el cruce de líneas, para eso se define la forma de conector. El uso de conectores debe producirse cuando no exista otra opción
- Todas las líneas de flujo deben estar conectadas a algún objeto
- A la hora de escribir texto en las formas, este debe ser escueto y legible
- Todos los símbolos de decisión deben tener más de una línea de salida, es decir, deben indicar qué camino seguir en función de la decisión tomada.

El **proceso de programación** comunica un usuario y una máquina. Para que se pueda realizar esta comunicación debemos de tener:

- Los dos agentes principales, **receptor** y **emisor** (usuario y máquina).
- **Canal**: para asemejar el ejemplo con el que estamos explicando el proceso de programación, podemos decir que nuestro canal es el teclado.
- **Lenguaje**: aquí es donde viene la dificultad, ya que los agentes hablan un lenguaje completamente diferente. Para que la comunicación sea fluida debemos de acercar los lenguajes y, tanto la máquina como el usuario, hacer forzar el entendimiento. 

Para solventar el problema de la comunicación, aparecen lenguajes de programación de dos tipos: **alto nivel** y **bajo nivel**. Los lenguajes de alto nivel están más cerca del lenguaje que habla el usuario, mientras que los lenguajes de bajo nivel están más cerca de las estructuras del lenguaje de la máquina.

---

Para facilitar nuestro trabajo, implementaremos nuestro código con lenguajes de alto nivel. Necesitando un proceso de traducción para convertir el programa escrito en lenguaje máquina.

Características del lenguaje de alto nivel:

- Es totalmente independiente a la máquina y, por tanto, muy portable.
- Muy utilizado en el mercado laboral informático.
- Amplio juego de instrucciones.
- Tanto las modificaciones como las actualizaciones son muy fáciles de realizar.
- Para la tarea de traducción de código necesitamos un compilador y un enlazador con librerías del propio lenguaje de programación elegido.

---

A lo largo de esta unidad formativa hablaremos de la estructura de un programa informático y de sus elementos principales como son las variables, las constantes y los distintos operadores que podemos usar a la hora de implementar un código fuente.

Continuaremos hablando del control que podemos tener sobre un código a la hora de su proceso de compilación. Este control de ejecución es fundamental cuando
construimos cualquier programa en un lenguaje de alto nivel. En una programación estructurada, las instrucciones deben ejecutarse una detrás de otra, dependiendo de una serie de condiciones que pueden cumplir o no. Estas instrucciones pueden repetirse diferentes veces hasta que lleguen a cumplir alguna condición especificada.

En este capítulo nos vamos a centrar en el lenguaje de programación C# porque:

- Es un lenguaje sencillo y cómodo de utilizar.
- Es recomendable a la hora de crear instrucciones para cualquier ámbito.
- Es un lenguaje orientado a objetos.
- Utiliza el recolector de basura.
- Permite la unificación de tipos.

### 2. Estructura de un programa informático

En el lenguaje de programación C# podemos tener una aplicación formada por uno o varios ficheros con su código fuente correspondiente, teniendo en cuenta que solo uno de ellos va a ser el principal.

Para todas las pruebas que realizaremos vamos a utilizar el programa Visual Studio. Con este programa vamos a ir generando los diferentes proyectos. Cada vez que creemos un proyecto nuevo, el programa va a generar solo un fichero de código fuente, que es el que va a dar lugar al ejecutable que necesita la aplicación.

Este fichero que se genera debe tener la extensión *.cs*, ya que es la extensión utilizada por los ficheros en C#.

#### 2.1 Bloques de un programa informático

Podemos definir un programa como una secuencia de instrucciones separadas por punto y coma, que se van a ir agrupando en diferentes bloques mediante llaves.

Si implementamos un programa en C# debe tener, como mínimo, la parte del programa principal:

```c#
void main(){
// Bloque de implementación
}
```

Toda clase que vaya a ser ejecutada debe contener la función **Main**. Una función es un trozo de código al que se le domina con un nombre, de forma que cada vez que queramos ejecutar ese código solo tendremos que indicar el nombre de la función.

La función main no tiene ningún argumento y no devuelve parámetro. Las “{}” delimitan el bloque en C#. Todos los programas van a tener una función *main()* que se va a ejecutar al principio.

Es conveniente ir añadiendo comentarios a nuestro programa sobre los pasos que se van realizando. Los comentarios van con “//” si el comentario ocupa una sola línea y “/* */” si el comentario ocupa diferentes líneas.

A continuación, vamos a ver cómo sería un programa básico en C# que imprima una frase por pantalla:

```c#
/*Programa que muestre por pantalla la frase Buenas tardes*/
// Nombre del archivo BuenasTardes.cs
public class Hello1
{
 public static void Main()
 {
 System.Console.WriteLine("Buenas Tardes");
 }
}
```

La primera parte, con los símbolos ”/*” y “*/” es un comentario donde se explica lo que hay que hacer en el ejercicio. A continuación, se declara la clase “Hello1”.

Una **clase** consta de **métodos** (funciones) y datos de características comunes.

Dentro de la función Main(), tenemos el operador “System.Console.WriteLine”, que muestra por pantalla el mensaje “Buenas Tardes”.

Las operaciones de E/S se realizan de forma diferente según el lenguaje de programación que se utilice. En C necesita funciones declaradas en “stdio.h”, mientras que en C++ utiliza “stream”, que es el que se refiere al flujo de la información mediante “E/S”.

#### 2.2. Variables. Usos y tipos

Las **variables** podemos definirlas como un espacio de memoria identificada por un nombre, que puede ir variando a lo largo de un programa. Cuando hablamos de variables nos referimos al símbolo que vamos a utilizar para identificar un elemento de un conjunto determinado.

A la hora de desarrollar un programa, las variables se utilizan para almacenar unos datos determinados. Se pueden nombrar a lo largo de todo el programa.

Las variables tienen como ámbito de trabajo el bloque donde han sido definidas. Se definen al comienzo del bloque y, al salir de él, se destruyen.

Cada variable va a almacenar un tipo de dato como:

***Insertar tabla***

Para definir una variable necesitamos conocer primero el tipo de datos que va a almacenar y, a continuación, el nombre que le vamos a asignar. Es recomendable que este nombre tenga relación con el ejercicio que estemos desarrollando.

Para identificar a una variable, y que tenga un identificador válido por el compilador, debemos de seguir una serie de normas:

- Debe comenzar por un carácter (letra o “_”)
- Debe de estar formada por caracteres del alfabeto (no podemos usar “ñ” ni palabras acentuadas), de dígitos (del 0 al 9) y se puede utilizar subrayado (_).
- No debe comenzar con un dígito.
- Distingue entre mayúsculas y minúsculas.
- No puede llevar espacios en blanco.

Debe cumplir la siguiente sentencia:

 *[cualificador] <tipo> <nombre_variable>;*
 
 Y en C# lo pondríamos de la siguiente forma:
 
 ```c#
 int num
 ```

En este caso estamos definiendo una variable de tipo entero denominada “num”. A las variables también se le puede asignar un valor:

 ```c#
 int num = 5;
 ```

Definimos una variable de tipo entero, denominada “num” y le asignamos el valor de 5.

Cuando definimos una variable, es importante que sepamos cuánto espacio nos va a ocupar para intentar seleccionar qué tipo de variable es la más adecuada.

Podemos encontrar dos tipos de variables diferentes: globales y locales.
- **Local**: si está definida dentro de un bloque.
- **Global**: si está definida fuera de un bloque, pero se puede acceder a ella.

#### 2.3. Constantes. Tipos y utilidades

En el apartado anterior hemos hablado de las variables como espacio de memoria donde se almacenan datos que pueden variar a lo largo del programa. Ahora trabajaremos con los espacios de memoria donde no se puede alterar su contenido a lo largo del programa, las constantes.

Son muy parecidas a las variables como hemos indicado anteriormente, aunque añadiendo la palabra “const”. Se definen de la siguiente forma:

```
const <tipo> <nombre de la variable>
```

Por ejemplo:

```c#
const int numero
```

Declaramos una constante de tipo entero que denominamos *num*. A continuación, declararemos una constante llamada "dias_semana", con el valor de 7, ya que todas las semanas tienen 7 días.

```c#
class Calendar1
{
 public const int dias_semanas = 7;
}
```

#### 2.4. Operadores del lenguaje de programación

Para poder operar con las diferentes variables, utilizaremos una serie de operaciones que detallamos en las siguientes tablas:

***Insertar tablas***

2.5. Conversiones de tipos de clase

Como hemos visto anteriormente, un programa consta de numerosas variables de diferentes tipos, que suelen declararse al comienzo de este. Sin embargo, conforme vamos avanzando en el programa y realizando operaciones o almacenando resultados, es posible que tengamos que ir adaptando las variables a los nuevos tipos de datos que estemos utilizando. Esta conversión recibe el nombre de **casting**.

```c#
double resultado;
int numero1 = 3, numero2 = 9;
resultado = numero1;
numero2 = (int)resultado;
```

En este fragmento de código declaramos una variable denominada “resultado” de tipo “double” y otras dos de tipo entero: “numero1” y “numero2”. Les asignamos respectivamente, los valores 1 y 4.

Al decir que “resultado=numero1” estamos realizando una operación de asignación de un valor entero a una variable “double”. No se produce error porque el programa interpreta la variable “resultado1=3.0”.

En la última línea, si no tuviéramos el paréntesis “(int)” asignaríamos un valor “double” a una variable entera, y, por tanto, el compilador no nos dejaría, ya que el tipo de datos “double” es decimal, y el tipo de datos “int” es entero, por tanto, desperdiciaríamos la parte decimal de la variable. Para solventar este problema hacemos uso del “casting”, es decir, conversión de tipo. Por tanto ponemos entre paréntesis el tipo de datos al que queremos convertir el valor, para que tenga el mismo tipo que la variable destino. En este caso es entero.

Con esto estamos diciendo que el valor de resultado va a ser un número entero, pero nuestra variable resultado seguirá siendo de tipo “double”.

#### 2.6. Comentarios al código

A lo largo de esta unidad formativa nos estamos introduciendo en la creación por parte de un programador de código fuente con una finalidad concreta. No debemos pasar por alto el hecho de que, además de realizar programas, lo debemos de hacer de la forma más óptima y ordenada posible.

En el ámbito de la organización entra en escena el concepto de los comentarios. Herramienta disponible en el compilador, para que el programador pueda hacer anotaciones en el propio código sin que sea procesado por el compilador. Estas anotaciones deben de esclarecer el propio código y ayudar a entender las sentencias del programa.

En el lenguaje de programación C# está permitido hacer dos tipos de comentarios:
- **Comentarios de una línea**: son frases cortas y, por tanto, solo pueden ocupar una línea del código. Debemos de escribir “//” antes de comenzar con dichas anotaciones.
- **Comentarios multiline o multi-líneas**: se utilizan para hacer una explicación mucho más detallada del código en cuestión. También podemos hacer uso de este tipo de comentarios cuando deseamos que una parte de código no sea procesada por el compilador. En este caso, debemos de englobar el texto entre los caracteres “/*” y “*/”.

El uso de los comentarios es muy útil y, por tanto, aconsejamos a los programadores a que implementen programas con tantos comentarios como sea posible para documentar el código.

### 3. Programación estructurada

La **programación estructurada** es la manera que tenemos de escribir o diseñar un programa de una forma clara y concisa. Vamos a hacerlo siempre siguiendo tres estructuras básicas: **secuencial**, **condicional** e **iterativa**.

A finales de los años setenta surgió una nueva forma de desarrollar los programas que, además de conseguir el correcto funcionamiento de estos, también facilitó su comprensión gracias a la forma en la que estaban escritos. Estos programas resultaron ser más fiables y eficientes.

En esta época fue cuando **Edsger Dijkstra** comprobó que todo programa se puede escribir utilizando únicamente tres instrucciones de control:

- **Secuencia de instrucciones**.
- **Instrucción condicional**.
- **Iteración o bucle de instrucciones**.

Utilizando estas tres estructuras (Teorema de Dijkstra), se pueden crear programas informáticos, a pesar de que los lenguajes ofrecen un repertorio de instrucciones bastante mayor. 

#### 3.1. Fundamentos de programación

Cuando hablamos de programar, debemos tener una idea general de a qué nos referimos. En este caso, podemos definir el concepto de programar como decirle a una máquina qué debe realizar en el menor tiempo posible.

Ahora bien, para llegar a buen fin, es conveniente especificar la estructura y el comportamiento de un determinado programa, probar que realiza la tarea que le ha sido asignada de forma correcta y que ofrece un buen rendimiento.

El programa se encarga de transformar la entrada en salida:

---

Por su parte, el algoritmo es la secuencia de los pasos y las distintas operaciones que debe realizar el programa para conseguir resolver un problema planteado. Dicho programa debe implementar el algoritmo en un lenguaje de programación especificado previamente.

En resumen, podemos señalar que **la programación es una etapa en todo el proceso de desarrollo que existe a la hora de resolver un problema**.

#### 3.2. Introducción a la algoritmia

Las personas estamos acostumbradas a obedecer una serie de órdenes secuenciales y lógicas. Lo mismo pasa con los ordenadores, que realizan diferentes tareas siguiendo una serie de pasos lógicos, ya que están programados (mediante algoritmos) para solucionar distintos problemas en un lenguaje de programación determinado.

La **algoritmia** es un conjunto ordenado y finito de operaciones que permite encontrar la solución a un problema cualquiera.

Es fundamental que logremos desarrollar y utilizar nuestra mente en forma de algoritmo, ya que, como la vida misma, la programación consiste en buscar la solución óptima para un problema determinado. Todo esto se consigue mediante el diseño, creación e implementación de un algoritmo. 

#### 3.3. Diseño de algoritmos

***Insertar diagrama***

La imagen representa el ciclo de vida de un programa informático, de manera que las flechas indican el orden de realización de cada etapa. 

- **Análisis de requisitos**: a partir de las necesidades del usuario o del programa planteado, se decide qué es lo que hay que hacer para llegar a conseguir una solución óptima, y se genera un documento de requisitos. El contenido de comunicación de esta etapa es muy intenso, ya que el objetivo es eliminar la ambigüedad en la medida de lo posible.
- **Diseño de la arquitectura**: se hace un estudio para ver los distintos componentes que van a formar parte de nuestro programa (módulos, subsistemas, etc.) y se genera un documento de diseño. Esta fase se va a revisar todas las veces que sea necesario hasta que estemos seguros de cuál va a ser la mejor solución.
- **Etapa de implementación o codificación**: en esta etapa vamos a pasar a codificar las aplicaciones que hemos elegido en la etapa anterior, empleando el lenguaje de programación con el que estemos trabajando. El resultado que vamos a obtener va a ser el código fuente.
- **Pruebas de integración**: hay que realizar ensayos del funcionamiento, combinando todos los módulos de la aplicación. Así, haciendo funcionar la aplicación completa, comprobamos que cumple lo establecido en el diseño.
- **Pruebas de validación**: el último paso de la integración se basa en realizar nuevas pruebas de la aplicación en su conjunto. El objetivo es cerciorarse de que se cumple lo establecido en el documento de requisitos y que cubre las necesidades de los usuarios que ya habíamos previsto.
- **Fase de mantenimiento**: revisar todo el proceso anterior e ir actualizando o modificando los cambios oportunos en las etapas anteriores.

#### 3.4. Prueba de programas

Una vez implementado y compilado el código de nuestro algoritmo, debemos ponerlo en marcha y comenzar la etapa de *testing*, plan de prueba o prueba de programa.

Se prueba un programa para demostrar la existencia de un defecto: algorítmico, de sintaxis, de precisión, de documentación, de sobrecarga, de capacidad, de rendimiento, de sincronización, de recuperación, de hardware y software y de estándares.

Este proceso de prueba de programa se lleva a cabo de manera automática o manual, persiguiendo los siguientes objetivos:
- Comprobación de los requisitos funcionales y no funcionales del programa.
- Probar todo tipo de casos para detectar algún tipo de anomalía en su ejecución.

El plan de prueba consta de varias etapas, ya que, después de implementar el código, si existiera algún tipo de fallo en el programa, tendríamos que volver a empezar con el nuevo código modificado.

#### 3.5. Tipos de datos: simples y compuestos

C# es un lenguaje de programación en el que cada variable, constante, atributo o valor que devuelve una función se encuentra establecido en un rango de elementos ya definidos.

Podemos diferenciar entre:
- Tipos simples:

A la hora de seleccionar un determinado tipo, debemos considerar el rango de valores que puede tomar, las operaciones a realizar y el espacio necesario
para almacenar datos.

Debemos tener en cuenta que el tipo de datos simple no está compuesto por otros tipos, y que contiene un valor único.
- Tipos simples predefinidos: entre sus propiedades más importantes podemos destacar que son indivisibles, tienen existencia propia y permiten operadores relacionales.

Se utilizan sin necesidad de ser definidos previamente.
En pseudolenguaje, son los siguientes:
- Natural: números naturales (N): byte, uint, ushort, ulong.
- Entero: números enteros (Z): sbyte, int, long, short.
- Real: números reales (R): decimal, float, double.
- Carácter: caracteres (C): char.
- Lógico: booleanos (B): bool.

- Tipos simples definidos por el usuario
- Tipos enumerados: ofrecen la posibilidad de definir nuevos tipos simples. Estos tipos se declaran en el apartado "tipos" de un programa de la siguiente forma:

```c#
ENUM {Id1, Id2, Id3} IdTipoEnumerado
public class EnumTest
{
 enum Dias { Domingo,Lunes,Martes,Miercoles,Jueves,Viernes,Sabado };
 static void Main()
 {
 int x = (int)Dias.Domingo;
 int y = (int)Dias.Viernes;
 Console.WriteLine("Domingo = {0}", x);
 Console.WriteLine("Viernes = {0}", y);
 }
}
/* Salida:
 Domingo = 0
 Viernes = 5
*/
```

- Tipos compuestos o estructurados: se crean mediante la unión de varios tipos (simples o compuestos)

 - Vectores: se utilizan para agrupar distintas variables de un mismo tipo con un nombre único. También son llamados *arrays unidimensionales*, es de decir, de una dimensión. Esa anotación también nos dice la cantidad de indicadores de posición que necesitamos para acceder a un elemento de la tabla. En este caso solo necesitamos una posición.

```
<tipo> [] <nombre> = new <tipo> [<tamaño>];
```
 Por ejemplo:
 
 ```c#
 int [] v = new int [10];
 ```
 Nos estamos declarando 10 enteros en un vector al que hemos llamado *v*.
 
 Para poder acceder a cada uno de ellos lo haremos de la siguiente forma, siempre recordando que la primera posición de todo array es el 0:
 
 - Matrices: unión de varios vectores de cualquier tipo simple (enteros, reales, etc.). También la podemos ver como un *array bidimensional*, por tanto, esos datos nos indican que necesitamos dos indicadores de posición para acceder al elemento.
 
```
Tipo [,] Nombre= new Tipo [filas, columnas];
```

Por ejemplo:

```c#
int [,] matriz = new bool[2,3];
```
 En este caso, estamos declarando una matriz denominada *matriz*, de tipo entero, que consta de 2 filas y 3 columnas.

## UF3: Fundamentos de gestión de ficheros
### 1.0. Gestión de ficheros

Todo lo que llevamos visto hasta aquí ha sido mediante variables, estructuras de datos, y hemos manipulado la información de la que disponíamos. Esta información, una vez que finaliza la ejecución del software, desaparece de memoria, ya que ha estado almacenada en la memoria principal el tiempo que dura la ejecución del software.

Una vez que llegamos al tema de los ficheros, cambia un poco la forma de trabajar que traíamos, de manera que vamos a utilizar nuevas estructuras o métodos que van a permitir que la información no se volatilice, es decir, que no se borre cuando terminemos el proceso de ejecución.

### 1.1. Definición y tipos de ficheros

Podemos ver los **ficheros** como una parte de un dispositivo no volátil a la que se le asigna un nombre, y que puede contener una cantidad de datos que va a estar limitada, o por la cantidad de espacio del que disponga el dispositivo o por las características del sistema operativo. Entendemos por dispositivos no volátiles aquellos que no pierden la información que poseen cuando apagamos nuestro ordenador.

Debido a la importancia que tienen los ficheros al actuar de almacenes no volátiles de la información, la *BCL* reserva un espacio de nombres denominados *System.IO*, y están destinados a trabajar con ellos.

Cada sistema operativo puede tener un formato diferente de nombres de ficheros, nosotros vamos a centrarnos en la plataforma .NET, que consiste básicamente en nombrar los ficheros utilizando como máximo 259 caracteres diferentes según el siguiente formato:

```xml
<nombre_fichero>.<extension>
<nombre_fichero> nombre del fichero.
<extension> tipo del fichero del que se trata
```

Los ficheros se almacenan en directorios o carpetas. Cada directorio puede contener, a su vez, otros directorios diferentes, y esto hace que el sistema de archivos vaya creando una estructura jerárquica en la que cada fichero o directorio tiene como padre al directorio que lo contiene. Como es lógico, y para que esta estructura sea finita, debe existir un directorio raíz que va a ser el que contenga a todos los demás y no tenga dependencia de ningún otro.

**En resumen**:

Los ficheros o archivos son una secuencia de bits (0 y 1) que se almacenan en un dispositivo de almacenamiento secundario, por lo que la información va a permanecer a pesar de que se cierre la aplicación que los utilice. Esto da más independencia sobre la información, ya que no necesitamos que el programa se esté ejecutando para que la información que contiene exista. Cuando se diseña un programa y se quiere guardar información en algún fichero, el programador es el encargado de indicar cómo se va a hacer. Los ficheros tienen la ventaja de poder almacenar gran cantidad de información.

A la hora de trabajar con ficheros debemos tener en cuenta:

- La información es un conjunto de 0 y 1.
- Al agrupar los bits se forman bytes o palabras.
- Los tipos de datos van a estar formados por un conjunto de bytes o palabras.
- Al agrupar los campos se crean los registros de información.
- Un fichero es creado por un conjunto de ficheros de manera que todos tienen en común la misma estructura.
- Los directorios tienen la función de agrupar distintos ficheros siguiendo unas condiciones determinadas dadas por el sistema operativo o por el programador.

**Utilidades de los ficheros**: 

- Permiten organizar más fácilmente el sistema de archivos.
- Evitan conflictos con sus nombres, ya que cada programa instala sus ficheros en directorios diferentes. Por tanto, en una misma máquina pueden existir dos ficheros identificados por el mismo nombre, ya que como van a tener distinta ruta, lo vamos a poder diferenciar. Como se puede comprobar, la relación entre ficheros y directorio es muy cercana, en C# se establece entre tipos y espacio de nombres.

**Rutas de ficheros y directorios**:

### 1.2. Operaciones sobre ficheros secuenciales
### 1.3. Diseño y modulación de las operaciones sobre ficheros
#### 1.3.1. Fundamentos de los flujos
#### 1.3.2. Clases de flujos
