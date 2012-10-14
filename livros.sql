CREATE TABLE `livro` (
  `cd_livro` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(60) NOT NULL,
  `genero` varchar(100) NOT NULL,
  `autor` varchar(100) NOT NULL,
  `idioma` varchar(20) NOT NULL,
  `dt_lancamento` date NOT NULL,
  PRIMARY KEY (`cd_livro`)
);