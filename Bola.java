package belajarinharitence2;

public class Bola extends BangunRuang {
    float r;
    
    @Override
    float volume(){
        float volume = 4/3 * 22/7 * r * r * r;
        System.out.println("Volume bola " + "= " + volume);
        return volume;
    }
    @Override
    float Lpermukaan(){
        float Lpermukaan = 4 * 22/7 * r * r;
        System.out.println("Luas Permukaan Bola" + "= " + Lpermukaan);
        return Lpermukaan;
    }
}
