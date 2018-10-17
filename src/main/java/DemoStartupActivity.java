import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;

/**
 * This is our sample StartupActivity used to execute code on project open.
 */
public class DemoStartupActivity implements StartupActivity {

    @Override
    public void runActivity(Project project) {
        // This code is executed after the project was opened.
        System.out.println("Hello World! Loaded project: " + project.getName());
    }

}