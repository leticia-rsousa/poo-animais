## POO Animais - Descrição do Projeto
**Descrição Geral** 📄<br>
Este projeto apresenta uma implementação simples dos pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. O sistema modela animais por meio de uma classe abstrata e duas classes derivadas, demonstrando **abstração, herança e polimorfismo** em um exemplo direto e didático.

---
**Objetivo** 🎯 <br> 
O objetivo principal do projeto é exemplificar o uso dos conceitos fundamentais de POO, permitindo compreender como classes abstratas, métodos sobrescritos e comportamentos polimórficos funcionam na prática.

---
**Tecnologias Utilizadas** 💻 <br>
* ***Java*** - linguagem principal.
* ***Programação Orientada a Objetos (POO):***
  * Abstração;
  * Herança;
  * Polimorfismo;
  * Encapsulamento.
* ***Collections (List / ArrayList).***
* ***Sobrescrita de métodos (@Override).***

---
**Arquitetura e Estrutura do Código** 🧱 <br><br>
***1. Classe Abstrata Animal*** <br>
A classe Animal representa o conceito genérico de um animal.<br>
Ela contém:
* ***Atributo protegido:*** nome 
* ***Métodos concretos:***
  * chamar()
  * dormir()
* ***Método abstrato:*** 
  * fazerSom()

A classe abstrata não pode ser instanciada e funciona como base para as subclasses.

***2. Classe Cachorro*** <br>
Herdeira de Animal, representa um cachorro. <br>
Implementa o método abstrato **fazerSom() exibindo o som característico “au au”**.

***3. Classe Gato*** <br>
Herdeira de Animal, representa um gato. <br>
Implementa o método abstrato **fazerSom() exibindo o som “miau”**.

***4. Classe Main***<br>
Ponto de entrada do sistema.<br>
Nela ocorre:
* ***Criação de uma lista de animais.***
* ***Instanciação de objetos de Cachorro e Gato.***
* ***Execução dos métodos:***
  * chamar()
  * fazerSom()
  * dormir()

Aqui acontece o polimorfismo, pois cada animal reage de forma diferente ao mesmo método.

---
**Conceitos de POO Demonstrados** 🔍 <br><br>
✅ ***Abstração:*** <br>
Representada pela classe **Animal**, que contém comportamentos genéricos e define métodos que devem ser implementados pelas subclasses.

✅***Herança:*** <br>
As classes **Cachorro** e **Gato** estendem **Animal**, herdando atributos e comportamentos.

✅***Polimorfismo:*** <br>
O método **fazerSom()** é sobrescrito em cada classe e executado dinamicamente conforme o tipo do objeto.

✅***Encapsulamento:*** <br>
O atributo **nome** é protegido **(protected)**, controlando o acesso nas subclasses.

---
**Como Executar o Projeto** ▶️ <br><br>
***1. Compile os arquivos:*** <br>
```javac Animal.java Cachorro.java Gato.java Main.java```

***2. Execute o programa*** <br>
```java Main```

***Exemplo de saída:***<br>
```
Chamando o animal: Mel
O cachorro Mel está fazendo au au!
O animal Mel está dormindo.
...
```
---
**Conclusão** 📌 <br>
Este projeto demonstra de forma clara e objetiva o funcionamento dos principais conceitos de **Programação Orientada a Objetos** em Java. É ideal como base de estudo ou como parte de um portfólio inicial, evidenciando domínio dos pilares da POO e boas práticas de modelagem de classes.
