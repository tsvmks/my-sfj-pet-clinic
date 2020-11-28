package guru.springframework.sfgpetclinic.model;

/**
 * @author tsvetkov
 * @created 2020-11-28
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
