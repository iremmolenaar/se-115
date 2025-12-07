public class counting_a {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'a', 'd', 'a', 'e'};
        int a = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == 'a'){
                a = a + 1;
            }
        }
        System.out.println("There are "+a+" a letters");
    }
}
