-- You can use this file to load seed data into the database using SQL statements
INSERT INTO Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')
INSERT INTO `tb_pessoa`(`id`, `cpf`, `nome`) VALUES (00001,12345678901,'Gustavo Petruceli')
INSERT INTO `tb_pessoa`(`id`, `cpf`, `nome`) VALUES (00002,09876543212,'Leonardo Petruceli')
INSERT INTO `tb_pessoa`(`id`, `cpf`, `nome`) VALUES (00003,12345543211,'Jose Marcelo')
INSERT INTO `tb_aluno`(`dataAniversairo`, `matricula`, `id`) VALUES ('1990-07-06',12345,00001)
INSERT INTO `tb_aluno`(`dataAniversairo`, `matricula`, `id`) VALUES ('1989-03-10',54321,00002)
INSERT INTO `tb_professor`(`salario`, `id`) VALUES (4.500,00003)
INSERT INTO `tb_sala`(`id`,`PC`,`capacidade`,`codigo`,`dataTerminoManutencao`,`dtShow`,`observacao`,`qBranco`,`status`) VALUES (0,true,30,'AAAAA',null,true,'Sala',true,1)
