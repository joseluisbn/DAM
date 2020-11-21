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

