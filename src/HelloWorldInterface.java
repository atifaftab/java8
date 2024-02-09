@FunctionalInterface
public interface HelloWorldInterface {
    String sayHelloWorld();
    default int number(){
        return 5;
    }
    static Double phoneNumber(){
        return Math.random();
    }
}
