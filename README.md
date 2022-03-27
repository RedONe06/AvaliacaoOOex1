# AvaliacaoOOex1
⭕ Avaliação - Exercício 01 (Criação de peça) - ULBRA Técnico em TI (Noturno)

De acordo com o diagrama abaixo codifique: (Nome da classe, atributos e suas visibilidades, construtor e
métodos).

![image](https://user-images.githubusercontent.com/98191980/160294192-b9c667a6-a42a-4235-ba31-3a111853498b.png)

1. No construtor – inicialize o nome da peca = “Teclado” e segundos = 100,00 e no método
+setSegundos(segundos:int):void não permita valor negativo. (Faça o uso do teste condicional) caso for
enviado valor negativo atribuir a variável 100 segundos.
2. Para o método +calcularHMS():void, converta segundos em hora, minuto e segundo. Armazene os
resultados nos atributos hora, minuto e segundo (da classe). **lembrando: 1 hora = 3600 segundos – 1
minuto = 60 segundos – utilize os operadores aritméticos / %).
3. Para o método +toString():String – retorne a seguinte mensagem:

`"A peça: “+this.getPeca() + “ que levou um total de “+this.getSegundos() +” levou
“+this.getHora()+”:”+this.getMinuto()+”:”+this.getSegundo() +” para ficar pronta!!"`

4. crie uma classe com o nome de UsaProducao – defina o método main().
5. Instancie 2 objetos - prod da classe Producao e ler da classe Scanner. – não esqueça de passar
parâmetros, para que o objeto prod funcione.
6. Execute o método +calcularHMS():void.
7. Execute o método +toString():String - dentro de um Sysout()
8. Faça a leitura de uma nova peça qualquer (Use os Setters e leituras com o objeto ler)
9. Execute novamente o método +calcularHMS():void.
10. Mostre os resultados utilizando o método +toString():String (dentro do sysout()).
