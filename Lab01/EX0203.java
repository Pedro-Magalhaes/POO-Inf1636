/**
 * EX0203
 */
public class EX0203 {

    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println("Numero de argumentos recebidos: " + args.length);
            for (int i=0;i<args.length;i++) {
                Socio s=new Socio(Integer.parseInt(args[i]));
                System.out.println(s.getMatric());
            }
            
        } else {
            Socio s=new Socio(123456);
                System.out.println(s.getMatric());
        }
        
    }
}