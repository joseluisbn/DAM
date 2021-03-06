# Entornos de desarrollo

## 1. Desarrollo de software

### 1.1. El software del ordenador

El ordenador está compuesto por dos partes: la parte física, que llamamos *hardware*, y que está compuesta por el teclado, el ratón, el monitor, los discos duros o la placa base, entre otros elementos. En definitiva, lo forman todos aquellos componentes que podemos ver y tocar. En cambio, el ordenador posee otra parte lógica llamada *software*, encargada de dar instrucciones al hardware y hacer ejecutar la computadora.

En este apartado veremos conceptos básicos para el desarrollo del software.

Además de dar instrucciones al hardware, el software almacenará los datos necesarios para ejecutar los programas y contendrá los datos almacenados del ordenador.

Podemos dividir el software en dos categorías: según las tareas que realiza y según su método de distribución. Además, si tenemos en cuenta la licencia por la cual se distribuye, se clasifica en: software libre, software propietario y software de dominio público.

#### 1.1.1. Software basado en el tipo de trabajo que realizan

Según esta clasificación, hay tres tipos de software:

- **Software de sistema**: es el que hace que el hardware funcione. Está formado por programas que administran la parte física e interactúa entre los usuarios y el hardware (sistemas operativos, controladores de dispositivos, herramientas de diagnóstico, etc.).
- **Software de aplicación**: aquí tendremos los programas que realizan tareas específicas para que el ordenador sea útil al usuario. Por ejemplo, los programas ofimáticos, el software médico o el de diseño asistido, etc.
- **Software de programación o desarrollo**: es el encargado de proporcionar al programador las herramientas necesarias para escribir los programas informáticos y para hacer uso de distintos lenguajes de programación. Entre ellos encontramos los entornos de desarrollo integrado (IDE).

#### 1.1.2. Software basado en el método de distribución

Según esta clasificación, distinguimos tres tipos de software:

- Shareware: donde los usuarios pueden pagar y después descargar el aplicativo desde internet. Por ejemplo, PowerDVD.
- Freeware: donde los usuarios Software pueden descargar el aplicativo de forma gratuíta, pero que mantiene los derechos de autor. Por ejemplo, Avast.
- Adware: es un aplicativo donde se ofrece publicidad incrustada, incluso en la instalación del mismo. Por ejemplo, CCleaner.

#### 1.1.3. Licencias de software. Software libre y propietario.

Una **licencia** es un contrato entre el desarrollador de un software y el usuario final. En él se especifican los derechos y deberes de ambas partes. Es el desarrollador el que especifica qué tipo de licencia distribuye.

Existen tres tipos de licencias:

- **Software libre**: el autor de la licencia concede libertades al usuario, entre ellas están:
  − Libertad para usar el programa con cualquier fin.
  − Libertad para saber cómo funciona el programa y adaptar el código a nuestras propias necesidades.
  − Libertad para poder compartir copias a otros usuarios.
  − Libertad para poder mejorar el programa y publicar las modificaciones realizadas.
- **Software propietario**: este software no nos permitirá acceder al código fuente del programa y de forma general nos prohibirá la redistribución, la reprogramación, la copia o el uso simultáneo en varios equipos. Pueden darse dos variantes vistas anteriormente: freeware y shareware.
- **Software de dominio público**: este software no pertenece a ningún propietario y carece de licencia, por lo que todo el mundo lo puede utilizar. Incluso podremos realizar una oferta para adquirirlo bajo el código fuente de dominio público.

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
1. Fase de búsqueda: se localiza la instrucción en la memoria principal y se envía a la Unidad de Control para poder procesarla.
2. Fase de ejecución: se ejecutan las acciones de las instrucciones.

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

#### 1.3.3. Máquinas Virtuales

Una máquina virtual es un tipo de software capaz de ejecutar programas como si fuese una máquina real. Se clasifican en dos categorías:

