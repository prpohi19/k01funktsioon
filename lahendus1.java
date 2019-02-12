// Esimese kodutöö lahendus
// Kavatsen luua byte converterid

public class lahendus1 {
	public static void main(String[] args) {
		System.out.println("1 BYTES to BITS: "+BytesToBits(1));
		System.out.println("1 KB TO BYTES: "+KilobytesToBytes(1));
		System.out.println("1 MB TO BYTES: "+MegabyteToBytes(1));
		System.out.println("1 GB TO BYTES: "+GigabyteToBytes(1));
		System.out.println("1 TB TO BYTES: "+TerabyteToBytes(1));
		System.out.println("1 PB TO BYTES: "+PetabyteToBytes(1));
		System.out.println("1 EB TO BYTES: "+ExabyteToBytes(1));
		
		System.out.println(" ");
		System.out.println("8 BITS TO BYTES: "+BitsToBytes(8));
		System.out.println("1024 BYTES TO KB: "+BytesToKilobytes(1024));
		System.out.println("1048576 BYTES TO MB: "+BytesToMegabyte(1048576));
		System.out.println("1.073741824E9 BYTES TO GB: "+BytesToGigabyte(1.073741824E9));
		System.out.println("1.099511627776E12 BYTES TO TB: "+BytesToTerabyte(1.099511627776E12));
		System.out.println("1.125899906842624E15 BYTES TO PB: "+BytesToPetabyte(1.125899906842624E15));
		System.out.println("1.15292150460684698E18 BYTES TO EB: "+BytesToExabyte(1.15292150460684698E18));
	}
	
	public static double BytesToBits(double bytes) { return bytes * 8; }
	public static double BitsToBytes(double bits) { return bits / 8; }
	
	public static double KilobytesToBytes(double bytes) { return bytes * Math.pow(2, 10); }
	public static double MegabyteToBytes(double bytes) { return bytes * Math.pow(2, 20); }
	public static double GigabyteToBytes(double bytes) { return bytes * Math.pow(2, 30); }
	public static double TerabyteToBytes(double bytes) { return bytes * Math.pow(2, 40); }
	public static double PetabyteToBytes(double bytes) { return bytes * Math.pow(2, 50); }
	public static double ExabyteToBytes(double bytes) { return bytes * Math.pow(2, 60); }
	
	public static double BytesToKilobytes(double bytes) { return Math.round(bytes * Math.pow(1000, -1)); }
	public static double BytesToMegabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -2)); }
	public static double BytesToGigabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -3)); }
	public static double BytesToTerabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -4)); }
	public static double BytesToPetabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -5)); }
	public static double BytesToExabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -6)); }
}