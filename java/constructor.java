public class constructor {
    void display(){
        System.out.println("method");
    }
    constructor(){
        System.out.println("constructor");
    }
    public static void main(String[] args){
        constructor obj=new constructor();
        obj.display();
    }
    
}
