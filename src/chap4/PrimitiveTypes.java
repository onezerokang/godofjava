package chap4;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
    }

    private void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        // 범위 벗어나기
        byteMin = (byte)(byteMin - 1);
        byteMax = (byte)(byteMax + 1);
        System.out.println("byteMin-1 = " + byteMin); // 127: 1000_000에서 1을 빼면 0111_111
        System.out.println("byteMax+1 = " + byteMax); // 128: 0111_111에서 1을 더하면 1000_000


    }
}
