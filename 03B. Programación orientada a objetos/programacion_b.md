# Programación B

## UF4: Programación orientada a objetos (POO)

Los elementos que componen un programa son siempre similares. En la mayoría de los programas podemos encontrar variables, constantes, sentencias alternativas,
repetitivas, etc. La principal diferencia la podemos apreciar entre las distintas palabras reservadas, y en cómo se van a definir estas en un lenguaje de programación específico.

### 1.0. Lenguaje de programación Java

- Es un lenguaje interpretado. El código que diseña se denomina bytecode y se puede interpretar a través de una máquina virtual. Esta máquina está escrita en el código nativo de la plataforma (en la cual se ejecuta el programa), y se basa en aquellos servicios que ofrece el sistema operativo (que van a permitir atender las solicitudes que necesite dicho programa).
- Es un lenguaje multiplataforma. El compilador de Java produce un código binario de tipo universal, es decir, se puede ejecutar en cualquier tipo de máquina virtual que admita la versión utilizada. Java es un tipo de lenguaje denominado Write once (escribir una sola vez), run anywhere (ejecutar en cualquier parte).
- Es un lenguaje orientado a objetos. El lenguaje Java es uno de los que más se acerca al concepto de una programación orientada a objetos. Los principales módulos de programación son las clases, y no permite que existan funciones independientes. Cualquier variable o método que se utilice en Java tiene que pertenecer a una clase.
- Posee una gran biblioteca de clases. Java cuenta con una gran colección de clases agrupadas en los diferentes directorios. Estas clases sirven al usuario para realizar alguna tarea determinada sin necesidad de tenerla que implementar.

### 1.1. Características

A continuación vamos a ver las características principales que diferencian el lenguaje Java de los demás:

- Independencia de la plataforma. Podemos desarrollar diferentes aplicaciones que pueden ser ejecutadas bajo cualquier tipo de hardware o sistema operativo. Inicialmente, se va a generar un bytecode que, después, va a ser traducido por la máquina en el lugar en el que se ejecute el programa.
- Fácil de aprender. Java es el lenguaje de programación más utilizado hoy en día en los entornos educativos, ya que viene provisto de unas herramientas que permiten configurarlo con un entorno cómodo y fácil de manejar.
- Basado en estándares. A través del proceso Java Community se pueden ir definiendo nuevas versiones y características.
- Se utiliza a nivel mundial. Java es una plataforma libre que dispone de un gran número de desarrolladores que cuentan, entre otras cosas, con una gran cantidad de información, librerías y herramientas.
- Entornos runtime consistentes. Su función es intermediar entre el sistema operativo y Java. Está formado por la máquina virtual de Java, las bibliotecas, y otros elementos también necesarios para poder ejecutar la aplicación deseada.
- Optimizado para controlar dispositivos. Ofrece un soporte para aquellos dispositivos integrados.
- Recolector de basura. Su función principal es eliminar de forma automática aquellos objetos que no hacen referencia a ningún espacio determinado de memoria.

### Introducción a la programación orientada a objetos

Según Bruce Eckel: “A medida que se van desarrollando los lenguajes, se va desarrollando también la posibilidad de resolver problemas cada vez más complejos. En la evolución de cada lenguaje, llega un momento en el que los programadores comienzan a tener dificultades a la hora de manejar programas que sean de un cierto tamaño y sofisticación.” (Bruce Eckel, “Aplique C++”, p. 5 Ed. McGraw- Hill).

La **programación orientada a objetos** (POO) pretende acercarse más a la realidad, de manera que los elementos de un programa se puedan ajustar, en la medida de lo posible, a los diferentes elementos de la vida cotidiana.

La programación orientada a objetos ofrece la posibilidad de crear diferentes softwares a partir de pequeños bloques, que pueden ser reutilizables

Sus propiedades más importantes las podemos dividir en:

- **Abstracción**: cuando utilizamos la programación orientada a objetos, nos basamos, principalmente, en qué hace el objeto y para qué ha sido creado, aislando (abstrayendo) otros factores, como la implementación del programa en cuestión.
- **Encapsulamiento**: en este apartado se pretende ocultar los datos de los objetos de cara al mundo exterior, de manera que, del objeto solo se conoce su esencia y qué es lo que pretendemos hacer con él.
- **Modularidad**: que la programación orientada a objetos es modular quiere decir que vamos a tener una serie de objetos que van a ser independientes los unos de los otros y pueden ser reutilizados.
- **Jerarquía**: nos referimos a que vamos a tener una serie de objetos que desciendan de otros.
- **Polimorfismo**: nos va a permitir el envío de mensajes iguales a diferentes tipos de objetos. Solo se debe conocer la forma en la que debemos contestar a estos mensajes.

### 2.2. Definición de objetos y características

Definimos los objetos como un conjunto de datos (características o atributos) y métodos (comportamientos) que se pueden realizar. Es fundamental tener claro que estos dos conceptos (atributos y métodos), están ligados formando una misma unidad conceptual y operacional.

Debemos señalar también que estos objetos son casos específicos de unas entidades denominadas clases, en las que se pueden definir las características que tienen en común estos objetos. Los objetos podríamos definirlos como un contenedor de datos, mientras que una clase actúa como un molde en la construcción de objetos.

A continuación, vamos a ver un ejemplo relacionado con la vida cotidiana en el que aclararemos todos estos conceptos:

- Podemos declarar un objeto coche.
- Sus atributos pueden ser, entre otros: color, marca, modelo.
- Y algunas de las acciones que este objeto puede realizar, pueden ser, entre otras: acelerar, frenar y cambiar velocidad.

Recordemos que un objeto va a utilizar estos atributos en forma de variables, y los métodos van a ser funciones que se van a encargar de realizar las diferentes acciones.

En nuestro ejemplo tendríamos variables en las que almacenar el color, la marca y el modelo, junto con un conjunto de funciones que van a desarrollar las acciones de acelerar, frenar y cambiar de velocidad.
