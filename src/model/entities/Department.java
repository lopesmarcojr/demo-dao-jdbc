package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Department that = (Department)o;
            return Objects.equals(this.id, that.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public String toString() {
        return "Department - Id: " + this.id + ", Nome: " + this.name + "\n";
    }
}