- Máquinas virtuales de sistema. Nos permiten virtualizar máquinas con distintos sistemas operativos en cada una. Un ejemplo son los programas VMware Workstation o Virtual Box que podremos usar para probar nuevos sistemas operativos o ejecutar programas.
- Máquinas virtuales de proceso. Se ejecutan como un proceso normal dentro de un SO y solo soporta un proceso. Se inician cuando lanzamos el proceso y se detienen cuando este finaliza. El objetivo es proporcionar un entorno de ejecución independiente del hardware y del sistema operativo y permitir que el programa sea ejecutado de la misma forma en cualquier plataforma. Ejemplo de ello es la máquina virtual de Java.

Las máquinas virtuales requieren de grandes recursos por lo que hay que tener cuidado y ejecutarlas en ordenadores capaces de soportar los procesos que requieren dichas máquinas para que no nos funcionen lentas o se colapsen.

**La máquina virtual de Java**

Los programas que se compilan en lenguaje Java son capaces de funcionar en cualquier plataforma (UNIX, Mac, Windows, Solaris, etc.). Esto se debe a que el código no lo ejecuta el procesador del ordenador sino la propia Máquina Virtual de Java (JVM).

---

El funcionamiento básico de la máquina virtual es el siguiente:

1. El código fuente estará escrito en archivos de texto planos con la extensión .java.
2. El compilador javac generará uno o varios archivos siempre que no se produzcan errores y tendrán la extensión .class.
3. Este fichero .class contendrá un lenguaje intermedio entre el ordenador y el SO y se llamará bytecode.
4. La Java VM coge y traduce el bytecode en código binario para que el procesador de nuestro ordenador sea capaz de reconocerlo- Los ficheros .class podrán ser ejecutados en múltiples plataformas.

Entre las tareas que puede realizar la máquina virtual Java pueden estar:

- La reserva de espacio para objetos creados y liberar aquella memoria que no se usa.
- Comunicación con el sistema en el que se ejecuta la aplicación para varias funciones.
- Observar que se cumplen las normas de seguridad para las aplicaciones Java.

Una de las desventajas de usar este tipo de lenguajes que se basan en una máquina virtual puede ser que son más lentos que los lenguajes ya compilados, debido a la capa intermedia. No obstante, cabe destacar que no una desventaja demasiado crítica.

Para poder instalar la Java VM tendremos que acceder a la siguiente url: http://www.oracle.com/technetwork/java/javase/downloads/index.html, pulsar en el botón download donde aparece JRE (Java Runtime Environment) y descargar el fichero que nos interese según el sistema operativo que usemos. Una vez descargado, la instalación es fácil, ya que solo tendremos que ir siguiendo los pasos indicados. Cuando finalice la instalación puede que debamos reiniciar el equipo.

### 1.4. Tipos de lenguajes de programación. Clasificación y características de los lenguajes más difundidos

Como hemos definido anteriormente, un programa informático es un conjunto de instrucciones escritas en un lenguaje de programación. Asimismo, lenguaje de programación hace referencia al conjunto de caracteres, reglas y acciones combinadas y consecutivas que un equipo debe ejecutar.

Constará de los siguientes elementos:

- Alfabeto o vocabulario: conjunto de símbolos permitidos.
- Sintaxis: reglas para realizar correctamente construcciones con los símbolos.
- Semántica: reglas que determinan el significado de construcción del lenguaje.

#### 1.4.1. Clasificación y características

Podemos clasificar los lenguajes de programación basándonos en los siguientes criterios:

- Según su nivel de abstracción:
  - Lenguajes de bajo nivel.
  - Lenguajes de nivel medio.
  - Lenguajes de alto nivel.
- Según la forma de ejecución:
  - Lenguajes compilados.
  - Lenguajes interpretados.
- Según el paradigma de programación:
  - Lenguajes imperativos.
  - Lenguajes funcionales.
  - Lenguajes lógicos.
  - Lenguajes estructurados.
  - Lenguajes orientados a objetos.

** Según su nivel de abstracción**

## 2. Documentación y optimización

En esta segunda parte de la unidad trataremos el control de versiones y para qué se utiliza en la creación de proyectos de software. Usaremos herramientas cliente y servidor y aprenderemos a documentar las clases Java usando Javadoc. Por último, abordaremos el concepto de refactorización y por qué es necesario refactorizar.

