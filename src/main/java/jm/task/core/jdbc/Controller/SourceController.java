package jm.task.core.jdbc.Controller;
import jm.task.core.jdbc.model.Source;
import jm.task.core.jdbc.service.SourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/source"})
@RequiredArgsConstructor
public class SourceController {

    private final SourceService sourceService;

    @GetMapping("/{name}")
    public Source findByNameSource(@PathVariable String name) {
        return sourceService.findByNameSource(name);
    }

    @PostMapping()
    public void saveSource( @RequestBody Source source) {
        sourceService.saveSource(source);
    }

}
