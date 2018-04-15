import java.lang.Math;

public class Imaginary {
	double real;
	double imag;
	
	public Imaginary(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public Imaginary add(Imaginary i ) {
		real = real + i.getReal();
		imag = imag + i.getImag();
		return (this);
	}
	
	public double magnitude(Imaginary i) {
		return Math.sqrt((i.getImag() * i.getImag()) + (i.getReal() * i.getReal()));
	}
	
	public Imaginary squared() {
		return new Imaginary( ( (real * real) + (-1 * imag * imag) ), (2 * (real * imag)));
	}
	
	public void reset(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		if (imag != 0) {
			if (imag < 0) {
				return new String(real + " " + imag + "i");
			} else {
				return new String(real + " + " + imag + "i");	
			}
		} else if (imag == 0) {
			return new String(real + "");
		} else {
			return new String(imag + "i");
		}
	}
}
