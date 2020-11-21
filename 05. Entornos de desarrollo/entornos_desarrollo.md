# Entornos de desarrollo

## 1. Desarrollo de software

En esta primera parte de la unidad vamos a aprender a reconocer elementos y herramientas que se usan para desarrollar un programa informático, así como las características y fases que tiene que pasar hasta su puesta en funcionamiento.

Empezaremos a ver qué es el software del ordenador y el significado y los componentes de un programa, así como el ciclo de vida de dicho software. También veremos los distintos tipos de lenguajes de programación que podremos utilizar, sus características y las distintas clasificaciones. Por último, abordaremos las fases que deberemos pasar para desarrollar la aplicación y estudiaremos cómo es el código fuente.

### 1.1. El software del ordenador

Antes de comenzar con la definición de software es necesario aclarar la diferencia entre hardware y software. El ordenador está compuesto por dos partes: la parte física, que llamamos hardware, y que está compuesta por el teclado, el ratón, el
monitor, los discos duros o la placa base, entre otros elementos. En definitiva, lo forman todos aquellos componentes que podemos ver y tocar. En cambio, el ordenador posee otra parte lógica llamada software, encargada de dar instrucciones al hardware y hacer ejecutar la computadora.

En este apartado veremos conceptos básicos para el desarrollo del software.

Además de dar instrucciones al hardware, el software también almacenará los datos necesarios para ejecutar los programas y contendrá los datos almacenados del ordenador.

Podemos dividir el software en dos categorías: según las tareas que realiza y según su método de distribución. Además, si tenemos en cuenta la licencia por la cual se distribuye, se clasifica en: software libre, software propietario y software de dominio público.

#### 1.1.1. Software basado en el tipo de trabajo que realizan

Según esta clasificación, podemos distinguir tres tipos de software:

- Software de sistema: es el que hace que el hardware funcione. Está formado por programas que administran la parte física e interactúa entre los usuarios y el hardware. Algunos ejemplos son los sistemas operativos, los controladores de dispositivos, las herramientas de diagnóstico, etc.
- Software de aplicación: aquí tendremos los programas que realizan tareas específicas para que el ordenador sea útil al usuario. Por ejemplo, los programas ofimáticos, el software médico o el de diseño asistido, etc.
- Software de programación o desarrollo: es el encargado de proporcionar al programador las herramientas necesarias para escribir los programas informáticos y para hacer uso de distintos lenguajes de programación. Entre ellos encontramos los entornos de desarrollo integrado (IDE).

#### 1.1.2. Software basado en el método de distribución

Según esta clasificación, distinguimos tres tipos de software:

- Shareware: donde los usuarios pueden pagar y después descargar el aplicativo desde internet. Por ejemplo, PowerDVD.
- Freeware: donde los usuarios Software pueden descargar el aplicativo de forma gratuíta, pero que mantiene los derechos de autor. Por ejemplo, Avast.
- Adware: es un aplicativo donde se ofrece publicidad incrustada, incluso en la instalación del mismo. Por ejemplo, CCleaner.

#### 1.1.3. Licencias de software. Software libre y propietario.

Una licencia es un contrato entre el desarrollador de un software y el usuario final. En él se especifican los derechos y deberes de ambas partes. Es el desarrollador el que especifica qué tipo de licencia distribuye.

Existen tres tipos de licencias:

- Software libre: el autor de la licencia concede libertades al usuario, entre ellas están:
  − Libertad para usar el programa con cualquier fin.
  − Libertad para saber cómo funciona el programa y adaptar el código a nuestras propias necesidades.
  − Libertad para poder compartir copias a otros usuarios.
  − Libertad para poder mejorar el programa y publicar las modificaciones realizadas.
- Software propietario: este software no nos permitirá acceder al código fuente del programa y de forma general nos prohibirá la redistribución, la reprogramación, la copia o el uso simultáneo en varios equipos. Pueden darse dos variantes vistas anteriormente: freeware y shareware.
- Software de dominio público: este software no pertenece a ningún propietario y carece de licencia, por lo que todo el mundo lo puede utilizar. Incluso podremos realizar una oferta para adquirirlo bajo el código fuente de dominio público.

La licencia que más se usa en el software libre es la licencia GPL (GNU General Public License – Licencia Pública General) que nos dejará usar y cambiar el programa, con el único requisito que se hagan públicas las modificaciones realizadas.

Para encontrar más información sobre licencia GPL podremos visitar la siguiente dirección: http://www.gnu.org/licenses/license-list.es.html#SoftwareLicenses

### 1.2. Concepto de programa informático

Un programa informático es un grupo de instrucciones que están escritas en un lenguaje de programación sobre el que se aplican una serie de datos para resolver un problema. Es decir, el ordenador necesita que esté en lenguaje máquina y para ello tendremos que usar un compilador. Una vez hecho esto tendremos que procesar todas las instrucciones pasándolas a la memoria principal.

#### 1.2.1. Programa y componentes del sistema informático

Si queremos iniciar un programa necesitaremos recursos hardware del ordenador, como son el procesador, la memoria RAM, dispositivos E/S, etc. Las instrucciones para inicializar el programa se cargan en la memoria principal y se ejecutarán en la CPU (en inglés, Central Processing Unit).

