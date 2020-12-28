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

El proceso de programación comunica un usuario y una máquina. Para que se pueda realizar esta comunicación debemos de tener:

- Los dos agentes principales, receptor y emisor (usuario y máquina).
- Canal: para asemejar el ejemplo con el que estamos explicando el proceso de programación, podemos decir que nuestro canal es el teclado.
- Lenguaje: aquí es donde viene la dificultad, ya que los agentes hablan un lenguaje completamente diferente. Para que la comunicación sea fluida debemos de acercar los lenguajes y, tanto la máquina como el usuario, hacer forzar el entendimiento. 

Para solventar el problema de la comunicación, aparecen lenguajes de programación de dos tipos: alto nivel y bajo nivel. Los lenguajes de alto nivel están más cerca del lenguaje que habla el usuario, mientras que los lenguajes de bajo nivel están más cerca de las estructuras del lenguaje de la máquina.

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

### 3. Programación estructurada

La programación estructurada es la manera que tenemos de escribir o diseñar un programa de una forma clara y concisa. Vamos a hacerlo siempre siguiendo tres estructuras básicas: secuencial, condicional e iterativa.

A finales de los años setenta surgió una nueva forma de desarrollar los programas que, además de conseguir el correcto funcionamiento de estos, también facilitó su comprensión gracias a la forma en la que estaban escritos. Estos programas resultaron ser más fiables y eficientes.

En esta época fue cuando Edsger Dijkstra comprobó que todo programa se puede escribir utilizando únicamente tres instrucciones de control:

- Secuencia de instrucciones.
- Instrucción condicional.
- Iteración o bucle de instrucciones.

Utilizando estas tres estructuras, se pueden crear programas informáticos, a pesar de que los lenguajes ofrecen un repertorio de instrucciones bastante mayor. 

#### 3.1. Fundamentos de programación

Cuando hablamos de programar, debemos tener una idea general de a qué nos referimos. En este caso, podemos definir el concepto de programar como decirle a una máquina qué debe realizar en el menor tiempo posible.

Ahora bien, para llegar a buen fin, es conveniente especificar la estructura y el comportamiento de un determinado programa, probar que realiza la tarea que le ha sido asignada de forma correcta y que ofrece un buen rendimiento.

El programa se encarga de transformar la entrada en salida:

---

Por su parte, el algoritmo es la secuencia de los pasos y las distintas operaciones que debe realizar el programa para conseguir resolver un problema planteado. Dicho programa debe implementar el algoritmo en un lenguaje de programación especificado previamente.

En resumen, podemos señalar que la programación es una etapa en todo el proceso de desarrollo que existe a la hora de resolver un problema.

#### 3.2. Introducción a la algoritmia

Las personas estamos acostumbradas a obedecer una serie de órdenes secuenciales y lógicas. Lo mismo pasa con los ordenadores, que realizan diferentes tareas siguiendo una serie de pasos lógicos, ya que están programados (mediante algoritmos) para solucionar distintos problemas en un lenguaje de programación determinado.

La algoritmia es un conjunto ordenado y finito de operaciones que permite encontrar la solución a un problema cualquiera.

Es fundamental que logremos desarrollar y utilizar nuestra mente en forma de algoritmo, ya que, como la vida misma, la programación consiste en buscar la solución óptima para un problema determinado. Todo esto se consigue mediante el diseño, creación e implementación de un algoritmo. 

#### 3.3. Ciclo de vida

La imagen representa el ciclo de vida de un programa informático, de manera que las flechas indican el orden de realización de cada etapa. 

- Análisis de requisitos: a partir de las necesidades del usuario o del programa planteado, se decide qué es lo que hay que hacer para llegar a conseguir una solución óptima, y se genera un documento de requisitos. El contenido de comunicación de esta etapa es muy intenso, ya que el objetivo es eliminar la ambigüedad en la medida de lo posible.
- Diseño de la arquitectura: se hace un estudio para ver los distintos componentes que van a formar parte de nuestro programa (módulos, subsistemas, etc.) y se genera un documento de diseño. Esta fase se va a revisar todas las veces que sea necesario hasta que estemos seguros de cuál va a ser la mejor solución.
- Etapa de implementación o codificación: en esta etapa vamos a pasar a codificar las aplicaciones que hemos elegido en la etapa anterior, empleando el lenguaje de programación con el que estemos trabajando. El resultado que vamos a obtener va a ser el código fuente.
- Pruebas de integración: hay que realizar ensayos del funcionamiento, combinando todos los módulos de la aplicación. Así, haciendo funcionar la aplicación completa, comprobamos que cumple lo establecido en el diseño.
- Pruebas de validación: el último paso de la integración se basa en realizar nuevas pruebas de la aplicación en su conjunto. El objetivo es cerciorarse de que se cumple lo establecido en el documento de requisitos y que cubre las necesidades de los usuarios que ya habíamos previsto.
- Fase de mantenimiento: revisar todo el proceso anterior e ir
actualizando o modificando los cambios oportunos en las etapas
anteriores.

#### 3.4. Prueba de programas

Una vez implementado y compilado el código de nuestro algoritmo, debemos ponerlo en marcha y comenzar la etapa de testing, plan de prueba o prueba de programa.

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
