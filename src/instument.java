
public class instument {
    String name,id,dis;
    int price;
    
    void displayInformation(){
        System.out.println(name="Samsumg");
        System.out.println(id="123");
        System.out.println(dis="Made by Japan");
        System.out.println(price=2000);
        
    }
    void setInformation(String n,String i,String di,int pri){
        name=n;
        id=i;
        dis=di;
        price=pri;
        
    }
    void displayInformation2(){
        System.out.println("Name: "+name +"\nid "+id+ "\ndiscription: "+dis+"\nPrice: "+price);
    }
}
