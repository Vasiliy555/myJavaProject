package school.lesson4.task6;

public class Payment {
    class Shoes {

        public void buy(){
            System.out.println("Ботинки -покупка совершена");
        }
    }
    class Dress {

        public void buy(){
            System.out.println("Платье-покупка совершена");
        }
    }
    class Socks {

        public void buy(int sm){
            System.out.printf("Носки - кол-во %s - покупка совершена", sm);
            System.out.println();
        }
    }
    class Shirt {


        public void buy( String m,int sm) {
            System.out.printf("Рубашка %s - фирмы, кол-во %s - покупка совершена", m,sm);
            System.out.println();
        }
    }
    Shoes s1= new Shoes();
    Dress d1= new Dress();
    Socks sc1=new Socks();
    Shirt sh1= new Shirt();
}
