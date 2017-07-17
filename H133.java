package GUVI;

import java.util.Arrays;
import java.util.Scanner;
public class H133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] parts = "Word boundary is better than space".split("\\b");
StringBuilder sb = new StringBuilder();
for (int i = parts.length; i --> 0 ;) {
    sb.append(parts[i]);
}
System.out.println("[" + sb.toString() + "]");
	}

}
