public class Main {
    public static void main(String[] args) {
        
        //Create a duck
        MallardDuck duck = new MallardDuck();

        //Create a turkey
        WildTurkey turkey = new WildTurkey();

        //Wrap turkey in adapter, so it looks like a duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        //Turkey
        System.out.println("Turkey:");
        turkey.gobble();
        turkey.fly();

        //Duck
        System.out.println("\nDuck");
        testDuck(duck);

        //Turkey Adapter
        System.err.println("\nTurkey Adapter to Duck");
        testDuck(turkeyAdapter);



    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
