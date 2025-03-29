# 📋 Desafio: Calculadora Completa

📝 Este programa implementa uma calculadora interativa que permite ao usuário realizar operações matemáticas básicas entre dois números, repetindo as operações até que ele escolha parar. Ideal para praticar operadores aritméticos, estrutura de repetição e tratamento de exceções em Java.

---

🧩 **Funcionalidades**
- Solicita dois números ao usuário.
- Permite escolher uma operação matemática: adição (`+`), subtração (`-`), multiplicação (`*`) ou divisão (`/`).
- Calcula e exibe o resultado da operação.
- Lida com entradas inválidas utilizando tratamento de erros.
- Repete o processo até que o usuário escolha encerrar.

---

📂 **Onde Encontrar o Código**
O código para este desafio está disponível no arquivo [`CalculadoraCompleta.java`].
---

🔧 **Ferramentas e Tecnologias**
- **Linguagem:** Java
- **Entrada de dados:** `Scanner`
- **Operadores aritméticos:** `+`, `-`, `*`, `/`
- **Controle de fluxo:** `do-while` para repetição.
- **Tratamento de erros:** `try-catch` para capturar exceções como `InputMismatchException`.

---

📚 **Conceitos Aprendidos**
- Coleta de entrada do usuário com `Scanner`.
- Implementação de operadores aritméticos.
- Controle de fluxo com estrutura de repetição (`do-while`).
- Tratamento de erros e validação de entrada.
- Comparação de strings para identificar operações (`equals()`).

---

🛠️ **Instruções para Execução**
1. Certifique-se de ter o **Java Development Kit (JDK)** instalado.
2. Baixe o código-fonte do arquivo [`CalculadoraCompleta.java`].
3. Compile o programa utilizando o comando:
   ```bash
   javac CalculadoraCompleta.java
4. Execute o programa com:
   java CalculadoraCompleta
5. Insira os valores e a operação desejada:
    * Escolha entre +, -, * ou /.
    * Continue realizando operações ou encerre digitando n.

💻 Exemplo de Execução Entrada válida:

Número 1: 10
Escolha uma operação (+, -, *, /): +
Número 2: 5
Resultado: 15.0
Deseja realizar outra operação? (s/n): s
Número 1: 8
Escolha uma operação (+, -, *, /): *
Número 2: 4
Resultado: 32.0
Deseja realizar outra operação? (s/n): n


