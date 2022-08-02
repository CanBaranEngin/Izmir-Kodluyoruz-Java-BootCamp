import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Odev1 {
    String repeat;
    Scanner inp = new Scanner(System.in);
    
    public void createStarShape(){
        System.out.println("Enter the heigth value");
        int heigth = inp.nextInt();
        
        for(int i=1 ; i<heigth*2;i=i+2){
            for(int j=i; j<heigth*2;j=j+2){
                System.out.printf(" ");
            }
            repeat="*".repeat(i);
            System.out.println(repeat);

        }
        for(int k=heigth*2-3 ; k>0;k=k-2){
            for(int z=k; z<heigth*2+1;z=z+2){
                System.out.printf(" ");
            }
            repeat="*".repeat(k);
            System.out.println(repeat);

        }


    }
}
