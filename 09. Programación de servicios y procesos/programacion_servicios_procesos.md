# Programación de servicios y procesos

## UF1: Seguridad y criptografía

### Uso de técnicas de programación segura

#### 1.1. Prácticas de programación segura

A la hora de desarrollar programas, es necesario tener presente que un código limpio aportará seguridad a la aplicación.

Para ello es preciso:

- Estar siempre informado de los diferentes tipos de vulnerabilidades, con lo cual es necesario estar al día en ciberseguridad.
- Explorar software libre para conocer cómo se trabaja la seguridad en distintas aplicaciones.

Normalmente, toda aplicación recibirá información por parte del usuario, por lo que es importante el tratamiento de la misma. Los datos, al ser una parte muy sensible, es lo que más se suele atacar.

Es necesario verificar siempre que los datos introducidos son válidos, tanto los parámetros, como la información, como los ficheros que se utilizan.

Cuando se trabaja con URL páginas web, hay que tener presente la seguridad y, por ello, comprobar si la URL es fiable o no. Los datos de las webs pueden ser alterados por un usuario, tanto su contenido como la configuración.

En muchas ocasiones, los propios navegadores web avisan de que no se debe confiar en cookies de terceros, ya que estas también pueden ser modificadas.

Otro de los puntos clave en la programación segura es la reutilización de código, una práctica común y muy aconsejada, pero siempre teniendo en cuenta que ese código ha sido revisado y no cuenta con problemas de seguridad.

También se considera práctica de programación segura eliminar el código obsoleto para que no interceda con el código bueno, ya que, en las revisiones posteriores, podría llevar a confusión. Por último, se considera fundamental utilizar herramientas de software para detectar fallos en el código.

En resumen, durante el desarrollo de un producto software, se deben tener en cuenta los siguientes aspectos:

- Los usuarios son los mismos que intentarán vulnerar la aplicación.
- Los archivos que se utilicen en la aplicación deben ser de solo lectura, para evitar que un usuario los modifique.
- Toda información sensible guardada en la base de datos, o que se transmita por la red, debe ir siempre cifrada.
- Comprobar que todas las llamadas al sistema se han realizado con éxito y detener la aplicación si no ha sido así.
- Utilizar las rutas absolutas de los ficheros que se necesiten.
- No abrir nunca terminales desde una aplicación, ni otro software que no sea fiable.

#### 1.2. Criptografía de clave pública y clave privada

La criptografía es el conjunto de técnicas que cifran información, con el objetivo de que un usuario no sea capaz de entender el contenido, y, por lo tanto, conseguir confidencialidad en el mensaje.

Para conseguir esta confidencialidad, es necesario transformar el mensaje mediante un algoritmo matemático. La criptología no solo se encarga de cifrar el mensaje, sino también de descifrarlo para que el receptor sea capaz de entenderlo.

Antes de conocer los distintos algoritmos que existen, es necesario conocer algunos conceptos importantes:

- Texto legible: es el mensaje original.
- Texto cifrado: es el resultado de aplicar uno de los siguientes algoritmos sobre un texto legible.

Existen diferentes tipos de algoritmos:

**Cifrado Cesar**

Cifrado en el que se realiza una sustitución de cada letra por otra. El desplazamiento será el mismo para todas las letras del mensaje. Es un cifrado muy simple, pero bastante vulnerable. Los atacantes pueden conocer el mensaje mediante estadísticas. 
