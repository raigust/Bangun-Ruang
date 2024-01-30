
package belajarinharitence2;

public class LimasSegitiga extends BangunRuang {
    float a;
    float tS;
    float tL;
    
    @Override
    float volume(){
        float volume = a * tS * tL / 3 / 2;
        System.out.println("Volume Limas Segitiga " + "= " + volume);
        return volume;
    }
    @Override
    float Lpermukaan(){
        float Lpermukaan = a * a;
        System.out.println("Luas Permukaan Limas segitiga " + "= " + Lpermukaan);
        return Lpermukaan;
    }
}
