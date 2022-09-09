public class EjercicioTema3 {
    public static void main(String[] args) {
        sum(1,2,3);

        Coche miCoche = new Coche();
        miCoche.moreDoors();
        System.out.print(miCoche.doors);
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    public int doors = 4;

    public void moreDoors(){
        this.doors++;
    }
}
