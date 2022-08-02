public class Odev1 {

    public void createStarShape(){
        String repeat;

        for(int i=1 ; i<8;i=i+2){
            for(int j=i; j<8;j=j+2){
                System.out.printf(" ");
            }
            repeat="*".repeat(i);
            System.out.println(repeat);

        }
        for(int k=5 ; k>0;k=k-2){
            for(int z=k; z<9;z=z+2){
                System.out.printf(" ");
            }
            repeat="*".repeat(k);
            System.out.println(repeat);


        }


    }
}
