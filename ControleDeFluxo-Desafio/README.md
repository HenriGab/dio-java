# ✨ Desafio de Controle de Fluxo - Java ✨

Este projeto implementa um sistema que solicita dois números inteiros do usuário e imprime uma contagem baseada na diferença entre esses números. Caso os valores informados sejam inválidos, o sistema solicita a entrada novamente até que os dados sejam corretamente fornecidos.

---

## 🛠️ Tecnologias Utilizadas
- Java 
- Scanner para entrada de dados
- Try/Catch para tratamento de exceções

---

## ✅ Funcionalidades
- Solicita dois números inteiros via terminal.
- Verifica se os valores são válidos (números inteiros).
- Lanca uma exceção personalizada caso o primeiro número seja maior que o segundo.
- Repete a solicitação caso ocorra um erro até que os valores corretos sejam inseridos.
- Exibe uma contagem até atingir o segundo número.

---

## 🗒️ Como Funciona o Código?

### 1. **Entrada de Dados**
O código usa um **loop `while`** para garantir que o usuário forneça entradas válidas:
```java
Scanner sc = new Scanner(System.in);
int number1 = 0; number2 = 0;
boolean validInput = false;
```
- **Enquanto** a entrada for inválida, continua pedindo os valores ao usuário.
- Converte os valores de `String` para `int`.

### 2. **Tratamento de Exceções**
Utilizamos **dois `catch`** para tratar diferentes erros:
```java
catch (NumberFormatException e) {
    System.out.println("Erro: Digite apenas números inteiros!");
} catch (ParametrosInvalidosException e) {
    System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
}
```
- `NumberFormatException`: Captura erro quando o usuário digita algo que não é um número.
- `ParametrosInvalidosException`: Captura erro quando o primeiro número é maior que o segundo.

### 3. **Exceção Personalizada**
Criamos a classe `ParametrosInvalidosException` para tratar o caso específico de entrada inválida:
```java
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
```
Essa exceção é **lançada** no método `contar()` se `number1> number2`.

### 4. **Execução da Contagem**
Se os valores forem válidos, chamamos o método `contar()`:
```java
static void contar(int n1, int n2) throws ParametrosInvalidosException {
    if (n1 > n2) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
    int count = n2-n1
    }
    for (int i = 1; i <= count; i++) {
        System.out.println((i)+" Interecation");
    }
}
```
- **Lanca exceção** se o primeiro número for maior.
- **Imprime a contagem** com base na diferença entre os dois números.

---

## 📚 Exemplo de Execução

**Entrada correta:**
```
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
15
```
**Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

**Entrada inválida (texto no lugar de números):**
```
Digite o primeiro parâmetro:
abc
Erro: Digite apenas números inteiros!
```

**Entrada inválida (primeiro número maior que o segundo):**
```
Digite o primeiro parâmetro:
20
Digite o segundo parâmetro:
10
Erro: O segundo parâmetro deve ser maior que o primeiro.
```

---

## 🚀 Benefícios da Implementação
- **Maior confiabilidade**: evita que o programa quebre com entradas erradas.
- **Experiência do usuário melhorada**: feedback imediato para erros.
- **Boa prática de tratamento de exceções**: uso correto de `try-catch` e exceções personalizadas.

---



## Autores

- [@HenriGab](https://github.com/HenriGab)




## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
