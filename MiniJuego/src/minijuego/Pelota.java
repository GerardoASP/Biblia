package minijuego;

public class Pelota implements Runnable{
    //Atributos de la Clase
    private int x;
    private int y;
    
    //Constructor Por Defecto
    public Pelota(){
        
    }
    //Constructor Parametrizado
    public Pelota(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    //Serie de getters and setters
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
