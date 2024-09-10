public class reverseString {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("Ravi Kumar");
        StringBuilder namerev=new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
           namerev.append(name.charAt(i));
        }
        System.out.println(namerev);
    }
}
