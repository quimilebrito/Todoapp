
package model;

import java.util.Date;

public class Project {
    
    private int idProjeto;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public Project(int idProjeto, String name, String description, Date createdAt, Date updatedAt) {
        this.idProjeto = idProjeto;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Project() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
}
