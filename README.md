# Sistema Bancário Simples (Java POO)

Este projeto simula um sistema bancário básico, com suporte para contas corrente e poupança, permitindo saque, depósito e transferência entre contas.

## Estrutura

- Java puro (sem frameworks)
- Separado por pacotes (`model` para entidades)

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/elias-mb3/banco-digital-poo.git
```

2. Compile e execute:

```bash
cd sistema-bancario-java
javac -d dist src/model/*.java src/Main.java src/Main.java
java -cp dist Main
```

## Saída esperada:

```
Saldo CC: 800.0
Saldo CP: 700.0
```
