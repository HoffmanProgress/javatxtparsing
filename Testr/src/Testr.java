
import java.io.*;

public class Testr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double randumNum = Math.random()*2000000;
		if (randumNum < 1000000)
			randumNum = randumNum + 1000000;
		System.out.println(randumNum);
	}

}
