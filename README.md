# PARCIAL_AREP_2
## Instalación EC2 usando Docker

1.	Acceda a su máquina virtual de AWS
2.	Instale Docker
sudo yum update -y
sudo yum install docker
3.	Inicie el servicio de docker
sudo service docker start
4.	Configure su usuario en el grupo de docker para no tener que ingresar “sudo” cada vez que invoca un comando
sudo usermod -a -G docker ec2-user
5.	Desconectese de la máquina virtual e ingrese nuevamente para que la configuración de grupos de usuarios tenga efecto.
6.	A partir de la imagen creada en Dockerhub cree una instancia de un contenedor docker independiente de la consola (opción “-d”) y con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):
docker run -d -p 42000:6000 --name parcialarep fabimauri47/parcialarep
7.	Abra los puertos de entrada del security group de la máxima virtual para acceder al servicio
8.	Verifique que pueda acceder en una url similar a esta (la url específica depende de los valores de su maquina virtual EC2)
http://ec2-45-35-764-12.us-east-2.compute.amazonaws.com:42000/asin?value=0.5
http://ec2-45-35-764-12.us-east-2.compute.amazonaws.com:42000/atan?value=1

## Instalacion AWS en Lambda
