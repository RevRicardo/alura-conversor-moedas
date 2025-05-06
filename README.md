# Conversor de Moedas 💰
Este é um aplicativo Java que permite converter moedas utilizando a API ExchangeRate-API. 
O sistema suporta a conversão entre BRL (Real), USD (Dólar), EUR (Euro) e AUD (Dólar Australiano).
## 🚀 Tecnologias utilizadas
•	Java (Versão 8+)
•	Gson (Para manipulação de JSON)
•	ExchangeRate-API (Para obter taxas de câmbio em tempo real)
## 📌 Funcionalidades
•	Conversão entre Real e Dólar (BRL ↔ USD)
•	Conversão entre Real e Euro (BRL ↔ EUR)
•	Conversão entre Real e Dólar Australiano (BRL ↔ AUD)
•	Opção para converter Real para todas as moedas disponíveis simultaneamente

## 📂 Estrutura do Projeto
ConversorMoedasApplication.java       // Classe principal (menu e controle)
```
│── service
│   │── MoedaConversao.java  // Lida com conversões
│── request
│   │── MoedaRequest.java    // Busca dados da API
│── response
│   │── MoedaResponse.java   // Exibe os resultados no terminal
│── domain
│   │── Moeda.java           // Representa uma moeda e sua taxa de conversão
```

## 🛠 Como executar
1.	Clone o repositório:
       git clone https://github.com/seu-usuario/conversor-moedas.git

## 🔄 Como funciona?
O sistema inicia com um menu interativo no terminal, onde o usuário escolhe a moeda de conversão e insere o valor desejado. O programa então consulta a API de câmbio e retorna o valor convertido com a taxa aplicada.

## 📌 Exemplo de saída
```
*---------------------------------*
*   ALURA - ONE                   *
*   Sistema Conversor de Moedas   *
*---------------------------------*
```
Selecione a opção de conversão:
1. BRL para USD
2. USD para BRL
3. BRL para EUR
4. EUR para BRL
5. BRL para AUD
6. AUD para BRL
7. BRL para todas (USD, EUR, AUD)
8. Encerrar aplicação
Opção: 1
Digite o valor a ser convertido: 100

A moeda BRL será convertida para USD
A taxa de conversão é: 5.25
Valor convertido: 525.00 USD

## 🏗 Melhorias futuras
•	Adicionar mais moedas ao sistema
•	Criar interface gráfica (GUI) para maior usabilidade
•	Permitir configuração personalizada das taxas de câmbio
