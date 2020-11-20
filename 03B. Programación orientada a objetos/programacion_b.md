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

Las palabras reservadas const y goto no se utilizan actualmente. Las palabras true, false y nullse tratan como si fueran palabras reservadas, sin embargo, son constantes literales, no se pueden usar como identificadores.

---

### 3.2. Creación de atributos.

Gracias a los atributos podemos recoger características específicas de un objeto determinado mediante el uso de variables.

Se expresan de la siguiente forma:

```java
//Sintaxis de los atributos
[Modifficador_de_acceso] Tipo_dato nombre_atributo;
```

Donde:
- Modificador_de_acceso: se utiliza para definir el nivel de ocultación o visibilidad de los miembros de la clase (atributos y métodos), estos pueden ser default, protected, private o public como los más utilizados también tenemos otros valores como final, static, volatile y transient.
- Tipo_dato: un atributo puede ser de cualquier tipo de datos que existan, como int, double, char o algunos más complejos, como estructuras, tablas o incluso objetos.
- Nombre_atributo: identificador que vamos a utilizar para esa variable.

A continuación, vamos a ver un ejemplo que se ha visto ya en el punto 2.5 donde detallaremos la creación de los atributos.

```java
public class Alumnos {
 //Atributos
 private String nombre;
 private String curso;
}
```

## 3.3. Creación de métodos.

Los métodos son las diferentes funciones de una clase y pueden acceder a todos los atributos que esta tenga. Vamos a implementar estos métodos dentro de la propia clase, excepto cuando los métodos sean abstractos (abstract), que se definen en clases derivadas utilizando la palabra extends.

```java
[Modifficador_de_acceso] tipo_devuelto nombre_metodo(parámetros) {
 //sentencias;
}
```

Donde:

- tipo_devuelto: es el tipo de dato que devuelve el método. Para ello, debe aparecer la instrucción return en el código. En el caso en el que la función no devuelva ningún valor, utilizaremos la palabra void.
- nombre_metodo: nombre con el que vamos a llamar al método.
- parámetros: distintos valores que se le pueden pasar a la función para que se puedan utilizar.
- sentencias: distintas operaciones que debe realizar el método.

En Java, podemos tener los siguientes tipos de métodos:

- static: se puede utilizar directamente desde la propia clase en vez de instanciar esta. De la misma forma, podemos también crear atributos estáticos. Cuando utilizamos un método tipo Static, utilizamos las variables estáticas definidas en la clase.
- abstract: será más sencillo de comprender después de ver el significado de la herencia. De todas formas, señalaremos que los métodos abstractos no se van a declarar en la clase principal, pero sí en las demás que hereden de esta.
- final: estos métodos no ofrecen la posibilidad de sobrescribirlos.
- native: métodos implementados en otros lenguajes pero que deseamos añadir a nuestro programa. Podremos hacerlo incorporando la cabecera de la función en cuestión, y sustituyendo el cuerpo del programa por “;” (punto y coma).
- Synchronized: utilizado en aplicaciones multi-hilo.

Vamos a ver un ejemplo siguiendo con la clase Alumnos, la cual vamos a desarrollar durante este apartado.

```java
//Clase alumnos que nos servirá para crear objetos tipo alumno
public class Alumnos {
 //Atributos
 private String nombre;
 private String curso;
 //Métodos GET y SET
 public String getNombre() {return nombre;}
 public void setNombre(String nombre) {this.nombre = nombre;}
 public String getCurso() {return curso;}
 public void setCurso(String nombre) {this.curso = curso;}
 //Métodos creados por el programador
 public double evaluar(double nota) {
 nota = nota * 0.7;
 return nota;
 }
}
```

Hemos creado los métodos get y set, estos métodos son funcionalidades del programa hechas por el programador, son muy comunes en Java ya que, estas devolverán los valores de los atributos o nos permitirán modificarlos, los métodos get sirven para mostrar los valores de los atributos y los métodos set sirven para insertar o modificar los valores de los atributos.

También hemos creado un método que va a realizar una funcionalidad propia de esta clase, como podría ser evaluar a los alumnos, según la nota que reciba este realizará cálculos internos y devolverá el valor del ejercicio en la nota final.

### 3.4. Sobrecarga de métodos

La sobrecarga de métodos consiste en crear métodos en la misma clase y con el mismo nombre pero que estos tengan distintos parámetros de entrada. La sobrecarga de métodos permite asignar más funcionalidad.

Por ejemplo, veamos diferentes posibilidades que podrían existir para una función denominada visualizar:

```java
public void visualizar () {
 //código del método visualizar sin parámetros
}
public void visualizar (Objeto X) {
 //código del método visualizar con un parámetro
}
public void visualizar (Objeto X, int num1) {
 //código del método visualizar con dos parámetros
}
```

