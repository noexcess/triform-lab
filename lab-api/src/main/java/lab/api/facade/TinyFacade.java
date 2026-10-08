package lab.api.facade;

import io.triform.core.Result;
import lab.api.dto.Item;
import io.triform.rpc.annotation.RemoteFacade;

/** 跨服务契约: 标 @RemoteFacade 即可被任何引入 triform 的服务消费。 */
@RemoteFacade
public interface TinyFacade {
    Result<String> ping(String name);

    /** D4 验收: 复杂类型往返(LocalDateTime 依赖宿主 ObjectMapper 的 JavaTimeModule) */
    Result<Item> item(String name);

    /** F档验收: 入参含 LocalDateTime 的复杂 DTO(编码+解码双端共用宿主 ObjectMapper) */
    Result<Item> echo(Item item);
}
