package belajarinharitence2;

public class Kubus extends BangunRuang {
    float sisi;
    
    @Override
    float volume(){
        float volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus " + "= " + volume);
        return volume;
    }
    
    @Override
    float Lpermukaan(){
        float Lpermukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + Lpermukaan);
        return Lpermukaan;
    }
    
}
