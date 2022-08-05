# Locadora de veículo   "Sua Garagem"

A locadora brasileira de veículos ( Sua Garagem ) cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário.
Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00.

Fazer umprograma que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação.
O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela.
Veja os exemplos.

### Exemplo:
##### Digite o modelo do carro
##### Modelo : Corsa
##### Data de entrada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
##### Data de saída (dd/MM/yyyy hh:mm): 25/06/2018 14:40
##### Digite o preco por hora: R$ 10.00
##### Digite o preço por dia: R$ 130.00
##### Extrato:
##### Pagamento mínimo: R$ 50.00
##### Taxa: R$ 10.00
##### Total a pagar : R$ 60.00 

### Fómula do Cálculo de imposto:
###### Duração = (25/06/2018 14:40) - (25/06/2018 10:30) = 4:10 = 5 hora
###### Pagamento básico = 5 * 10 = 50
###### Taxa = 50 * 20% = 50 * 0.2 = 10

### Exemplo:
##### Digite o modelo do carro
##### Modelo: Civic
##### Data de entrada (dd/MM/yyyy hh:mm): 25/06/2018 10:30
##### Data de saída (dd/MM/yyyy hh:mm): 27/06/2018 11:40
##### Digite o preço por hora : R$ 10.00
##### Digite o preço por dia: R$ 130.00
##### INVOICE:
##### Pagamento mínimo: R$ 390.00
##### Taxa: R$ 58.50
##### Total a pagar: R$ 448.50

### Fórmula do Cálculo do imposto
###### Duration = (27/06/2018 11:40) - (25/06/2018 10:30) = 2 days + 1:10 = 3 days
###### Basic payment = 3 * 130 = 390
###### Tax = 390 * 15% = 390 * 0.15 = 58.50
