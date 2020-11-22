# Desarrollo de interfaces

## 1. Confección de interfaces de usuario

Existen una serie de aplicaciones en el mercado que se utilizan para llevar a cabo la confección de interfaces. Dichas aplicaciones también reciben el nombre de IDE (entorno de desarrollo integrado).

Entre sus principales características se encuentran las de codificación, compilación, depuración y testeo de los diferentes programas.

Las más importantes son: Visual Studio, NetBeans y Eclipse.

Esta aplicación cuenta con diferentes versiones bajo licencia, aunque también ha desarrollado algunas versiones gratuitas con denominación express.

Estas últimas cuentan con menos funcionalidades y están más limitadas que las versiones con licencia, aunque disponen de un gran número de herramientas capaces de cubrir las distintas demandas del usuario particular.

**Creación de un proyecto**

La creación de proyectos no es una tarea muy complicada en Visual Studio y, además, es un proceso bastante intuitivo. Desde que aparece la primera ventana ya es posible tener acceso a la creación de un proyecto y a todas sus opciones del menú Archivo.

Cuando se selecciona la opción Nuevo Proyecto, aparecerán una serie de plantillas de creación de proyectos clasificadas por su ámbito y por el lenguaje de programación que utilizan.

**Área de trabajo**

Es posible diferenciar un área central de trabajo junto a otras ventanas flotantes que se pueden acoplar. Estas ventanas se pueden visualizar o no, según las necesidades del usuario. También es posible cambiarlas de lugar, permitiendo al usuario personalizar su entorno de trabajo.

Además, el usuario tiene la posibilidad de diferenciar las áreas que van a formar parte de la interfaz, que suelen ser las mismas en los diferentes IDE.

Con independencia del proyecto seleccionado, el usuario podrá distinguir siempre una serie de áreas dentro de la interfaz y que son comunes a la mayoría de los IDE.

**Explorador de soluciones**

La ventana del explorador de soluciones aparece en la parte derecha del entorno gráfico del programa, aunque se puede modificar según las necesidades del usuario. Permite visualizar, de forma jerárquica, los diferentes archivos que forman el proyecto.

**Ventana de propiedades**

La ventana de propiedades tiene dos vistas principales: la vista de propiedades y de eventos, es decir, puede mostrar un tipo de información u otra dependiendo del elemento que seleccione el usuario en un determinado momento.

Podemos configurar la apariencia de un elemento a través de las propiedades, y su comportamiento mediante los eventos.

**Menú**

En la opción Menú, es importante diferenciar entre las opciones en las que es posible guardar un trabajo que se haya desarrollado en el sistema de archivos (Menú Archivo) y la configuración determinada del proyecto en el que se esté trabajando (Menú Proyecto).

- Menú archivo: permite generar y gestionar nuevos proyectos, abrir los que ya existían y guardar, entre otras opciones.
- Menú proyecto: permite gestionar los repositorios de control de versiones. Un archivo de solución (.sln) permite agrupar un conjunto de proyectos. Gracias a esta agrupación, podemos hacer operaciones comunes, como la compilación de la solución.

## 1.2. Enlaces de componentes a orígenes de datos

La gran mayoría de aplicaciones y servicios requieren almacenar y obtener acceso a determinados tipos de datos. Por ejemplo, una aplicación de hotel necesita obtener los datos de los servicios y habitaciones de una base de datos para poder mostrar los detalles a los usuarios, así como también insertar información en la base de datos cuando se realiza una reserva.

En la siguiente figura se puede observar cómo la capa de datos lógicos de la aplicación contiene uno o más almacenes de datos y describe una capa de componentes lógicos con acceso a datos.

---

Como almacén principal de los datos, la mayoría de las aplicaciones hacen uso de una base de datos relacional. Para poder recuperar los datos de la base de datos, se utiliza un conjunto de datos conocido como DataReader. Estos datos se envían a través de las diferentes capas y niveles de la aplicación para que finalmente puedan ser utilizados por uno de sus componentes.

Indistintamente del almacén de datos que se utilice, el servicio o la aplicación para obtener el acceso a los datos utilizará componentes lógicos de acceso a datos. Estos componentes ofrecen una interfaz sencilla de programación para recuperar y realizar operaciones para insertar, eliminar, recuperar y actualizar los datos.

