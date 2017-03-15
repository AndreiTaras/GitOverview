package net.gitoverview;

/**
 * Created by Andrei on 15.03.2017.
 */
public class BaseEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    boolean isNew(){
        return (this.id == null);
    }
}
