
public class java_algorithms {

	public static int[] dict(String t) {
		   if (t == null) {
			  throw new IllegalArgumentException("Wrong argument");
		   }
		   int[] pattern = new int[t.length()];
		   pattern[0] = 0;
		   int s = 0;
		   int p = 1;
		   while(p < t.length()) {
			  if (t.charAt(s) == t.charAt(p)) {
				 pattern[p] = s + 1;
				 s++;
				 p++;
			  } else if (s > 0) {
				 s = pattern[s - 1];
			  } else {
				 p++;
			  }
		   }
		   return pattern;
		}
		public static int kmp(String s, String t) {
		   if (s == null || t == null || s.length() < t.length()) {
			  throw new IllegalArgumentException("Wrong argument");
		   }
		   int[] dict = dict(t);
		   int st = 0;
		   int p = 0;
		   
		   while (st < s.length()) {
			  if (s.charAt(st) == t.charAt(p)) {
				 if (p == t.length() - 1) {
					return st - p;
				 }
				 st++;
				 p++;
			  } else if (p > 0) {
				 p = dict[p - 1];
			  } else {
				 p = 0;
			  }
		   }
		   return -1;
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
