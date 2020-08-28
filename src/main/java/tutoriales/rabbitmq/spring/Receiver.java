package tutoriales.rabbitmq.spring;

public class Receiver {

    public static final String RECEIVE_METHOD_NAME = "receiveMessage";

    public void receiveMessage(String message) throws InterruptedException {

        System.out.println("[Receiver] ha recibido el mensaje \"" + message + '"');
    }
}