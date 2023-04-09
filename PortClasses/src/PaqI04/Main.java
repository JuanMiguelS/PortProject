package PaqI04;

public class Main {
    public static void main(String[] args) {



        Container g= new Container(234, -545, "Spain", false, 1, "a normal container", "CompanySA", "oCompanySA");
        Container y= new Container(254, 45, "Mongolia", true, 1, "another container", "CompanySA", "oCompanySA");
        Hub h= new Hub();



        System.out.println(g.getPriority());

        h.stack(g);
        h.stack(y);

        System.out.println(h.getHu()[0].length);
        System.out.println(h.getHu()[9][0].countryoforigin);
        System.out.println(h);
//
        h.ccountry("Spain");
        h.display();




    }
}