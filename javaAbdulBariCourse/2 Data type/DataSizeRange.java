class DataSizeRange {
    public static void main(String[] args) {
        // Intiger
        System.out.println("Max value:- " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Min value:- " + Integer.MIN_VALUE); // 2147483648
        System.out.println("Byte value Intiger:- " + Integer.BYTES); // 4
        // Byte
        System.out.println("Byte Min:- " + Byte.MIN_VALUE);
        // float
        System.out.println("float Max value:- " + Float.MAX_VALUE);
        // Long
        System.out.println("logn min:- " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("long max value :- " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("long Byte :- " + Long.BYTES); // 8
        // Short
        System.out.println("Short max:- " + Short.MIN_VALUE); // 32768
        System.out.println("Short Maz:- " + Short.MAX_VALUE); // 32767
        System.out.println("Short Bytes :- " + Short.BYTES); // 2

        byte b = 5;
        System.out.println("binary of 5 is:- " + Integer.toBinaryString(b));
        byte b1 = -5;
        System.out.println("binary of -5 is:- " + Integer.toBinaryString(b1));
        // 2's complitment

    }
}
