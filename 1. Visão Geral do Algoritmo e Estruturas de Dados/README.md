# 🟢 Desafio: Par ou Ímpar

📄 Este programa solicita que o usuário insira um número inteiro e, em seguida, determina se o número é **par** ou **ímpar**. Ele utiliza conceitos básicos de Java, como entrada de dados, conversão de tipos e estruturas de controle condicionais.

---

🚀 **Como o programa foi implementado**
1. **Entrada de Dados:**
   - O programa usa a classe `JOptionPane` para exibir uma interface gráfica solicitando que o usuário insira um número. 

2. **Conversão de Tipos:**
   - A entrada é capturada como uma string e convertida para um número inteiro usando `Integer.parseInt()`.

3. **Lógica Condicional:**
   - A lógica utiliza o operador `%` (módulo) para determinar se o número é divisível por 2:
     - Se o resto for `0`, o número é classificado como **par**.
     - Caso contrário, ele é classificado como **ímpar**.

4. **Saída de Dados:**
   - Os resultados são exibidos no console informando se o número é par ou ímpar.

---

📂 **Localização do Código**
O código completo deste desafio está disponível no arquivo [`ParOuImpar01.java`].

---

🛠️ **Como executar o programa**
1. Certifique-se de ter o **Java Development Kit (JDK)** instalado no seu computador.
2. Navegue até a pasta onde está localizado o arquivo do código.
3. Compile o programa no terminal com o comando:
   ```bash
   javac ParOuImpar01.java
4. Execute o programa com o comando:
   java ParOuImpar01
5. Insira um número quando solicitado e veja o resultado no console.

📚 Conceitos Aplicados

Entrada de dados com GUI: JOptionPane.showInputDialog()

   * Conversão de Tipos: Integer.parseInt()

   * Estrutura Condicional: if-else

   * Operador Aritmético: Módulo (%)

   * Exibição de Resultados: System.out.println()


