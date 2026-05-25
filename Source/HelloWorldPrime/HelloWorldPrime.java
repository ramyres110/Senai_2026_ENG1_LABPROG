public class HelloWorldPrime {
    public static void main(String [] args){
        if(args.length == 0){
            System.out.println("Informe seu nome!");
            return;
        }
        
        String nome= String.join(" ", args);
        String template = "Hello World %s, seja bem vindo(a)!";
        System.out.println(String.format(template, nome));
    }
}
