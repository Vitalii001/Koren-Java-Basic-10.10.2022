public class DZ7shuttles {
    public static void main(String[] args) {
        int i =0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c =0; c <10; c++){
                    if( a != 4 && a != 9 &&  b != 4 && b != 9 && c !=4 && c !=9){
                        int k = a*100 + b*10+ c;
                        array[i] = k;
                        }
                }

            }
        }

    }
}