Si una aplicación contiene diferentes componentes lógicos de acceso a datos, puede utilizar un componente de ayuda de acceso a datos que permite centralizar la administración de conexión y el código que está relacionado con un origen de datos específico.

1.3. Componentes: características y campos de aplicación

La programación orientada a componentes (POC) pertenece a la rama de la ingeniería del software que hace énfasis en la descomposición de sistemas ya conformados en componentes funcionales con interfaces bien definidas usadas para la comunicación entre componentes.

Se considera que los componentes tienen un nivel de abstracción más elevado que los objetos, por este motivo no comparten estado y la comunicación es a través de mensajes que contienen datos.

Es posible definir un componente de software como un elemento de un sistema que ofrece servicios predefinidos y puede comunicarse con otros componentes.

Un componente es un objeto escrito de acuerdo con unas especificaciones, las cuales hacen que el objeto se convierta en componente adquiriendo características como, por ejemplo, la reusabilidad.

El objetivo de la POC es construir una serie de componentes software, permitiendo a los desarrolladores de aplicaciones reutilizar componentes ya diseñados y testados para desarrollar aplicaciones de una forma rápida y robusta.

Las entidades básicas de la POC son los componentes, estos pueden interpretarse como cajas negras que encapsulan cierta funcionalidad y son diseñadas sin saber cuándo se van a utilizar. Los servicios de los componentes son conocidos por sus interfaces y requisitos.

El diseño e implementación de un componente debe ser de tal forma que este pueda ser reutilizado en programas diferentes, ya que una de las características más importantes que ofrecen los componentes es la capacidad de reutilización.

Diseñar un componente reutilizable requiere gran esfuerzo y atención, ya que debe estar:

- Completamente documentado.
- Diseñado pensando en su uso de maneras imprevistas.
- Probado profundamente.
  - Debe ser robusto, comprobando la validez de las entradas.
  - Debe ser capaz de enviar mensajes de error apropiados.

## 1.4. Eventos escuchadores y acciones a eventos

Además de los elementos, contenedores y métodos, los eventos son otra de las herramientas básicas para la implementación de las interfaces gráficas. La interactividad y la respuesta ante una entrada del usuario es posible gracias a los eventos y las acciones que se implementan cuando algunos de ellos ocurren.

Un evento es una acción que puede realizar un usuario cuando interactúa sobre un componente de la aplicación.

A la hora de diseñar un programa con eventos, es necesario definirlos junto con las acciones que realizarán al interactuar con cada uno de ellos, esta acción es conocida como administrador de eventos.

En la programación dirigida a eventos, cuando empiece la ejecución del programa se realizarán las inicializaciones y el resto del código inicial y a continuación el programa se bloqueará hasta que se produzca cualquier evento. Una vez que se ha disparado un evento, el programa ejecutará el código del correspondiente administrador de eventos. Por ejemplo, si un evento consiste en que, al pulsar sobre él un usuario, se reproduzca un audio, se ejecutará el código del administrador de eventos y este hará que se reproduzca el audio.

La programación dirigida a eventos se considera la base de lo que se llama interfaz de usuario, aunque también es posible utilizarla para desarrollar interfaces entre componentes de software o módulos de núcleo.

En los primeros programas de computación, los programas eran de carácter secuencial, conocidos como batch. Un programa secuencial, una vez arrancado, lee los parámetros de entrada, los procesa y genera un resultado de una manera lineal y sin ninguna intervención por parte del usuario.

Con la aparición de los PC, este tipo de programación no podía responder a las nuevas necesidades de interacción con los usuarios. La programación orientada a eventos permitía la interacción con los usuarios en el proceso de ejecución, permitiendo recoger y tratar los eventos producidos por parte de los usuarios.

Un ejemplo de programa orientado a objetos a eventos en pseudocódigo:

```java
While (true) {
 Switch (event) {
 Case mouse_click ():
 Case Keypressed ():
 Case Else:
 }
 }
 ```
 
Un escuchador de eventos (event listener) es un mecanismo asíncrono ante ciertas circunstancias que ocurren en clases diferentes a la nuestra. Se utiliza, por ejemplo, para detectar si un botón ha sido pulsado.

Para usar un escuchador de eventos, se tienen que seguir tres pasos:
- Implementar la interfaz del escuchador.
- Registrar el escuchador en el objeto que genera el evento, indicándole el objeto que los recogerá.
- Implementar los métodos callback correspondientes.

