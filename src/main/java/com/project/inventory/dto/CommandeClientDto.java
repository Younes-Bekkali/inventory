
package com.project.inventory.dto;


import com.project.inventory.model.Client;
import com.project.inventory.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;


@Data
@Builder
public class CommandeClientDto{
    private Integer id;

    private String code;


    private Instant dateCommande;



    private Client client;

    public List<LigneCommandeClientDto> ligneCommandeCliens;

        //Mapping
    //fromEntity
    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient == null){
            return  null;
            //Todo throw an exception
        }
        //Category --> CategoryDto
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .client(commandeClient.getClient())
                .build();
    }

    //toEntity
    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto == null){
            return  null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setClient(commandeClientDto.getClient());
        return commandeClient;
    }


}
