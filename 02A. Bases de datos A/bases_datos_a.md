# Bases de datos A

## UF1: Introducción a las bases de datos

### 1.0 Definición de base de datos

Una **base de datos** es una agrupación de datos relevantes para una entidad determinada. Estos datos representan algún aspecto del mundo real. Son diseñadas y almacenan datos para un propósito específico y están destinadas a un grupo de usuarios.

### 1.1. Evolución histórica de las BBDD

#### Años 60 y 70: sistemas centralizados

En este periodo nos encontramos con sistemas diseñados para facilitar el uso de conjuntos de datos muy amplios interrelacionados de forma compleja. Dichos sistemas solo trabajan por lotes (*batch*). Estos sistemas de bases de datos (SGBD) se empleaban en grandes empresas.

#### Años 80: Sistemas de gestión de bases de datos relacionales

En esta década comienza a extenderse la informática. Las aplicaciones que gestionaban las BBDD anteriormente estaban diseñadas para ser manipuladas por personal altamente cualificado. Para solucionar este problema surgió la **estandarización** con un nuevo lenguaje bautizado como SQL. En los años ochenta empezaron a aparecer los primeros ordenadores personales, capaces de manejar SGBD a nivel de usuario.

#### Años 90: Distribución, C/S y 4GL

A comienzos de la década ya existe una presencia bastante amplia en la utilización en todas las empresas, por lo que se trataba de conseguir mejorar el rendimiento de los SGBD.

#### Actualidad

### 1.2. Ventajas e inconvenientes de las BBDD
### 1.3. Almacenamiento de la información
### 1.4. Sistemas gestores de BBDD
### 1.5. Arquitectura ANSI/X3/SPARC. Estándar y niveles
### 1.6. Modelos de BBDD. Tipos
### 1.7. BBDD centralizadas y distribuidas

### 2. Modelo entidad-relación

El modelo **entidad-relación** es un modelo de datos abstracto que nos permite representar de manera conceptual una base de datos.

Se compone de dos elementos principales:
- El diagrama de entidad-relación.
- Las restricciones y otras anotaciones que no se pueden representar en el diagrama (como las claves candidatas).

El diagrama es el elemento principal en el modelo entidad-relación. Se compone principalmente de entidades, relaciones entre las entidades, atributos y cardinalidades.

Este modelo nos ayuda a la creación de una base de datos. Se realiza tras la recopilación de información sobre la futura BBDD que se desea construir y antes del modelo relacional.

Para contextualizar el modelo entidad-relación dentro de una base de datos, vamos a describir las fases que precisa una base de datos para su completa formación.

1. **Recopilar información**: Consiste en recabar toda la información posible de la base de datos que deseamos diseñar. ESta información puede ser dada por el cliente o por el mismo desarrollador, dependiendo del caso.
2. **Realizar el modelo entidad-relación**: tras la recopilación de información se realiza el diseño del modelo entidad-relación. Para ello, se refleja toda la información recogida en el diagrama entidad-relación y en las restricciones asociadas al diagrama. Este modelo corresponde al modelo conceptual.
3. **Paso del modelo entidad-relación al modelo relacional**: una vez que tenemos listo el modelo entidad-relación, realizamos la conversión de este al modelo relacional. Para ello usaremos unas reglas determinadas. El modelo relacional es el modelo lógico.
4. **Normalización**: en esta fase retocamos el modelo relacional para hacerlo más eficiente de cara a su codificación.
5. **Codificación**: en esta fase trasladamos el modelo lógico que hemos diseñado a una máquina física, como un servidor. Para ello tendremos que elegir el hardware más pertinente y también el software más adecuado, es decir, el SGBD. Una vez hayamos elegido estos dos elementos, pasaremos a codificar en un lenguaje de bases de datos (SQL) el modelo lógico anteriormente creado. Esta fase pertenece al modelo físico.

Por lo tanto, se pueden definir tres tipos de modelos de una base de datos:

- **Modelo conceptual**: representación estructurada de la realidad en entidades y relaciones.
- **Modelo lógico**: especificación de todas las tablas.
- **Modelo físico**: archivo SQL que determina en el sistema informático la BBDD.

#### 2.1. Concepto de entidad-relación

Como mencionamos anteriormente, el modelo entidad-relación es un arquetipo conceptual que representa un problema planteado a través de entidades y relaciones.

Se debe diferenciar entre modelo entidad-relación y el diagrama entidad-relación. El modelo entidad-relación es el modelado abstracto de la base de datos, en el que utiliza el diagrama como herramienta para representarse y las restricciones para matizar el diagrama y completar el modelado conceptual de la base. Simplificando, podría decirse que el modelo entidad-relación consiste fundamentalmente en un diagrama y unas restricciones asociadas.

**Insertar diagrama**

#### 2.2. Entidad. Representación gráfica, atributos y tipos de claves

Se definen las **entidades** como la representación de aquellos elementos (físicos o abstractos) de los que se desea almacenar la información.

Se pueden representar gráficamente mediante un rectángulo que contiene en su interior el nombre del elemento al que representan. Este nombre debe ser único, es decir, no puede aparecer repetido en nuestro diagrama.

**Insertar diagrama**

