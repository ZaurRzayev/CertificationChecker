package kafka.pprojectcerficate.controllers;

import kafka.pprojectcerficate.dtos.ToolDTO;
import kafka.pprojectcerficate.services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tools")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @PostMapping("/register")
    public ToolDTO registerTool(@RequestBody ToolDTO toolDTO) {
        return toolService.createTool(toolDTO);
    }

    @GetMapping("/{id}")
    public Optional<ToolDTO> getToolById(@PathVariable Long id) {
        return toolService.findById(id);
    }
}

