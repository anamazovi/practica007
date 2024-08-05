package es.cic.curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


/*
 * Declara un atributo privado para almacenar una instancia de TaskManager.
 */
public class TestManagerTest {
    private TaskManager taskManager;
  
    /*
     * @BeforeEach: Anotación que indica que este método debe 
     * ejecutarse antes de cada método de prueba.
     * Esto asegura que cada prueba empiece con un TaskManager nuevo.
     */
    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
    }

    /*
     * Task task = taskManager.addTask("Buy groceries");: 
     * Llama al método addTask para añadir una nueva tarea.
     * assertNotNull(task);: Verifica que la tarea añadida no sea null.
     * assertEquals("Buy groceries", task.getDescription());: Verifica 
     * que la descripción de la tarea sea "Buy groceries".
     */
    @Test
    public void testAddTask() {
        Task task = taskManager.addTask("Buy groceries");
        assertNotNull(task);
        assertEquals("Buy groceries", task.getDescription());
    }

    /*
     * assertNull(taskManager.getTask(task.getId()));: 
     * Verifica que la tarea ya no esté en el TaskManager.
     */
    @Test
    public void testRemoveTask() {
        Task task = taskManager.addTask("Clean the house");
        taskManager.removeTask(task.getId());
        assertNull(taskManager.getTask(task.getId()));
    }

    /*
     * task.complete();: Marca la tarea como completada.
     * assertTrue(task.isCompleted());: Verifica que la 
     * tarea esté marcada como completada.
     */
    @Test
    public void testCompleteTask() {
        Task task = taskManager.addTask("Do laundry");
        task.complete();
        assertTrue(task.isCompleted());
    }
}
