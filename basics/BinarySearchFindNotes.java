package basics;

public class BinarySearchFindNotes {

	public static void main(String[] args) {

		int[] notes = { 500, 200, 100, 50 };

		int amount = 2550;
		int debit = 0;

		int notes500 = 0;
		int notes50 = 0;
		int notes100 = 0;
		int notes200 = 0;

		for (int i = 0; i < notes.length; i++) {

			while (debit + notes[0] <= amount) {
				debit = debit + notes[0];
				notes500++;
			}

			while (debit + notes[1] <= amount) {
				debit = debit + notes[1];
				notes200++;
			}

			while (debit + notes[2] <= amount) {
				debit = debit + notes[2];
				notes100++;
			}

			while (debit + notes[3] <= amount) {
				debit = debit + notes[3];
				notes50++;
			}
		}
		System.out.println("rs 500 notes "+notes500);
		System.out.println("rs 200 notes "+notes200);
		System.out.println("rs 100 notes "+notes100);
		System.out.println("rs 50 notes "+notes50);

	}
}