Cuando hablamos de **atributos** de una entidad, hacemos referencia a las propiedades o características que tiene una instancia en particular de esa entidad. Por ejemplo, en el caso de un libro, su título, el autor o la fecha de publicación. Por ejemplo:

**Insertar diagrama**

Un atributo o conjunto de ellos pueden conformar una **clave primaria**, que permite identificar de manera única un registro de una tabla. Este concepto se abordará posteriormente. Su representación en un diagrama sería:

**Insertar diagrama**

Un atributo es **multivaluado** cuando para la misma instancia de una entidad, el atributo posee varios datos posibles. En tal caso, se representa con una doble circunferencia.

**Insertar diagrama**

Una instancia de una entidad es un valor concreto. Por ejemplo, de la entidad empleado podríamos tener varias instancias y cada una sería un empleado concreto (Por ejemplo, el empleado "Julián Hernández", "Julia Blanco", etc.).

Un atributo es **derivado** o calculado cuando se puede deducir de otro u otros atributos. Se representa con una circunferencia discontinua. Por ejemplo, podemos conocer la antigüedad de un empleado si disponemos de su fecha de alta y la fecha actual.

**Insertar diagrama**

#### 2.3. Relación. Representación gráfica, atributos, grado y cardinalidad

La **relación** sirve para escenificar las conexiones entre las diferentes entidades, dándoles un significado semántico más completo.

La palabra escogida para identificar la relación suele ser un verbo e indica la relación existente entre dichas entidades. Este puede estar en infinitivo o en una forma verbal, generalmente en presente.

Se representa gráficamente mediante un rombo:

**Insertar diagrama**

Por ejemplo, supongamos que estamos haciendo una BBDD de una empresa para el departamento de RRHH. Podíamos tener las entidades empleado y departamento y la relación pertenece (o trabaja). Así, representaríamos en el diagrama entidad-relación la realidad de que los empleados pertenecen a departamentos de esta manera:

**Insertar diagrama**



## UF2: Lenguajes SQL: DML y DDL

### 1. Lenguajes de las BBDD. SQL

El lenguaje de programación SQL es el lenguaje fundamental de los SGBD relacionales. Una de las características principales de este lenguaje es su aspecto declarativo en vez de imperativo., es decir, el programador debe indicar qué hacer y no cómo hacerlo.

Este lenguaje pretende ser lo más natural posible y, por esta razón, se le considera
de cuarta generación.

Los elementos que componen el lenguaje SQL son los siguientes:

- **DML** (*Data Manipulation Language*): es el lenguaje que manipula los datos ya creados. Modifica los registros o tuplas de la BDD.
- **DDL** (*Data Definition Language*): permite la creación de la BDD y de las tablas que la componen.
- **DCL** (*Data Control Language*): administra a los usuarios de las BDD, concediendo o denegando los permisos oportunos.
- **TCL** (*Transaction Control Language*): lenguaje que controla el procesamiento de las transacciones de las BDD.

A continuación, para terminar este apartado de introducción al SQL, vamos a nombrar las normas básicas para tener en cuenta para diseñar instrucciones en SQL:
- No se distingue entre mayúsculas y minúsculas.
- La instrucción en SQL debe terminar con el carácter “;” (punto y coma). Esto se debe a que el compilador está diseñado para que vaya decodificando la instrucción hasta que se encuentre con este carácter que delimita el fin del comando.
- Antes de finalizar la instrucción, cualquier comando puede ir seguido por: un espacio en blanco o un salto de línea.
- Se puede tabular la instrucción para clarificar la orden deseada.

#### 1.1 Herramientas para gestionar los datos en un SGBDR corporativo

En este tema vamos a desarrollar los distintos lenguajes que pueden intervenir a la hora de detallar el proceso de implantación de una base de datos en un determinado sistema informático.

Existen múltiples herramientas a la hora de crear y manipular una determinada base de datos si disponemos de alguna interfaz gráfica que ayude al DBA (Database Administrator). Esta también debe ser capaz de enviar diferentes comandos de administración de forma automática sin necesidad de profundizar con más detalle sobre su sintaxis.

**PhpMyAdmin de MySQL**

Es una interfaz basada en diferentes páginas web disponibles para MySQL.

Tiene disponibles diferentes opciones que nos permiten visualizar cualquier gestión que realicemos en la BBD como crear, modificar o borrar tablas. Además, permite también importar/exportar información, estadísticas, copias de seguridad, etc.

**Oracle Enterprise Manager y Grid Control**

Dispone de dos herramientas gráficas con su correspondiente interfaz web. Estas están montadas en un servidor web de Oracle:
- Enterprise Manager: Permite manipular cualquier función básica correspondiente a una base de datos. Esta herramienta ya viene incorporada en el software de Oracle.
- Grid Control: Gestiona diferentes bases de datos en distintos servidores y ofrece posibilidad de poder consultar el estado y rendimiento de cualquiera de ellas. Se debe instalar a parte del software de Oracle.

**DB2 Data Studio**

Ofrece la posibilidad de manipular y modificar los objetos de los permisos de una base de datos. Facilita la construcción de consultas SQL. Permite crear Servicios web para poder distribuir datos de consulta.

#### 1.2. Lenguaje de definición de datos (DDL)


## Bibliografía
