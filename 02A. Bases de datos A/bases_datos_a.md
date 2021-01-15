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

#### 2.4. Diagrama entidad-relación

Vamos a abordar los diferentes conceptos o funcionalidades que presentan los diagramas entidad-relación.

**Cardinalidad**

La **cardinalidad** indica la participación que existe entre las entidades, es decir, el número de instancias de una entidad respecto a otra con la que está relacionada y viceversa.

**Insertar diagrama**

La cardinalidad nos indicará si un libro tiene uno o varios autores, y al revés. Nos indicará si un libro puede ser escrito por un autor o por muchos de ellos. Las cardinalidades posibles son:

| Cardinalidad | Descripción |
|:------:|--------|
| **1:1 (uno a uno)** |Este caso ocurre cuando las instancias de dos entidades están relacionanda, como máximo, con solo una instancia de otra entidad. Es decir, que no habrá una instancia de una entidad que pueda relacionarse con dos o más instancias de la otra entidad, sino solo con una, como mucho.|
| **1:N (uno a muchos)** |Es un caso asimétrico. Ocurre cuando una entidad puede tener una instancia que se relacione con muchas instancias de la otra entidad, pero no al revés, pues cada instancia de esa otra entidad solo podrá relacionarse, como máximo, con una instancia de la primera entidad y no con varias.|
| **N:M M (muchos a muchos)**  |Es una situación simétrica. Cada instancia de cualquier entidad puede relacionarse con dos o más instancias de la otra entidad.|

**Insertar diagramas de ejemplo con sus explicaciones**

**Participaciones**

Las **participaciones** son las cardinalidades particulares de cada lado de la entidad. Indican el mínimo y el máximo de relaciones que puede tener una entidad con otra.

Por ejemplo:

Un alumno debe estudiar al menos una asignatura y como máximo muchas (1,n). Por otro lado, una asignatura puede no ser estudiada por ningún alumno, como mínimo, y por muchos como máximo (0,n).

**Insertar diagrama explicando la orientación de las cardinalidades**

La cardinalidad general de la relación vendrá dada por los máximos de las dos entidades implicadas. Para el caso del ejemplo, esta será N,M, ya que, por convenio, la segunda N se transforma en una M, teniendo un significado invariable.

Las participaciones posibles son:

