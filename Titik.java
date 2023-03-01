//Nama : Ahmad Alvin Griffin
//NIM  : 24060121140106
//Lab  : PBO C1

class Titik{
	private double absis;
	private double ordinat;
	static int counterTitik; //menghitung objek titik
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}