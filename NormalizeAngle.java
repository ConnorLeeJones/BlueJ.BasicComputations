 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        Integer normalized = angle % 360;
        return normalized;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        Integer normalized = Math.floorMod(integer, 360);
        return normalized;
    }

    public static void main(String[] args){

    }
}
