INSERT INTO tb_apartamento (id_apartamento, data_liberacao, data_reserva,nome ) VALUES
  (1, '2022-01-01', '2022-01-01', 'suite master'),
  (2, '2022-01-01', '2022-01-01', 'quarto comum');

INSERT INTO tb_funcionario (id_funcionario, cargo ,nome  ) VALUES
  (1, 'Gerente',  'Joao'),
  (2, 'Motorista', 'Maria');

INSERT INTO tb_hospede (id_hospede,cidade ,cpf ,data_nasc , email , endereco , estado , nome , numero ,rg ,telefone ) VALUES
  (1, 'Recife',  '123456789', '2022-01-01', 'pedro@email.com', 'Av. Caxanga', 'Pernambuco', 'Pedro', 12, 123456, 915645645),
  (2, 'Carpina', '223456789', '2022-01-02', 'jose@email.com', 'Rua Capitão', 'Pernambuco', 'Jose', 31, 223456, 925645645);

INSERT INTO tb_reserva (id_codigo, data_entrada, data_saida, status_reserva, id_apartamento, id_hospede ) VALUES
  (1, '2022-01-01',  '2022-01-01', 1, 1, 1),
  (2, '2022-01-02',  '2022-01-02', 2, 2, 2);