## 2.1. Refactorización. Concepto. Limitaciones. Patrones de refacción más usuales.

La refactorización nos va a permitir optimizar un código que se ha escrito previamente, realizando cambios en la estructura interna sin que afecten al comportamiento final del producto.

La refactorización tiene como objetivo limpiar el código para que se entienda mejor y se pueda modificar de forma más fácil, lo que nos va a permitir una mejor lectura y comprensión de lo que se realiza. Esta modificación no alterará su ejecución ni los resultados.

### 2.1.1. Cuándo refactorizar. Malos olores (*bad smells*)

La refactorización la deberemos ir haciendo a medida que desarrollamos el software. En 2003, Mario G. Piattini y Félix Òscar García analizaron los síntomas que indican la necesidad de refactorizar. Por su parte, el ingeniero de software británico Martin Fowler y otros expertos diagnosticaron los bad smells (malos olores), es decir, pequeños indicios que indican que el sistema no funciona como es debido. Los síntomas para refactorizar el código son los siguientes:

− Código duplicado (Duplicated code). Esta será la principal razón para realizar la refactorización. Si encontramos algún código repetido deberemos unificarlos.
− Métodos muy largos (Long method). Los métodos largos normalmente pueden estar compuestos de métodos más pequeños por lo que deberemos dividirlos para que, además, puedan reutilizarse.
− Clases muy grandes (Large class). Si una clase es grande tendrá muchas responsabilidades al tener demasiados métodos y atributos. Por ello, deberemos crear clases más pequeñas y que estén bien delimitadas.
− Lista de parámetros extensa (Long parameter list). Las funciones deben tener el mínimo de parámetros posible o, del contrario, tendremos un problema de encapsulación de datos. Si un método requiere de muchos parámetros deberemos crear una clase objeto con esa cantidad de datos.
− Cambio divergente (Divergent change). Una clase se puede modificar por diferentes motivos. Éstos no tienen por qué estar relacionados y cabe la posibilidad de poder eliminar o dividir dicha clase en el caso, por ejemplo, de que esté realizando demasiadas tareas.
− Cirugía a tiro pistola (Shotgun surgery). Cambios adicionales realizados después de modificar una clase para compatibilizar el cambio.
− Envidia de funcionalidad (Feature envy). Ocurre cuando un método usa más elementos de otra clase que de la suya propia. Se resolverá pasando ese método a la clase que usa más.
− Clase de solo datos (Data class). Clase que solo tiene atributos y métodos de acceso. No debería ser lo habitual.
− Legado rechazado (Refused bequest). Subclases que usan características de superclase, lo que pude inducir a un error en la jerarquía de clases.

El proceso de refactorización posee algunas ventajas entre las que están la facilidad de mantenimiento en el diseño del sistema y el incremento de la facilidad en la lectura y en el código fuente.

Las bases de datos y las interfaces son áreas conflictivas para la refactorización. El cambio de base de datos tendría como consecuencia la migración de la estructura y de los datos.

### 2.1.2. Refactorización en Eclipse

En Eclipse disponemos de distintas formas de refactorizar. En función de donde lo hagamos tendremos un menú contextual u otro. Para ello, deberemos ir a la opción Refactor del menú contextual.

---

**Métodos de refactorización**

Son prácticas para refactorizar el código. A través de distintas herramientas plantearemos elementos para refactorizar y nos mostrarán las posibles soluciones en las que podremos observar el resultado antes y después de la refactorización.

También se les llama patrones de refactorización o catálogos de refactorización.

Para refactorizar seleccionamos el elemento y pulsamos el botón derecho del ratón, elegimos Refactor y seleccionamos método de refactorización. Los elementos más comunes serán los siguientes:

