# Programación multimedia y dispositivos móviles

## Ciclo de vida de una aplicación Android

1. ***onCreate()***
2. ***onStart()***
3. ***onResume()***
4. ***onPause()***
5. ***onRestart()***
6. ***onStop()***
7. ***onDestroy()***

## Intefaz gráfica en Android Studio

Las **unidades de medida** más comunes son:
- *Match_parent*: igual que el padre que lo contiene.
- *Wrap:_content*: ajustar al contenido.

**Tamaños fijos**:
- dp: píxeles independientes de la densidad. Toma como base una pantella de 160dpi.
- sp: como dp, pero toma como base el tamaño de fuente seleccionada.
- pt: 1/72 de una pulgada.
- px: píxeles. Corresponde con la resolución actual de la pantalla.
- mm, in: (milímetros, pulgadas) basado en las dimensiones físicas de la pantalla.

### Componentes de una aplicación
- Vista (*view*):
- Layout
- Actividad (*Activity*)
- Servicio
- Intención (*Intent*)
- Receptor de anuncios (*Broadcast receiver*)
- Proveedor de contenido (*Content provider*)

#### Vista (*view*)

- La interfaz de usuario se contruye a través de objetos Vistas (Views) y grupo de visitas (ViewGroup).
- Se utilizan para dibujar el contenida en la pantalla del dispositivo Android.
- Aunque es posible instanciar una View tanto en Kotlin como en Java, es más aconsejable y sencillo de utilizarla a través de un archivo de diseño XML.
- El archivo de *layout* sería **activity_main.xml** y el código que contiene podría tener la siguiente forma:

```xml
<TextView
    android:id="@+id/hello_world"
    android:layout_width="wrap:content"
    android:layout_height="wrap:content"
    android:text="Hello World!" />

```

- La vista que estamos usando es de tipo texto (TextView).
- Los atributos layout_width y layout_height indican el espacio que queremos usar de la pantalla.
- El atributo text contiene el texto a representar.
- El atributo id sirve para referenciar al objeto TextView.
- Las cadenas de texto que vamos a usar en una aplicación se pueden definir en el fichero *res/values/strings.xml*.
```xml
<resources>
    <string name="Hello_world">Hello, World!</string>
    <string name="app_name">Hello, World!</string>
</resources>
```
- De este modo, tendremos separado el código y el contenido.
- Esta manera de desarrollar facilita, entre otras cosas, la traducción a otras lenguas de nuestra aplicación.

#### Grupo de vistas (*ViewGroup*)

- Es un objeto invisible empleado para contener otros objetos *View* y *ViewGroup* y permite organizar y controla el layout de una pantalla.
- Los objetos *ViewGroup* se emplean además para establecer una jerarquía de objetos *View* de manera que podamos crear layouts más complejos.
---

1

---

