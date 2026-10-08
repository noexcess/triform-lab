package lab.api.dto;

import java.time.LocalDateTime;

public class Item {
    private String name;
    private LocalDateTime at;

    public Item() {
    }

    public Item(String name, LocalDateTime at) {
        this.name = name;
        this.at = at;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDateTime getAt() { return at; }
    public void setAt(LocalDateTime at) { this.at = at; }
}
