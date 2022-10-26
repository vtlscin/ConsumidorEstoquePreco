package com.microservico.consumidorestoquepreco.consumer;

import constantes.RabbitMqConstantes;
import dto.EstoqueDto;
import dto.PrecoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PrecoConsumer {

    @RabbitListener(queues = RabbitMqConstantes.FILA_PRECO)
    private void consumir(PrecoDto precoDto){

        System.out.println(precoDto.getCodigoProduto());
        System.out.println(precoDto.getPreco());

        System.out.println("-----------------------------");

    }

}
