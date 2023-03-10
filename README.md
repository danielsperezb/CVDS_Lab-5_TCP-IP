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
En este caso, gane al primer intento!

b. Abra la aplicación en doscomputadores diferentes. Si no dispone de uno, hágalo en dos navegadores diferentes(por ejemplo Chrome y Firefox;
incluso se puede en un único navegador usando una ventana normal y una ventana de incógnito / privada).Haga cinco intentos en uno, y luego
un intento en el otro.¿Qué valor tiene cada uno?

Para abrir la aplicacion se necesita ingresar a la URL a traves de IP del computador:8080/faces/guess.xhtml

CHROME:

![Prueba #1](https://tucatalogo.digital/img_cvds/prueba2a.png)
Realizo 5 intentos

FIREFOX:
![Prueba #1](https://tucatalogo.digital/img_cvds/prueba2b.png)
Realizo 1 intento.




