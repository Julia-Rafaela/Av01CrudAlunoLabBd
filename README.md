Um sistema acadêmico de uma faculdade, chamado AGIS, oferece diversas funcionalidades e 
seus usuários são alunos, professores e funcionários da secretaria acadêmica.
Apesar desses perfis, nesse momento, por se tratar de protótipo, o desenvolvimento não 
considera a necessidade de login para acesso seguro das áreas de cada usuário.
A secretaria acadêmica necessita cadastrar os alunos que ingressam na faculdade pelo 
vestibular. São diversos dados que devem ser incluídos no dia da primeira matrícula, como CPF, 
que deve ser válido de acordo com a legislação brasileira1, nome, nome social (Não 
obrigatório), data de nascimento2, telefones de contato, e-mail pessoal, e-mail corporativo, 
data de conclusão do segundo grau, instituição de conclusão do segundo grau, pontuação no 
vestibular, posição no vestibular, ano de ingresso, semestre de ingresso, semestre e ano limite 
de graduação3
. Todos os alunos devem receber um RA4.
Todo aluno está vinculado a apenas 1 curso e 1 turno (Que devem ser preenchidos na ficha do 
aluno). 
A faculdade tem diversos cursos, que são registrados por 1 código único numérico de 0 a 100, 
um nome, uma carga horária, uma sigla para uso interno e a última nota da participação no 
ENADE (De acordo com o regimento do Ministério da Educação do Brasil)
Os cursos têm entre 40 e 50 disciplinas, que são registradas por um código numérico iniciado 
em 1001, um nome, quantidade de horas semanais. Cada disciplina tem entre 5 e 15 conteúdos 
que serão ministrados ao longo de um semestre. 
Cursos podem ter disciplinas semelhantes, mas não exatamente iguais, pois podem se 
diferenciar no nome, na carga horária ou no conteúdo. As disciplinas estão presentes em um 
curso, em um determinado horário
Todos os alunos devem poder se matricular em 1 ou mais disciplinas do seu curso para serem 
cursadas ao longo de um semestre. O processo de matrícula5 significa que o aluno deve 
selecionar, dentro de um rol de disciplinas, as que ele pretende cursar. Considere que o aluno 
pode, ou não, já ter cursados disciplinas em semestres anteriores, com ou sem aprovação. 
Considere que um aluno não pode fazer disciplinas cujos horários conflitem. Considere 
também, que matriculas são feitas semestralmente e o sistema deve estar preparado para isso.
Os horários disponíveis são (Outras possibilidades não estão contempladas):
Iniciando às 13:00 com 4 aulas de duração (Até 16h30)
Iniciando às 13:00 com 2 aulas de duração (Até 14h40)
Iniciando às 14:50 com 4 aulas de duração (Até 18h20)
Iniciando às 14:50 com 2 aulas de duração (Até 16h30)
Iniciando às 16:40 com 2 aulas de duração (Até 18h20)
1 Deve-se fazer uma procedure que valide o CPF antes da inserção 2 Deve-se fazer uma procedure que valide uma idade igual ou superior a 16 anos antes da inserção 3 A data limite de graduação deve ser a saída de uma procedure que calcula 5 anos do ingresso
4 O RA inicia com o ano de ingresso, seguido pelo semestre de ingresso e 4 números aleatórios, deve 
ser gerado por uma procedure para inserção.
5 A inserção das matrículas deve ter suas regras controladas por uma procedure e só ser confirmada 
caso não haja nenhuma restrição.
Atividade 1 Laboratório de Banco de Dados
Prof. Leandro Colevati FATEC-ZL
Para a avaliação deve se fazer, utilizando Java Web (Maven, JSP e JSTL), com SQL Server:
Um protótipo do AGIS:
• A modelagem do sistema pedido, com as diagramações pertinentes;
• Com a funcionalidade do CRUD de aluno, baseado em uma Stored Procedure, 
fazendo as validações internas;
• Considerando as tabelas de Curso e Disciplinas já criadas, apenas devendo ser 
populadas para finalidade de testes;
• Com a criação de uma funcionalidade de matrícula, onde o aluno, baseado em 
seu RA deve poder ver as matérias disponíveis e tentar realizar a matrícula. O 
processo de matrícula deve ser validado em Stored Procedure para inserção e 
alteração. Por princípios de regulamento, não deve ser possível remover a 
matrícula já realizada em uma disciplina. A alteração deve ser apenas inserir 
novas matrículas em disciplinas não marcadas anteriormente;
• O aluno deve poder ver, em uma tela, baseado em seu RA, as disciplinas onde 
está matriculado.
Serão avaliados, além da solução do código:
A qualidade do desenvolvimento e as boas práticas
A qualidade da usabilidade do sistema pelo usuário
A qualidade da modelagem do sistema
O projeto deve ser carregado no Github e o link encaminhado na tarefa correspondente no 
prazo estipulado.
O projeto será apresentado, rodando e questionamentos sobre o código, ao professor na 
aula determinada. A apresentação sem o projeto entregue antecipadamente na tarefa 
incorre em desconto da avaliação.
As modelagens devem estar em uma pasta chamada doc na pasta WEB-INF do projeto Java 
Web.
Códigos Java ou SQL com semelhanças geram grandes descontos
