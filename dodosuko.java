import java.util.Random;
public class dodosuko {
    public static void main(String [] args){
        String[] ddsk={"ドド","スコ"};
        String KEY="";//文字列初期化
        String TNSNG="ドドスコスコスコドドスコスコスコドドスコスコスコ";
        Random r=new Random(); 
        int tried=0;//カウンタ
        do{
            String rWord=ddsk[r.nextInt(2)];
            System.out.print(rWord);
           KEY+=rWord;//乱数生成した文字列をString型変数「TNSNG」に追加 
           tried++;//インクリメント
           if(KEY.contains(TNSNG)){
            break;
           }
         //インクリメント
        }while(true); 
        System.out.print("ラブ注入♡\n") ;
        System.out.printf("試行回数は%d回でした\n",tried);
    }
}