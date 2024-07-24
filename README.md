# Igors-Pizzaria
 
O Build Pattern, utilizado neste projeto, é um padrão de projeto que viabiliza a construção de múltiplos objetos complexos a partir da reutilização do código comum a eles. Desta forma, é possível predispor configurações default e se preocupar de fato apenas com as especificidades de cada objeto. 
 
Feito por: 
- [Igor Filipi Cardoso](https://github.com/igorcardosoy)
- [Cauã Rufino de Sá](https://github.com/CauaDeSa)

#
- Explique porque o Objeto builder, precisou ser instanciado duas vezes.
- Contemple na explicação como é o comportamento em memória dos objetos Pizza.Builder e Pizza.

```
  	O Builder é um objeto de criação que, uma vez configurado, sempre criará objetos com aquelas mesmas configurações

e retornará apenas as suas instâncias em cada chamada do método de criação Build(). Sendo assim, quando houver a necessidade

de construir um objeto diferente ao previamente configurado, é necessário que seja instanciado um novo Builder.


	Neste padrão de projeto criacional, o Builder age criando em memória temporária as especificações e atributos do objeto

desejado, porém só é após a chamada do método Build() que ocupa-se de fato a memória com valores finais de atributo, visto

que neste padrão geralmente é desejada a criação de objetos imutáveis. Após o ciclo de criação, quando não é mais necessário

o objeto Builder, ele pode ser descartado pelo coletor de lixo.
```
