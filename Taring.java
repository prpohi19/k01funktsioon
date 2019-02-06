import java.util.Random;

	public class Taring {

		private int kyljed;
		private int vaartus;
		private Random generaator;

		public Taring(int kyljed) {
			this.kyljed = kyljed;
			generaator = new Random();
		}

		public Taring(int kyljed, int seed) {
			this.kyljed = kyljed;
			generaator = new Random(seed);
		}

		public int veereta() {
			this.vaartus = this.generaator.nextInt(this.kyljed) + 1; //muidu on 5 voimalikku varianti, +1 annab ühe kulje veel juurde
			return this.vaartus; //tagastab vaartuse
		}

	}
