/////////////////PERIEXEI KAI ASKISEIS ERGASTIRIOU 1.1 KAI 1.2/////////////////
package erg_1_2;

public class TestStudent {
    
    public static void compareThreeStudentMarks(Student s1, Student s2, Student s3){
        double v1 = s1.computeFinal();
        double v2 = s2.computeFinal();
        double v3 = s3.computeFinal();
        double[] array = {v1, v2, v3};
        double max = v1;
        int step;
        int i;
        double temp;
        
        for (step = 0; step < 2; step++){
            boolean flag = false;
            for (i = 0; i < 3 - step - 1; i++){
                if (array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
                }
            if (!flag)
                break;
        }
        
        System.out.println (array[0]);
        System.out.println (array[1]);
        System.out.println (array[2]);
    }

    public static void main(String[] args) {
        Student s1 = new Student(12345, "onoma1", 2, 7.4, 8.9);
        Student s2 = new Student(54321, "onoma2", 1, 9.4, 9.9);
        Student s3 = new Student(65432, "onoma3", 0, 10.0, 10.0);
        
        System.out.println (s1);
        System.out.println (s2);
        System.out.println (s3);
        
        compareThreeStudentMarks(s1, s2, s3);
        
    }
}
