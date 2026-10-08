package lab.consumer.web;

import io.triform.core.Result;
import lab.api.dto.Item;
import lab.api.facade.TinyFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {

    private final TinyFacade tinyFacade;

    public LabController(TinyFacade tinyFacade) {
        this.tinyFacade = tinyFacade;
    }

    @GetMapping("/lab/ping")
    public Result<String> ping(@RequestParam(defaultValue = "triform") String name) {
        return tinyFacade.ping(name);
    }

    @GetMapping("/lab/item")
    public Result<Item> item(@RequestParam(defaultValue = "triform") String name) {
        return tinyFacade.item(name);
    }

    @PostMapping("/lab/echo")
    public Result<Item> echo(@RequestParam(defaultValue = "triform") String name,
                             @RequestParam(defaultValue = "2026-10-09T12:00:00") String at) {
        return tinyFacade.echo(new Item(name, java.time.LocalDateTime.parse(at)));
    }
}
