package entities;

public class Rettangolo {
//attributes
private int width;
private  int height;

//constructor
public Rettangolo(int width,int height){
    this.setWidth(width);
    this.setHeight(height);
}
//getters

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    //setters

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //methods
public int getPerimeter(){
    int result= (this.width*this.height)/2;
//    System.out.println("l'area del rettangolo è:"+result);
    return result;
}
    public int getArea(){
        int result= (this.width*this.height);
//        System.out.println("il perimetro del rettangolo è:"+result);
        return result;
    }
public void stampaRettangolo(){
    int area = this.getArea();
    int perimeter = this.getPerimeter();
    System.out.println("Area del rettangolo: " + area);
    System.out.println("Perimetro del rettangolo: " + perimeter);
}
public static void stampaDueRettangoli(Rettangolo r1,Rettangolo r2){
    System.out.println("Primo rettangolo");
    r1.stampaRettangolo();
    System.out.println("Secondo rettangolo");
    r2.stampaRettangolo();
    int totArea= r1.getArea()+r2.getArea();
    System.out.println("area totale: "+totArea);
    int totPerimetro= r1.getPerimeter()+r2.getPerimeter();
    System.out.println("perimetro totale: "+totArea);
}
}
