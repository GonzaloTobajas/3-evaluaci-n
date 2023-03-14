import java.math.*;
public class Prog3{
        //variables
        private int cordx;
        private int cordy;
        //constructor
        public Prog3(int ncordx,int ncordy){
            cordx=ncordx;
            cordy=ncordy;
        }
        //métodos
        double DisOrigen(){
            double dist;
            dist= Math.sqrt((cordx*cordx)+(cordy*cordy));
            return(dist);
        }
        //Métodos setter&getter
        //set-->fijar el valor de un atributo
        void setCordx(int ncordx, int ncordy){
            cordx=ncordx;
            cordy=ncordy;
        }
        public int geetCoordx(){
            return cordx;
        }
        public void setCoordx(int cordx){
            this.cordx=cordx;
        }
    }
