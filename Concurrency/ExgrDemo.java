import java.util.concurrent.Exchanger;

class ExgrDemo{
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}

class MakeString implements Runnable{
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c){
        ex = c;
        str = new String();
    }

    public void run(){
        char ch = 'A';
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++)
                str += ch++;
                try{
                    str = ex.exchange(str);
                }catch(InterruptedException e){
                    System.out.println(e);
                }

        }
    }
}

class UseString implements Runnable{
    String str;
    Exchanger<String> ex;
    UseString(Exchanger<String> c){
        ex = c;
    }

    public void run(){
        for (int i=0; i<3; i++){
            try{
                str = ex.exchange(new String());
                System.out.println("Got: " + str);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}