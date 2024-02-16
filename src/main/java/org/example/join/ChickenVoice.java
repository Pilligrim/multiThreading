package org.example.join;

public class ChickenVoice {
    public static void main(String[] args) throws InterruptedException {
        Runnable eggVoice = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Яйцо!");
            }//Слово «яйцо» сказано 5 раз
        };
        Thread eggOpinion = new Thread(eggVoice);//Создание потока

        Runnable chickenVoice = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Курица!");
            }

            if(eggOpinion.isAlive())//(если Поток еще выполняется) Если оппонент еще не сказал последнее слово
            {
                try{
                    eggOpinion.join();//Подождать пока оппонент закончит высказываться.
                }catch(InterruptedException e) {
                }
                System.out.println("Первым появилось яйцо!");
            }else{
                System.out.println("Первой появилась курица!");
            }
        };
        Thread chikenOpinion = new Thread(chickenVoice);//Создание потока

        System.out.println("Спор начат...");

        eggOpinion.start();
        chikenOpinion.start();

        eggOpinion.join();
        chikenOpinion.join();

        System.out.println("Спор закончен!");

    }
}