Si vemos la arquitectura Von Neumann entenderemos cómo funcionan los
componentes que conforman la CPU:

- La Unidad de Control (UC): se encarga de interpretar y ejecutar las instrucciones que se almacenan en la memoria principal y, además, genera las señales de control necesarias para ejecutarlas.
- La Unidad Aritmético-Lógica (UAL): es la que recibe los datos y ejecuta operaciones de cálculo y comparaciones, además de tomar decisiones lógicas (si son verdaderas o falsas), pero siempre supervisada por la Unidad de Control.
- Los registros: son los que almacenan la información temporal, almacenamiento interno de la CPU.

---

A continuación, vamos a ver los diferentes registros que posee la UC:

- Contador de programa (CP): contendrá la dirección de la siguiente instrucción para realizar, su valor será actualizado por la CPU después de capturar una instrucción.
- Registro de Instrucción (RI): es el que contiene el código de la instrucción, se analiza dicho código. Consta de dos partes: el código de la operación y la dirección de memoria en la que opera.
- Registro de dirección de memoria (RDM): tiene asignada una dirección correspondiente a una posición de memoria que va a almacenar la información mediante el bus de direcciones.
- Registro de intercambio de memoria (RIM): recibe o envía, según si es una operación de lectura o escritura, la información o dato contenidos en la posición apuntada por el RDM.
- Decodificador de instrucción (DI): extrae y analiza el código de la instrucción contenida en el RI y, además, genera las señales para que se ejecute correctamente la acción.
- El Reloj: marca el ritmo del DI y nos proporciona unos impulsos eléctricos con intervalos constantes a la vez que marca los tiempos para ejecutar las instrucciones.
- El secuenciador: son órdenes que se sincronizan con el reloj para que ejecuten correctamente y de forma ordenada la instrucción.

Cuando ejecutamos una instrucción podemos distinguir dos fases:
- 1. Fase de búsqueda: se localiza la instrucción en la memoria principal y se envía a la Unidad de Control para poder procesarla.
- 2. Fase de ejecución: se ejecutan las acciones de las instrucciones.

Para que podamos realizar operaciones de lectura y escritura en una celda de memoria se utilizan el RDM, el RIM y el DI. El decodificador de instrucción es el encargado de conectar la celda RDM con el registro de intercambio RIM, el cual posibilita que la transferencia de datos se realice en un sentido u otro según sea de lectura o escritura.

### 1.3. Código fuente, código objeto y código ejecutable; máquinas virtuales

En la etapa de diseño construimos las herramientas de software capaces de generar un código fuente en lenguaje de programación. Estas pueden ser los diagramas de
flujo o el pseudocódigo.

La etapa de codificación es la encargada de generar el código fuente y pasa por diferentes estados.

#### 1.3.1. Tipos de código

Cuando escribimos un código pasa por distintos estados hasta que se ejecuta:

- Código fuente: es el código realizado por los programadores usando algún editor de texto o herramienta de programación. Posee un lenguaje de alto nivel y para escribirlo se parte de los diagramas de flujo o pseudocódigos. No se puede ejecutar directamente en el ordenador.
- Código objeto: es el código que se crea tras realizar la compilación del código fuente. Este código no es entendido ni por el ordenador ni por nosotros. Es una representación intermedia de bajo nivel.
- Código ejecutable: este código se obtiene tras unir el código objeto con varias librerías para que así pueda ser ejecutado por el ordenador.

#### 1.3.2. Compilación

La compilación es el proceso a través del cual se convierte un programa en lenguaje máquina a partir de otro programa de computadora escrito en otro lenguaje. La compilación se realiza a través de dos programas: el compilador y el enlazador. Si en el compilador se detecta algún tipo de error no se generará el código objeto y tendremos que modificar el código fuente para volver a pasarlo por el compilador.

---

Dentro del compilador tendremos varias fases en las que se realizan distintas operaciones:

- Análisis léxico: se lee el código obteniendo unidades de caracteres llamados tokens. Ejemplo: la instrucción resta = 2 – 1, genera 5 tokens: resta, =, 2, -, 1.
- Análisis sintáctico: recibe el código fuente en forma de tokens y ejecuta el análisis para determinar la estructura del programa, se comprueba si cumplen las reglas sintácticas.
- Análisis semántico: revisa que las declaraciones sean correctas, los tipos de todas las expresiones, si las operaciones se pueden realizar, si los arrays son del tamaño correcto, etc.
- Generación de código intermedio: después de analizarlo todo, se crea una representación similar al código fuente para facilitar la tarea de traducir al código objeto.
- Optimización de código: se mejora el código intermedio anterior para que sea más fácil y rápido a la hora de interpretarlo la máquina.
- Generación de código: se genera el código objeto.

El enlazador insertará, en el código objetos, las librerías necesarias para que se pueda producir un programa ejecutable. Si se hacen referencia a otros ficheros que contengan las librerías especificadas en el código objeto, se combina con dicho código y se crea el fichero ejecutable.

