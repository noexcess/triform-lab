package lab.provider.impl;

import io.triform.core.Result;
import lab.api.dto.Item;
import java.time.LocalDateTime;
import lab.api.facade.TinyFacade;
import org.springframework.stereotype.Service;

@Service
public class TinyFacadeImpl implements TinyFacade {
    @Override
    public Result<String> ping(String name) {
        return Result.ok("lab-provider-pong: " + name);
    }

    @Override
    public Result<Item> item(String name) {
        return Result.ok(new Item(name, LocalDateTime.now()));
    }

    @Override
    public Result<Item> echo(Item item) {
        item.setName("echo-" + item.getName());
        return Result.ok(item);
    }
}
