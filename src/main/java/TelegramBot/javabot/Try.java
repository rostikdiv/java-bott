package TelegramBot.javabot;
import java.util.ArrayList;

public class Try {
    ArrayList<String> arrayList= new ArrayList<>();

    void add(String str){
        arrayList.add(str);
    }
    void show(){
        for (int i=1;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
    void sss(){
        for(int i =0;i<=10;i++){
            System.out.println(i);
        }
    }

}
