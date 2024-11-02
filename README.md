# SISTEMA_VEICULO

O projeto consiste em um arranjo de calsses hipotético para um sistema de classificação de veículos composto por 7 classes e uma classe main. As classes e seus respectivos atributos são:

* Veiculo (super):
 - modelo
 - fabricacao

* Bicileta (subclasse Veiculo):
 - marca
 - cor
 - material
 - marcha
 - amortecedor

* Skate (subclasse Veiculo):
 - marca
 - cor
 - dureza
 - diametro

* Automotor (subclasse Veiculo):
 - montadora
 - cor
 - kilometragem

* Caminhao (subclasse Automotor):
 - eixo
 - peso

* Domestico (subclasse Automotor):
 - passageiros
 - freio
 - airbag

* Motocicleta (subclasse Automotor):
 - cilindradas
 - torque


Todas as classes possuem o método printaTudo() herdado de Veiculos que retorna todos os atributos da classe em String e o método insert() que retorna uma string com um comando SQL para inserir as informações dessa classe em uma tabela com o nome da respectiva classe.

### 📋 Pré-requisitos

É necessário ter java instalado e demais dependencias (no caso de Linux é necessário que instale jdk-23_linux-x64_bin.deb)

### 🔧 Instalação

Para a utilização de projeto é necessário executa-lo através do Visual Studio code ou através do comando "java" direto numa shell Linux (para isso é necessário primeiro compilar os arquivos com "javac Main.java")

## 🛠️ Construído com

Ferramentas utilizadas e bibliotecas

* IDE Visual Studio

## 📌 Versão

* **Versão 1.0** O projeto consiste em um arranjo de calsses hipotético para um sistema de classificação de veículos composto por 7 classes e uma classe main. As classes e seus respectivos atributos são:
* Automotor (super):
 - montadora
 - cor
 - kilometragem

* Veiculo (super):
 - modelo
 - fabricacao

* Caminhao (subclasse Automotor):
 - eixo
 - peso

* Domestico (subclasse Automotor):
 - passageiros
 - freio
 - airbag

* Motocicleta (subclasse Automotor):
 - cilindradas
 - torque

* Bicileta (subclasse Veiculo):
 - marca
 - cor
 - material
 - marcha
 - amortecedor

* Skate (subclasse Veiculo):
 - marca
 - cor
 - dureza
 - diametro

Todas as classes possuem o método printaTudo() herdado de Veiculos que retorna todos os atributos da classe em String e o método insert() que retorna uma string com um comando SQL para inserir as informações dessa classe em uma tabela com o nome da respectiva classe.

## ✒️ Autores

* **Giovanni Galli** - *Trabalho Inicial* - Sistema Veículos