## 1.5. Edición del código generado por las herramientas de diseño

Para la creación de la interfaz gráfica es posible utilizar los IDE que anteriormente se han detallado.

Teniendo en cuenta el lenguaje Java en cualquiera de las dos herramientas, los IDE facilitan la programación de una interfaz gráfica. Se dedica un apartado a la creación de la interfaz gráfica mediante una pestaña de diseño y sobre ella se pueden ir arrastrando los elementos deseados y automáticamente se traducen en el código correspondiente.

En la siguiente imagen es posible ver la vista de diseño a la que podemos arrastrar los elementos deseados:

---

## 1.6. Clases, propiedades, métodos.

Una clase es una plantilla que se utiliza para crear objetos de datos según un modelo predefinido. Las clases son utilizadas para representar entidades o conceptos. Cada clase es un modelo que define un conjunto de variables (el estado) y métodos que permiten operar con dichos datos (comportamiento).

Un objeto creado a partir de la clase se denomina instancia de la clase.

Las clases nos permiten abstraer los datos y sus operaciones a modo de una caja negra. Una clase puede tener una representación (metaobjeto) que proporciona apoyo en tiempo de ejecución para la manipulación de los metadatos relacionados con la clase.

Las clases se componen de elementos de varios tipos:

- Campos de datos: se utilizan para contener datos que reflejan el estado de la clase. Los datos pueden estar almacenados en variables o estructuras más complejas (como structs). Habitualmente, las variables son privadas al objeto (principio de ocultación) y su acceso se realiza mediante propiedades o métodos.
- Métodos: implementan la funcionalidad asociada al objeto. Podemos acceder a las variables de la clase de forma implícita. Cuando se realiza una acción sobre un objeto, se dice que se le manda un mensaje invocando a un método que realizará la acción.
- Propiedades: son un tipo especial de métodos. Debido a que las variables suelen ser privadas para controlar el acceso y mantener la coherencia, surge la necesidad de permitir realizar consultas o modificar su valor mediante los métodos GetVariable y SetVariable. Java o C# añaden la construcción de propiedad.

Un ejemplo de clase en Java:

```java
public class Coche {
 String marca;
 String modelo;
 Int potencia;

 // Constructor, se llamará cuando se cree la clase
 public Coche () {
 marca = 'Ford';
 modelo = 'Focus';
 potencia = 150;
 }

 // Métodos para insertar valores, conocidos como setters
 public void setMarca(String marca) {
 this.marca = marca;
 }
 public void setPotencia(int potencia) {
 this.potencia = potencia;
}
...
// Métodos para obtener valores, conocidos como getters
public String getMarca() {
 return marca;
}

public int getPotencia() {
 return potencia;
}
...
}
```
En este ejemplo, se ha creado la clase denominada Coche. El espacio que comprenden la apertura y el cierre de la clase, es decir, el contenido que se encuentra entre las llaves (símbolos { y }), se denomina cuerpo de la clase.

Todos los objetos de tipo Coche tendrán los mismos atributos: una marca (cadena de caracteres), un modelo (cadena de caracteres) y una potencia (valor entero 0, 1, 2, etcétera). Los atributos principales los definiremos normalmente una vez que se realiza la apertura de la clase, fuera de los constructores o métodos que haya.

Se ha definido que cualquier Coche que se cree tenga los siguientes atributos: marca “Ford”, modelo “Focus” y una potencia de 150. Dicha sintaxis se utiliza para el constructor public Coche{…}.

Por otro lado, se han establecido unos métodos que sirven para recibir valores (setMarca, setPotencia) y quedar asignado el valor recibido en los métodos. Y métodos que permiten devolver un valor (getMarca, getPotencia) cuando se haga referencia a ellos.

Para crear objetos Coche se debe asignar a una variable el valor new Coche(). De esta forma, es posible crear 5 objetos: coche1, coche2, coche3, coche4 y coche5. Cada objeto Coche tiene tres atributos: marca, modelo y potencia. En total disponemos de 15 atributos (5 coches x 3 atributos = 15 atributos).

Un objeto es una instancia de una clase, es por este motivo que a los atributos definidos en Coche se los denomina variables de instancia. También son conocidos como campos de la clase. Cada clase tiene sus campos específicos, por ejemplo, para la clase Persona sus campos pueden ser: nombre, apellidos, DNI, altura y peso.
