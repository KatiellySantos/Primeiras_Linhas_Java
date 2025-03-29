# 📋 Desafio: Operadores Aritméticos e Relacionais

📝 Este programa realiza operações aritméticas básicas entre dois números fornecidos pelo usuário, além de comparar os valores para determinar qual é maior, menor ou se são iguais. Ele é ideal para praticar o uso de **operadores aritméticos**, **comparadores relacionais** e **tratamento de exceções** em Java.

---

🧩 **Funcionalidades**
- Permite ao usuário inserir dois números e escolher uma operação matemática (adição, subtração, multiplicação ou divisão).
- Calcula o resultado da operação selecionada.
- Compara os dois números para determinar a relação entre eles (maior, menor ou igual).
- Garante que apenas valores válidos sejam aceitos utilizando tratamento de erros.

---

📂 **Onde Encontrar o Código**
O código para este desafio está disponível no arquivo [`OperadoresAritmeticoseRelacionais.java`].

---

🔧 **Ferramentas e Tecnologias**
- **Linguagem:** Java
- **Entrada de dados:** `Scanner`
- **Conversão de tipos:** `Double.parseDouble()` para transformar strings em números decimais.
- **Operadores aritméticos:** `+`, `-`, `*`, `/`
- **Operadores relacionais:** `>`, `<`, `==`
- **Tratamento de erros:** `try-catch` para capturar exceções como `NumberFormatException`.

---

📚 **Conceitos Aprendidos**
- Coleta de entrada do usuário com `Scanner`.
- Conversão de strings para números utilizando `Double.parseDouble()`.
- Implementação de operadores aritméticos e relacionais.
- Comparação de valores com estruturas condicionais (`if-else`).
- Validação de entrada do usuário para evitar exceções.

---

🛠️ **Instruções para Execução**
1. Certifique-se de ter o **Java Development Kit (JDK)** instalado.
2. Baixe o código-fonte do arquivo [`OperadoresAritmeticoseRelacionais.java`].
3. Compile o programa utilizando o comando:
   ```bash
   javac OperadoresAritmeticoseRelacionais.java
4. Execute o programa com:
   java OperadoresAritmeticoseRelacionais
5. Siga as instruções para:
   * Inserir os dois números (substituindo vírgulas por pontos para números decimais).
   * Escolher a operação matemática desejada (+, -, * ou /).
   * Observar o resultado da operação e a comparação entre os números.

💻 Exemplo de Execução:
```java
Digite o 1ª Número: abc
Entrada inválida. Por favor, digite apenas números.
Digite o 1ª Número: 10
Digite a operação: +
Digite o 2ª Número: 5
O resultado é: 15.0
O primeiro número é maior, menor ou igual ao segundo? 
É Maior



