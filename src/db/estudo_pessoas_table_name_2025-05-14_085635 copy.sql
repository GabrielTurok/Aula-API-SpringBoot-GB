-- Banco de Estudo

CREATE DATABASE estudo_pessoas
    DEFAULT CHARACTER SET = 'utf8mb4';
--
-- Table structure for table `table_name`
--
Use estudo_pessoas

DROP TABLE IF EXISTS `table_name`;

CREATE TABLE `table_name` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp() COMMENT 'Create Time',
  `name` varchar(255) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL COMMENT 'Telefone no formato XXXXXXXXXXX',
  `endereco` varchar(150) DEFAULT NULL COMMENT 'Endereço Completo',
  PRIMARY KEY (`id`)
) 

CREATE TABLE `Compras` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `dataCompra` timestamp NOT NULL DEFAULT current_timestamp(),
  `pessoa_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
  FOREIGN KEY (`pessoa_id`) REFERENCES `table_name`(`id`)
)

CREATE TABLE `ItensCompra` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `compra_id` BIGINT(20) NOT NULL,
  `produto_id` BIGINT(20) NOT NULL,
  `quantidade` BIGINT(20),
  `precoUnitario` DOUBLE(200),
  PRIMARY KEY (`id`)
  FOREIGN KEY(`compra_id`) REFERENCES `table_name`(`id`)
)


-- Inserção de dados de exemplo
INSERT INTO table_name (name, telefone, endereco, imagem_perfil) VALUES
('João Silva', '(31) 91234-5678', 'Rua das Flores, 123', 'https://imagem.com/perfil.png'),
('Maria Oliveira', '(31) 99887-1234', 'Avenida Central, 456', 'https://imagem.com/perfil2.png');


/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-14  8:56:50
