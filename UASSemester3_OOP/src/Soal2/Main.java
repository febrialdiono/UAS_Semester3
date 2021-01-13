
package Soal2;


public class Main {
    public static void main(String [] args){
        
        Bangundatar bd = new Bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        
        System.out.println("NIM SAYA 201969040009");
        System.out.println("===============");
        System.out.println("-----> LUAS DAN KELILING SEGITIGA <-----");
        
        Segitiga st = new Segitiga();
        st.HitungLuas();
        System.out.println("===============");
        st.HitungKeliling();
        
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        
        System.out.println(" LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("===============");
        kotak.HitungKeliling();
        
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        
        System.out.println(" LUAS DAN KELILING LINGKARAN");
        Lingkaran bunder= new Lingkaran();
        bunder.HitungLuas();
        System.out.println("===============");
        bunder.HitungKeliling();
        
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");    
                
    }
}
