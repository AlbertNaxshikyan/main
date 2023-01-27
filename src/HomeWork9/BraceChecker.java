package HomeWork9;

public class BraceChecker {
    private String text;
    char compare;

    public BraceChecker(String text) {
        this.text = text;


    }

    public void check() {
        Stack stc = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);

            switch (a) {
                case '(':
                case '[':
                case '{':
                    stc.push(a);
                    break;
                case ')':
                    compare = (char)
                            stc.pop(a);
                    if (compare != '(') {
                        System.out.println("Error:"  + "opened" + compare + "but closed" + a + "at " + i) ;
                        break;
                    }

                case ']':
                    compare = (char)
                            stc.pop(a);
                    if (compare != '[') {
                        System.out.println("Error:"  + "opened" + compare + "but closed" + a + "at " + i);
                        break;
                    }
                case '}':
                    compare = (char)
                            stc.pop(a);
                    if (compare != '{')
                        System.out.println("Error:"  + "opened" + compare + "but closed" + a + "at " + i);

                    break;

            }

        }


    }
}
