# Estrategias de medición de la adopción de la nube en empresas colombianas
## Descripción
En las **Estrategias de medición de la adopción de la nube en empresas colombianas** se presentarán y analizarán factores de adopción y aceptación de la Computación en la Nube en empresas colombianas. La metodología utilizada fue elaborada de manera descriptiva con su respectiva investigación de fondo, en la cual una fue de revisión de literatura, seguida por ejemplos de empresas que ya tienen adopción en la nube en gran parte de la infraestructura del área de TI de la empresa. Como resultado de esta investigación, surge una adopción a esta tecnología, en la que se establecieron tres tipos de variables como lo son variables estratégicas, de competitividad y desempeño, teniendo en cuenta la utilidad y facilidad de uso percibida por los individuos frente a la Computación en la Nube, y, por lo tanto, la intención de uso. Debido a que la relación con la Computación en la Nube está ligada al entorno y a las experiencias de las empresas colombianas, esta adopción contribuye en parte de manera transversal a la innovación basada en conocimiento y al desarrollo tecnológico.

## Enlace a la aplicación en Heroku

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arep-proyecto.herokuapp.com/)

## Manual de Usuario

### Acceso al sitio Web

**Requerimiento:**

* Acceso de Internet a Dirección Web.

**Ingrese al navegador y escriba en la barra de direcciones lo siguiente:**

* https://arep-proyecto.herokuapp.com/

Al abrir la aplicación web desplegada en Heroku, se muestra la siguiente interfaz de usuario, en la cual el usuario puede ya sea realizar la búsqueda manualmente por Dirección IP realizando clic en el botón correspondiente, o buscar por grupos de interés, entre los cuales se encuentran: **Gobierno**, **Industria**, **Educación Superior** y **Deportes**.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/MenuPrincipal.PNG)

Al realizar clic sobre el botón **Gobierno**, se muestra el respectivo análisis del grupo de interés con sus respectivas gráficas, en las cuales se encuentra distribuido primero en qué proveedor de nube se encuentran alojadas las páginas web del grupo de interés, y segundo, en qué países se encuentran alojadas dichas páginas web, acompañado de sus respectivos datos de cada página web, como lo son ciudad, región, país, nombre de la organización y proveedor.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/Gobierno.PNG)

Al realizar clic sobre el botón **Industria**, se muestra el respectivo análisis del grupo de interés con sus respectivas gráficas, en las cuales se encuentra distribuido primero en qué proveedor de nube se encuentran alojadas las páginas web del grupo de interés, y segundo, en qué países se encuentran alojadas dichas páginas web, acompañado de sus respectivos datos de cada página web, como lo son ciudad, región, país, nombre de la organización y proveedor.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/Industria.PNG)

Al realizar clic sobre el botón **Educación Superior**, se muestra el respectivo análisis del grupo de interés con sus respectivas gráficas, en las cuales se encuentra distribuido primero en qué proveedor de nube se encuentran alojadas las páginas web del grupo de interés, y segundo, en qué países se encuentran alojadas dichas páginas web, acompañado de sus respectivos datos de cada página web, como lo son ciudad, región, país, nombre de la organización y proveedor.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/EducacionSuperior.PNG)

Al realizar clic sobre el botón **Deportes**, se muestra el respectivo análisis del grupo de interés con sus respectivas gráficas, en las cuales se encuentra distribuido primero en qué proveedor de nube se encuentran alojadas las páginas web del grupo de interés, y segundo, en qué países se encuentran alojadas dichas páginas web, acompañado de sus respectivos datos de cada página web, como lo son ciudad, región, país, nombre de la organización y proveedor.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/Deportes.PNG)

Luego de realizar clic en el botón de **Búsqueda por Dirección IP**, se tiene la siguiente interfaz de usuario, en la cual este puede ingresar la dirección IP que se desea consultar y de la cual se desean saber los respectivos datos como lo son ciudad, región, país, nombre de la organización, proveedor y ubicación en el mapa de la IP ingresada.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/Interfaz.PNG)

