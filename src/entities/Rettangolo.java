package entities;

public class Rettangolo {
//attributes
private int width;
private  int height;

//constructor
public Rettangolo(int width,int height){
    this.width=width;
    this.height=height;
}
//methods
public int getPerimeter(){
    int result= (this.width*this.height)/2;
    System.out.println("l'area del rettangolo è:"+result);
    return result;
}
    public int getArea(){
        int result= (this.width*this.height);
        System.out.println("il perimetro del rettangolo è:"+result);
        return result;
    }

}
