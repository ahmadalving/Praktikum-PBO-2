//Nama : Ahmad Alvin Griffin
//NIM  : 24060121140106
//Lab  : PBO C1



public class MOperasiTitik{
    public static void main(string[] args){
        Titik t = new Titik(a: 4,o: 4);
        OperasiTitik o = new OperasiTitik();
        System.out.printIn("Titik : (" + t.getabsis() + "," + t.getOrdinat()+")");
        o.refleksiSumbuX(t);
        System.out.printIn("Titik : (" + t.getabsis() + "," + t.getOrdinat()+")");
        o.refleksiSumbuY(t);
        System.out.printIn("Titik : (" + t.getabsis() + "," + t.getOrdinat()+")");
    }

}