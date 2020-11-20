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

### 2.6. Gestión de memoria. Destrucción de objetos y liberación de memoria.

En algunos lenguajes de programación, a la hora de destruir algún objeto, se cuenta con unas funciones especiales que se van a ejecutar de forma automática cuando se deba eliminar un objeto. Se trata de una función que no devuelve ningún tipo de dato (ni siquiera void), ni recibe ningún tipo de parámetros de entrada a la función. Normalmente, los objetos dejan de existir cuando finaliza su ámbito, antes de terminar su ciclo viral.

También existe la posibilidad del conocido recolector de basura (garbage collector) que, cuando existen elementos referenciados, forma un mecanismo para gestionar la memoria y conseguir que estos se vayan eliminando.

En Java no existen los destructores como tal por ser un tipo de lenguaje que ya se encarga de la eliminación o liberación de memoria que ocupa un objeto determinado a través del recolector de basura.

El recolector de basura en Java, antes de “barrer el objeto no usado”, llama al método finalize() de ese objeto. Esto significa que se ejecuta primero el método finalize() y después el objeto se destruye de la memoria. El método finalize() existe para todos los objetos en Java y se utiliza para realizar algunas operaciones finales u operaciones de limpieza en un objeto antes de que este objeto se elimine de la memoria.

El método finalize() debe tener las siguientes características:

```java
protected void finalize() throws Throwable{
 //Cuerpo del destructor
}
```

En este método se está utilizando la cláusula throws, que hace referencia al lanzamiento de una excepción; este tema se explica en la UF5, en el punto 2.

### 3. Desarrollo de programas organizados en clases.

### 3.1. Concepto de clase. Estructura y componentes.

Las clases en Java van precedidas de la palabra class seguida del nombre de la clase correspondiente y, normalmente, vamos a utilizar el modificador public, quedando de la siguiente forma:

```java
Modificador_de_acceso class nombre_de_la_clase {
 //Propiedades;
 //Métodos;
}
```

El comportamiento de las clases es similar al de un struct, donde algunos campos actúan como punteros de una función, definiendo estos punteros de tal forma que poseen un parámetro específico (this) que va a actuar como el puntero de nuestra clase.

De esta forma, las funciones que señalan estos punteros (métodos), van a poder acceder a los diferentes campos de la clase (atributos).

Definimos la clase como un molde ya preparado en el que podemos fijar los componentes de un objeto: los atributos(variables), y las acciones que van a realizar
estos atributos (métodos).

En la programación orientada a objetos podemos decir que coche es una instancia de la clase de objetos conocida como coches. Todos los coches tienen algunos estados o atributos (color, marca, modelo) y algunos métodos (acelerar, frenar, cambiar velocidad) en común.

Debemos tener en cuenta que el estado de cada coche es independiente al de los demás coches, es decir, podemos tener un coche negro y otro azul, ya que ambos tienen en común la variable color. De tal forma que podremos utilizar esta plantilla para definir todas las variables que sean necesarias y sus métodos correspondientes para los coches. Estas plantillas que usaremos para crear objetos se denominan clases.

La clase es una plantilla que define aquellas variables y métodos comunes para los objetos de un cierto tipo.

Veamos un ejemplo en el que participen todos los conceptos que estamos definiendo.

Partimos de nuestra clase coche, en la que debemos introducir datos que tengan sentido (elementos de la vida cotidiana). Establecemos que un coche se caracteriza, entre otros factores, por:
- Tener ruedas características.
- Tener matrícula.
- Tener cantidad de puertas.
- Tener un color.
- Tener una marca.
- Ser de un determinado modelo.

Aunque si a nuestro taller llega un Seat Ibiza de tres puertas, las características serían:
- Ruedas tipo X. 4 más una de repuesto.
- Matrícula FNR 9774.
- 3 puertas.
- Negro.
- Seat.
- Ibiza.

De esta forma, tenemos la clase coche y el objeto Seat Ibiza.

Cuando creamos una clase, definimos sus atributos y métodos:
- Atributos: las variables que hacen referencia a las características principales del objeto que tenemos.
- Métodos: diferentes funciones que pueden realizar los atributos de la clase.

**Estructura y miembros o componentes**

A continuación, vamos a ver un ejemplo que se ha visto en el punto 2.5, durante este punto 3 vamos a detallar la creación de todos los puntos de este ejemplo:

```java
public class Alumno {
 //Atributos;
 //Métodos;
}
```

- public → Palabra reservada que se utiliza para indicar la visibilidad de una clase.
- class → Palabra reservada que se utiliza para indicar el inicio de una clase.
- Alumno → Nombre que le asignemos a la clase.
- Atributos → Diferentes características que van a definir la clase.
- Métodos → Conjunto de operaciones que van a realizar los atributos que formen parte de la clase.

Los miembros o componentes que forman parte de una clase (atributos y métodos) se pueden declarar de varias formas:

**Públicos (public)**

Engloba aquellos elementos a los que se puede acceder desde fuera de la clase.

Si no se especifica que un miembro es público, nos estaremos refiriendo a que este solo va a ser accesible (o visible) por otros miembros de la clase.

Mientras que, si lo definimos como público, estamos señalando que otros objetos puedan realizar llamadas a estos miembros.

**Privados (private)**

Aquellos componentes de carácter privado solamente pueden ser utilizados por otros miembros de la clase, pero nunca por otras donde se instancien.

Por defecto, cuando definimos un método, si no especificamos nada se considera privado.

También existen otros modificadores que se pueden utilizar en determinadas ocasiones, como:
- Protected: Lo utilizamos cuando trabajamos con vaerias clases que heredan las unas de las otras, de tal forma que, aquellos miembros que actúen de forma privada, se suelen declarar como protected. De este modo puede seguir siendo privado, aunque permite que lo utilicen las clases que hereden de ella.
- Package: Podemos utilizarlo cuando tenemos una clase que no tiene modificador y, además, es visible en todo el paquete. De esta forma, aunque la clase no tenga modificador, puede actuar de forma similar sin utilizar package.

A continuación, aparece un listado de palabras reservadas (key words o reserved words) del lenguaje de programación Java. Estas palabras no se pueden utilizar como identificadores en los programas escritos en Java.

Las palabras reservadas const y goto no se utilizan actualmente. Las palabras true, false y nullse tratan como si fueran palabras reservadas, sin embargo,son constantes literales, no se pueden usar como identificadores.

---

