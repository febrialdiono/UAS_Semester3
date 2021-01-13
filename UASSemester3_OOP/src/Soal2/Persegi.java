
package Soal2;


        

public class Persegi extends Segitiga {
    
    @Override
    public void HitungLuas(){
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang sisi :" + this.sisic + "cm");
        System.out.println("Luas Persegi :" + luas + "cm");
        
    }
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisic *2;
        System.out.println("Panjang sisi :" + this.sisic + "cm");
        System.out.println("keliling Persegi :" + keliling + "cm");
        
    }
}
