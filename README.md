# Parcial Segundo Corte_AREP

## Información Del Proyecto

Se debe construir y desplegar los siguientes servicios en un micro contenedor Docker desplegado en una instancia a EC2 de AWS y otro desplegado en AWS lambda con AWS Gateway.

* Las funciones asignadas de acuerdo al estudiante fueron:

	* Función Asin
	* Funcion Atan


### Pre-Requisitos

- Para la realización de este proyecto es necesario el uso de los aplicativos mencionados abajo de la descripción, en donde si no cuenta con alguno de estos,
       solo es necesario darle clic al que necesite y lo dirigirá a la página de instalación:


    * [Java 8](https://www.java.com/es/) - Codificación
    * [Maven](https://maven.apache.org/) - Manejo de Dependencias
    * [Git](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git) - Control de Sistemas de veriones.
    * [Docker Install](https://docs.docker.com/engine/install/) - Despligue de proyecto.
    


### Integracion Continua con Circle CI
>[![CircleCI](https://circleci.com/gh/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI.svg?style=svg)](https://app.circleci.com/pipelines/github/Fabimauri47/-AREP-Lab3-CLIENTES-Y-SERVICIOS)
>

## Videos del Funcionamiento

	* [Presione Aqui para revisar el video EC2 con DOCKER](https://web.microsoftstream.com/video/0b412606-fae2-49fb-bc4a-aea4e0280ad5?list=studio)

	* [Presione Aqui para revisar el video LAMBDA](https://web.microsoftstream.com/video/b4ecb220-bc78-4bd1-a83d-878d2a44acbe?list=studio)

	* [Presione Aqui para revisar el video API GATEWAY](https://web.microsoftstream.com/video/a7eede1f-1762-4449-a370-8e79103710d3?list=studio)

## Guia de Instalación

### Instalación EC2 usando Docker

A continuación se realizara un paso a paso de como realizar la instalacion de nuestra maquina virtual EC2 en AWS, haciendo uso de la herramienta Docker:

	1. Se debe acceder a su máquina virtual de AWS
		
		 Acceso mediante el siguiente link: https://www.awseducate.com/student/s/classrooms
		
	2. Instale Docker
		 sudo yum update -y
		
		 sudo yum install docker
		
	3. Inicie el servicio de docker
		 sudo service docker start
		
	4. Configure su usuario en el grupo de docker para no tener que ingresar “sudo” cada vez que invoca un comando
		 sudo usermod -a -G docker ec2-user
		
	5. Desconectese de la máquina virtual e ingrese nuevamente para que la configuración de grupos de usuarios tenga efecto.
	
	6. A partir de la imagen creada en Dockerhub cree una instancia de un contenedor docker independiente de la consola (opción “-d”) y con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):
		 docker run -d -p 42000:6000 --name parcialarep fabimauri47/parcialarep
		
	7. Abra los puertos de entrada del security group de la máxima virtual para acceder al servicio
	
	8. Verifique que pueda acceder en una url similar a esta (la url específica depende de los valores de su maquina virtual EC2)
         http://ec2-45-35-764-12.us-east-2.compute.amazonaws.com:42000/asin?value=0.5
         http://ec2-45-35-764-12.us-east-2.compute.amazonaws.com:42000/atan?value=1

 -[Presione Aqui para revisar el video EC2 con DOCKER](https://web.microsoftstream.com/video/0b412606-fae2-49fb-bc4a-aea4e0280ad5?list=studio)

## Instalacion AWS en Lambda

A continuación se realizara un paso a paso de como realizar la instalación de nuestra instancia desplegado en AWS lambda con AWS Gateway:

	1. Se debe acceder a AWS Lambda
		
		 Acceso mediante el siguiente link: https://www.awseducate.com/student/s/classrooms
		
	2. Oprima el botón de crear una función: 
	
		 Cree la función desde el inicio (From scratch)

		
	3. Asígnele un nombre:
	
		 en este caso "asin"

		
	4. Seleccione el “Runtime” a Java 8
		
	5. Dejar que AWS cree un rol por defecto
	
	6.En la sección “Function code” cargue el código
		 Upload Code
		
	7. En el campo “Handler” escriba: servicesCalculator::calculateAsin
	
	8. Oprima el botón de guardar
         Boton ubicado en la parte superior derecha del Lambda.
	
	9. En la parte superior en el cuadro de selección seleccione:
		”Select a test event” 
		 
		 * seleccione “Configure test events”.
	10. En el cuadro de texto, borre el JSON que aparece y escriba un numero entre -1 y 1
	
	11. Oprima el botón de crear.
	
	12. Una vez creado ya puede oprimir el boton de:
		“Test” y obtendrá el resultado de haber ejecutado la función


## Construido con

* [Java](https://www.java.com/es/) - Codificación y Lenguaje de Programacíon.
* [Maven](https://maven.apache.org/) - Manejo de Dependencias.
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) - Programa usado para la Codificacíon.
* [AWS](https://aws.amazon.com/es/education/awseducate/) - Despligue de Ambiente Web
* [Docker](https://www.docker.com/) - Control y despliegue del proyecto


## Autor

* **Fabián Mauricio Ramirez Pinto** [Fabimauri47](https://github.com/Fabimauri47)


## Licencia

Este proyecto cuenta con la licencia GNU: General Public License - see the [LICENSE.md](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/LICENSE.txt)

