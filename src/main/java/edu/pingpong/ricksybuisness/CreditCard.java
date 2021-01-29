package edu.pingpong.ricksybuisness;

public class CreditCard {

    private String name;
    private String number;
    private Double credit;
    private final String SYMBOL = "EZI";
    


    public CreditCard (String name,String number){  //ESTO ES UN CONSTRUCTOR
        this.name = name;
        this.number = number;
        this.credit = 3000.0d;
        
        
    }
    public String getOwner(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public String getCredit(){
        return this.credit.toString();
    }

    @Override
    public String toString (){
        return  "owner: "+ getOwner() + "\n"+
                "number: "+ getNumber() + "\n"+
                "credit: "+ getCredit()+SYMBOL + "\n";
    }


}