Luego de escribir en el campo provisto la dirección IP alojada en Amazon (52.15.247.208), para probar el correcto funcionamiento de la aplicación, se muestran los datos como lo son ciudad, región, país, nombre de la organización, proveedor y ubicación en el mapa de la misma.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/AWS.PNG)

Para probar que el caché está funcionando correctamente, se ingresa otra dirección IP alojada en Microsoft (40.121.255.254). Luego de ingresar la dirección IP y presionar clic sobre el botón **Buscar**, se muestran los datos como lo son ciudad, región, país, nombre de la organización, proveedor y ubicación en el mapa de la dirección IP. También se muestra la ubicación de la dirección IP de Amazon en el mapa, la cual fue la última dirección IP consultada antes de realizar la respectiva búsqueda de la dirección IP alojada en Microsoft.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/MicrosoftAzure.PNG)

Para realizar la última prueba con una dirección IP cuyo propietario es el Ministerio de Salud y Protección Social (186.31.104.171), se ingresa la dirección IP y presionar clic sobre el botón **Buscar**, se muestran los datos como lo son ciudad, región, país, nombre de la organización, proveedor y ubicación en el mapa de la dirección IP. También se muestra la ubicación de la dirección IP de Amazon y Microsoft en el mapa, las cuales fue las últimas direcciónes IP consultadas antes de realizar la respectiva búsqueda de la dirección IP propietaria del Ministerio de Salud y Protección Social.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/MinisterioDeSalud.PNG)

## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [Heroku](https://www.heroku.com/). Plataforma en la nube como servicio (PaaS en sus siglas en inglés) basada en contenedores. Los desarrolladores usan Heroku para implementar, administrar y escalar aplicaciones modernas.

Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

```
mvn -version
git --version
java -version
```

## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio, ejecutando la siguiente línea de comando en GIT.

```
git clone https://github.com/JamesTorres99/PrototipoAREP.git
```

## Ejecución
Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn package
```
## Pruebas
Para realizar las pruebas correspondientes del proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn test
```

Luego de haber ejecutado el comando ```mvn test``` en un Shell o Símbolo del Sistema, debe aparecer la siguiente imagen, demostrando que las pruebas han sido realizadas exitosamente.

![img](https://github.com/JamesTorres99/PrototipoAREP/blob/main/img/Pruebas.PNG)

## Construido con
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [JUnit](https://junit.org/junit5/). Framework de Java que permite la realización de la ejecución de clases de manera controlada, para poder comprobar que los métodos realizan su cometido de forma correcta.
* [NetBeans](https://netbeans.apache.org/). Entorno de desarrollo integrado libre, orientado principalmente al desarrollo de aplicaciones Java. La plataforma NetBeans permite el desarrollo de aplicaciones estructuradas mediante un conjunto de componentes denominados “módulos”. Cada uno de estos módulos sería un archivo Java conteniendo un conjunto de clases que interactarán con las APIs de NetBeans. El objetivo de esta arquitectura es favorecer el desarrollo de funcionalidades de forma independiente y la reutilización de componentes.
* [Java](https://www.oracle.com/java/). Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.
* [Heroku](https://www.heroku.com/). Plataforma en la nube como servicio (PaaS en sus siglas en inglés) basada en contenedores. Los desarrolladores usan Heroku para implementar, administrar y escalar aplicaciones modernas.
* [CircleCI](https://circleci.com/). Plataforma moderna de integración continua y entrega continua (CI / CD) que se encarga de automatizar la construcción, pruebas e implementación de software.

     [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/JamesTorres99/PrototipoAREP)

## Autores
[Alejandro Toro Daza](https://github.com/Skullzo)

[Duck James Alexander Torres Segura](https://github.com/JamesTorres99)

[David Leonardo Coronado Gomez](https://github.com/davinchicoronado)
## Licencia & Derechos de Autor
**©** Alejandro Toro Daza, Duck James Alexander Torres Segura, David Leonardo Coronado Gomez. Estudiantes de Ingeniería de Sistemas de la [Escuela Colombiana de Ingeniería Julio Garavito](https://www.escuelaing.edu.co/es/).

Licencia bajo la [GNU General Public License](https://github.com/JamesTorres99/PrototipoAREP/blob/main/LICENSE.txt).
