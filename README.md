# Groovy-Script-Alterando-Payload

🔀 SAP BTP CPI - Groovy Script Alterando Payload

Este repositório demonstra como receber um JSON via REST, converter para XML e utilizar o **General Splitter** no **SAP Cloud Integration (CPI)** para processar cada item individualmente.

![Capa](imagens/capa-linkedin.png)

---

## 📥 Exemplo de Payload JSON

O JSON utilizado no teste pode ser encontrado em:

📄 [`json/ordens.json`](json/ordens.json)

```json
{
  "Orders": {
    "Pedidos": [
      { "id": 1, "value": 100 },
      { "id": 2, "value": 200 },
      { "id": 3, "value": 300 }
    ]
  }
}
```

## 🔄 Fluxo do iFlow

![Fluxo](imagens/Screenshot_1.png)
![Fluxo](imagens/Screenshot_2.png)
![Fluxo](imagens/Screenshot_3.png)
![Fluxo](imagens/Screenshot_4.png)
![Fluxo](imagens/Screenshot_5.png)
![Fluxo](imagens/Screenshot_6.png)
![Fluxo](imagens/Screenshot_7.png)
![Fluxo](imagens/Screenshot_8.png)
![Fluxo](imagens/Screenshot_9.png)
![Fluxo](imagens/Screenshot_10.png)
![Fluxo](imagens/Screenshot_11.png)


## 📦 Exemplo prático – iFlow para baixar

📦 [Download do iFlow – SPLITTER.zip](Package/SPLITTER.zip)

> O arquivo pode ser importado diretamente no SAP Integration Suite (CPI).
