public class StringReplace {
    public static void main(String[] args) {
        String st = "hello";
        String st2 = " ";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'l') {
                st2 = st2 + 'w';
            } else {
                st2 = st2 + ch;
            }
        }
        System.out.println(st2);

    }

}
