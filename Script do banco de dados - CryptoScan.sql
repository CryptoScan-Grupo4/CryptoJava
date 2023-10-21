CREATE DATABASE CryptoScan;
USE CryptoScan;
-- DROP DATABASE CryptoScan;

CREATE TABLE Token (
idToken INT PRIMARY KEY AUTO_INCREMENT,
token VARCHAR(45),
dataEmitida timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Token (token) VALUES
	('123');

CREATE TABLE Empresa (
idEmpresa INT PRIMARY KEY AUTO_INCREMENT,
nomeEmpresa VARCHAR(45),
telEmpresa CHAR(10),
cepEmpresa CHAR(9),
numEndereco VARCHAR(10),
cpnjEmpresa VARCHAR(45),
fkToken INT,
FOREIGN KEY (fkToken) REFERENCES Token(idToken)
);

INSERT INTO Empresa (nomeEmpresa, fkToken)  VALUES 
	('Minera&Minera', 1);

CREATE TABLE TipoConta(
idTipoConta INT PRIMARY KEY AUTO_INCREMENT,
tipoConta VARCHAR(45)
);

INSERT INTO TipoConta (tipoConta) VALUES 
	('ADM'),
    ('Funcionario');

CREATE TABLE Funcionario (
idFuncionario INT AUTO_INCREMENT,
nomeFuncionario VARCHAR(45),
rgFuncionario CHAR(10),
cpfFuncionario VARCHAR(45),
emailFuncionario VARCHAR(45),
Senha VARCHAR(45),
fkTipoConta INT,
fkEmpresa INT,
FOREIGN KEY (fkEmpresa) REFERENCES Empresa(idEmpresa),
FOREIGN KEY (fkTipoConta) REFERENCES TipoCOnta(idTipoConta),
PRIMARY KEY(idFuncionario, fkTipoConta)
);

INSERT INTO Funcionario (nomeFuncionario, emailFuncionario, Senha, fkEmpresa ,fkTipoConta) VALUES
	('Lucas Santos' , 'lucas@email.com', '123', 1  , 1),
	('Hamilton Silva' , 'hamilton@email.com' , '123' , 1 , 2);
    
SELECT emailFuncionario, senha FROM Funcionario JOIN tipoConta
ON fkTipoConta = idTipoConta;

CREATE TABLE Setor (
idSetor INT AUTO_INCREMENT,
Andar VARCHAR(45),
fkEmpresa INT,
FOREIGN KEY (fkEmpresa) REFERENCES Empresa(idEmpresa),
PRIMARY KEY(idSetor, fkEmpresa)
);

INSERT INTO Setor VALUES 
	(NULL, '3' , 1),
	(NULL, '4' , 1),
	(NULL, '5' , 1);
    
    SELECT * FROM Setor;

CREATE TABLE Computador(
idComputador INT AUTO_INCREMENT,
fkSetor INT,
FOREIGN KEY (fkSetor) REFERENCES Setor(idSetor),
PRIMARY KEY (idComputador, fkSetor),
fkFuncionarioResponsavel INT,
FOREIGN KEY (fkFuncionarioResponsavel) REFERENCES Funcionario(idFuncionario),
fkTipoConta INT,
FOREIGN KEY (fkTipoConta) REFERENCES TipoConta(idTipoConta),
 serialComputador VARCHAR(45)
);

INSERT INTO Computador VALUES 
	(NULL, 1 , 1 , 1 , '455'),
	(NULL, 1 , 1 , 1 , '244'),
	(NULL, 1 , 1 , 1 , '255');


CREATE TABLE Componente(
idComponente INT PRIMARY KEY auto_increment,
modeloComponente VARCHAR(45),
tipoComponente VARCHAR(45),
serialComponente VARCHAR(45)
);


INSERT INTO Componente (modeloComponente, tipoComponente, serialComponente) VALUES
	('Intel I9' , 'Processador' , '457' ),
	('Fury DDR5 32GB' , 'Memoria RAM' , '427' ),
	('Fury DDR5 32GB' , 'Memoria RAM' , '417' ),
	('HD Seagate' , 'HD' , '407' ),
    ('Asus A520M'  , 'Placa mãe' , '477' );

SELECT * FROM Componente;

SELECT * FROM Setup WHERE(SELECT serialComputador FROM Computador WHERE serialComputador = "455");

-- Associativa
CREATE TABLE Setup(
idSetup INT AUTO_INCREMENT,
fkComputador INT,
fkComponente INT,
fkSetor INT,
StatuSetup VARCHAR(20),
PRIMARY KEY (idSetup, fkComponente, fkComputador, fkSetor),
FOREIGN KEY (fkComputador) REFERENCES Computador(idComputador),
FOREIGN KEY (fkComponente) REFERENCES Componente(idComponente),
FOREIGN KEY (fkSetor) REFERENCES Setor(idSetor)
);

select * from Setup;

INSERT INTO Setup VALUES
	(NULL , 1 , 1 , 1, 'Ativo'),
	(NULL , 1 , 2 , 1, 'Ativo'),
	(NULL , 1 , 3 , 1, 'Ativo'),
	(NULL , 1 , 4 , 1, 'Ativo'),
	(NULL , 1 , 5 , 1, 'Ativo');
    

CREATE TABLE Medida(
idMedida INT AUTO_INCREMENT,
usoProcessador FLOAT,
usoRam FLOAT,
usoDisco FLOAT,
dataMedida timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
unidadeMedida VARCHAR(45),
fkSetup INT,
PRIMARY KEY(idMedida,fkSetup),
FOREIGN KEY (fkSetup) REFERENCES Setup(idSetup)
);
SELECT usoProcessador, usoRam, usoDisco FROM Medida WHERE fkSetup = 6;
select * from medida;

SELECT idComputador, serialComputador AS 'Codigo do computador' FROM Computador;

SELECT * FROM Setup WHERE(SELECT serialComputador FROM Computador WHERE serialComputador = "455"); 

SELECT idSetup FROM Setup WHERE (SELECT * FROM Medida);

SELECT * FROM Setup WHERE idSetup = 6;

SELECT * FROM Medida WHERE (SELECT idSetup FROM Setup WHERE idSetup = 6);