| Participación | Descripción |
|:------:|--------|
| **(0,1** |Mínimo cero, máximo uno.|
| **(1,1)** |Obliga a la participación|
| **(0,n)** |Mínimo cero, máximo n (indefinido)|
| **(1,n)** |Mínimo uno, máximo n (indefinido)|

La notación que utilizamos para expresar la participación de in diagrama entidad-relación consiste en cologar la participación al lado de la entidad, sobre la línea de la relación.

**Entidades fuertes y débiles**

Una **entidad fuerte** tiene existencia por sí misma, es decir, está dotada de significado propio. Se representa:

**Insertar diagrama**

En una **entidad débil** los atributos no la identifican completamente. Su participación está ligada a una relación fuerte que le ayuda a identificarla.

**Insertar diagrama y ejemplo de entidad fuerte y débil**

Las entidades débiles tienen identificador, representadas con una línea subrayada discontinua. Necesitará su identificador junto a la clave primera de su entidad fuerte para poder distinguir de manera unívoca cada instancia.

**Tipos de correspondencias en las relaciones: binaria, reflexiva y otros**

#### 2.5. Modelo entidad-relación extendido 

## UF2: Lenguajes SQL: DML y DDL

### 5. Lenguajes de las BBDD. SQL

El lenguaje de programación **SQL** es el lenguaje fundamental de los SGBD relacionales. Una de las características principales de este lenguaje es su aspecto declarativo en vez de imperativo., es decir, el programador debe indicar qué hacer y no cómo hacerlo.

Este lenguaje pretende ser lo más natural posible y, por esta razón, se le considera de cuarta generación.

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

#### 5.1. Tipos de lenguages para gestionar los datos en un SGBDR corporativo

Vamos a enumerar algunos de los tipos de lenguajes que se utilizan en la gestión y desarrollo de una base de datos en un SGBDR corporativo. Por esta razón, lenguajes *freeware*, como SQLite, quedarán fuera de esta categoría.

**Oracle**

**PL/SQL** (*Procedural Language / Structured Query Language*) es el lenguaje procedural usado en Oracle RDBMS (*Relational Data Base Management System*). Al igual que la mayoría de lenguajes de bases de datos, este está basado en SQL y además posee algunas características adicionales sobre el control de excepciones, el manejo de las variables o en las estructuras de control de flujo.

Los lenguajes procedurales son propios de la programación estructurada y usan las llamadas **rutinas**, las cuales tienen un conjunto de sentencias.

**Microsoft**

*SQL Server* es un SGBDR de Microsoft. El lenguaje empleado en SQL Server es **T-SQL** (*Transact-SQL*). Al igual que el lenguaje de Oracle, este también deriva del SQL estándar, pero añade la opción de trabajar con procedimientos.

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

#### 5.3. Lenguaje de definición de datos (DDL)

El **Lenguage de definición de datos (DDL) es un lenguaje de programación para definir estructuras de datos. Define el continente (no el contenido). Se encarga de definir, modificar y eliminar las estructuras básicas de la base de datos, tales como tablas, vístas, índices, etc.

Analizaremos varias sentencias SQL, que agruparemos en tres tipos: CREATE, ALTER y DROP.

**Crear BD**

Para crear una base de datos utilizaremos la sentencia "CREATE DATABASE":

```sql
CREATE DATABASE nombreBD;
```

Una vez creada la base, estará vacía, es decir, no tendrá ninguna tabla.

**Creación de tablas**

Una vez generada la base de datos, entramos en ella con el comando USE:

```sql
USE nombreBD;
```

Ya dentro, crearemos las tablas correspondientes, teniendo en cuenta la siguiente estructura:

```sql
CREATE TABLE nombre_tabla(
  columna1 tipodato
  columna2 tipodato
  {RESTRICCIONES}
);
```

Por ejemplo:

```sql
CREATE TABLE empleado(
  id INT PRIMARY KEY,
  nombre VARCHAR(80) NOT NULL,
  departamento VARCHAR(40)
);
 ```
 
 - PRIMARY KEY indicanda que este atributo es la clave primaria de la tabla.
 - NOT NULL indica que el atributo debe tener siempre algún valor, es decir, que el registro no puede quedar vacío.

Los nombres de las variables puede cambiar según el tipo de SQL que usemos. En MySQL algunas de ellas son:

**Crear tabla con ejemplos**

Se puede ver el listado completo de los tipos de datos en MySQL en la siguiente web:

- https://dev.mysql.com/doc/refman/8.0/en/data-types.html

**Añadir tabla con algunas variantes de tipos de datos entre MySQL y Oracle**

**Modificación de tablas**

Para modificar una tabla se usa ALTER TABLE. Así, podemos añadir, modificar o elimiar las columnas de una tabla, así como habilitar o deshabilitar restricciones.

```sql
ALTER TABLE nombre_tabla(
  ADD (columna)
  MODIFY/CHANGE (colum [….])
  DROP COLUMN (colum…..)
  ADD CONSTRAINT restricción
  DROP CONSTRAINT restricción
  DISABLE CONSTRAINT restricción
  ENABLE CONSTRAINT restricción
);
```

Algunas opciones para esta sentencia son:

- **ADD**: Añade una columna. Si la columna no tiene restricción NOT NULL, se añadirá sin más. Si tiene esa restricción, se le añade, se le asigna un valor y se le asigna la restricción.
- **MODIFY/CHANGE**: Puede modificar la longitud de la columnam y aumentar o disminuir el valor de los decimales del campo.
- **DROP**: elimina una columna. No se pueden eliminar todos los campos de una tabla, así como borrar las claves primarias referenciadas por una clave ajena de otra tabla.

***Añadir ejemplos***

**Borrado de tablas**

Para borrar una tabla se emplea la siguiente sintaxis:

```sql
DROP TABLE nombreBD;
```

Al eliminar una tabla, también desaparece todo su contenido. Si añadimos la cláusula de eliminación en cascada (*Cascade Constraint*) también se eliminarán las restricciones de integridad referencial que afecten a la clave principal de la tabla que se va a borrar.

Hay que tener un cuidado extremo, ya que esta operación es **irreversible**. Antes de llevarla a cabo, debemos asegurarnos de que no habrá ningún problema.

#### 5.4. Lenguaje de manipulación de datos (DML)

El lenguage de manipulación de datos (DML) nos permite insertar, modificar, eliminar y consultar la información en una base de datos.

A través de este lenguaje tenemos la posibilidad de añadir nuevos registros en las tablas, modificar la información de los mismos, consultarlo e incluso borrarlos.

Se agrupan en cuatro tipos:

- SELECT
- INSERT
- UPDATE
- DELETE

##### 5.4.1 Sentencias de inserción

Una vez que hemos creado la base de datos y las tablas, el siguiente paso es añadir la información, es decir, insertar registros (tuplas) en las tablas.

```sql
INSERT INTO nombre_tabla (columna1, columna2, columna3);
VALUES (valor1, valor2, valor3);
```

Tomaremos como ejemplo una hipotética base de datos de una biblioteca:

```sql
CREATE TABLE libros(
  codigo INT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL
  autor VARCHAR(80)
)ENGINE=INNODB;
```

Como aclaración "ENGINE=INNODB" se añade de manera opcional en MySQL para indicar el moter de almacenamiento que deseamos. Este es adecuado para trabajar con claves foráneas, transacciones o bloqueos, entre otros.

Introduciremos datos:

```sql
INSERT INTO libros (codigo, titulo, autor)
VALUES (1, "El despertar del Leviatán", "James S.A. Corey");
```

También está la posibilidad de omitir el nombre de las columnas. En cualquier caso, el orden de los valores debe coincidir con el orden de los campos creados en la tabla.

```sql
INSERT INTO libros
VALUES (35, "Marte rojo", "Kim Stanley Robinson");
```

##### Sentencias de modificación

Para modificar el valor o valores de un registro se utiliza UPDATE.

```sql
UPDATE nombre_tabla
SET columna1=valor1, columna2=valor2, columna3=valor3
WHERE condición;
```

Hay que tener un gran cuidado a la hora de emplear esta sentencia, ya que en la cláusula WHERE tenemos que introducir la condición que deben cumplir los datos para actualizarse. Si omitimos se modificarían todos los registros de la tabla.

Por ejemplo, partiendo de la siguiente tabla (discos):

| id | album | artista |
|:------:|--------|--------|
| 1 |El espíritu del vino| Héroes del silencio |
| 2 |De pata negra| Metallica |
| 3 |Iowa| Slipknot|

Queremos modificar la tupla con id 2, ya que Metallica no es autora de disco *De pata negra*.

```sql
UPDATE discos
SET artista = "Melody"
WHERE id = 2;
```

Obtendremos pues una actualización del campo *artista* cuyo id tiene como valor 2. El resultado sería entonces:

| id | album | artista |
|:------:|--------|--------|
| 1 |*El espíritu del vino*| Héroes del silencio |
| 2 |*De pata negra*| Melody |
| 3 |*Iowa*| Slipknot|

##### Sentencias de eliminación

Se utiliza DELETE FROM para suprimir registros de una tabla que cumplan una determinada condición. Como comentábamos anteriormente, si omitimos u olvidamos la cláusula WHERE se borrarán todas las tuplas de la tabla.

```sql
DELETE FROM nombre_tabla
WHERE condición;
```

Por ejemplo, si tenemos la siguiente tabla (libros):

| id | titulo | autor |
|:------:|--------|--------|
| 1 |*El problema de los tres cuerpos*| Cixin Liu |
| 2 |*Arañas de Marte*| Guillem López |
| 3 |*Crepúsculo*| Stephenie Meyer|

Supongamos que queremos eliminar el registro con id 3, escribiríamos la sentencia:

```sql
DELETE FROM libros
WHERE id = 3;
```

Si olvidásemos la cláusula WHERE, no sólo estaríamos eliminando *Crepúsculo* de nuestra tabla, sino que la eliminaríamos por completo. Existe un videotutorial sobre ello: https://www.youtube.com/watch?v=i_cVJgIz_Cs

También disponemos del comando TRUNCATE, que nos permite eliminar todos los registros de una tabla de manera más eficiente:

```sql
TRUNCATE nombre_tabla
```

## Bibliografía
