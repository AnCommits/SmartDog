public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String inp = "Woof-woof-woof-woof-woof-woof-woof-woof! Woof-woof-woof-woof-woof-woof-woof-woof-woof!";
//        String inp = "khkhkhWbzzzzobzzzOghrrrrfseswsw!";
//        String inp = "Wofowof!";
//        String inp = "Woofshhh! Shhh!";
//        String inp = "Woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof!";
        String res = SmartDogOwner.woofDecoder(inp);
        System.out.println(res);
    }
}