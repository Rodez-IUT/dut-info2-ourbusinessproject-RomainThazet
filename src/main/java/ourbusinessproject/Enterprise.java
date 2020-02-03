package ourbusinessproject;

import javax.validation.constraints.*;

public class Enterprise {
    @NotEmpty
    private String name;
    @NotEmpty @Size(min = 10)
    private String description;
    @NotEmpty
    private String contactName;
    @NotEmpty @Email
    private String contactEmail;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDescription() {
        return description;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
