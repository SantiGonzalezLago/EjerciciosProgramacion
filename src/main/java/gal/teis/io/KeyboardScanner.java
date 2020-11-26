package gal.teis.io;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public final class KeyboardScanner {
	private static final int DEFAULT_ATTEMPT_LIMIT = 10;

	private Scanner sc;
	private boolean lineInBuffer;
	private int defaultAttemptLimit;

	public KeyboardScanner() {
		this(DEFAULT_ATTEMPT_LIMIT);
	}

	public KeyboardScanner(int defaultAttemptLimit) {
		sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		lineInBuffer = false;
		this.defaultAttemptLimit = defaultAttemptLimit;
	}

	public KeyboardScanner(Locale locale) {
		this();
		sc.useLocale(locale);
	}

	public KeyboardScanner(int defaultAttemptLimit, Locale locale) {
		this(defaultAttemptLimit);
		sc.useLocale(locale);
	}

	public void useLocale(Locale locale) {
		sc.useLocale(locale);
	}

	public void setDefaultAttemptLimit(int defaultAttemptLimit) {
		this.defaultAttemptLimit = defaultAttemptLimit;
	}

	public void close() {
		sc.close();
	}

	public String nextLine() {
		cleanBuffer();
		return sc.nextLine();
	}

	public void cleanBuffer() {
		if (lineInBuffer) {
			sc.nextLine();
			lineInBuffer = false;
		}
	}

	public byte nextByte() throws InputMismatchException {
		return nextByte(defaultAttemptLimit);
	}

	public byte nextByte(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		byte input = 0;
		do {
			error = false;
			try {
				input = sc.nextByte();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public short nextShort() throws InputMismatchException {
		return nextShort(defaultAttemptLimit);
	}

	public short nextShort(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		short input = 0;
		do {
			error = false;
			try {
				input = sc.nextShort();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public int nextInt() throws InputMismatchException {
		return nextInt(defaultAttemptLimit);
	}

	public int nextInt(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		int input = 0;
		do {
			error = false;
			try {
				input = sc.nextInt();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public long nextLong() throws InputMismatchException {
		return nextLong(defaultAttemptLimit);
	}

	public long nextLong(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		long input = 0;
		do {
			error = false;
			try {
				input = sc.nextLong();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public float nextFloat() throws InputMismatchException {
		return nextFloat(defaultAttemptLimit);
	}

	public float nextFloat(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		float input = 0;
		do {
			error = false;
			try {
				input = sc.nextFloat();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public double nextDouble() throws InputMismatchException {
		return nextDouble(defaultAttemptLimit);
	}

	public double nextDouble(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		double input = 0;
		do {
			error = false;
			try {
				input = sc.nextDouble();
				lineInBuffer = true;
			} catch (InputMismatchException ex) {
				error = true;
				attempts++;
				sc.nextLine();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public char nextChar() throws InputMismatchException {
		return nextChar(defaultAttemptLimit);
	}

	public char nextChar(int attemptLimit) throws InputMismatchException {
		boolean error;
		int attempts = 0;
		char input = 0;
		do {
			error = false;
			try {
				input = sc.nextLine().charAt(0);
			} catch (StringIndexOutOfBoundsException ex) {
				error = true;
				attempts++;
				cleanBuffer();
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

	public BigDecimal nextBigDecimal() throws InputMismatchException {
		return nextBigDecimal(defaultAttemptLimit);
	}

	public BigDecimal nextBigDecimal(int attemptLimit) {
		boolean error;
		int attempts = 0;
		BigDecimal input = null;
		do {
			error = false;
			try {
				input = new BigDecimal(sc.nextLine());
			} catch (NumberFormatException ex) {
				error = true;
				attempts++;
				if (attempts >= attemptLimit)
					throw ex;
			}
		} while (error);
		return input;
	}

}
