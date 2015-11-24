
package rend;

public class Rend {

    public static void main(String[] args) {
       int number_0 = 1;
       double number_0_per;
       int number_1 = 1;
       double number_1_per;
       int temp_number;
       int interation_number = 0;
       int streak = 0;
       int previous_number = -1;
       int tmp_streak = 0;
       
       do{
           
            
           
           temp_number = (int)(Math.random()*2);
           if(temp_number == 0) number_0++;
           else{
               number_1++;
           }
           interation_number++;
           
           number_0_per = (number_0*100) / (number_0 + number_1);
           number_1_per = (number_1*100) / (number_0 + number_1);
           
           if(temp_number == previous_number) tmp_streak++;
           else tmp_streak = 1;
           
           if(streak<tmp_streak) streak = tmp_streak;
           
           
           if(interation_number % 1 == 0){
           System.out.println(  interation_number + 
                                " | Generate number: " + temp_number + 
                                "; Number of '0' : " + number_0 + "(" + number_0_per + "%)" +  
                                "; Number of '1' : " + number_1 + "(" + number_1_per + "%)" +
                                "; Streak : " + streak + "; TMP_STREAK : " +  tmp_streak + ";"
           );
           
           
           
           
           previous_number = temp_number;
           
           }
           
       }while (true);
    }
    
}
