# CVDS_Lab-5_TCP-IP

Nombre de los integrantes del taller:
- Daniel Esteban Perez Bohorquez
- Juan Francisco Teran Roman

Proyecto: TCP/IP - Proyecto Web

Entrega del laboratorio: https://github.com/danielsperezb/CVDS_Lab-5_TCP-IP.git

_______________________________________________________________________________________________________________________________________________________________________

**PARTE I. - JUGANDO A SER UN CLIENTE HTTP**

¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
Sale error tipo 40X, esta clase de errores corresponden al cliente (mala url, url dejo de existir, mala configuracion del servidor, etc?

¿Qué otros códigos de error existen?,¿En qué caso se manejarán?

Errores tipo 50X, los cuales corresponden a errores del servidor.

Ahora,solicite (GET) el recurso /html.¿Qué se obtiene como resultado?
Aparece un recurso html que al parecer esta relacionada con Moby Dick. No arroja error (arroja 200 OK).

¿Cuál es la diferencia entre los verbos GET y POST?¿Qué otros tipos de peticiones existen?
GET tiene una limitación en la longitud de los valores, generalmente 255 caracteres, mientras que POST no tiene limitación en la longitud de los valores, ya que se envían a través del cuerpo de HTTP. El método GET solo admite tipos de datos de cadena, mientras que el método POST admite diferentes tipos de datos, como cadena, numérico, binario, etc.

Los métodos de solicitud HTTP más utilizados son GET, POST, PUT, PATCH y DELETE. Estas son equivalentes a las operaciones CRUD (crear, leer, actualizar y eliminar). GET: la solicitud GET se utiliza para leer/recuperar datos de un servidor web.

¿Cuáles son las diferenciascon los diferentes parámetros?
El parametro -l se utiliza para permitir la redireccion automatica de URL, desde la URL solicitada hasta la URL final. 
Mientras que -v se utiliza para conseguir informacion mas detallada de la solicitud, como encabezados (heads), codigo de estado, etc.


**PARTE II. - HACIENDO UNA APLICACION WEB DINAMICA A BAJO NIVEL**

Revise qué valor tiene el parámetro ‘urlPatterns’ de la anotación @WebServlet, pues este indica qué URLs atiende las peticiones el servlet.
El valor del parametro es "helloServlet".

Revise en el pom.xml para qué puerto TCP/IP está configurado el servidor embebido de Tomcat (versección de plugins).
El puerto configurado es el 8080.


**PARTE III**

Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada. Ingrese los datos y verifique losresultados. Cambie el formulario para que ahora en lugar de POST, use el método GET . Qué diferencia observa?

¿Qué se está viendo? Revise cómo están implementadoslos métodos de la clase Service.java para entender el funcionamiento interno.

**PARTE IV. - JUGANDO A SER UN CLIENTE HTTP**

a. Abra la aplicación en un explorador. Realice algunas pruebascon el juego e intente adivinar el número

![Prueba #1](https://tucatalogo.digital/img_cvds/prueba1.png)

En este caso, gane al primer intento, DE PURA SUERTE!

Y haciendo otras pruebas, me he dado cuenta que funciona correctamente.

b. Abra la aplicación en doscomputadores diferentes. Si no dispone de uno, hágalo en dos navegadores diferentes(por ejemplo Chrome y Firefox;
incluso se puede en un único navegador usando una ventana normal y una ventana de incógnito / privada).Haga cinco intentos en uno, y luego
un intento en el otro.¿Qué valor tiene cada uno?

Para abrir la aplicacion se necesita ingresar a la URL a traves de IP del computador:8080/faces/guess.xhtml


AL HACERLO CON @ApplicationScoped 

CHROME:

![Prueba #1](https://tucatalogo.digital/img_cvds/1.png)

Hice 5 intentos, pero no cuenta, es como si se reinciara.

FIREFOX:

![Prueba #1](https://tucatalogo.digital/img_cvds/2.png)
Pasa lo mismo, sin embargo, si le doy varias veces al boton enviar, por ejemplo pensando que el numero es 5,  y me sale correcto pero le vuelvo a dar y me sale incorrecto.


c. Aborte el proceso de Tomcat-runner haciendo Ctrl+C en la consola, y modifique elcódigo del backing-bean de manera que use la anotación
@SessionScoped en lugar de @ApplicationScoped. Reinicie la aplicación y repita el ejercicio anterior.
¿Coinciden los valores del premio?.
Dado la anterior,¿Cuál esla diferencia entre los backing-beans de sesión y los de aplicación?

Abortamos el proceso:

![Prueba #1](https://tucatalogo.digital/img_cvds/3.png)

Y arrancamos de nuevo con @SessionScoped:

![Prueba #1](https://tucatalogo.digital/img_cvds/6.png)

AL HACERLO CON @SessionScoped 

Al abrirlo en distintas sesiones me funciona a la perfeccion, meintras que al hacerlo con @ApplicationScoped al enviar el numero, es como si se reinciara.
La diferencia segun lo que hemos visto en la practica es la capacidad de mantener varias sesiones al tiempo, sin complicaciones en el funcionamiento de la pagina web.
CHROME:

![Prueba #1](https://tucatalogo.digital/img_cvds/4.png)

Realizo 5 intentos

FIREFOX:

![Prueba #1](https://tucatalogo.digital/img_cvds/5.png)

Realizo 1 intento.

d. Por medio de las herramientas de desarrollador del explorador (Usando la tecla "F12" en la mayoría de exploradores):
Ubique elcódigoHTML generado por elservidor.
Busque el elemento oculto, que contiene el número generado aleatoriamente.
En la sección de estilos, deshabilite el estilo que oculta el elemento para que sea visible.
Observe elcambio en la página,cada vez que se realiza un cambio en el estilo.
Revise qué otros estilosse pueden agregar a los diferentes elementos y qué efecto tienen en la visualización de la página. Actualice la
página. Loscambios de estilosrealizados desaparecen, puesse realizaron únicamente en la visualización, la respuesta delservidor
sigue siendo la misma, ya que elcontenido de los archivos allí almacenados no se ha modificado.
Revise qué otroscambiosse pueden realizar y qué otra información se puede obtener de las herramientas de desarrollador.


![Prueba #4](https://tucatalogo.digital/img_cvds/descubrir.png)

Lo podemos ver al lado derecho y cada vez que reiniciamos el juego, el numero cambia permitiendonos ganar en el primer intento y ganando los $100,000:


![Prueba #4](https://tucatalogo.digital/img_cvds/descubrir2.png)


Agregando cambios temporales se podria, agregar un fondo de color rojo:

![Prueba #4](https://tucatalogo.digital/img_cvds/10.png)

Pero asi como dice el laboratorio si se recarga la pagina esto se pierde.

11. Para facilitar losintentos del usuario,se agregará una lista de los últimosintentosfallidosrealizados:
a. Agregue en el Backing-Bean, una propiedad que contenga una lista de intentadosrealizados.
b. Agregue cada intento a la lista,cuando se ejecute el método guess.
c. Cuando se reinicie el juego, limpie elcontenido de la lista.
d. Busque cómo agregar una tabla a la página,cuyo contenido sea los últimosintentosrealizado

