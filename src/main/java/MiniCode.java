import org.springframework.stereotype.Component;

@Component
public class MiniCode {

    public static final char [][] LETTERS ;


    static {
        char letter = 'A';
        LETTERS = new char[10][];
        for (int i = 1; i < 10; i++) {
            if(i==1){
                LETTERS[1] = new char[1];
                LETTERS[1][0] = '1';
            }else{
                boolean flag = false;
                if(i>6&&i!=8){
                    LETTERS[i] = new char[4];
                    flag = true;
                }else{
                    LETTERS[i] = new char[3];
                }
                for (int j = 0; j <(flag?4:3); j++) {
                    LETTERS[i][j] = letter;
                    letter = (char)(letter+1);
                }
            }
        }
    }


    public static void fun(int [] nums,int index,String preStr){
        int length = nums.length;
        if(index>=length){
            System.out.print(preStr+"\t");
            return;
        }
        int num = nums[index];
        char[] letter = LETTERS[num];
        for (char c : letter) {
            fun(nums,++index,preStr+String.valueOf(c));
            index--;
        }
    }

}

