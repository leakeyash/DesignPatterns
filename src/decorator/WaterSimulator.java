package decorator;

public class WaterSimulator {
    public static void main(String[] args){
        Water sw = new SugarWater();
        sw = new Sugar(sw);
        System.out.println(sw.getDescription());

        Water ssw = new SugarSaltWater();
        ssw = new Sugar(ssw);
        ssw = new Salt(ssw);
        System.out.println(ssw.getDescription());

        System.out.println(((Additive)ssw).display());
        //System.out.println(((Sugar)ssw).display());
    }
}