- Rename. Cambia el nombre de cualquier identificador de Java. Es de las opciones más utilizadas y, una vez realizada, se modifican las referencias a ese identificador.
- Move. Se mueve la clase de un paquete a otro, se moverá el archivo .java y se cambiarán todas las referencias.
- Extract Constant. Convierte en una constante un número o una cadena. Se mostrará el estado antes y después de refactorizar. El objetivo es modificar el valor del literal en un único lugar.
- Extract Local Variable. Se asigna una expresión a una variable local. La misma expresión a otro método no se modifica.
- Convert Local Variable to Field. Convierte una variable local en un atributo privado de la clase. Tras la refactorización, todos los usos de la variable local se sustituyen por el atributo.
- Extract Method. Convierte un bloque de código en un método. No debe llevar llaves abiertas. Este patrón es muy útil cuando detectamos bad smells en métodos muy largos o en bloques de código que se repiten.
- Change Method Signature. Permite cambiar la firma de un método, es decir, el nombre y los parámetros que tiene.
- Inline. Nos ajusta una referencia a una variable o método con la línea en la que se utiliza y conseguir, así, una única línea de código.
- Member Type to Top Level. Permite convertir una clase anidada en una clase de nivel superior con su propio archivo de java. Si es estática se realizará inmediatamente y, si no lo es, nos pedirá el nombre de la clase.
- Extract Interface. Nos va a permitir escoger los métodos de una clase para crear una Interface. Una Interface es una plantilla que define los métodos pero no los desarrolla. Serán las clases de la interface la encargada de desarrollarlos.
- Extract Superclass. Permite extraer una superclase. Si ya utilizaba una, la extraída será la nueva superclase. Se podrán seleccionar los métodos y atributos que van a formar parte de la nueva superclase.
- Convert Anonymous Class to Nested. Permite convertir una clase anónima a una clase anidada de la clase que la contiene. Una clase anónima se caracteriza por:
  - Utilizar la palabra new seguida de la definición entre llaves.
  - Usar la palabra new seguida del nombre de la clase que hereda (sin extends) y la definición de la clase entre llaves.
  - Utilizar la palabra new seguida del nombre de la interface (sin implements) y la definición de la clase anónima entre llaves.

### 2.2. Control de versiones. Estructura de las herramientas de control de versiones.

El control de versiones es la capacidad de poder recordar todos los cambios que se han realizado tanto en la estructura de directorios como en el contenido de los archivos. Puede ser muy útil para recuperar carpetas, archivos o algún proyecto en un momento dado del desarrollo. Es necesario saber qué cambios se hacen, quién los hace y cuándo se realizan.

**Terminología**

Veamos algunos términos útiles en relación al manejo del control de versiones:

− Repositorio. Lugar donde se almacenan los datos y los cambios realizados.
− Revisión o versión. Una revisión es una versión concreta de los datos almacenados. La última versión se identifica como la cabeza o HEAD.
− Etiquetar o Rotular (tag). Las etiquetas se crean para localizar o recuperar en cualquier momento una versión concreta del desarrollo.
− Tronco (trunk). Línea principal del desarrollo del proyecto.
− Rama o ramificar (branch). Copias de carpetas, archivos o proyectos. Se pueden crear ramas para la creación de nuevas funcionalidades o comprobación de errores.
− Desplegar (Checkout). Copia del proyecto, archivos y carpetas en el repositorio del equipo local.
− Confirmar (commit o check-in). Se realiza cuando se confirman los cambios realizados en el local para integrarlos al repositorio.
− Exportación (export). Es similar al Checkout, pero no se vincula la copia con el repositorio.
− Importación (import). Subida de carpetas y archivos al repositorio.
− Actualizar (update). Se realiza cuando se desea integrar los cambios realizados en el repositorio de la copia del trabajo local.
− Fusión (merge). Se unen cambios realizados sobre uno o varios archivos en una única revisión. Se suele realizar cuando existen varias ramas y es necesario unir los cambios realizados.
− Conflicto. Suele ocurrir cuando un usuario hace un Checkout de un archivo y otro usuario no actualiza y realiza cambios sobre el mismo archivo. Cuando envía los cambios realizados existe un conflicto entre ambos archivos, por lo que se deberán realizar los cambios o elegir uno de ellos.
− Resolver conflicto. Actuación del usuario para atender varios conflictos.

Para trabajar con el control de versiones habrá que crear primero una copia local con Checkout, realizar las modificaciones y, por último, subir las modificaciones con commit. Si ya está vinculada la copia habrá que hacer Update para que se haga sobre la última versión.

