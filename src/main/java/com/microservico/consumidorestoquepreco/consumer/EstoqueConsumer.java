package com.microservico.consumidorestoquepreco.consumer;

import constantes.RabbitMqConstantes;
import dto.EstoqueDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMqConstantes.FILA_ESTOQUE)
    private void consumir(EstoqueDto estoqueDto){

        System.out.println(estoqueDto.getCodigoProduto());
        System.out.println(estoqueDto.getQuantidade());

        System.out.println("-----------------------------");

    }

}
