public class MainTest {
    public static void main(String[] args){

        Subject sub = new Subject();
        sub.setInput(5);

        int input = 5;

        OpCircleCircummatance OCC = new OpCircleCircummatance();
        OCC.setSubject(sub);

        if((int)(2 * 3.14 * input) != OCC.operate())
            System.exit(1);

        LucasSeries LS = new LucasSeries();
        LS.setSubject(sub);

        if (11 != LS.operate())
            System.exit(1);

        CircleArea CA = new CircleArea();
        CA.setSubject(sub);
        
        if((int)(3.14 * input * input) != CA.operate())
            System.exit(1);


    }
}
