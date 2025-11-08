[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/u4Uqvfhl)

Questão 1:

a) Verdadeiro. Os construtores não são herdados pela subclasse. Eles precisam serem criados novos para a subclasse ou serem herdados explicitamente pelo comnando super para que sejam usados os mesmos da superclasse.

b) Falso. Os relacionamento "tem um" usa a composição de que uma classe contem a outra. Os relacionamentos "é um" que usam a base de que uma classe faz parte da outra e usam a implementação por herança.

c) Falso. Para que uma subclasse redefina o método da outra é necessario sobrescrever e não fazer a sobrecarga (através do método @Override).

Questão 2:

Utilizar protected permitem que subclasses acessem e utilizem métodos das supreclasses mais facilmente, o que melhora o aproveitamento do código e permite sobrescrever métodos da superclasses sem necessidade de getter e setters públicos. Entretanto, isso diminui o controle que as superclasses tem sobre o resto do código. O que torna mais difícil a manutenção do código como um todo ja que pode haver mudanças em cada subclasse, além da diminuição de segurança. O uso do protected é mais indicado para classes que tem previsão de já serem herdadas e com informações que podem ser modificadas mais facilmente.

Questão 3:

A chamada primeiro irá chamar as variáveis e contrutores da superclasse e somente depois chamar as variáveis e construtores da subclasse. Os construtores que são necessários para inicializar os objetos. Quando eles não tem variáveis que precisam ser definidas pelo usuário eles podem ser chamados explicitamente pela subclasse, fazendo apenas a inicialização padrão dos objetos. Caso tenha valores ele precisa ser chamado explicitamente pela subclasse pelo método super, senão irá dar erro de compilação.
