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

```java
//Clase coche que va a servir para crear objetos coche public class coche {
 String color;
 String marca;
 String modelo;
 public coche(String color, String marca, String modelo){
 this.color = color;
 this.marca = marca;
 this.modelo = modelo;
 }
 public void acelerar() {//código del método}
 public void frenar() {//código del método}
 public void cambiar_velocidad(){//código del método}
}
//Clase donde vamos a crear objetos tipo coche
public class garaje {
 public static void main(String[] args) {
 //Declaración de objetos con sus atributos
 coche Coche1 = new coche("Azul", "Nissan", "Almera");
 coche Coche2 = new coche("Negro", "Seat", "Ibiza");
 coche Coche3 = new coche("Blanco", "Renault", "Megane");
 coche Coche4 = new coche("Gris", "BMW", "Z3");
 coche Coche5 = new coche("Rojo", "Ferrari", "Testa rosa");
 //Acciones que pueden realizar los objetos
 Coche1.acelerar();
 Coche2.frenar();
 Coche3.cambiar_velocidad();
 }
}
```

### 2.4. Utilización de métodos. Métodos estáticos. Constructores.

Los métodos son las funciones propias que tiene una clase, capaces de acceder a todos los atributos que tenga definidos. La forma de acceder a los diferentes métodos se debe escribir dentro de la clase en cuestión, excepto cuando los métodos son abstractos, que en cuyo caso se debe indicar mediante la palabra abstract. Los métodos se deben definir en las clases derivadas haciendo uso de la palabra extends.

**Constructores**

Los constructores deben tener el mismo nombre que el de la clase a la que pertenezcan, y se ejecutan de forma automática una vez que se crea un ejemplar. Se pueden crear tantos constructores como se desee, siempre y cuando los argumentos que reciba sean distintos.

El compilador va a seleccionar el constructor correcto de forma automática, en función de los parámetros que tenga cada uno de los constructores.

** Métodos de acceso **

La función principal de estos métodos es habilitar las tareas de lectura y de modificación de los atributos de la clase. Se utilizan, entre otras cosas, para reforzar la encapsulación al permitir que el usuario pueda añadir información a la clase o extraer información de ella sin que se necesiten conocer detalles más específicos de la implementación. Cualquier cambio que se realice en la implementación de los métodos no afectan a las clases clientes.

*Static*

Es una palabra reservada que distingue entre atributos y métodos.

Los atributos cualificados con la palabra static son atributos de la clase. Es decir, nos referimos a que este atributo se va a almacenar en una zona de memoria propia de la clase, y va a compartir su valor con todos los ejemplares de la clase en cuestión. Además, ya que es parte de la clase, debemos crear un ejemplar de esta, que es la que vamos a utilizar para poder acceder al atributo al que nos estamos refiriendo.

Los métodos cualificados con static son propios de la clase y se va a reservar un espacio para ellos cuando arrancamos el programa. Tienen acceso a los atributos static de la clase, pero no a aquellos atributos de ejemplar. Para emplearnos no se necesita crear un ejemplar determinado de la clase.

### 2.5. Utilización de propiedades.

Para poder utilizar los métodos de una clase, lo primero que debemos hacer es crearnos una clase que sea el esquema, donde definamos tanto los atributos como la declaración e implementación de los métodos. A continuación, en cualquier parte de la función, definimos un objeto de tipo clase creada anteriormente.

Este tipo en cuestión tiene la posibilidad de poder controlar tanto los atributos como los métodos que el ámbito le permita.

Para poder utilizar tanto los atributos como los métodos definidos en la clase, debemos utilizar el carácter punto.

A continuación, vemos un ejemplo de la creación de un objeto y la llamada a sus métodos, los conceptos de este ejemplo se detallan más adelante.

```java
//Clase alumnos que nos servirá para crear objetos tipo alumno
public class Alumnos {
 //Atributos
 //Constructor
 //Métodos
 public void evaluar() {//código del método}
}
-------------------------------------------------------------------
//Clase Aula donde utilizaremos los objetos alumnos
public class Aula {
 public static void main(String[] args) {
 //Creación de objetos Alumno
 Alumnos alumno_1 = new Alumnos("Antonio", "DAW");
 //Sintaxis de utilización de los métodos del objeto
 alumno_1.evaluar();
 }
}
```
