package guz.research.activitidep;

import org.activiti.engine.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    private ProcessEngine processEngine;
    private TaskService taskService;
    private RuntimeService runtimeService;
    private HistoryService historyService;
    private RepositoryService repositoryService;

    public App() {

        try {

            ApplicationContext ctx = new ClassPathXmlApplicationContext("activiti.cfg.xml");

            processEngine = (ProcessEngine) ctx.getBean("processEngine");
            taskService = processEngine.getTaskService();
            runtimeService = processEngine.getRuntimeService();
            historyService = processEngine.getHistoryService();
            repositoryService = processEngine.getRepositoryService();


            System.out.println(ctx);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main( String[] args ) {
        new App();
    }
}
