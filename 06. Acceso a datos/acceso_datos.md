# Acceso a datos

## 1. Gestión de ficheros

En los siguientes temas aprenderemos todos los conceptos básicos que hay que tener en cuenta cuando necesitamos tratar con ficheros con lenguaje Java.

Para entender mejor qué trataremos en los siguientes apartados, primero deberemos entender bien los conceptos básicos: ¿qué podemos entender por un fichero?

Un fichero es un archivo que contendrá un conjunto de caracteres o bytes que se almacenarán en el dispositivo en una ruta y con un nombre concretos.

Es el archivo que usará nuestro programa para almacenar, leer, escribir o gestionar información sobre el proceso que se esté ejecutando. Existen diferentes tipos de ficheros, como, por ejemplo:

- Fichero estándar: es un archivo que contiene todo tipo de datos: caracteres, imagen, audio, vídeo, etcétera. Normalmente son ficheros que contienen información de cualquier tipo.
- Directorios o carpetas: son ficheros que albergan más archivos en su interior. Su principal utilidad es mantener un orden o jerarquía en nuestros sistemas.
- Ficheros especiales: son todos esos ficheros que usa nuestro sistema operativo y que se utilizan para controlar los dispositivos o periféricos de nuestro ordenador.

En este tema profundizaremos en el tipo de ficheros estándar y en los directorios. Como explicaremos más adelante, este tipo de ficheros nos permitirán realizar diferentes acciones para tratar los ficheros y para mantener un orden y jerarquía con las carpetas.

Podemos destacar dos tipos de ficheros de datos:
- Los ficheros de bytes: también conocidos como ficheros binarios, son archivos que usan los programas para leer o escribir información.
- Los ficheros de caracteres: también conocidos como ficheros de texto, nos permitirán leer o escribir la información que contengan.

Un fichero se caracteriza por estar formado por la ruta en la que está almacenado, el nombre y una extensión, siguiendo este orden. Además, tenemos que tener en cuenta que no podrán existir ficheros con el mismo nombre, ruta y extensión. Para que sean
únicos, el nombre o la extensión en la misma ruta deben ser distintos.

Para tener acceso a un fichero determinado, se utiliza una ruta (o también la podemos nombrar path) que indica la ubicación de ese fichero en nuestro sistema. La ruta está compuesta por diferentes niveles jerárquicos (carpetas) separado por un símbolo barra
/, Aunque en Windows, para separar los niveles jerárquicos, se utiliza la contrabarra o \. En cambio, en Unix el separador será /. Eclipse admite tanto / como \ cuando definimos la ruta.

Si queremos definir la ruta independientemente del sistema operativo, podemos realizarlo de este modo:

```java
//Ejemplo con la ruta directa al string
File archivoNoseguro = new File("carpeta/ejemplo.txt");
//Ruta que asegura el separador correcto segun plataforma
File archivo = new File("carpeta"+File.separator+"ejemplo.txt");
```

Existen dos tipos importantes de rutas que nos serán muy útiles en la gestión de ficheros:
- Ruta absoluta: se conoce como la ruta desde la carpeta padre: *C:\datos\ejemplo.txt*
- Ruta relativa: es aquella que coge como referencia el directorio actual para dar la ruta. La diferencia entre la ruta absoluta y la relativa es que no se indica la carpeta padre u origen y solo se da la guía desde la carpeta actual. Se indica con un punto, una barra y el nombre de los diferentes directorios separados por barras. Teniendo en cuenta que la carpeta actual sea accesoDatos, veamos este ejemplo: *./datos/ejemplo.txt*

La extensión del archivo nos permitirá diferenciar qué programa puede utilizar ese fichero. Se considera extensión todo lo que podemos encontrar después del punto que ponemos al final de nombre. Veamos el ejemplo:

- ejemplo.txt
- ejemplo.docx

El fichero se guardará según la codificación del dispositivo que estemos usando.

Los archivos que trataremos, en muchas ocasiones, contendrán información de texto o caracteres. Cada lengua utiliza un tipo de carácter distinto de otra, por ejemplo, el ruso utiliza un abecedario diferente que el español, por lo que usará caracteres distintos. Los
caracteres se almacenan en nuestro ordenador como uno o más bytes.

Básicamente, podemos asumir que todos los caracteres están almacenados en ordenadores usando un código especial, es decir, una codificación de caracteres proporciona una clave para descifrar el código. Es un conjunto de asignaciones entre los
bytes de los ordenadores y los caracteres en el conjunto de caracteres. Sin la clave, cuando el ordenador descifre los caracteres de ese fichero, aparecerán sin descifrar y se verán raros. Por ejemplo, algo así:

