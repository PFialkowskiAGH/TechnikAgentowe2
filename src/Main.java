import jade.core.Agent;

public class Main extends Agent
{
    protected void system() {
        System.out.println("Hello world! My name is" + getLocalName());
        doDelete();
    }
}