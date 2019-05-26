 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String hex = Integer.toBinaryString(value);
        return hex;
    }

    public String printIntegerAsOctal(int value){
        String hex = Integer.toOctalString(value);
        return hex;
    }

    public String printIntegerAsHexadecimal(int value){
        String hex = Integer.toHexString(value);
        return hex;
    }

    public static void main(String[] args){

    }
}