W®ûYr|¢Kt8 J¡ÐŸ [êLUC&ÈÙ ÎŠ…™ Éâæj Æ %hªò «  ’ƒF<j    IDATx^Ì½gœUEÒ8

Este sería un ejemplo de mala interpretación de un encoding. Los caracteres no son legibles y no podemos interpretar la información.

Se denomina encoding al sistema utilizado para transformar los caracteres que usa cada lenguaje en un símbolo que un ordenador pueda interpretar.

La codificación de caracteres asigna los caracteres escogidos a bytes específicos en la memoria del ordenador, y luego, para mostrar el texto, lee los bytes nuevamente en caracteres. Principalmente, se basa en crear tablas de equivalencias entre caracteres de
lenguaje entendible por las personas con su correspondencia al lenguaje que usa un sistema informático.

No es necesario saberse todos los que existen, pero aquí os mostraremos los más importantes:

**ASCII**
---
Es el conjunto de caracteres creado por la American National Standard Code for Information (ANSI), en 1967. Codifica caracteres, letras y símbolos que usamos día a día.

**ISO-8859**

Se trata de otro tipo de encoding bastante conocido que se caracteriza por incluir letras, símbolos y caracteres, pero además también los acentos y los símbolos de interrogación y exclamación. Este tipo de codificación utiliza 8 bits, por tanto, tiene una capacidad de 256 caracteres, lo que la hace más amplia que ASCII. Incluye los 128 caracteres de ASCII, pero se añaden símbolos matemáticos y letras griegas, entre otros. Con el tiempo, este encoding se ha quedado corto en cuanto a contemplar los diferentes alfabetos de distintos idiomas. Por este motivo, se han ido creando diferentes especializaciones de esta codificación. Podemos encontrar también estos otros:

- ISO 8859-1 (Latin-1), para la zona de Europa occidental.
- ISO 8859-2 (Latin-2), para la zona de Europa occidental y Centroeuropa.
- ISO 8859-3 (Latin-3), para la zona de Europa occidental y Europa del sur.
- ISO 8859-4 (Latin-4), para la zona de Europa occidental y países bálticos (lituano, estonio y lapón).
- ISO 8859-5, para el alfabeto cirílico.
- ISO 8859-6, para el alfabeto árabe.
- ISO 8859-7, para el alfabeto griego.
- ISO 8859-8, para el alfabeto hebreo.
- ISO 8859-9 (Latin-5), para la zona de Europa occidental con los caracteres del alfabeto turco.
- ISO 8859-10 (Latin-6), para la zona de Europa occidental, incluye los caracteres del alfabeto nórdico, lapón y esquimal.
- ISO 8859-11, incorpora caracteres del alfabeto tailandés.
- ISO 8859-13 (Latin-7), incorpora caracteres para los idiomas bálticos y el polaco.
- ISO 8859-14 (Latin-8), incorpora caracteres para los idiomas celtas.
- ISO 8859-15 (Latin-9), añade el símbolo del euro.
- ISO 8859-16, incorpora caracteres para los idiomas polaco, checo, eslovaco, húngaro, albano, rumano, alemán e italiano.

**Unicode**

Es una norma de codificación creada en 1991 para unificar los tipos de codificación.
Como hemos visto, existen multitud de variantes de codificación para abarcar diferentes idiomas. La creación de este encoding pretendía organizar en un mismo estándar los diferentes caracteres dentro de una misma codificación, para poder abarcar diferentes idiomas tanto de alfabetos europeos como de chinos, japoneses, coreanos o lenguas ya extinguidas con alfabetos diferentes. Para realizar las tablas de equivalencias, Unicode asigna un identificador numérico a cada carácter, pero también irá acompañado de información como la direccionalidad, la capitalización y otros atributos. Nuestro ordenador, según su arquitectura, utilizará diferentes bloques de 8, 16 o 32 bits para interpretar y representar los números. Estos tres diferentes bloques han creado diferentes codificaciones:

- UTF-8
- UTF-16.
- UTF-32

Hoy en día, la codificación más usada es la codificación de caracteres UTF-8.

Tanto los editores de texto, como los IDE (programa para desarrollar nuestra aplicación) normalmente dan la posibilidad de configurar qué tipo de codificación queremos usar.

Por ejemplo, en Eclipse esta configuración se puede encontrar dirigiéndonos a Window > Preferences > General > Workspace. Se nos abrirá una ventana y abajo a la derecha podremos escoger la codificación, tal y como se muestra en esta captura:

Para que se haga efectivo este cambio, tendremos que darle a Apply and Close, y todos los ficheros que creemos a partir de este momento serán con este tipo de codificación.

En el caso de que queramos usar diferentes encodings, será necesario usar un fichero binario, es decir, un fichero que almacenará bytes con la información.

---