Podemos comprobar que existen tres funciones que se llaman de la misma forma pero que, cada una de ellas, tiene diferentes parámetros.

A la hora de realizar la llamada a la función no va a existir ambigüedad:

```java
visualizar (); //estamos haciendo referencia a la primera, que
no tiene parámetros.
visualizar (dato); //Si dato es de tipo objeto, nos estaremos
refiriendo a la segunda.
visualizar (dato, 5); // Nos referimos a la tercera opción
```

Podemos ver, de forma clara, que las tres llamadas se diferencian perfectamente entre sí, el paso de parámetros es el adecuado.

### 3.5. Creación de constructores.

Una de las formas que tenemos de identificar a un constructor de una clase es que debe llamarse igual que esta. El constructor se va a ejecutar siempre de forma automática al crearse una instancia de la clase.

Existe la posibilidad de tener varios constructores, cada uno de ellos, con diferentes parámetros.

Siguiendo con el ejemplo de los alumnos vamos a ver cómo crear los constructores para esta clase:

```java
public class Alumnos {
 //Atributos
 private String nombre;
 private String curso;
 //Constructor vacío
 public Alumnos() {
 this.nombre = "Ilerna";
 this.curso = "Online";
 }
 //Constructor con parámetros
 public Alumnos(String nombre, String curso) {
 this.nombre = nombre;
 this.curso = curso;
 }
 //Métodos
}
```

En este ejemplo hemos creado dos constructores: uno sin parámetros y otro que recibe parámetros.

La llamada al constructor sin parámetros devolverá un valor por defecto del objeto; en el caso de llamar al constructor con parámetros, le podremos indicar los valores que deseemos a este objeto.

### 3.6. Creación de destructores y/o métodos de finalización

Como hemos indicado en apartados anteriores, Java no utiliza destructores como tal por ser un tipo de lenguaje que se encarga de la eliminación o liberación de memoria que puede ocupar un objeto determinado a través de la recolección de basura.

Como se comentó con anterioridad, el recolector de basura en Java, antes de “barrer el objeto no usado”, llama al método finalize() de ese objeto. Este método puede ser implementado por nosotros para realizar acciones antes de la eliminación del objeto.

### 3.7. Uso de clases y objetos. Visibilidad

Como ya hemos visto en apartados anteriores, la definición de las clases y de los objetos sigue una estructura implementada en un programa en Java.

La sintaxis que debemos seguir a la hora de instanciar un objeto:

```java
//Declaración
nombre_clase nombre_variable;
//Creación
nombre_variable = new nombre_clase ();
//Declaración creación
nombre_clase nombre_variable = new nombre_clase ();
```

De la misma forma que se utiliza en otros lenguajes de programación, debemos hacer uso de la palabra reservada new para poder reservar un espacio en memoria, de tal forma que, si solo declarásemos el objeto, no podríamos utilizarlo. Esta instrucción comienza una expresión para instanciar una clase, la cual crea un objeto del tipo especificado a la derecha del new.

Una vez instanciado el objeto, la forma de acceder a los diferentes miembros de la clase va a ser utilizando el operador punto. En el lenguaje Java vamos a utilizar el operador this para poder referenciar a la propia clase junto con sus métodos y atributos.

Si necesitamos crear arrays de objetos debemos inicializar cada objeto de la casilla que le corresponda en la tabla de la clase para que, cuando llegue el momento de utilizar ese objeto que se encuentra almacenado en un array, antes debe haber sido creado.

```java
//Declaración creación del array
Clase [] nombre_array = new Clase [MAX];
//Creación objetos que se necesiten
for (int i=0; i<MAX; i++) {
 nombre_array [i] = new Clase ();
}
//Creación de un objeto determinado para que exista antes de ser
utilizado
nombre_array [pos] = new Clase ();
```

El método main proporciona el mecanismo para controlar la aplicación. Cuando se ejecuta una clase Java, el sistema localiza y ejecuta el método main de esa clase.

A continuación, tenemos el ejemplo de la clase Aula donde vemos cómo crear los objetos tipo alumno y cómo utilizar los métodos que hemos generado.

```java
//Clase Aula donde utilizaremos los objetos alumnos
public class Aula {
 public static void main(String[] args) {
 double nota[] = new double[2];
 //Creación de objetos Alumno
 Alumnos Alumno_1 = new Alumnos("Antonio", "DAW");
 Alumnos Alumno_2 = new Alumnos("Laura", "DAM");
 //Sintaxis de utilización de los métodos del objeto
 nota[0] = Alumno_1.evaluar(6.5);
 nota[1] = Alumno_2.evaluar(8);
 }
}
```

## 3.8. Conjuntos y librerías de clases