### 2.2.1. Subversión. Ciclo de vida de subversión

Durante el desarrollo de un proyecto, es fundamental el uso de una herramienta multiplataforma de código abierto que garantice el control de versiones proceso conocido como subversión. Esta herramienta usa una base de datos central llamada repositorio que contendrá archivos cuyas versiones e historias son controladas. Este repositorio actuará como servidor de archivos y recordará cada cambio realizado.

La subversión es especialmente importante cuando un proyecto lo realizan varias personas, pues será básico llevar un control y un orden para el correcto desarrollo de este. El proyecto tendrá que verse como un árbol con su tronco (trunk), que será la línea principal; sus ramas (branches), las cuales añaden nuevas funciones o corrigen errores; y, sus etiquetas (tags), que marcan situaciones importantes o versiones acabadas.

Así, la estructura con sus funciones quedará:

- Trunk (tronco): se guardan las carpetas del proyecto. Aquí estará la versión básica, o sea, la línea principal.
- Tags (etiquetas): copia del proyecto, carpeta o archivo para obtener una versión que no se modifique. Serán copias del tronco y es útil para crear versiones ya finalizadas.
− Branches (ramas): desarrolla versiones que serán publicadas. Es una copia del tronco, que será modificada para conseguir un producto final distinto al original. Serán modificaciones de versiones cerradas.

---

### 2.2.2. Cliente TortoiseSVN

TortoiseSVN es un cliente gratuito de código abierto para el sistema de control de versiones Subversion. Cuando se instala aparece integrado en la shell de Windows. Podemos descargarlo en la siguiente URL: http://tortoisesvn.net/downloads.html

Estará disponible para 32 y 64 bits, y también existirá el instalador del idioma. En esta unidad trabajaremos con la versión 1.8.4. Primero instalaremos la herramienta y después el idioma.

El proceso de instalación es muy sencillo. Solo debemos aceptar los términos de la licencia, indicamos la carpeta donde se instalará y pulsamos en Instalar.

Seguidamente instalamos el idioma. Para configurarlo, pulsamos el botón derecho del ratón en el escritorio, seleccionamos TortoiseSVN/Settings y el cuadro que nos aparece en General seleccionamos el idioma en Language. Seleccionamos español y comprobamos que las opciones que nos aparecen están en español.

Ahora vamos a ver cómo se crea un repositorio en el PC para controlar los archivos y documentos que se almacenan en él.

Para crearlo debemos crear una carpeta en nuestro disco duro, la seleccionamos y haciendo clic derecho elegimos la opción TortoiseSVN y accedemos a la opción Crear repositorio aquí. A continuación, hacemos clic en el botón Crear estructura de carpetas (se creará la estructura branches, tags y trunks) y pulsaremos Navegador de repositorios para que nos muestre el navegador. La revisión creada será la 1 e irá aumentando conforme hagamos cambios en el repositorio. Para acceder a las demás revisiones pulsamos en el botón HEAD.

Podremos crear todos los repositorios que queramos y administrarlos desde el navegador. Se creará la estructura de carpetas trunk-tags-branches. Esa estructura variará dependiendo de la organización que queramos, ya que podremos organizarlo por ramas o por proyectos.

#### 2.2.2.1. Operaciones con Tortoise

Para probar esta herramienta podremos usar archivos y carpetas de nuestro disco duro y tanto desde dentro del repositorio como desde fuera. Dentro del navegador y desde el menú contextual de TortoiseSVN se podrán seleccionar las operaciones a realizar.

## Documentación. Uso de comentarios. Alternativas

La documentación es el texto escrito que acompaña a los proyectos. Es un requisito importante en un proyecto comercial, ya que el cliente querrá que se documente las distintas fases del proyecto. 

Podemos distinguir entre los siguientes tipos de documentación:
− Documentación de las especificaciones: sirve para comprobar que tanto las ideas del desarrollador como las del cliente son las mismas, ya que sino el proyecto no será aceptable. Según la norma IEEE 830, que recoge varias recomendaciones para la documentación de software, esta documentación deberá contener:
  - Introducción: se explican los fines y objetivos del software.
  - Descripción de la información: descripción detallada, incluyendo hardware y software.
  - Descripción funcional: detalla cada función del sistema.
  - Descripción del comportamiento: explica cómo se comporta el software ante sucesos externos e internos.
  - Criterios de validación: documento sobre el límite de rendimientos, los tipos de pruebas, la respuesta esperada del software y las consideraciones especiales.
