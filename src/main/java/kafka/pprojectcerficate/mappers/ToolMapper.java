package kafka.pprojectcerficate.mappers;


import kafka.pprojectcerficate.dtos.ToolDTO;
import kafka.pprojectcerficate.entities.Tool;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToolMapper {
    Tool toEntity(ToolDTO toolDTO);
    ToolDTO toDTO(Tool tool);
}

