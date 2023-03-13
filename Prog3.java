import java.math.*;
public class Prog3{
        //variables
        int cordx;
        int cordy;
        //constructor
        public Prog3(int ncordx,int ncordy){
            cordx=ncordx;
            cordy=ncordy;
        }
        //métodos
        float DisOrigen(){
            float dist;
            dist=math.sqrt((cordx*cordx)+(cordy*cordy));
            return(dist);
        }
    }
