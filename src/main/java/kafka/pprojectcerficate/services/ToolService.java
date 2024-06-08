package kafka.pprojectcerficate.services;

import kafka.pprojectcerficate.dtos.ToolDTO;
import kafka.pprojectcerficate.entities.Tool;
import kafka.pprojectcerficate.mappers.ToolMapper;
import kafka.pprojectcerficate.repositories.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToolService {

    @Autowired
    private ToolRepository toolRepository;

    @Autowired
    private ToolMapper toolMapper;

    public ToolDTO createTool(ToolDTO toolDTO) {
        Tool tool = toolMapper.toEntity(toolDTO);
        tool = toolRepository.save(tool);
        return toolMapper.toDTO(tool);
    }

    public Optional<ToolDTO> findById(Long id) {
        return toolRepository.findById(id).map(toolMapper::toDTO);
    }
}

