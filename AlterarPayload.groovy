import com.sap.it.script.v2.api.Message
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder
import java.io.Reader
import java.math.BigDecimal

Message processData(Message message) {

    Reader reader = message.getBody(java.io.Reader.class)
    def json = new JsonSlurper().parse(reader)

    // Informações gerais
    String loja = json.RegistroCompras.InformacoesGerais.NomeLoja
    String dataCriacao = json.RegistroCompras.InformacoesGerais.Data

    // Transações
    def transacoes = json.RegistroCompras.Transacoes

    // Quantidades
    int numeroItens = transacoes.size()
    int numeroItensCartao = transacoes.findAll { item ->
        item.TipoPagamento == "Cartão de Crédito"
    }.size()

    // Soma total
    BigDecimal valorTotal = BigDecimal.ZERO
    transacoes.each { item ->
        valorTotal = valorTotal.add(item.Preco as BigDecimal)
    }

    // JSON de saída
    JsonBuilder builder = new JsonBuilder()
    builder {
        Log {
            "InformacoesGerais" {
                "Loja" loja
                "DataCriacao" dataCriacao
            }
            "ResumoCartao" {
                "NumeroItens" numeroItens
                "NumeroItensCartaoCredito" numeroItensCartao
                "ValorTotal" valorTotal
            }
        }
    }

    message.setBody(builder.toPrettyString())
    return message
}
