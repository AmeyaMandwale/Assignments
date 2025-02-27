interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Amphibian implements Flyable,Swimmable {
    public void fly(){
            System.out.println("Amphibian is flyable");
        }
        public void swim(){
            System.out.println("Amphibian is Swimmable");
        }

    }
    public class Assignment_Q2{
    public static void main(String[] args){
        Amphibian amp=new Amphibian();
        amp.fly();
        amp.swim();
    }

    }