- Documentación del diseño: en este documento se describe toda la estructura interna del programa, formas de implementación, contenido de clases, métodos, objetos, etc.
- Documentación del código fuente: durante el desarrollo del proyecto se debe ir comentando en el código fuente cada parte, para tener una mayor claridad de lo que se quiere conseguir en cada sección.
- Documentación de usuario final: documentación que se entrega al cliente en la que se describe cómo usar las aplicaciones del proyecto.

**Documentación del código fuente**

La documentación del código del programa también es fundamental para que todo el equipo pueda realizar funciones de actualización y reparación de errores de
manera mucho más sencilla.

Esta debe describir lo que se está haciendo y por qué. Hay 2 reglas que no se deben
olvidar:
- Todos los programas poseen errores y es cuestión de tiempo que se detecten.
- Todos los programas sufren modificaciones a lo largo de su vida.

Al realizar las modificaciones es necesario que el código esté bien documentado para que otro programador ajeno localice los cambios que quiere realizar.

Al documentarlo, habrá que explicar lo que realiza una clase o un método y por qué y para qué lo hace.

Para documentar proyectos existen muchas herramientas como pueden ser PHPDoc, phpDocumentor, Javdoc o JSDoc, el javadoc para JavaScript. Nosotros usaremos Javadoc.

### 2.3.1. Uso de Javadoc en Eclipse

Javadoc es una herramienta de Java que sirve para extraer y generar documentación básica para el programador a partir del código fuente en formato HTML. Tendremos que escribir los comentarios siguiendo las recomendaciones de Javadoc, y el código y la documentación se encontrarán dentro del mismo fichero.

Los tipos de comentario para que genere la documentación son:
- Comentarios en línea: comienzan con los caracteres “//” y terminan en la misma línea.
- Comentarios tipo C: comienzan con “/*” y terminan con “*/”. Pueden contener varias líneas.
- Comentarios de documentación Javadoc: se colocan entre delimitadores /**…*/, podrán agrupar varias líneas y cada línea irá precedida por un *.

Deberá colocarse antes de la declaracion de una clase, un campo, un método o constructor. Podrá contener etiquetas HTML y los comentarios están formados por dos partes: una descripción seguida de un bloque de tags.

**Uso de etiquetas de documentación**

Las etiquetas de Javadoc van precedidas por @ y las más utilizadas son:

- **@author**: autor de la clase. Solo para clases.
- **@version**: versión de la clase. Solo para clases.
- **@see**: referencia a otra clase.
- **@param**: descripción del parámetro. Una etiqueta por cada parámetro.
- **@return**: descripción de lo que se devuelve. Solo si no es void.
- **@throws**: descripción de la excepción que se puede propagar. Habrá una etiqueta throws por cada tipo de excepción.
- **@since**: número de la versión de la que existe el método.

**Generar la documentación**

Casi todos los entornos de desarrollo incluyen un botón para poder configurar Javadoc. Para hacerlo desde Eclipse, abrimos el menú Project y elegimos el botón Generate Javadoc. En la siguiente ventana nos pedirá la siguiente información:
- En Javadoc command se indicará dónde se encuentra el fichero ejecutable de Javadoc, el javadoc.exe. Pulsamos en Configure para buscarlo dentro de la carpeta del JDK y elegimos la carpeta bin.
- En los cuadros inferiores elegiremos el proyecto y las clases a documentar.
- Elegimos la privacidad de los elementos. Con Private se documentarán todos los miembros públicos, privados y protegidos.
- Para finalizar, se indica la carpeta de destino en la que se almacenará el código HTML.

Pulsar next, en la siguiente ventana poner el título del documento html que se genera, y elegir las opciones para la generación de las páginas HTML. Como mínimo se seleccionará la barra de navegación y el índice.
