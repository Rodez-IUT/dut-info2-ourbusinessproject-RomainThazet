package ourbusinessproject;



import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Enterprise {

    @Id
    @GeneratedValue
    private Long Id;

    @NotEmpty
    private String Name;

    @NotEmpty
    @Size(min = 10)
    private String Description;

    @OneToMany(mappedBy = "entreprise")
    public Collection<Project>  Projects = new HashSet<>();

    public Collection<Project> getProjects() {
        return Projects;
    }

    public void setProjects(Collection<Project> projects) {
        Projects = projects;
    }

    @NotEmpty
    private String ContactName;

    @NotEmpty
    @Email
    private String ContactEmail;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public Long getId() { return Id; }
}