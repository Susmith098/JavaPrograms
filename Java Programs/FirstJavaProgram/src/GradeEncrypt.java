public class GradeEncrypt {
    public static void main(String[] args) {
        char grade = 'B';
        //encrypting B
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypting B
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
