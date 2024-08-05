package es.cic.curso;

import java.util.HashMap;
import java.util.Map;
/*
 * private Map<Integer, Task> tasks;: Atributo privado que almacena las tareas. 
 * Utiliza un Map donde la clave es el id de la tarea y el valor es el objeto Task.
 * private int nextId;: Atributo privado que mantiene el siguiente ID disponible 
 * para nuevas tareas.
 */
public class TaskManager {
    private Map<Integer, Task> tasks;
    private int nextId;


    /*
     * public TaskManager(): Constructor de la clase. Se ejecuta cuando se crea 
     * una nueva instancia de TaskManager.
     * this.tasks = new HashMap<>();: Inicializa el atributo tasks como una nueva 
     * instancia de HashMap. Esto prepara el almacenamiento de tareas.
     * this.nextId = 1;: Inicializa nextId en 1. Esto significa que el primer ID 
     * asignado a una tarea será 1.
     */
    public TaskManager() {
        this.tasks = new HashMap<>();
        this.nextId = 1;
    }

    /*
     * Método para añadir una nueva tarea
     * Task task = new Task(nextId++, description);: Crea un nuevo objeto Task con
     * el ID actual (nextId) y la descripción proporcionada. Luego, incrementa nextId 
     * para el siguiente ID.
     * tasks.put(task.getId(), task);: Añade la tarea al Map tasks, usando el ID de 
     * la tarea como clave y el objeto Task como valor.
     */
    public Task addTask(String description) {
        Task task = new Task(nextId++, description); // Constructor Task(int id, String description)
        tasks.put(task.getId(), task);
        return task;
    }

    /*
     * Método para eliminar una tarea por su ID.
     */
    public void removeTask (int id) {
        tasks.remove(id);
    }

    /*
     * Método para obtener una tarea por su ID.
     */
    public Task getTask (int id) {
        return tasks.get(id);
    }

    /*
     * Método para obtener todas las tareas almacenadas.
     * return tasks;: Devuelve el Map completo de tareas.
     */
    public Map<Integer, Task> getAllTasks() {
        return tasks;
    }

}
