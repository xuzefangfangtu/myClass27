import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test27 {
    //双色球案例
    public static void main(String[] args) {
        //首先让我们做一个红色球池子
        int[] redBalls = new int[33];
        int len = redBalls.length;
        for (int i=0;i<len;i++){
            redBalls[i]=i+1;
        }

        //用户所选红蓝球
        int[] userRedball = new int[6];
        int userBlueball = 0;
        //机器生成红篮球
        int[] sysRedball = new int[6];
        int sysBlueball;


        //选择机选还是自选
        Random r =new Random();
        System.out.println("选项：1.机选 2.人选 ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            case 1:
                //机选
                computerSelection(redBalls,userRedball);
                userBlueball= r.nextInt(12)+1;
//                System.out.println(Arrays.toString(userBall));
                break;
            case 2:
                //人选
                System.out.println("请输入依次6个红球（01-33）");
                for(int i=0;i<6;i++){
                    userRedball[i] = input.nextInt();
                }
                System.out.println("请输入1个蓝球（01-16）");
                userBlueball = input.nextInt();
                break;
        }
//        Arrays.sort(userRedball);
        sortNumber(userRedball);
        System.out.println("您的本次号码是"+Arrays.toString(userRedball)+"+"+userBlueball);

        //系统生成中奖号码
        for(int i=0;i<6;i++){
            computerSelection(redBalls,sysRedball);
        }
        sysBlueball = r.nextInt(16)+1;
//        Arrays.sort(sysRedball);
        sortNumber(sysRedball);
        System.out.println("本次中奖号码是"+Arrays.toString(sysRedball)+"+"+sysBlueball);

        //你的号码和中奖号码比较
        int winRedNumber = 0;
        int winBlueNumber = 0;
        int len1 = sysRedball.length - winRedNumber;
        for(int i=0;i<6;i++){
            for(int j=0;j<len1;j++){
                if(userRedball[i] == sysRedball[j]){
                    sysRedball[j] = sysRedball[len1 - 1] + sysRedball[j] - (sysRedball[len1 - 1] = sysRedball[j]);
                    winRedNumber++;
                    break;
                }
            }
        }
        if(userBlueball == sysBlueball) {
            winBlueNumber++;
        }
        System.out.println("红球中了"+ winRedNumber +"个");
        System.out.println("蓝球中了"+ winBlueNumber +"个");


        //公布中奖情况
        if(winRedNumber <=3 && winBlueNumber==0){
            System.out.println("别伤心，没中很正常");
        }else if(winRedNumber == 1 && winBlueNumber < 3){
            System.out.println("恭喜六等奖，5元到手");
        }else if((winRedNumber==3&& winBlueNumber==1) || (winRedNumber==4&& winBlueNumber==0)){
            System.out.println("恭喜五等奖，10元到手");
        }else if((winRedNumber==4&& winBlueNumber==1) || (winRedNumber==5&& winBlueNumber==0)){
            System.out.println("恭喜四等奖，200元到手");
        }else if(winRedNumber==5&& winBlueNumber==1){
            System.out.println("恭喜三等奖，3000元到手");
        }else if(winRedNumber==6&& winBlueNumber==0){
            System.out.println("恭喜二等奖，1万元到手");
        }else if(winRedNumber==6&& winBlueNumber==1){
            System.out.println("恭喜一等奖，500万元到手");
        }else{
            System.out.println("系统异常，2元不退");
        }
    }

    //redBalls 代表红球池子
    //comRedball 代表抽出的红球组合
    private static void computerSelection(int[] redBalls,int[] comRedball){
        Random r=new Random();
        for(int i=0;i<comRedball.length;i++){
            int index = r.nextInt(redBalls.length - i);
            comRedball[i] = redBalls[index];
            redBalls[index] = redBalls[redBalls.length - i - 1]+redBalls[index]-(redBalls[redBalls.length - i - 1]=redBalls[index]);
        }
    }

    //大大版冒泡排序法
    private static void sortNumber(int[] comRedball){
        int len = comRedball.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(comRedball[j]>comRedball[j+1]){
                    comRedball[j+1]=comRedball[j]+comRedball[j+1]-(comRedball[j]=comRedball[j+1]);
                }
            }
        }
    }
}
