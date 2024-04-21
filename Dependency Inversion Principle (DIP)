import java.util.ArrayList;
import java.util.List;

// Interface representing the ability to perform a task
interface TaskPerformer {
    void performTask();
}

// Interface representing the ability to supervise a task
interface TaskSupervisor {
    void superviseTask();
}

// Interface representing the ability to report on a task
interface TaskReporter {
    void reportTask();
}

// Class representing a Manager who can supervise and report on tasks
class Manager implements TaskSupervisor, TaskReporter {
    @Override
    public void superviseTask() {
        System.out.println("Manager is supervising.");
    }

    @Override
    public void reportTask() {
        System.out.println("Manager is reporting.");
    }
}

// Class representing a Worker who can perform tasks
class Worker implements TaskPerformer {
    @Override
    public void performTask() {
        System.out.println("Worker is performing.");
    }
}

// Demo class demonstrating the usage of task execution roles and the Interface Segregation Principle
public class Interface_Segregation_Principle_Tasks {
    public static void main(String[] args) {
        // Create a list of task execution roles
        List<Object> roles = new ArrayList<>();
        roles.add(new Manager());
        roles.add(new Worker());

        // Perform actions based on each role
        for (Object role : roles) {
            if (role instanceof TaskPerformer) {
                ((TaskPerformer) role).performTask();
            }
            if (role instanceof TaskSupervisor) {
                ((TaskSupervisor) role).superviseTask();
            }
            if (role instanceof TaskReporter) {
                ((TaskReporter) role).reportTask(); // Assume reporting is a common action for all task execution roles
            }
            System.out.println();
        }
    }
}

/**
 * In the above program, we have interfaces representing specific task execution roles,
 * such as performing and supervising tasks, instead of a single interface containing all tasks.
 * This allows classes like Manager and Worker to implement only the interfaces relevant
 * to their roles, adhering to the Interface Segregation Principle.
 */
