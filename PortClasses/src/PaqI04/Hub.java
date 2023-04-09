package PaqI04;

import java.util.Scanner;
public class Hub {

    private Container[][] hu;


    public Hub() {
        this.hu = new Container[10][12];

    }


    public Container[][] getHu() {
        return hu;
    }

    public void setHu(Container[][] hu) {
        if (hu != null) this.hu = hu;
    }






    public Container unstack(int col) {
        if (col < 0 || col >= hu[0].length) return null;
        for (int i = 0; i < hu.length; i++) {
            if (hu[i][col] != null) {
                Container aux = hu[i][col];
                hu[i][col] = null;
                return aux;
            }
        }
        return null;
    }

    public void stack(Container c) {
        if (c != null) {
            int p = c.getPriority();
            if (p == 1 || p == 2) {
                int col = p - 1;
                for (int i = hu.length - 1; i >= 0; i--) {
                    if (hu[i][col] == null) {
                        hu[i][col] = c;
                        return;
                    }
                }
            } else {
                for (int j = 2; j < hu[0].length; j++) {
                    for (int i = hu.length - 1; i >= 0; i--) {
                        if (hu[i][j] == null) {
                            hu[i][j] = c;
                            return;
                        }
                    }
                }
            }

        }
    }

    public void display(){
        boolean found= false;
        Scanner sc= new Scanner (System.in);
        System.out.println("Please indicate the container's identifier:");
        int id= sc.nextInt();

        for (int i = 0; i< hu[0].length; i++){
            for (int j = 0; j< hu.length; j++){
                if(hu[j][i]!=null)
                if (id== hu[j][i].identifiernumber){
                    System.out.println(hu[j][i]);
                    found=true;
                }
            }
        }

        if (found==false) System.out.println("The container is not in the hub");
    }

public int ccountry (String c){
    int ccount=0;



    for (int i = 0; i< hu[0].length; i++) {
        for (int j = 0; j < hu.length; j++) {
            if(hu[j][i]!=null)
            if(hu[j][i].countryoforigin.equals(c)) ccount++;



        }


    }

    System.out.println("The number of containers from " +c+ " is " +ccount );

return ccount;
}

public String toString() {
        String str = new String();
        for (int i = 0; i < hu.length; i++) {
            for (int j = 0; j < hu[i].length; j++) {
                if (hu[i][j] == null) str += "|N|";
                else str += "<" + hu[i][j].identifiernumber + ">";
            }
            str += "\n";
        }
        str += "\n";
        return str;
    }
}


