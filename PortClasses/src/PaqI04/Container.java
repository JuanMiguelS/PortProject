package PaqI04;

public class Container {

    int identifiernumber;
    int weight;
    String countryoforigin;
    boolean inspected;
    int priority;
    String description;
    String companysend;
    String companyreceive;


    public Container() {


    }


    public Container(int identifiernumber, int weight, String countryoforigin, boolean inspected, int priority, String description,
              String companysend, String companyreceive) {
        this();
        if (identifiernumber < 0) identifiernumber = -identifiernumber;
        this.identifiernumber = identifiernumber;
        this.setWeight(weight);
        this.countryoforigin = countryoforigin;
        this.setPriority(priority);
        this.inspected = inspected;
        this.setDescription(description);
        this.companysend = companysend;
        this.companyreceive = companyreceive;
    }


    public int getIdentifiernumber() {
        return identifiernumber;
    }

    public void setIdentifiernumber(int identifiernumber) {
        this.identifiernumber = identifiernumber;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        if (weight < 0) this.weight = -weight;
        else this.weight=weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        if (description != null) this.description = description;
    }

    public boolean isInspected() {

        return inspected;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 3) {
            this.priority = priority;
        }
    }

    public String getCompanysend() {
        return companysend;
    }

    public void setCompanysend(String companysend) {
        if (companysend != null) this.companysend = companysend;
    }

    public String getCompanyreceive() {
        return companyreceive;
    }

    public void setCompanyreceive(String companyreceive) {
        if (companyreceive != null) this.companyreceive = companyreceive;
    }

//METHODS

    public String toString() {
       String str = new String();

       str= "----CONTAINER " + this.identifiernumber + "----\n" +
               "Identifier number: " +this.identifiernumber+ "\n" +
               "Weight: " +this.weight+ "kg"+ "\n" +
               "Country of origin: " + this.countryoforigin + "\n"+
               "Inspected: ";

       if(this.inspected==true) str=str+"Yes\n";
       else str=str+"No\n";

       str=str+"Priority: " +this.priority+ "\n" +
               "Description: " +this.description+ "\n" +
               "Company of origin: " +this.companysend+ "\n" +
               "Company of destination: " +this.companyreceive;

       return str;



    }
}
