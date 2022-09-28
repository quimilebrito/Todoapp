
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {
    public static void main(String[] args) {
        
//        ProjectController pc = new ProjectController();
//        Project project = new Project();
//        project.setName("Teste");
//        project.setDescription("teste again");
////      pc.save(project);
//        
//        ProjectController pc = new ProjectController();
//        Project project = new Project();
//        project.setIdProjeto(13);
//        project.setName("New name project");
//        project.setDescription("description");
//        pc.update(project);
//        
//        
//        List<Project> projects = pc.getAll();
//        System.out.println("Total de projetos = " + projects.size());
//        
//        pc.removeByID(13);

        TaskController taskController = new TaskController();
        Task task = new Task();
        task.setIdTarefa(12);
        task.setIdProject(1);
        task.setName("Minha Segunda Tarefa");
        task.setDeadline(new Date());
        task.isCompleted(true);
        task.setDescription("teste do boolean");
        task.setNotes("Sem notas");
        taskController.update(task);
        List<Task> tasks = taskController.getAll(1);
        System.out.println("Total de tarefas no projeto: "+ tasks.size());
        System.out.println(Arrays.toString(tasks.toArray()));
 

       
        
        
      
    }
}
