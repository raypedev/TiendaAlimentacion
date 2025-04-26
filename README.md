Tienda de Alimentación - Aplicación de Escritorio
Este proyecto es una aplicación de escritorio desarrollada en Java (Swing) que permite la gestión de productos de alimentación conectándose a una base de datos MySQL.

Funcionalidades principales:
Conexión segura a una base de datos MySQL utilizando JDBC.

Visualización de productos de alimentación mediante una interfaz gráfica (GUI).

Consulta de productos: selección de un artículo para ver su nombre, descripción, stock y precio.

Cierre seguro de la conexión a la base de datos.

Tecnologías utilizadas:
Java SE (Swing para la interfaz gráfica)

MySQL

JDBC (Java Database Connectivity)

NetBeans IDE

Estructura del Proyecto:
ConexionBD.java: Clase que administra la conexión y desconexión de la base de datos.

GUITienda.java: Ventana principal de la aplicación. Permite seleccionar artículos y muestra su información detallada.

Requisitos:
JDK 8 o superior

NetBeans IDE o similar

Servidor de base de datos MySQL con una base de datos llamada tienda y una tabla articulos.

Cómo ejecutar:
Configurar la base de datos y asegurarse de que el usuario y contraseña coincidan con los del código (root/root por defecto).

Clonar el repositorio.

Abrir el proyecto en NetBeans.

Ejecutar el archivo GUITienda.java.
