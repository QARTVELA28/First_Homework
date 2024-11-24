public class While {
    public static void main(String[] args) {
        String text = "Th s is an example string with z"; // ტექსტი
        int index = 2;

        while (index < text.length()) {
            char ch = text.charAt(index);
            System.out.println(ch);
            if (ch == 'z') {
                break;
            }
            index += 3;
        }
    }
}

